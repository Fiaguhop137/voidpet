package com.appsflyer.internal;

/* JADX INFO: renamed from: com.appsflyer.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2163k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1iSDK f28512a;

    public /* synthetic */ RunnableC2163k(AFb1iSDK aFb1iSDK) {
        this.f28512a = aFb1iSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFb1iSDK.getMediationNetwork(this.f28512a);
    }
}
