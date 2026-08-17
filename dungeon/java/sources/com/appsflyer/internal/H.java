package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f28484b;

    public /* synthetic */ H(AFj1sSDK aFj1sSDK, Runnable runnable) {
        this.f28483a = aFj1sSDK;
        this.f28484b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28483a.component1(this.f28484b);
    }
}
