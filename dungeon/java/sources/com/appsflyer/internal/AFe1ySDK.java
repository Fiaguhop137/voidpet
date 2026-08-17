package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1ySDK {

    @NotNull
    final String getCurrencyIso4217Code;

    @NotNull
    final String getMonetizationNetwork;

    public AFe1ySDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1ySDK)) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
        return Intrinsics.b(this.getMonetizationNetwork, aFe1ySDK.getMonetizationNetwork) && Intrinsics.b(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.getCurrencyIso4217Code.hashCode();
    }

    @NotNull
    public final String toString() {
        return "HostConfig(prefix=" + this.getMonetizationNetwork + ", host=" + this.getCurrencyIso4217Code + ")";
    }
}
