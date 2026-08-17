package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f28518a;

    public /* synthetic */ s(AFd1wSDK aFd1wSDK) {
        this.f28518a = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFd1wSDK.getMonetizationNetwork(this.f28518a);
    }
}
