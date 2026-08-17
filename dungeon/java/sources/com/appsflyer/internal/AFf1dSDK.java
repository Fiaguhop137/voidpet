package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1dSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1dSDK$3, reason: invalid class name */
    final class AnonymousClass3 implements AppsFlyerLVL.resultListener {
        private /* synthetic */ AFa1tSDK getMediationNetwork;

        AnonymousClass3(AFa1tSDK aFa1tSDK) {
            this.getMediationNetwork = aFa1tSDK;
        }

        public final void onLvlFailure(Exception exc) {
            this.getMediationNetwork.getRevenue("onLvlFailure with exception", exc);
        }

        public final void onLvlResult(String str, String str2) {
            if (str != null && str2 != null) {
                this.getMediationNetwork.getMonetizationNetwork(str, str2);
            } else if (str2 == null) {
                this.getMediationNetwork.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signature"));
            } else {
                this.getMediationNetwork.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
            }
        }
    }

    interface AFa1tSDK {
        void getMonetizationNetwork(@NonNull String str, @NonNull String str2);

        void getRevenue(String str, Exception exc);
    }

    public final boolean getRevenue(long j10, @NonNull Context context, @NonNull AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j10, context, new AnonymousClass3(aFa1tSDK));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
