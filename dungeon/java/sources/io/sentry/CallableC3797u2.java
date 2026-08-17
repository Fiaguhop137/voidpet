package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3797u2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f46555a;

    public /* synthetic */ CallableC3797u2(T2.a aVar) {
        this.f46555a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f46555a.a();
    }
}
