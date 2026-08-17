package p163j1;

import android.window.SplashScreen;
import android.window.SplashScreenView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements SplashScreen.OnExitAnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.c f46772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.e f46773b;

    public /* synthetic */ p(g.c cVar, g.e eVar) {
        this.f46772a = cVar;
        this.f46773b = eVar;
    }

    @Override // android.window.SplashScreen.OnExitAnimationListener
    public final void onSplashScreenExit(SplashScreenView splashScreenView) {
        g.c.q(this.f46772a, this.f46773b, splashScreenView);
    }
}
