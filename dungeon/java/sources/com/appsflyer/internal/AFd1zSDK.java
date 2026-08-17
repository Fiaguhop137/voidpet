package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1zSDK {
    @NonNull
    AFc1oSDK AFAdRevenueData();

    @NonNull
    AFc1hSDK AFInAppEventParameterName();

    @NonNull
    AFf1eSDK AFInAppEventType();

    @NonNull
    AFe1vSDK AFKeystoreWrapper();

    @NonNull
    AFj1sSDK AFLogger();

    @NonNull
    AFf1fSDK afDebugLog();

    AFi1hSDK afErrorLog();

    @NonNull
    AFd1xSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFg1bSDK afInfoLog();

    @NonNull
    AFb1hSDK afLogForce();

    @NonNull
    AFa1lSDK afVerboseLog();

    AFh1pSDK afWarnLog();

    @NonNull
    AFh1xSDK areAllFieldsValid();

    @NonNull
    AFf1kSDK component1();

    @NonNull
    PurchaseHandler component2();

    @NonNull
    AFg1nSDK component3();

    @NonNull
    AFc1qSDK component4();

    @NonNull
    AFd1oSDK copy();

    @NonNull
    AFe1oSDK copydefault();

    @NonNull
    AFi1pSDK d();

    @NonNull
    AFa1cSDK e();

    @NonNull
    AFj1lSDK equals();

    @NonNull
    AFc1eSDK force();

    @NonNull
    AFe1sSDK getCurrencyIso4217Code();

    @NonNull
    ScheduledExecutorService getMediationNetwork();

    @NonNull
    ExecutorService getMonetizationNetwork();

    @NonNull
    AFd1nSDK getRevenue();

    @NonNull
    AFa1mSDK i();

    @NonNull
    AFc1tSDK registerClient();

    @NonNull
    AFi1kSDK unregisterClient();

    @NonNull
    AFb1aSDK v();

    @NonNull
    AFi1oSDK w();
}
