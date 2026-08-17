package io.sentry.cache;

import io.sentry.protocol.I;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f45708b;

    public /* synthetic */ i(t tVar, I i10) {
        this.f45707a = tVar;
        this.f45708b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.p(this.f45707a, this.f45708b);
    }
}
