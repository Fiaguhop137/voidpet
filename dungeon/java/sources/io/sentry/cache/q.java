package io.sentry.cache;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45723a;

    public /* synthetic */ q(t tVar) {
        this.f45723a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.s(this.f45723a);
    }
}
