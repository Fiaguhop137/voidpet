package Zc;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.splashscreen.SplashScreenOptions;
import kotlin.jvm.internal.Intrinsics;
import p163j1.g;
import p163j1.r;
import p163j1.s;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f18923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static g f18924d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18921a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f18922b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReactMarker.MarkerListener f18925e = new Zc.a();

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f18926a;

        a(View view) {
            this.f18926a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (d.f18922b) {
                return false;
            }
            this.f18926a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    private d() {
    }

    private final void e(SplashScreenOptions splashScreenOptions) {
        if (f18924d == null) {
            return;
        }
        long duration = splashScreenOptions.getDuration();
        g gVar = f18924d;
        if (gVar == null) {
            Intrinsics.r("splashScreen");
            gVar = null;
        }
        gVar.c(new b(duration));
    }

    static /* synthetic */ void f(d dVar, SplashScreenOptions splashScreenOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            splashScreenOptions = new SplashScreenOptions();
        }
        dVar.e(splashScreenOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j10, s splashScreenViewProvider) {
        Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
        View viewA = splashScreenViewProvider.a();
        viewA.animate().setDuration(j10).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new c(splashScreenViewProvider, viewA)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(s sVar, View view) {
        if (Build.VERSION.SDK_INT < 31) {
            sVar.b();
        } else {
            Intrinsics.d(view, "null cannot be cast to non-null type android.window.SplashScreenView");
            r.a(view).remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ReactMarkerConstants name, String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name != ReactMarkerConstants.CONTENT_APPEARED || f18923c) {
            return;
        }
        f18921a.j();
    }

    public final void j() {
        f18922b = false;
    }

    public final void k(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f18924d = g.f46753b.a(activity);
        ReactMarker.addListener(f18925e);
        View viewFindViewById = activity.findViewById(16908290);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        f(this, null, 1, null);
    }

    public final void l(boolean z10) {
        f18923c = z10;
    }

    public final void m(SplashScreenOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        e(options);
    }

    public final void n() {
        ReactMarker.removeListener(f18925e);
    }
}
