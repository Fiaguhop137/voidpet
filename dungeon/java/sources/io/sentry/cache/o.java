package io.sentry.cache;

import io.sentry.protocol.C3759c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3759c f45720b;

    public /* synthetic */ o(t tVar, C3759c c3759c) {
        this.f45719a = tVar;
        this.f45720b = c3759c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45719a.F(this.f45720b, "contexts.json");
    }
}
