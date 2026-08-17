package io.sentry.logger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f45969a;

    public /* synthetic */ f(g gVar) {
        this.f45969a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f45969a;
        gVar.f45973d.a(gVar.f45970a.getShutdownTimeoutMillis());
    }
}
