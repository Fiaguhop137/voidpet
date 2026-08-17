package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f28523a;

    public /* synthetic */ v(AFd1wSDK aFd1wSDK) {
        this.f28523a = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFd1wSDK.getRevenue(this.f28523a);
    }
}
