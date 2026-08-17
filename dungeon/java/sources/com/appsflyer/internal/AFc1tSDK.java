package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1tSDK {
    @NotNull
    List<AFc1uSDK> getCurrencyIso4217Code();

    @Nullable
    String getMediationNetwork(@NotNull AFc1uSDK aFc1uSDK);

    void getMediationNetwork();

    void getRevenue();

    boolean getRevenue(@Nullable String str);
}
