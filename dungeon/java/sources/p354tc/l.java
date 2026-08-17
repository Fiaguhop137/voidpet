package p354tc;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import androidx.core.view.AbstractC1921n0;
import androidx.core.view.C0;
import androidx.core.view.c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f54624a = new l();

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Log.e("NavigationBar", m10);
        return Unit.f48228a;
    }

    public static final void B(Activity activity, String visibility) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        f54624a.C(activity, visibility, new i(), new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D() {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(String m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Log.e("NavigationBar", m10);
        return Unit.f48228a;
    }

    public static final void l(Activity activity, String behavior) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        f54624a.m(activity, behavior, new c(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(String m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Log.e("NavigationBar", m10);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o() {
        return Unit.f48228a;
    }

    public static final void p(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f54624a.q(activity, i10, new e(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Log.e("NavigationBar", m10);
        return Unit.f48228a;
    }

    public static final void u(Activity activity, String visible) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visible, "visible");
        f54624a.m(activity, visible, new k(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v() {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        Log.e("NavigationBar", m10);
        return Unit.f48228a;
    }

    public static final void x(Activity activity, String position) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(position, "position");
        f54624a.y(activity, position, new g(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z() {
        return Unit.f48228a;
    }

    public final void C(Activity activity, String visibility, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        c1 c1Var = new c1(activity.getWindow(), activity.getWindow().getDecorView());
        if (Intrinsics.b(visibility, "visible")) {
            c1Var.h(C0.p.g());
        } else {
            if (!Intrinsics.b(visibility, "hidden")) {
                failureCallback.invoke("Invalid visibility: \"" + visibility + "\"");
                return;
            }
            c1Var.b(C0.p.g());
        }
        successCallback.invoke();
    }

    public final void k(Activity activity, int i10, Function0 successCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        activity.getWindow().setNavigationBarColor(i10);
        successCallback.invoke();
    }

    public final void m(Activity activity, String behavior, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        c1 c1Var = new c1(activity.getWindow(), activity.getWindow().getDecorView());
        int iHashCode = behavior.hashCode();
        if (iHashCode == -1158014083) {
            if (behavior.equals("overlay-swipe")) {
                c1Var.g(2);
                successCallback.invoke();
                return;
            }
            failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
        }
        if (iHashCode == -342250870) {
            if (behavior.equals("inset-swipe")) {
                c1Var.g(1);
                successCallback.invoke();
                return;
            }
            failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
        }
        if (iHashCode == -341554545 && behavior.equals("inset-touch")) {
            c1Var.g(0);
            successCallback.invoke();
            return;
        }
        failureCallback.invoke("Invalid behavior: \"" + behavior + "\"");
    }

    public final void q(Activity activity, int i10, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        if (Build.VERSION.SDK_INT < 28) {
            failureCallback.invoke("'setBorderColorAsync' is only available on Android API 28 or higher");
        } else {
            activity.getWindow().setNavigationBarDividerColor(i10);
            successCallback.invoke();
        }
    }

    public final void t(Activity activity, String buttonStyle, Function0 successCallback, Function1 failureCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        c1 c1Var = new c1(activity.getWindow(), activity.getWindow().getDecorView());
        if (Intrinsics.b(buttonStyle, "light")) {
            c1Var.e(false);
        } else {
            if (!Intrinsics.b(buttonStyle, "dark")) {
                failureCallback.invoke("Invalid style: \"" + buttonStyle + "\"");
                return;
            }
            c1Var.e(true);
        }
        successCallback.invoke();
    }

    public final void y(Activity activity, String position, Function0 successCallback, Function1 failureCallback) {
        boolean z10;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        if (Intrinsics.b(position, "absolute")) {
            z10 = false;
        } else {
            if (!Intrinsics.b(position, "relative")) {
                failureCallback.invoke("Invalid position: \"" + position + "\"");
                return;
            }
            z10 = true;
        }
        AbstractC1921n0.b(activity.getWindow(), z10);
        activity.getWindow().getDecorView().setFitsSystemWindows(z10);
        successCallback.invoke();
    }
}
