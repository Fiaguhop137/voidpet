package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3832z2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f46711a;

    public /* synthetic */ CallableC3832z2(T2.a aVar) {
        this.f46711a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.f46711a.a().length);
    }
}
