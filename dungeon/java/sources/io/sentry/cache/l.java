package io.sentry.cache;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f45714b;

    public /* synthetic */ l(t tVar, Runnable runnable) {
        this.f45713a = tVar;
        this.f45714b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.v(this.f45713a, this.f45714b);
    }
}
