package io.sentry.metrics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f45994a;

    public /* synthetic */ f(g gVar) {
        this.f45994a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f45994a;
        gVar.f45998d.a(gVar.f45995a.getShutdownTimeoutMillis());
    }
}
