package com.appsflyer.internal;

/* JADX INFO: renamed from: com.appsflyer.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2164l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1iSDK f28513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFh1qSDK f28514b;

    public /* synthetic */ RunnableC2164l(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        this.f28513a = aFb1iSDK;
        this.f28514b = aFh1qSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFb1iSDK.getMonetizationNetwork(this.f28513a, this.f28514b);
    }
}
