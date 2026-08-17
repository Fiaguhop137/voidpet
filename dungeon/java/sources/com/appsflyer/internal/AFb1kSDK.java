package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFb1kSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1qSDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;", "p1", "", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1qSDK;)V", "getMonetizationNetwork", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1kSDK {

    @NotNull
    public static final AFb1kSDK INSTANCE = new AFb1kSDK();

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    private static String getCurrencyIso4217Code;

    private AFb1kSDK() {
    }

    @NotNull
    public static final synchronized String getCurrencyIso4217Code(@NotNull AFc1qSDK p10) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(p10, "");
            if (getCurrencyIso4217Code == null) {
                String monetizationNetwork = p10.getMonetizationNetwork("AF_INSTALLATION", (String) null);
                if (monetizationNetwork == null) {
                    monetizationNetwork = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    p10.getRevenue("AF_INSTALLATION", monetizationNetwork);
                }
                getCurrencyIso4217Code = monetizationNetwork;
            }
            str = getCurrencyIso4217Code;
            Intrinsics.c(str);
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static final synchronized void getCurrencyIso4217Code(@NotNull String p10, @NotNull AFc1qSDK p11) {
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        getCurrencyIso4217Code = p10;
        p11.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
        p11.getRevenue("AF_INSTALLATION", p10);
    }
}
