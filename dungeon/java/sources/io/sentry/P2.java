package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f44444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3772q3 f44445b;

    public /* synthetic */ P2(InterfaceC3703f0 interfaceC3703f0, C3772q3 c3772q3) {
        this.f44444a = interfaceC3703f0;
        this.f44445b = c3772q3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.t(this.f44444a, this.f44445b);
    }
}
