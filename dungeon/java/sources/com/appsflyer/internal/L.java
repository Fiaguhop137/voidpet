package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f28491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFi1aSDK f28492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f28493c;

    public /* synthetic */ L(AFj1sSDK aFj1sSDK, AFi1aSDK aFi1aSDK, Runnable runnable) {
        this.f28491a = aFj1sSDK;
        this.f28492b = aFi1aSDK;
        this.f28493c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28491a.getCurrencyIso4217Code(this.f28492b, this.f28493c);
    }
}
