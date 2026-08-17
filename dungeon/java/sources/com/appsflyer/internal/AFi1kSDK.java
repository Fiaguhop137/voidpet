package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1kSDK {
    @NotNull
    Map<String, Object> getCurrencyIso4217Code();

    void getRevenue(@NotNull PluginInfo pluginInfo);
}
