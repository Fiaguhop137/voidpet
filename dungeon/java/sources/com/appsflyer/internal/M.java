package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1wSDK f28494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28495b;

    public /* synthetic */ M(AFj1wSDK aFj1wSDK, Context context) {
        this.f28494a = aFj1wSDK;
        this.f28495b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28494a.getMediationNetwork(this.f28495b);
    }
}
