package io.sentry.cache;

import io.sentry.protocol.x;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f45724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f45725b;

    public /* synthetic */ r(t tVar, x xVar) {
        this.f45724a = tVar;
        this.f45725b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45724a.F(this.f45725b, "replay.json");
    }
}
