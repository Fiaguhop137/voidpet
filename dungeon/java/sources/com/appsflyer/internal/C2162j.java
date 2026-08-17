package com.appsflyer.internal;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.appsflyer.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2162j implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1cSDK f28511a;

    public /* synthetic */ C2162j(AFb1cSDK aFb1cSDK) {
        this.f28511a = aFb1cSDK;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        AFb1cSDK.getMonetizationNetwork(this.f28511a, (AppSetIdInfo) obj);
    }
}
