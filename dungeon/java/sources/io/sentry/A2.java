package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f44196a;

    public /* synthetic */ A2(T2.a aVar) {
        this.f44196a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44196a.a();
    }
}
