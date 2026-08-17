package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFi1aSDK.AnonymousClass3 f28526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f28527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28529d;

    public /* synthetic */ y(AFi1aSDK.AnonymousClass3 anonymousClass3, InstallReferrerClient installReferrerClient, Context context, int i10) {
        this.f28526a = anonymousClass3;
        this.f28527b = installReferrerClient;
        this.f28528c = context;
        this.f28529d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28526a.lambda$onInstallReferrerSetupFinished$0(this.f28527b, this.f28528c, this.f28529d);
    }
}
