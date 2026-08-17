package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        if (mediationNetwork2 != -1 && monetizationNetwork == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (pairAFAdRevenueData != null) {
            return ((Number) pairAFAdRevenueData.c()).intValue() <= mediationNetwork && mediationNetwork <= ((Number) pairAFAdRevenueData.d()).intValue();
        }
        return monetizationNetwork != null && ((Number) monetizationNetwork.c()).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.d()).intValue();
    }
}
