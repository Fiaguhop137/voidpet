package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1lSDK implements AFi1oSDK {

    @Nullable
    private String getCurrencyIso4217Code;

    private static String AFAdRevenueData(Activity activity) {
        Uri uriK_ = AFb1qSDK.k_(activity != null ? activity.getIntent() : null);
        String string = uriK_ != null ? uriK_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getMediationNetwork(string)) {
            return null;
        }
        return string;
    }

    private static boolean getMediationNetwork(String str) {
        return StringsKt.O(str, "android-app://", false, 2, null);
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    @NotNull
    public final String getMediationNetwork(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    public final void getMonetizationNetwork(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getCurrencyIso4217Code;
        if (str == null || str.length() == 0) {
            this.getCurrencyIso4217Code = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1oSDK
    @Nullable
    public final String getRevenue(@Nullable Activity activity) {
        String str = this.getCurrencyIso4217Code;
        this.getCurrencyIso4217Code = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }
}
