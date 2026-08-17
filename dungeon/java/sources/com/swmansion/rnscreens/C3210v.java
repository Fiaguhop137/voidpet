package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3210v extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ArrayList f39333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected androidx.fragment.app.q f39334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Choreographer.FrameCallback f39338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B f39339g;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.v$a */
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C3210v.this.f39337e = false;
            C3210v c3210v = C3210v.this;
            c3210v.measure(View.MeasureSpec.makeMeasureSpec(c3210v.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C3210v.this.getHeight(), 1073741824));
            C3210v c3210v2 = C3210v.this;
            c3210v2.layout(c3210v2.getLeft(), C3210v.this.getTop(), C3210v.this.getRight(), C3210v.this.getBottom());
        }
    }

    public C3210v(Context context) {
        super(context);
        this.f39333a = new ArrayList();
        this.f39338f = new a();
    }

    private final void f(androidx.fragment.app.x xVar, androidx.fragment.app.i iVar) {
        xVar.b(getId(), iVar);
    }

    private final void i(androidx.fragment.app.x xVar, androidx.fragment.app.i iVar) {
        xVar.m(iVar);
    }

    private final androidx.fragment.app.q j(com.facebook.react.Y y10) {
        boolean z10;
        Context context = y10.getContext();
        while (true) {
            z10 = context instanceof androidx.fragment.app.j;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        androidx.fragment.app.j jVar = (androidx.fragment.app.j) context;
        if (jVar.h0().t0().isEmpty()) {
            androidx.fragment.app.q qVarH0 = jVar.h0();
            Intrinsics.c(qVarH0);
            return qVarH0;
        }
        try {
            androidx.fragment.app.q qVarF = androidx.fragment.app.q.f0(y10).F();
            Intrinsics.c(qVarF);
            return qVarF;
        } catch (IllegalStateException unused) {
            androidx.fragment.app.q qVarH1 = jVar.h0();
            Intrinsics.c(qVarH1);
            return qVarH1;
        }
    }

    private final C3208t.a k(B b10) {
        return b10.j().getActivityState();
    }

    private final void r() {
        this.f39336d = true;
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C2262k0) context).b().runOnUiQueueThread(new RunnableC3209u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C3210v c3210v) {
        c3210v.u();
    }

    private final void setFragmentManager(androidx.fragment.app.q qVar) {
        this.f39334b = qVar;
        v();
    }

    private final void x(androidx.fragment.app.q qVar) {
        androidx.fragment.app.x xVarM = qVar.m();
        Intrinsics.checkNotNullExpressionValue(xVarM, "beginTransaction(...)");
        boolean z10 = false;
        for (androidx.fragment.app.i iVar : qVar.t0()) {
            if ((iVar instanceof A) && ((A) iVar).j().getContainer() == this) {
                xVarM.m(iVar);
                z10 = true;
            }
        }
        if (z10) {
            xVarM.j();
        }
    }

    private final void z() {
        boolean z10;
        Unit unit;
        ViewParent parent = this;
        while (true) {
            z10 = parent instanceof com.facebook.react.Y;
            if (z10 || (parent instanceof Na.b) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        }
        if (parent instanceof C3208t) {
            B fragmentWrapper = ((C3208t) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f39339g = fragmentWrapper;
                fragmentWrapper.n(this);
                androidx.fragment.app.q qVarF = fragmentWrapper.b().F();
                Intrinsics.checkNotNullExpressionValue(qVarF, "getChildFragmentManager(...)");
                setFragmentManager(qVarF);
                unit = Unit.f48228a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(parent instanceof Na.b)) {
            if (!z10) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(j((com.facebook.react.Y) parent));
            return;
        }
        androidx.fragment.app.i associatedFragment = ((Na.b) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            androidx.fragment.app.q qVarF2 = associatedFragment.F();
            Intrinsics.checkNotNullExpressionValue(qVarF2, "getChildFragmentManager(...)");
            setFragmentManager(qVarF2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
        }
    }

    protected B c(C3208t screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new A(screen);
    }

    public final void d(C3208t screen, int i10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        B bC = c(screen);
        screen.setFragmentWrapper(bC);
        this.f39333a.add(i10, bC);
        screen.setContainer(this);
        r();
    }

    public final void e() {
        if (this.f39333a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.x xVarG = g();
        C3208t topScreen = getTopScreen();
        Intrinsics.d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        androidx.fragment.app.i fragment = topScreen.getFragment();
        Intrinsics.d(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(xVarG, fragment);
        ArrayList arrayList = this.f39333a;
        f(xVarG, ((B) arrayList.get(arrayList.size() - 2)).b());
        androidx.fragment.app.i fragment2 = topScreen.getFragment();
        Intrinsics.d(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(xVarG, fragment2);
        xVarG.j();
    }

    protected final androidx.fragment.app.x g() {
        androidx.fragment.app.q qVar = this.f39334b;
        if (qVar == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.x xVarS = qVar.m().s(true);
        Intrinsics.checkNotNullExpressionValue(xVarS, "setReorderingAllowed(...)");
        return xVarS;
    }

    public final int getScreenCount() {
        return this.f39333a.size();
    }

    @Nullable
    public C3208t getTopScreen() {
        Object next;
        Iterator it = this.f39333a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (k((B) next) != C3208t.a.ON_TOP);
        B b10 = (B) next;
        if (b10 != null) {
            return b10.j();
        }
        return null;
    }

    public final void h() {
        if (this.f39333a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.x xVarG = g();
        ArrayList arrayList = this.f39333a;
        i(xVarG, ((B) arrayList.get(arrayList.size() - 2)).b());
        xVarG.j();
    }

    public final C3208t l(int i10) {
        return ((B) this.f39333a.get(i10)).j();
    }

    public final B m(int i10) {
        Object obj = this.f39333a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (B) obj;
    }

    public boolean n(B b10) {
        return CollectionsKt.b0(this.f39333a, b10);
    }

    protected void o() {
        B fragmentWrapper;
        C3208t topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39335c = true;
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.fragment.app.q qVar = this.f39334b;
        if (qVar != null && !qVar.G0()) {
            x(qVar);
            qVar.c0();
        }
        B b10 = this.f39339g;
        if (b10 != null) {
            b10.q(this);
        }
        this.f39339g = null;
        super.onDetachedFromWindow();
        this.f39335c = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    public final void p() {
        C3208t topScreen = getTopScreen();
        Intrinsics.d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int iE = C2270o0.e(getContext());
            Context context = getContext();
            Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, topScreen.getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.d(new La.h(iE, topScreen.getId()));
            }
        }
    }

    public final void q() {
        v();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f39337e || this.f39338f == null) {
            return;
        }
        this.f39337e = true;
        com.facebook.react.modules.core.b.f29885f.a().k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.f39338f);
    }

    public void t() {
        androidx.fragment.app.x xVarG = g();
        androidx.fragment.app.q qVar = this.f39334b;
        if (qVar == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(qVar.t0());
        Iterator it = this.f39333a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            B b10 = (B) next;
            if (k(b10) == C3208t.a.INACTIVE && b10.b().n0()) {
                i(xVarG, b10.b());
            }
            hashSet.remove(b10.b());
        }
        boolean z10 = false;
        if (!hashSet.isEmpty()) {
            for (androidx.fragment.app.i iVar : (androidx.fragment.app.i[]) hashSet.toArray(new androidx.fragment.app.i[0])) {
                if ((iVar instanceof A) && ((A) iVar).j().getContainer() == null) {
                    i(xVarG, iVar);
                }
            }
        }
        boolean z11 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f39333a.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            B b11 = (B) next2;
            C3208t.a aVarK = k(b11);
            C3208t.a aVar = C3208t.a.INACTIVE;
            if (aVarK != aVar && !b11.b().n0()) {
                f(xVarG, b11.b());
                z10 = true;
            } else if (aVarK != aVar && z10) {
                i(xVarG, b11.b());
                arrayList.add(b11);
            }
            b11.j().setTransitioning(z11);
        }
        Iterator it3 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            Intrinsics.checkNotNullExpressionValue(next3, "next(...)");
            f(xVarG, ((B) next3).b());
        }
        xVarG.j();
    }

    public final void u() {
        androidx.fragment.app.q qVar;
        if (this.f39336d && this.f39335c && (qVar = this.f39334b) != null) {
            if (qVar == null || !qVar.G0()) {
                this.f39336d = false;
                t();
                o();
            }
        }
    }

    protected final void v() {
        this.f39336d = true;
        u();
    }

    public void w() {
        Iterator it = this.f39333a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ((B) next).j().setContainer(null);
        }
        this.f39333a.clear();
        r();
    }

    public void y(int i10) {
        ((B) this.f39333a.get(i10)).j().setContainer(null);
        this.f39333a.remove(i10);
        r();
    }
}
