package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2186s f29241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2182n f29242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f29243c;

    public /* synthetic */ r(C2186s c2186s, InterfaceC2182n interfaceC2182n, e0 e0Var) {
        this.f29241a = c2186s;
        this.f29242b = interfaceC2182n;
        this.f29243c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2186s.d(this.f29241a, this.f29242b, this.f29243c);
    }
}
