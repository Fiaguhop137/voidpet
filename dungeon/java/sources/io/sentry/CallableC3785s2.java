package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3785s2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f46482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3 f46483b;

    public /* synthetic */ CallableC3785s2(InterfaceC3703f0 interfaceC3703f0, O3 o10) {
        this.f46482a = interfaceC3703f0;
        this.f46483b = o10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.w(this.f46482a, this.f46483b);
    }
}
