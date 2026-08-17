package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f44348a;

    public /* synthetic */ H2(T2.a aVar) {
        this.f44348a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44348a.a();
    }
}
