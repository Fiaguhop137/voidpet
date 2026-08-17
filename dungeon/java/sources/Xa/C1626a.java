package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1626a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0217a f15935n = new C0217a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f15936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Double f15939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Double f15941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f15942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final double f15946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f15947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Boolean f15948m;

    /* JADX INFO: renamed from: Xa.a$a, reason: collision with other inner class name */
    public static final class C0217a {
        private C0217a() {
        }

        public /* synthetic */ C0217a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1626a(Boolean bool, String str, String str2, Double d10, String str3, Double d11, boolean z10, String productId, String str4, String str5, AbstractC1647k0 abstractC1647k0, double d12, String transactionId, Boolean bool2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f15936a = bool;
        this.f15937b = str;
        this.f15938c = str2;
        this.f15939d = d10;
        this.f15940e = str3;
        this.f15941f = d11;
        this.f15942g = z10;
        this.f15943h = productId;
        this.f15944i = str4;
        this.f15945j = str5;
        this.f15946k = d12;
        this.f15947l = transactionId;
        this.f15948m = bool2;
    }

    public /* synthetic */ C1626a(Boolean bool, String str, String str2, Double d10, String str3, Double d11, boolean z10, String str4, String str5, String str6, AbstractC1647k0 abstractC1647k0, double d12, String str7, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : d10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : d11, z10, str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : abstractC1647k0, d12, str7, (i10 & 8192) != 0 ? null : bool2);
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "ActiveSubscription"), Ad.v.a("autoRenewingAndroid", this.f15936a), Ad.v.a("basePlanIdAndroid", this.f15937b), Ad.v.a("currentPlanId", this.f15938c), Ad.v.a("daysUntilExpirationIOS", this.f15939d), Ad.v.a("environmentIOS", this.f15940e), Ad.v.a("expirationDateIOS", this.f15941f), Ad.v.a("isActive", Boolean.valueOf(this.f15942g)), Ad.v.a("productId", this.f15943h), Ad.v.a("purchaseToken", this.f15944i), Ad.v.a("purchaseTokenAndroid", this.f15945j), Ad.v.a("renewalInfoIOS", null), Ad.v.a("transactionDate", Double.valueOf(this.f15946k)), Ad.v.a("transactionId", this.f15947l), Ad.v.a("willExpireSoon", this.f15948m));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626a)) {
            return false;
        }
        C1626a c1626a = (C1626a) obj;
        return Intrinsics.b(this.f15936a, c1626a.f15936a) && Intrinsics.b(this.f15937b, c1626a.f15937b) && Intrinsics.b(this.f15938c, c1626a.f15938c) && Intrinsics.b(this.f15939d, c1626a.f15939d) && Intrinsics.b(this.f15940e, c1626a.f15940e) && Intrinsics.b(this.f15941f, c1626a.f15941f) && this.f15942g == c1626a.f15942g && Intrinsics.b(this.f15943h, c1626a.f15943h) && Intrinsics.b(this.f15944i, c1626a.f15944i) && Intrinsics.b(this.f15945j, c1626a.f15945j) && Intrinsics.b(null, null) && Double.compare(this.f15946k, c1626a.f15946k) == 0 && Intrinsics.b(this.f15947l, c1626a.f15947l) && Intrinsics.b(this.f15948m, c1626a.f15948m);
    }

    public int hashCode() {
        Boolean bool = this.f15936a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f15937b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15938c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f15939d;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str3 = this.f15940e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d11 = this.f15941f;
        int iHashCode6 = (((((iHashCode5 + (d11 == null ? 0 : d11.hashCode())) * 31) + Boolean.hashCode(this.f15942g)) * 31) + this.f15943h.hashCode()) * 31;
        String str4 = this.f15944i;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15945j;
        int iHashCode8 = (((((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 961) + Double.hashCode(this.f15946k)) * 31) + this.f15947l.hashCode()) * 31;
        Boolean bool2 = this.f15948m;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ActiveSubscription(autoRenewingAndroid=" + this.f15936a + ", basePlanIdAndroid=" + this.f15937b + ", currentPlanId=" + this.f15938c + ", daysUntilExpirationIOS=" + this.f15939d + ", environmentIOS=" + this.f15940e + ", expirationDateIOS=" + this.f15941f + ", isActive=" + this.f15942g + ", productId=" + this.f15943h + ", purchaseToken=" + this.f15944i + ", purchaseTokenAndroid=" + this.f15945j + ", renewalInfoIOS=" + ((Object) null) + ", transactionDate=" + this.f15946k + ", transactionId=" + this.f15947l + ", willExpireSoon=" + this.f15948m + ")";
    }
}
