package com.android.billingclient.api;

import p131h4.C3456l;
import p131h4.InterfaceC3457m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f27567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3456l f27568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3457m f27569c;

    public /* synthetic */ Q(Z z10, C3456l c3456l, InterfaceC3457m interfaceC3457m) {
        this.f27567a = z10;
        this.f27568b = c3456l;
        this.f27569c = interfaceC3457m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.android.billingclient.api.c*/.b(this.f27568b, this.f27569c);
    }
}
