package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3703f0 f44213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.sentry.clientreport.c f44214b;

    public /* synthetic */ B2(InterfaceC3703f0 interfaceC3703f0, io.sentry.clientreport.c cVar) {
        this.f44213a = interfaceC3703f0;
        this.f44214b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return T2.d(this.f44213a, this.f44214b);
    }
}
