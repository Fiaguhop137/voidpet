package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1vSDK implements AFd1uSDK {

    @NotNull
    private final AFc1cSDK getMonetizationNetwork;

    public AFd1vSDK(@NotNull AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1cSDK, "");
        this.getMonetizationNetwork = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getMonetizationNetwork(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1tSDK(bArr, map, 2000).AFAdRevenueData()) {
            this.getMonetizationNetwork.getCurrencyIso4217Code();
        }
    }
}
