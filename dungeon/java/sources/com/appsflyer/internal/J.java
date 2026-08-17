package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28486b;

    public /* synthetic */ J(AFj1sSDK aFj1sSDK, Runnable runnable) {
        this.f28485a = aFj1sSDK;
        this.f28486b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28485a.getRevenue(this.f28486b);
    }
}
