package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f28522a;

    public /* synthetic */ u(AFd1wSDK aFd1wSDK) {
        this.f28522a = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFd1wSDK.getMediationNetwork(this.f28522a);
    }
}
