package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T2.a f44373a;

    public /* synthetic */ K2(T2.a aVar) {
        this.f44373a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f44373a.a();
    }
}
