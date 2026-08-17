package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1pSDK {

    @NotNull
    public final Context getMediationNetwork;

    @Nullable
    public AFi1qSDK getMonetizationNetwork;

    public AFi1pSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getMediationNetwork = context;
    }
}
