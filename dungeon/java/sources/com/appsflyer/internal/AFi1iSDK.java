package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK implements AFi1kSDK {

    @NotNull
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.6", null, 4, null);

    @Override // com.appsflyer.internal.AFi1kSDK
    @NotNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        Map<String, Object> mapM = kotlin.collections.N.m(Ad.v.a("platform", this.getMediationNetwork.getPlugin().getPluginName()), Ad.v.a("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            mapM.put("extras", this.getMediationNetwork.getAdditionalParams());
        }
        return mapM;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getRevenue(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMediationNetwork = pluginInfo;
    }
}
