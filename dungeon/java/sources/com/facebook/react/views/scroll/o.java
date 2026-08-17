package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.InterfaceC2260j0;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f30917c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f30921g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f30915a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30916b = com.facebook.react.views.scroll.h.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CopyOnWriteArrayList f30918d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CopyOnWriteArrayList f30919e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f30920f = 250;

    public interface a {
        void d(int i10, int i11);

        ValueAnimator getFlingAnimator();
    }

    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j10);
    }

    public interface c {
        h getReactScrollViewScrollState();
    }

    public interface d {
        void a(int i10, int i11);

        void b(int i10, int i11);
    }

    public interface e {
        InterfaceC2260j0 getStateWrapper();
    }

    public interface f {
        void e(ViewGroup viewGroup);
    }

    private static final class g extends OverScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30922a;

        public g(Context context) {
            super(context);
            this.f30922a = 250;
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f30922a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            this.f30922a = i14;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30924b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f30926d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Point f30923a = new Point();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Point f30925c = new Point(-1, -1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30927e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f30928f = 0.985f;

        public final float a() {
            return this.f30928f;
        }

        public final Point b() {
            return this.f30923a;
        }

        public final Point c() {
            return this.f30925c;
        }

        public final int d() {
            return this.f30924b;
        }

        public final boolean e() {
            return this.f30926d;
        }

        public final boolean f() {
            return this.f30927e;
        }

        public final void g(boolean z10) {
            this.f30926d = z10;
        }

        public final void h(float f10) {
            this.f30928f = f10;
        }

        public final h i(int i10, int i11) {
            this.f30923a.set(i10, i11);
            return this;
        }

        public final void j(boolean z10) {
            this.f30927e = z10;
        }

        public final h k(int i10, int i11) {
            this.f30925c.set(i10, i11);
            return this;
        }

        public final void l(int i10) {
            this.f30924b = i10;
        }
    }

    public interface i {
        void b(ViewGroup viewGroup);

        void c(ViewGroup viewGroup, q qVar, float f10, float f11);
    }

    public static final class j implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f30929a;

        j(ViewGroup viewGroup) {
            this.f30929a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            o.p(this.f30929a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            o.p(this.f30929a);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f30930a;

        k(ViewGroup viewGroup) {
            this.f30930a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((c) this.f30930a).getReactScrollViewScrollState().g(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((c) this.f30930a).getReactScrollViewScrollState().j(true);
            o.F(this.f30930a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            h reactScrollViewScrollState = ((c) this.f30930a).getReactScrollViewScrollState();
            reactScrollViewScrollState.g(false);
            reactScrollViewScrollState.j(false);
        }
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void B(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f30918d.removeIf(new l(new com.facebook.react.views.scroll.k(listener)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(i iVar, WeakReference weakReference) {
        return weakReference.get() == null || Intrinsics.b(weakReference.get(), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(ViewGroup viewGroup, int i10, int i11) {
        if (f30917c) {
            W4.a.u(f30916b, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        a aVar = (a) viewGroup;
        ValueAnimator flingAnimator = aVar.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f30915a.x(viewGroup);
        }
        ((c) viewGroup).getReactScrollViewScrollState().i(i10, i11);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i10) {
            aVar.d(scrollX, i10);
        }
        if (scrollY != i11) {
            aVar.d(scrollY, i11);
        }
    }

    public static final void F(ViewGroup viewGroup) {
        f30915a.G(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    public static final void H(ViewGroup viewGroup, float f10, float f11) {
        f30915a.G(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
        l(viewGroup, f10, f11);
    }

    public static final void e(f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f30919e.add(new WeakReference(listener));
    }

    public static final void f(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f30918d.add(new WeakReference(listener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new j(viewGroup));
    }

    public static final void h(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator it = f30919e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null) {
                fVar.e(scrollView);
            }
        }
    }

    public static final void i(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator it = f30918d.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.b(scrollView);
            }
        }
    }

    public static final void j(ViewGroup viewGroup) {
        f30915a.m(viewGroup, q.BEGIN_DRAG);
    }

    public static final void k(ViewGroup viewGroup, float f10, float f11) {
        f30915a.n(viewGroup, q.END_DRAG, f10, f11);
    }

    public static final void l(ViewGroup viewGroup, float f10, float f11) {
        f30915a.n(viewGroup, q.SCROLL, f10, f11);
    }

    private final void m(ViewGroup viewGroup, q qVar) {
        n(viewGroup, qVar, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(ViewGroup viewGroup, q qVar, float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (qVar == q.SCROLL) {
            b bVar = (b) viewGroup;
            if (bVar.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - bVar.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = CollectionsKt.U0(f30918d).iterator();
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.c(viewGroup, qVar, f10, f11);
            }
        }
        Context context = viewGroup.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = C2270o0.e(reactContext);
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, viewGroup.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(p.f30931k.a(iE, viewGroup.getId(), qVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f10, f11, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
            if (qVar == q.SCROLL) {
                ((b) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    public static final void o(ViewGroup viewGroup, int i10, int i11) {
        f30915a.n(viewGroup, q.MOMENTUM_BEGIN, i10, i11);
    }

    public static final void p(ViewGroup viewGroup) {
        f30915a.m(viewGroup, q.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View q(ViewGroup host, View focused, int i10) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        int iIntValue;
        int[] relativeAncestorList;
        Set setV0;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!(host instanceof L)) {
            return null;
        }
        Context context = host.getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManagerG = C2270o0.g((ReactContext) context, 2);
        if (uIManagerG == null || (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManagerG).findNextFocusableElement(host.getId(), focused.getId(), i10)) == null || (relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), (iIntValue = numFindNextFocusableElement.intValue()))) == null || (setV0 = AbstractC3952n.V0(relativeAncestorList)) == null) {
            return null;
        }
        setV0.add(numFindNextFocusableElement);
        ((L) host).updateClippingRect(setV0);
        return host.findViewById(iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(ViewGroup viewGroup) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        int iD = reactScrollViewScrollState.d();
        Point pointC = reactScrollViewScrollState.c();
        int i10 = pointC.x;
        int i11 = pointC.y;
        if (f30917c) {
            W4.a.u(f30916b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        InterfaceC2260j0 stateWrapper = ((e) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", H.g(i10));
            writableNativeMap.putDouble("contentOffsetTop", H.g(i11));
            writableNativeMap.putDouble("scrollAwayPaddingTop", H.g(iD));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int s(Context context) {
        if (!f30921g) {
            f30921g = true;
            try {
                f30920f = new g(context).a();
            } catch (Throwable unused) {
            }
        }
        return f30920f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int t(ViewGroup viewGroup, int i10, int i11, int i12) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.f() || (reactScrollViewScrollState.e() && ((i12 != 0 ? i12 / Math.abs(i12) : 0) * (i11 - i10) > 0))) ? i11 : i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int u(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L4c
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L4c
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4a
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wrong overScrollMode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ReactNative"
            W4.a.I(r1, r3)
            return r0
        L4a:
            r3 = 0
            return r3
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.o.u(java.lang.String):int");
    }

    public static final int v(String str) {
        if (str == null) {
            return 0;
        }
        if (StringsKt.z("start", str, true)) {
            return 1;
        }
        if (StringsKt.z("center", str, true)) {
            return 2;
        }
        if (Intrinsics.b("end", str)) {
            return 3;
        }
        W4.a.I("ReactNative", "wrong snap alignment value: " + str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point w(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int height = (viewGroup.getHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop();
        Point pointB = reactScrollViewScrollState.b();
        overScroller.fling(t(viewGroup, viewGroup.getScrollX(), pointB.x, i10), t(viewGroup, viewGroup.getScrollY(), pointB.y, i11), i10, i11, 0, i12, 0, i13, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void y(f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f30919e.removeIf(new n(new m(listener)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(f fVar, WeakReference weakReference) {
        return weakReference.get() == null || Intrinsics.b(weakReference.get(), fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(ViewGroup viewGroup, int i10, int i11) {
        if (f30917c) {
            W4.a.u(f30916b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (Z6.a.a(viewGroup.getId()) == 1 || ((e) viewGroup).getStateWrapper() == null) {
            return;
        }
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.c().equals(i10, i11)) {
            return;
        }
        reactScrollViewScrollState.k(i10, i11);
        r(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new k(viewGroup));
    }
}
