package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1xSDK {

    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z10);
    }

    void AFAdRevenueData();

    void getMonetizationNetwork();

    void getMonetizationNetwork(AFa1vSDK aFa1vSDK);

    void getMonetizationNetwork(@NonNull Throwable th, @NonNull String str);
}
