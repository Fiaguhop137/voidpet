package com.android.billingclient.api;

import p131h4.C3445a;
import p131h4.InterfaceC3446b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f27572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3445a f27573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3446b f27574c;

    public /* synthetic */ T(Z z10, C3445a c3445a, InterfaceC3446b interfaceC3446b) {
        this.f27572a = z10;
        this.f27573b = c3445a;
        this.f27574c = interfaceC3446b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.android.billingclient.api.c*/.a(this.f27573b, this.f27574c);
    }
}
