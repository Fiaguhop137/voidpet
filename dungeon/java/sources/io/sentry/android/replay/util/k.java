package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f45582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f45583b;

    public /* synthetic */ k(Runnable runnable, l lVar) {
        this.f45582a = runnable;
        this.f45583b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.b(this.f45582a, this.f45583b);
    }
}
