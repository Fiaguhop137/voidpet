package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShutdownHookIntegration f44446a;

    public /* synthetic */ P3(ShutdownHookIntegration shutdownHookIntegration) {
        this.f44446a = shutdownHookIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ShutdownHookIntegration shutdownHookIntegration = this.f44446a;
        shutdownHookIntegration.f44474a.removeShutdownHook(shutdownHookIntegration.f44475b);
    }
}
