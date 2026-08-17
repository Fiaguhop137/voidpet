package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28480b;

    public /* synthetic */ F(AFj1sSDK aFj1sSDK, Runnable runnable) {
        this.f28479a = aFj1sSDK;
        this.f28480b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28479a.AFAdRevenueData(this.f28480b);
    }
}
