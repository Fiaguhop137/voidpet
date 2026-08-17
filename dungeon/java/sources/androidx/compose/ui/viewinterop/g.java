package androidx.compose.ui.viewinterop;

import V.k;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p001a0.j;
import p324s0.AbstractC4137f0;
import p324s0.AbstractC4146k;
import p324s0.AbstractC4147l;
import p324s0.AbstractC4148m;
import p324s0.o0;

/* JADX INFO: loaded from: classes.dex */
final class g extends k.c implements p001a0.k, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f22394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewTreeObserver f22395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Function1 f22396q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function1 f22397r = new b();

    static final class a extends o implements Function1 {
        a() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
            View viewG = f.g(g.this);
            if (viewG.isFocused() || viewG.hasFocus()) {
                return;
            }
            if (androidx.compose.ui.focus.d.b(viewG, androidx.compose.ui.focus.d.c(cVar.b()), f.f(AbstractC4146k.m(g.this).getFocusOwner(), AbstractC4147l.a(g.this), viewG))) {
                return;
            }
            cVar.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    static final class b extends o implements Function1 {
        b() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
            View viewFindNextFocusFromRect;
            View viewG = f.g(g.this);
            if (V.g.f13737d) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                    return;
                }
                return;
            }
            if (viewG.hasFocus()) {
                j focusOwner = AbstractC4146k.m(g.this).getFocusOwner();
                View viewA = AbstractC4147l.a(g.this);
                if (!(viewG instanceof ViewGroup)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect rectF = f.f(focusOwner, viewA, viewG);
                Integer numC = androidx.compose.ui.focus.d.c(cVar.b());
                int iIntValue = numC != null ? numC.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                g gVar = g.this;
                if (gVar.X1() != null) {
                    Intrinsics.d(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewA, gVar.X1(), iIntValue);
                } else {
                    Intrinsics.d(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !f.d(viewG, viewFindNextFocusFromRect)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectF);
                    cVar.a();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    private final FocusTargetNode W1() {
        int iA = AbstractC4137f0.a(1024);
        if (!k0().D1()) {
            p270p0.a.b("visitLocalDescendants called on an unattached node");
        }
        k.c cVarK0 = k0();
        if ((cVarK0.t1() & iA) != 0) {
            boolean z10 = false;
            for (k.c cVarU1 = cVarK0.u1(); cVarU1 != null; cVarU1 = cVarU1.u1()) {
                if ((cVarU1.y1() & iA) != 0) {
                    k.c cVarH = cVarU1;
                    K.c cVar = null;
                    while (cVarH != null) {
                        if (cVarH instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarH.y1() & iA) != 0 && (cVarH instanceof AbstractC4148m)) {
                            int i10 = 0;
                            for (k.c cVarX1 = ((AbstractC4148m) cVarH).X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
                                if ((cVarX1.y1() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarH = cVarX1;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new K.c(new k.c[16], 0);
                                        }
                                        if (cVarH != null) {
                                            cVar.b(cVarH);
                                            cVarH = null;
                                        }
                                        cVar.b(cVarX1);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarH = AbstractC4146k.h(cVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // V.k.c
    public void G1() {
        super.G1();
        ViewTreeObserver viewTreeObserver = AbstractC4147l.a(this).getViewTreeObserver();
        this.f22395p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // V.k.c
    public void H1() {
        ViewTreeObserver viewTreeObserver = this.f22395p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f22395p = null;
        AbstractC4147l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f22394o = null;
        super.H1();
    }

    @Override // p001a0.k
    public void K0(androidx.compose.ui.focus.g gVar) {
        gVar.g(false);
        gVar.h(this.f22396q);
        gVar.n(this.f22397r);
    }

    public final View X1() {
        return this.f22394o;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC4146k.l(this).y0() == null) {
            return;
        }
        View viewG = f.g(this);
        j focusOwner = AbstractC4146k.m(this).getFocusOwner();
        o0 o0VarM = AbstractC4146k.m(this);
        boolean z10 = (view == null || Intrinsics.b(view, o0VarM) || !f.d(viewG, view)) ? false : true;
        boolean z11 = (view2 == null || Intrinsics.b(view2, o0VarM) || !f.d(viewG, view2)) ? false : true;
        if (z10 && z11) {
            this.f22394o = view2;
            return;
        }
        if (z11) {
            this.f22394o = view2;
            FocusTargetNode focusTargetNodeW1 = W1();
            if (focusTargetNodeW1.Q().g()) {
                return;
            }
            l.i(focusTargetNodeW1);
            return;
        }
        if (!z10) {
            this.f22394o = null;
            return;
        }
        this.f22394o = null;
        if (W1().Q().e()) {
            focusOwner.n(false, true, false, androidx.compose.ui.focus.b.f21373b.c());
        }
    }
}
