package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f28489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AFd1zSDK f28490d;

    public /* synthetic */ K(AFj1sSDK aFj1sSDK, Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        this.f28487a = aFj1sSDK;
        this.f28488b = context;
        this.f28489c = runnable;
        this.f28490d = aFd1zSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28487a.getMonetizationNetwork(this.f28488b, this.f28489c, this.f28490d);
    }
}
