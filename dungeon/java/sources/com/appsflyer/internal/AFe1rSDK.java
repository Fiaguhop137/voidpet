package com.appsflyer.internal;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "getRevenue", "Ljava/lang/String;", "getMediationNetwork", "AFa1ySDK", "AFa1tSDK", "AFa1zSDK", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFe1rSDK {

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> getMediationNetwork = CollectionsKt.o("af_achievement_unlocked", "af_ad_click", "af_ad_view", "af_add_payment_info", "af_add_to_cart", "af_add_to_wishlist", "af_complete_registration", "af_content_view", "af_initiated_checkout", "af_invite", "af_level_achieved", "af_list_view", "af_login", "af_opened_from_push_notification", "af_purchase", "af_rate", "af_re_engage", "af_search", "af_share", "af_spent_credits", "af_start_trial", "af_subscribe", "af_travel_booking", "af_tutorial_completion", "af_update");

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1tSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1tSDK extends AFe1rSDK {

        @NotNull
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK extends AFe1rSDK {

        @NotNull
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1rSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFe1rSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFe1rSDK;", "", "", "Ljava/util/List;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static AFe1rSDK getMediationNetwork(@NotNull AFh1mSDK p10) {
            String string;
            Object obj;
            String string2;
            Intrinsics.checkNotNullParameter(p10, "");
            if (p10.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
                return AFa1tSDK.INSTANCE;
            }
            Integer intOrNull = null;
            if (p10.AFAdRevenueData() != AFe1pSDK.INAPP || !AFe1rSDK.getMediationNetwork.contains(p10.areAllFieldsValid)) {
                return null;
            }
            Map<String, Object> map = p10.getRevenue;
            Float fO = (map == null || (obj = map.get("af_revenue")) == null || (string2 = obj.toString()) == null) ? null : StringsKt.o(string2);
            Object obj2 = p10.AFAdRevenueData.get("iaecounter");
            if (obj2 != null && (string = obj2.toString()) != null) {
                intOrNull = StringsKt.toIntOrNull(string);
            }
            String str = p10.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new AFa1zSDK(str, fO, intOrNull);
        }
    }

    public static final class AFa1zSDK extends AFe1rSDK {

        @Nullable
        public final Integer AFAdRevenueData;

        @Nullable
        public final Float getCurrencyIso4217Code;

        @NotNull
        private final String getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1zSDK(@NotNull String str, @Nullable Float f10, @Nullable Integer num) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            this.getMediationNetwork = str;
            this.getCurrencyIso4217Code = f10;
            this.AFAdRevenueData = num;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.b(this.getMediationNetwork, aFa1zSDK.getMediationNetwork) && Intrinsics.b(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) && Intrinsics.b(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = this.getMediationNetwork.hashCode() * 31;
            Float f10 = this.getCurrencyIso4217Code;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            Integer num = this.AFAdRevenueData;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "PredefinedInAppEvent(name=" + this.getMediationNetwork + ", eventRevenue=" + this.getCurrencyIso4217Code + ", eventCounter=" + this.AFAdRevenueData + ")";
        }
    }

    public AFe1rSDK(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork = str;
    }
}
