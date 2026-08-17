package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f44452a;

    public /* synthetic */ R2(T2.a aVar) {
        this.f44452a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44452a.a();
    }
}
