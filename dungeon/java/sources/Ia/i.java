package Ia;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.InterfaceC2252f0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f5198n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final PointF f5199o = new PointF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float[] f5200p = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Matrix f5201q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float[] f5202r = new float[2];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Comparator f5203s = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f5206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f5207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f5208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f5209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f5210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f5211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet f5212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5216m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(AbstractC1098d abstractC1098d, AbstractC1098d abstractC1098d2) {
            return abstractC1098d == abstractC1098d2 || abstractC1098d.L0(abstractC1098d2) || abstractC1098d2.L0(abstractC1098d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(int i10) {
            return i10 == 3 || i10 == 1 || i10 == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float f10, float f11, View view) {
            return 0.0f <= f10 && f10 <= ((float) view.getWidth()) && 0.0f <= f11 && f11 <= ((float) view.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(AbstractC1098d abstractC1098d, AbstractC1098d abstractC1098d2) {
            if (!abstractC1098d.Y(abstractC1098d2) || h(abstractC1098d, abstractC1098d2)) {
                return false;
            }
            if (abstractC1098d == abstractC1098d2) {
                return true;
            }
            if (abstractC1098d.a0() || abstractC1098d.S() == 4) {
                return abstractC1098d.K0(abstractC1098d2);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(AbstractC1098d abstractC1098d, AbstractC1098d abstractC1098d2) {
            if (abstractC1098d != abstractC1098d2) {
                return abstractC1098d.N0(abstractC1098d2) || abstractC1098d2.M0(abstractC1098d);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = i.f5200p;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(i.f5201q);
                i.f5201q.mapPoints(fArr);
                float f12 = fArr[0];
                scrollY = fArr[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5217a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5217a = iArr;
        }
    }

    public i(ViewGroup wrapperView, j handlerRegistry, D viewConfigHelper, ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f5204a = wrapperView;
        this.f5205b = handlerRegistry;
        this.f5206c = viewConfigHelper;
        this.f5207d = rootView;
        this.f5209f = new ArrayList();
        this.f5210g = new ArrayList();
        this.f5211h = new ArrayList();
        this.f5212i = new HashSet();
    }

    private final void C(AbstractC1098d abstractC1098d, View view) {
        if (this.f5209f.contains(abstractC1098d)) {
            return;
        }
        this.f5209f.add(abstractC1098d);
        abstractC1098d.w0(false);
        abstractC1098d.x0(false);
        abstractC1098d.v0(Integer.MAX_VALUE);
        abstractC1098d.q0(view, this);
    }

    private final boolean D(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList arrayListA = this.f5205b.a(view);
        if (arrayListA != null) {
            synchronized (arrayListA) {
                try {
                    Iterator it = arrayListA.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    z10 = false;
                    while (it.hasNext()) {
                        AbstractC1098d abstractC1098d = (AbstractC1098d) it.next();
                        if (abstractC1098d.d0() && abstractC1098d.g0(view, fArr[0], fArr[1]) && !I(abstractC1098d, motionEvent)) {
                            C(abstractC1098d, view);
                            abstractC1098d.O0(i10);
                            z10 = true;
                        }
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z10 = false;
        }
        float width = view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && y(view) && p(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    private final void E() {
        if (this.f5213j || this.f5214k != 0) {
            this.f5215l = true;
        } else {
            l();
        }
    }

    private final boolean G(AbstractC1098d abstractC1098d) {
        ArrayList<AbstractC1098d> arrayList = this.f5209f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1098d abstractC1098d2 : arrayList) {
            if (abstractC1098d.Y(abstractC1098d2) && abstractC1098d2.S() == 4 && !f5198n.h(abstractC1098d, abstractC1098d2) && abstractC1098d.c0(abstractC1098d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(AbstractC1098d abstractC1098d) {
        ArrayList<AbstractC1098d> arrayList = this.f5209f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1098d abstractC1098d2 : arrayList) {
            if (f5198n.l(abstractC1098d, abstractC1098d2) && abstractC1098d2.S() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(AbstractC1098d abstractC1098d, MotionEvent motionEvent) {
        return ((abstractC1098d instanceof m) || (abstractC1098d instanceof com.swmansion.gesturehandler.react.k.b) || !com.swmansion.gesturehandler.react.a.c(motionEvent)) ? false : true;
    }

    private final boolean J(View view) {
        return (view instanceof com.swmansion.gesturehandler.react.l) && !Intrinsics.b(view, this.f5204a) && ((com.swmansion.gesturehandler.react.l) view).w();
    }

    private final boolean M(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        if (J(view)) {
            return false;
        }
        int i11 = b.f5217a[this.f5206c.a(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return D(view, fArr, i10, motionEvent) || f5198n.m(view, fArr);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return D(view, fArr, i10, motionEvent) || (view instanceof ViewGroup ? r((ViewGroup) view, fArr, i10, motionEvent) : false) || f5198n.m(view, fArr);
            }
            throw new Ad.n();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return D(view, fArr, i10, motionEvent);
            }
            return false;
        }
        boolean zR = r((ViewGroup) view, fArr, i10, motionEvent);
        if (zR) {
            D(view, fArr, i10, motionEvent);
        }
        return zR;
    }

    private final void N(AbstractC1098d abstractC1098d) {
        if (H(abstractC1098d) || G(abstractC1098d)) {
            abstractC1098d.q();
        } else if (u(abstractC1098d)) {
            h(abstractC1098d);
        } else {
            z(abstractC1098d);
            abstractC1098d.x0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(AbstractC1098d abstractC1098d) {
        abstractC1098d.p();
        abstractC1098d.k();
        abstractC1098d.B();
        return Unit.f48228a;
    }

    private final void h(AbstractC1098d abstractC1098d) {
        if (this.f5210g.contains(abstractC1098d)) {
            return;
        }
        this.f5210g.add(abstractC1098d);
        this.f5212i.add(Integer.valueOf(abstractC1098d.T()));
        abstractC1098d.x0(true);
        int i10 = this.f5216m;
        this.f5216m = i10 + 1;
        abstractC1098d.v0(i10);
    }

    private final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f5208e;
    }

    private final void j() {
        Iterator it = CollectionsKt.U0(CollectionsKt.S(this.f5210g)).iterator();
        while (it.hasNext()) {
            ((AbstractC1098d) it.next()).q();
        }
        this.f5211h.clear();
        this.f5211h.addAll(this.f5209f);
        Iterator it2 = CollectionsKt.S(this.f5209f).iterator();
        while (it2.hasNext()) {
            ((AbstractC1098d) it2.next()).q();
        }
    }

    private final void k() {
        for (AbstractC1098d abstractC1098d : CollectionsKt.U0(this.f5210g)) {
            if (!abstractC1098d.a0()) {
                this.f5210g.remove(abstractC1098d);
                this.f5212i.remove(Integer.valueOf(abstractC1098d.T()));
            }
        }
    }

    private final void l() {
        for (AbstractC1098d abstractC1098d : CollectionsKt.S(this.f5209f)) {
            if (f5198n.i(abstractC1098d.S()) && !abstractC1098d.a0()) {
                abstractC1098d.r0();
                abstractC1098d.w0(false);
                abstractC1098d.x0(false);
                abstractC1098d.v0(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.J(this.f5209f, new g());
        this.f5215l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(AbstractC1098d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f5198n.i(it.S()) && !it.a0();
    }

    private final void n(AbstractC1098d abstractC1098d, MotionEvent motionEvent) {
        if (!x(abstractC1098d.W())) {
            abstractC1098d.q();
            return;
        }
        if (abstractC1098d.S0(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View viewW = abstractC1098d.W();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(...)");
            MotionEvent motionEventK = K(viewW, motionEventObtain);
            if (abstractC1098d.N() && abstractC1098d.S() != 0) {
                abstractC1098d.R0(motionEventK, motionEvent);
            }
            if (!abstractC1098d.a0() || actionMasked != 2) {
                boolean z10 = abstractC1098d.S() == 0;
                abstractC1098d.X(motionEventK, motionEvent);
                if (abstractC1098d.Z()) {
                    if (abstractC1098d.R()) {
                        abstractC1098d.H0(false);
                        abstractC1098d.t0();
                    }
                    abstractC1098d.v(motionEventK);
                }
                if (abstractC1098d.N() && z10) {
                    abstractC1098d.R0(motionEventK, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    abstractC1098d.P0(motionEventK.getPointerId(motionEventK.getActionIndex()));
                }
            }
            motionEventK.recycle();
        }
    }

    private final void o(MotionEvent motionEvent) {
        this.f5211h.clear();
        this.f5211h.addAll(this.f5209f);
        CollectionsKt.A(this.f5211h, f5203s);
        Iterator it = this.f5211h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            n((AbstractC1098d) it.next(), motionEvent);
        }
    }

    private final boolean p(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                if ((parent instanceof com.swmansion.gesturehandler.react.l) && ((com.swmansion.gesturehandler.react.l) parent).w()) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList arrayListA = this.f5205b.a((View) parent);
                if (arrayListA != null) {
                    synchronized (arrayListA) {
                        try {
                            Iterator it = arrayListA.iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (it.hasNext()) {
                                AbstractC1098d abstractC1098d = (AbstractC1098d) it.next();
                                if (abstractC1098d.d0() && abstractC1098d.g0(view, fArr[0], fArr[1])) {
                                    C(abstractC1098d, viewGroup);
                                    abstractC1098d.O0(i10);
                                    z10 = true;
                                }
                            }
                            Unit unit = Unit.f48228a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z10;
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f5202r;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        M(this.f5204a, fArr, pointerId, motionEvent);
        r(this.f5204a, fArr, pointerId, motionEvent);
    }

    private final boolean r(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        ViewGroup viewGroup2;
        if (J(viewGroup)) {
            return false;
        }
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View viewC = this.f5206c.c(viewGroup, childCount);
            if (i(viewC)) {
                PointF pointF = f5199o;
                a aVar = f5198n;
                viewGroup2 = viewGroup;
                aVar.n(fArr[0], fArr[1], viewGroup2, viewC, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zM = (!w(viewC) || aVar.j(fArr[0], fArr[1], viewC)) ? M(viewC, fArr, i10, motionEvent) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (zM) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(AbstractC1098d abstractC1098d, AbstractC1098d abstractC1098d2) {
        if ((abstractC1098d.Z() && abstractC1098d2.Z()) || (abstractC1098d.a0() && abstractC1098d2.a0())) {
            return Integer.signum(abstractC1098d2.G() - abstractC1098d.G());
        }
        if (abstractC1098d.Z()) {
            return -1;
        }
        if (abstractC1098d2.Z()) {
            return 1;
        }
        if (abstractC1098d.a0()) {
            return -1;
        }
        return abstractC1098d2.a0() ? 1 : 0;
    }

    private final boolean u(AbstractC1098d abstractC1098d) {
        ArrayList<AbstractC1098d> arrayList = this.f5209f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1098d abstractC1098d2 : arrayList) {
            a aVar = f5198n;
            if (!aVar.i(abstractC1098d2.S()) && aVar.l(abstractC1098d, abstractC1098d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.f5206c.b((ViewGroup) view);
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f5204a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f5204a) {
            parent = parent.getParent();
        }
        return parent == this.f5204a;
    }

    private final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f5200p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void z(AbstractC1098d abstractC1098d) {
        int iS = abstractC1098d.S();
        abstractC1098d.x0(false);
        abstractC1098d.w0(true);
        abstractC1098d.H0(true);
        int i10 = this.f5216m;
        this.f5216m = i10 + 1;
        abstractC1098d.v0(i10);
        for (AbstractC1098d abstractC1098d2 : CollectionsKt.S(this.f5209f)) {
            if (f5198n.k(abstractC1098d2, abstractC1098d)) {
                abstractC1098d2.q();
            }
        }
        for (AbstractC1098d abstractC1098d3 : CollectionsKt.S(this.f5210g)) {
            if (f5198n.k(abstractC1098d3, abstractC1098d)) {
                abstractC1098d3.x0(false);
            }
        }
        k();
        if (iS == 1 || iS == 3) {
            return;
        }
        abstractC1098d.w(4, 2);
        if (iS != 4) {
            abstractC1098d.w(5, 4);
            if (iS != 5) {
                abstractC1098d.w(0, 5);
            }
        }
    }

    public final void A(AbstractC1098d handler, int i10, int i11) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5214k++;
        if (f5198n.i(i10)) {
            for (AbstractC1098d abstractC1098d : CollectionsKt.U0(this.f5210g)) {
                if (f5198n.l(abstractC1098d, handler) && this.f5212i.contains(Integer.valueOf(abstractC1098d.T()))) {
                    if (i10 == 5) {
                        abstractC1098d.q();
                        if (abstractC1098d.S() == 5) {
                            abstractC1098d.w(3, 2);
                        }
                        abstractC1098d.x0(false);
                    } else {
                        N(abstractC1098d);
                    }
                }
            }
            k();
        }
        if (i10 == 4) {
            N(handler);
        } else if (i11 == 4 || i11 == 5) {
            if (handler.Z()) {
                handler.w(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                handler.w(i10, 2);
            }
        } else if (i11 != 0 || i10 != 3) {
            handler.w(i10, i11);
        }
        this.f5214k--;
        E();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5213j = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            q(event);
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5 || actionMasked == 7) {
            q(event);
        }
        o(event);
        this.f5213j = false;
        if (this.f5215l && this.f5214k == 0) {
            l();
        }
        if ((actionMasked == 1 || actionMasked == 3 || actionMasked == 10) && this.f5209f.isEmpty()) {
            ViewGroup viewGroup = this.f5207d;
            if (viewGroup instanceof InterfaceC2252f0) {
                ((InterfaceC2252f0) viewGroup).d(viewGroup, event);
            }
        }
        return true;
    }

    public final void F(float f10) {
        this.f5208e = f10;
    }

    public final MotionEvent K(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.b(viewGroup, this.f5204a)) {
                K(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f5201q;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    public final PointF L(View view, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!Intrinsics.b(viewGroup, this.f5204a)) {
                L(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f5201q;
                matrix.invert(matrix2);
                float[] fArr = f5202r;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<AbstractC1098d> arrayListA = this.f5205b.a(view);
        if (arrayListA != null) {
            for (AbstractC1098d abstractC1098d : arrayListA) {
                if (abstractC1098d instanceof q) {
                    C(abstractC1098d, view);
                    abstractC1098d.T0(new h(abstractC1098d));
                }
            }
        }
    }

    public final ArrayList s(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f5205b.a(view);
    }

    public final boolean v() {
        ArrayList arrayList = this.f5209f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractC1098d) it.next()).S() == 4) {
                return true;
            }
        }
        return false;
    }
}
