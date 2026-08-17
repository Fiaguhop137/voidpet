package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC3827y2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f46704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3725j2 f46705b;

    public /* synthetic */ CallableC3827y2(InterfaceC3703f0 interfaceC3703f0, AbstractC3725j2 abstractC3725j2) {
        this.f46704a = interfaceC3703f0;
        this.f46705b = abstractC3725j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.o(this.f46704a, this.f46705b);
    }
}
