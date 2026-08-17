package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3635g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3639i f44892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f44893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44894c;

    public /* synthetic */ RunnableC3635g(C3639i c3639i, Runnable runnable, String str) {
        this.f44892a = c3639i;
        this.f44893b = runnable;
        this.f44894c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3639i.c(this.f44892a, this.f44893b, this.f44894c);
    }
}
