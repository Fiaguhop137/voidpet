package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1lSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V", "", "getMonetizationNetwork", "(Ljava/lang/String;)Z", "", "getRevenue", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/Map;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFa1lSDK;", "getMediationNetwork", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1jSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    final AFa1lSDK getMediationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> AFAdRevenueData;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1jSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFa1jSDK;", "Lcom/appsflyer/internal/AFa1lSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static AFa1jSDK AFAdRevenueData(@NotNull AFh1mSDK p10) {
            Intrinsics.checkNotNullParameter(p10, "");
            Map<String, Object> map = p10.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, null);
        }

        @NotNull
        public static AFa1jSDK getRevenue(@NotNull AFa1lSDK p10) {
            Intrinsics.checkNotNullParameter(p10, "");
            return new AFa1jSDK(new LinkedHashMap(), p10, null);
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.AFAdRevenueData = map;
        this.getMediationNetwork = aFa1lSDK;
    }

    /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : aFa1lSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }

    @NotNull
    public static final AFa1jSDK getCurrencyIso4217Code(@NotNull AFh1mSDK aFh1mSDK) {
        return Companion.AFAdRevenueData(aFh1mSDK);
    }

    @NotNull
    public static final AFa1jSDK getMediationNetwork(@NotNull AFa1lSDK aFa1lSDK) {
        return Companion.getRevenue(aFa1lSDK);
    }

    public final boolean getMonetizationNetwork(@NotNull String p10) {
        Intrinsics.checkNotNullParameter(p10, "");
        return this.AFAdRevenueData.containsKey(p10);
    }

    public final void getRevenue(@NotNull String p10, @Nullable Object p11) {
        Intrinsics.checkNotNullParameter(p10, "");
        this.AFAdRevenueData.put(p10, p11);
        AFa1lSDK aFa1lSDK = this.getMediationNetwork;
        if (aFa1lSDK != null) {
            aFa1lSDK.getMonetizationNetwork(this.AFAdRevenueData);
        }
    }
}
