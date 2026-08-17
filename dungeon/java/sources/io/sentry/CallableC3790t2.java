package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3790t2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f46497a;

    public /* synthetic */ CallableC3790t2(T2.a aVar) {
        this.f46497a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(this.f46497a.a().length);
    }
}
