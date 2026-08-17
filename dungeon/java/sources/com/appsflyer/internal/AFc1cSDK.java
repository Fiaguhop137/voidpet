package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1cSDK {
    @Nullable
    String AFAdRevenueData(@NotNull Throwable th, @NotNull String str);

    void getCurrencyIso4217Code(int i10, int i11);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(@NotNull String... strArr);

    @NotNull
    List<ExceptionInfo> getRevenue();
}
