package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1rSDK {

    @NotNull
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;

    @Nullable
    public final String getRevenue;

    public AFi1rSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
        this.getMonetizationNetwork = str3;
        this.getMediationNetwork = z10;
    }

    public final boolean getMediationNetwork() {
        return this.getMediationNetwork;
    }
}
