package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3817w2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f46691a;

    public /* synthetic */ CallableC3817w2(T2.a aVar) {
        this.f46691a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.f46691a.a().length);
    }
}
