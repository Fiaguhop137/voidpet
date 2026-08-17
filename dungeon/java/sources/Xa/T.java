package Xa;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f15883n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f15884o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1650m f15885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B f15888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f15890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final N f15892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1649l0 f15896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final H0 f15897m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public T(C1650m c1650m, String formattedPrice, String str, B b10, String str2, List offerTags, String offerToken, N n10, String priceAmountMicros, String priceCurrencyCode, String str3, C1649l0 c1649l0, H0 h10) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.f15885a = c1650m;
        this.f15886b = formattedPrice;
        this.f15887c = str;
        this.f15888d = b10;
        this.f15889e = str2;
        this.f15890f = offerTags;
        this.f15891g = offerToken;
        this.f15892h = n10;
        this.f15893i = priceAmountMicros;
        this.f15894j = priceCurrencyCode;
        this.f15895k = str3;
        this.f15896l = c1649l0;
        this.f15897m = h10;
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "ProductAndroidOneTimePurchaseOfferDetail");
        C1650m c1650m = this.f15885a;
        Pair pairA2 = Ad.v.a("discountDisplayInfo", c1650m != null ? c1650m.a() : null);
        Pair pairA3 = Ad.v.a("formattedPrice", this.f15886b);
        Pair pairA4 = Ad.v.a("fullPriceMicros", this.f15887c);
        B b10 = this.f15888d;
        Pair pairA5 = Ad.v.a("limitedQuantityInfo", b10 != null ? b10.a() : null);
        Pair pairA6 = Ad.v.a("offerId", this.f15889e);
        Pair pairA7 = Ad.v.a("offerTags", this.f15890f);
        Pair pairA8 = Ad.v.a("offerToken", this.f15891g);
        N n10 = this.f15892h;
        Pair pairA9 = Ad.v.a("preorderDetailsAndroid", n10 != null ? n10.a() : null);
        Pair pairA10 = Ad.v.a("priceAmountMicros", this.f15893i);
        Pair pairA11 = Ad.v.a("priceCurrencyCode", this.f15894j);
        Pair pairA12 = Ad.v.a("purchaseOptionId", this.f15895k);
        C1649l0 c1649l0 = this.f15896l;
        Pair pairA13 = Ad.v.a("rentalDetailsAndroid", c1649l0 != null ? c1649l0.a() : null);
        H0 h10 = this.f15897m;
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, Ad.v.a("validTimeWindow", h10 != null ? h10.a() : null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return Intrinsics.b(this.f15885a, t10.f15885a) && Intrinsics.b(this.f15886b, t10.f15886b) && Intrinsics.b(this.f15887c, t10.f15887c) && Intrinsics.b(this.f15888d, t10.f15888d) && Intrinsics.b(this.f15889e, t10.f15889e) && Intrinsics.b(this.f15890f, t10.f15890f) && Intrinsics.b(this.f15891g, t10.f15891g) && Intrinsics.b(this.f15892h, t10.f15892h) && Intrinsics.b(this.f15893i, t10.f15893i) && Intrinsics.b(this.f15894j, t10.f15894j) && Intrinsics.b(this.f15895k, t10.f15895k) && Intrinsics.b(this.f15896l, t10.f15896l) && Intrinsics.b(this.f15897m, t10.f15897m);
    }

    public int hashCode() {
        C1650m c1650m = this.f15885a;
        int iHashCode = (((c1650m == null ? 0 : c1650m.hashCode()) * 31) + this.f15886b.hashCode()) * 31;
        String str = this.f15887c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        B b10 = this.f15888d;
        int iHashCode3 = (iHashCode2 + (b10 == null ? 0 : b10.hashCode())) * 31;
        String str2 = this.f15889e;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15890f.hashCode()) * 31) + this.f15891g.hashCode()) * 31;
        N n10 = this.f15892h;
        int iHashCode5 = (((((iHashCode4 + (n10 == null ? 0 : n10.hashCode())) * 31) + this.f15893i.hashCode()) * 31) + this.f15894j.hashCode()) * 31;
        String str3 = this.f15895k;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1649l0 c1649l0 = this.f15896l;
        int iHashCode7 = (iHashCode6 + (c1649l0 == null ? 0 : c1649l0.hashCode())) * 31;
        H0 h10 = this.f15897m;
        return iHashCode7 + (h10 != null ? h10.hashCode() : 0);
    }

    public String toString() {
        return "ProductAndroidOneTimePurchaseOfferDetail(discountDisplayInfo=" + this.f15885a + ", formattedPrice=" + this.f15886b + ", fullPriceMicros=" + this.f15887c + ", limitedQuantityInfo=" + this.f15888d + ", offerId=" + this.f15889e + ", offerTags=" + this.f15890f + ", offerToken=" + this.f15891g + ", preorderDetailsAndroid=" + this.f15892h + ", priceAmountMicros=" + this.f15893i + ", priceCurrencyCode=" + this.f15894j + ", purchaseOptionId=" + this.f15895k + ", rentalDetailsAndroid=" + this.f15896l + ", validTimeWindow=" + this.f15897m + ")";
    }
}
