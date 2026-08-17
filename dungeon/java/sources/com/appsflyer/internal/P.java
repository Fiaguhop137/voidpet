package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1ySDK f28496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28497b;

    public /* synthetic */ P(AFj1ySDK aFj1ySDK, Context context) {
        this.f28496a = aFj1ySDK;
        this.f28497b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFj1ySDK.getRevenue(this.f28496a, this.f28497b);
    }
}
