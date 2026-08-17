package io.sentry.cache;

import io.sentry.C3697e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3697e f45718b;

    public /* synthetic */ n(t tVar, C3697e c3697e) {
        this.f45717a = tVar;
        this.f45718b = c3697e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.x(this.f45717a, this.f45718b);
    }
}
