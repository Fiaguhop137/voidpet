package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f44329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3741m3 f44330b;

    public /* synthetic */ F2(InterfaceC3703f0 interfaceC3703f0, C3741m3 c3741m3) {
        this.f44329a = interfaceC3703f0;
        this.f44330b = c3741m3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.v(this.f44329a, this.f44330b);
    }
}
