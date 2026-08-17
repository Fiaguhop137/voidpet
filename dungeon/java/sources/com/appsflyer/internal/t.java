package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f28519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f28520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28521c;

    public /* synthetic */ t(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        this.f28519a = aFd1wSDK;
        this.f28520b = th;
        this.f28521c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFd1wSDK.getCurrencyIso4217Code(this.f28519a, this.f28520b, this.f28521c);
    }
}
