package Xa;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1627a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15949g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15950h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1665z f15952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P f15956f;

    /* JADX INFO: renamed from: Xa.a0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1627a0(String basePlanId, C1665z c1665z, String str, List offerTags, String offerToken, P pricingPhases) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.f15951a = basePlanId;
        this.f15952b = c1665z;
        this.f15953c = str;
        this.f15954d = offerTags;
        this.f15955e = offerToken;
        this.f15956f = pricingPhases;
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "ProductSubscriptionAndroidOfferDetails");
        Pair pairA2 = Ad.v.a("basePlanId", this.f15951a);
        C1665z c1665z = this.f15952b;
        return kotlin.collections.N.l(pairA, pairA2, Ad.v.a("installmentPlanDetails", c1665z != null ? c1665z.a() : null), Ad.v.a("offerId", this.f15953c), Ad.v.a("offerTags", this.f15954d), Ad.v.a("offerToken", this.f15955e), Ad.v.a("pricingPhases", this.f15956f.a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627a0)) {
            return false;
        }
        C1627a0 c1627a0 = (C1627a0) obj;
        return Intrinsics.b(this.f15951a, c1627a0.f15951a) && Intrinsics.b(this.f15952b, c1627a0.f15952b) && Intrinsics.b(this.f15953c, c1627a0.f15953c) && Intrinsics.b(this.f15954d, c1627a0.f15954d) && Intrinsics.b(this.f15955e, c1627a0.f15955e) && Intrinsics.b(this.f15956f, c1627a0.f15956f);
    }

    public int hashCode() {
        int iHashCode = this.f15951a.hashCode() * 31;
        C1665z c1665z = this.f15952b;
        int iHashCode2 = (iHashCode + (c1665z == null ? 0 : c1665z.hashCode())) * 31;
        String str = this.f15953c;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f15954d.hashCode()) * 31) + this.f15955e.hashCode()) * 31) + this.f15956f.hashCode();
    }

    public String toString() {
        return "ProductSubscriptionAndroidOfferDetails(basePlanId=" + this.f15951a + ", installmentPlanDetails=" + this.f15952b + ", offerId=" + this.f15953c + ", offerTags=" + this.f15954d + ", offerToken=" + this.f15955e + ", pricingPhases=" + this.f15956f + ")";
    }
}
