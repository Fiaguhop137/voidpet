package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28482b;

    public /* synthetic */ G(AFj1sSDK aFj1sSDK, Runnable runnable) {
        this.f28481a = aFj1sSDK;
        this.f28482b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28481a.getMonetizationNetwork(this.f28482b);
    }
}
