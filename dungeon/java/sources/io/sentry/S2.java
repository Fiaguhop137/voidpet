package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3682b f44457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f44459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ILogger f44460d;

    public /* synthetic */ S2(C3682b c3682b, long j10, InterfaceC3703f0 interfaceC3703f0, ILogger iLogger) {
        this.f44457a = c3682b;
        this.f44458b = j10;
        this.f44459c = interfaceC3703f0;
        this.f44460d = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.A(this.f44457a, this.f44458b, this.f44459c, this.f44460d);
    }
}
