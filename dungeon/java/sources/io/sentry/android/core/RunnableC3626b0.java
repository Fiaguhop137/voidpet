package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3626b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3628c0 f44832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3628c0.b f44833b;

    public /* synthetic */ RunnableC3626b0(C3628c0 c3628c0, C3628c0.b bVar) {
        this.f44832a = c3628c0;
        this.f44833b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44832a.m(this.f44833b);
    }
}
