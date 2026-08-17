package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3822x2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f46701a;

    public /* synthetic */ CallableC3822x2(T2.a aVar) {
        this.f46701a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f46701a.a();
    }
}
