package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC1921n0;
import androidx.core.view.C0;
import androidx.core.view.c1;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f39066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f39067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f39068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Integer f39069e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f39065a = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static d f39070f = new d();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39071a;

        static {
            int[] iArr = new int[C3208t.g.values().length];
            try {
                iArr[C3208t.g.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3208t.g.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3208t.g.STYLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3208t.g.TRANSLUCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3208t.g.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3208t.g.ANIMATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C3208t.g.NAVIGATION_BAR_COLOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C3208t.g.NAVIGATION_BAR_TRANSLUCENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C3208t.g.NAVIGATION_BAR_HIDDEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f39071a = iArr;
        }
    }

    public static final class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f39072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f39073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Integer num, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f39072a = activity;
            this.f39073b = num;
            this.f39074c = z10;
            Intrinsics.c(jSExceptionHandler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Window window, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f39072a.getWindow();
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f39073b);
            valueAnimatorOfObject.addUpdateListener(new f0(window));
            if (this.f39074c) {
                valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            } else {
                valueAnimatorOfObject.setDuration(0L).setStartDelay(300L);
            }
            valueAnimatorOfObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f39075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f39075a = activity;
            this.f39076b = z10;
            Intrinsics.c(jSExceptionHandler);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            View decorView = this.f39075a.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (this.f39076b) {
                C3199j c3199j = C3199j.f39170a;
                c3199j.e(decorView);
                c3199j.b(e0.f39070f);
            } else {
                C3199j.f39170a.g(e0.f39070f);
            }
            androidx.core.view.Z.j0(decorView);
        }
    }

    public static final class d implements androidx.core.view.H {
        d() {
        }

        @Override // androidx.core.view.H
        public C0 a(View v10, C0 insets) {
            Intrinsics.checkNotNullParameter(v10, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            C0 c0Y = androidx.core.view.Z.Y(v10, insets);
            Intrinsics.checkNotNullExpressionValue(c0Y, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                C0 c0S = c0Y.s(c0Y.k(), 0, c0Y.l(), c0Y.j());
                Intrinsics.checkNotNullExpressionValue(c0S, "replaceSystemWindowInsets(...)");
                return c0S;
            }
            p020b1.d dVarF = c0Y.f(C0.p.h());
            Intrinsics.checkNotNullExpressionValue(dVarF, "getInsets(...)");
            C0 c0A = new C0.a().b(C0.p.h(), p020b1.d.c(dVarF.f25865a, 0, dVarF.f25867c, dVarF.f25868d)).a();
            Intrinsics.checkNotNullExpressionValue(c0A, "build(...)");
            return c0A;
        }
    }

    private e0() {
    }

    private final boolean h(C3208t c3208t, C3208t.g gVar) {
        switch (a.f39071a[gVar.ordinal()]) {
            case 1:
                return c3208t.getScreenOrientation() != null;
            case 2:
                return c3208t.getStatusBarColor() != null;
            case 3:
                return c3208t.getStatusBarStyle() != null;
            case 4:
                return c3208t.n() != null;
            case 5:
                return c3208t.m() != null;
            case 6:
                return c3208t.l() != null;
            case 7:
                return c3208t.getNavigationBarColor() != null;
            case 8:
                return c3208t.k() != null;
            case 9:
                return c3208t.j() != null;
            default:
                throw new Ad.n();
        }
    }

    private final C3208t i(C3208t c3208t, C3208t.g gVar) {
        B fragmentWrapper;
        if (c3208t == null || (fragmentWrapper = c3208t.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.m().iterator();
        while (it.hasNext()) {
            C3208t topScreen = ((C3210v) it.next()).getTopScreen();
            e0 e0Var = f39065a;
            C3208t c3208tI = e0Var.i(topScreen, gVar);
            if (c3208tI != null) {
                return c3208tI;
            }
            if (topScreen != null && e0Var.h(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final C3208t j(C3208t c3208t, C3208t.g gVar) {
        for (ViewParent container = c3208t.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C3208t) {
                C3208t c3208t2 = (C3208t) container;
                if (h(c3208t2, gVar)) {
                    return c3208t2;
                }
            }
        }
        return null;
    }

    private final C3208t k(C3208t c3208t, C3208t.g gVar) {
        C3208t c3208tI = i(c3208t, gVar);
        if (c3208tI != null) {
            return c3208tI;
        }
        return h(c3208t, gVar) ? c3208t : j(c3208t, gVar);
    }

    private final boolean l(int i10) {
        return ((double) 1) - ((((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(boolean z10, c1 c1Var) {
        if (z10) {
            c1Var.b(C0.p.h());
        } else {
            c1Var.h(C0.p.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Window window, int i10) {
        new c1(window, window.getDecorView()).e(f39065a.l(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        new c1(activity.getWindow(), decorView).f(Intrinsics.b(str, "dark"));
    }

    public final void e() {
        f39068d = true;
    }

    public final void f() {
        f39066b = true;
    }

    public final void g() {
        f39067c = true;
    }

    public final void m(C3208t screen, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean boolL;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (f39069e == null) {
            f39069e = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        C3208t c3208tK = k(screen, C3208t.g.COLOR);
        C3208t c3208tK2 = k(screen, C3208t.g.ANIMATED);
        if (c3208tK == null || (statusBarColor = c3208tK.getStatusBarColor()) == null) {
            statusBarColor = f39069e;
        }
        UiThreadUtil.runOnUiThread(new b(activity, statusBarColor, (c3208tK2 == null || (boolL = c3208tK2.l()) == null) ? false : boolL.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void o(C3208t screen, Activity activity) {
        Boolean boolM;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        C3208t c3208tK = k(screen, C3208t.g.HIDDEN);
        boolean zBooleanValue = (c3208tK == null || (boolM = c3208tK.m()) == null) ? false : boolM.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new b0(zBooleanValue, new c1(window, window.getDecorView())));
    }

    public final void q(C3208t screen, Activity activity) {
        Integer navigationBarColor;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C3208t c3208tK = k(screen, C3208t.g.NAVIGATION_BAR_COLOR);
        int navigationBarColor2 = (c3208tK == null || (navigationBarColor = c3208tK.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new d0(window, navigationBarColor2));
        window.setNavigationBarColor(navigationBarColor2);
    }

    public final void r(C3208t screen, Activity activity) {
        Boolean boolJ;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C3208t c3208tK = k(screen, C3208t.g.NAVIGATION_BAR_HIDDEN);
        if (!((c3208tK == null || (boolJ = c3208tK.j()) == null) ? false : boolJ.booleanValue())) {
            new c1(window, window.getDecorView()).h(C0.p.g());
            return;
        }
        c1 c1Var = new c1(window, window.getDecorView());
        c1Var.b(C0.p.g());
        c1Var.g(2);
    }

    public final void s(C3208t screen, Activity activity) {
        Boolean boolK;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || Ta.b.f12380a.a()) {
            return;
        }
        Window window = activity.getWindow();
        C3208t c3208tK = k(screen, C3208t.g.NAVIGATION_BAR_TRANSLUCENT);
        if (c3208tK == null || (boolK = c3208tK.k()) == null) {
            return;
        }
        AbstractC1921n0.b(window, !boolK.booleanValue());
    }

    public final void t(C3208t screen, Activity activity) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        C3208t c3208tK = k(screen, C3208t.g.ORIENTATION);
        activity.setRequestedOrientation((c3208tK == null || (screenOrientation = c3208tK.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void v(C3208t screen, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C3208t c3208tK = k(screen, C3208t.g.STYLE);
        if (c3208tK == null || (statusBarStyle = c3208tK.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new c0(activity, statusBarStyle));
    }

    public final void w(C3208t screen, Activity activity, ReactContext reactContext) {
        Boolean boolN;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null || Ta.b.f12380a.a()) {
            return;
        }
        C3208t c3208tK = k(screen, C3208t.g.TRANSLUCENT);
        UiThreadUtil.runOnUiThread(new c(activity, (c3208tK == null || (boolN = c3208tK.n()) == null) ? false : boolN.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void x(C3208t screen, Activity activity, ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (f39066b) {
            t(screen, activity);
        }
        if (f39067c) {
            m(screen, activity, reactContext);
            v(screen, activity, reactContext);
            w(screen, activity, reactContext);
            o(screen, activity);
        }
        if (f39068d) {
            q(screen, activity);
            s(screen, activity);
            r(screen, activity);
        }
    }
}
