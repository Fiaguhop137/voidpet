package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f28447a;

    public /* synthetic */ c(AFh1ySDK[] aFh1ySDKArr) {
        this.f28447a = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getCurrencyIso4217Code(this.f28447a);
    }
}
