package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f28446a;

    public /* synthetic */ b(AFh1ySDK[] aFh1ySDKArr) {
        this.f28446a = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMediationNetwork(this.f28446a);
    }
}
