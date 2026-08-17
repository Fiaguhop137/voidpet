package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AFAdRevenueData", "()Z", "getMediationNetwork", "getCurrencyIso4217Code", "Ljava/lang/String;", "getRevenue", "getMonetizationNetwork", "I", "F", "component4", "Ljava/util/List;", "component1", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFi1xSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public List<String> component1;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public final String getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final String getRevenue;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final float getMonetizationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final int AFAdRevenueData;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    public long component4;

    public AFi1xSDK(long j10, float f10, @NotNull List<String> list, int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component4 = j10;
        this.getMonetizationNetwork = f10;
        this.component1 = list;
        this.AFAdRevenueData = i10;
        this.getRevenue = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean AFAdRevenueData() {
        return TimeUnit.SECONDS.toMillis(this.component4) > AFa1ySDK.getRevenue().getMonetizationNetwork().component3().getCurrencyIso4217Code();
    }

    public final boolean equals(@Nullable Object p10) {
        if (this == p10) {
            return true;
        }
        if (!Intrinsics.b(AFi1xSDK.class, p10 != null ? p10.getClass() : null)) {
            return false;
        }
        Intrinsics.d(p10, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) p10;
        return this.component4 == aFi1xSDK.component4 && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.b(this.component1, aFi1xSDK.component1) && this.AFAdRevenueData == aFi1xSDK.AFAdRevenueData && Intrinsics.b(this.getRevenue, aFi1xSDK.getRevenue) && Intrinsics.b(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.component4) * 31) + Float.hashCode(this.getMonetizationNetwork)) * 31) + this.component1.hashCode()) * 31) + this.AFAdRevenueData) * 31) + this.getRevenue.hashCode()) * 31) + this.getCurrencyIso4217Code.hashCode();
    }
}
