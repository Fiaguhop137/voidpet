package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1rSDK f28477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28478b;

    public /* synthetic */ E(AFj1rSDK aFj1rSDK, Context context) {
        this.f28477a = aFj1rSDK;
        this.f28478b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFj1rSDK.getRevenue(this.f28477a, this.f28478b);
    }
}
