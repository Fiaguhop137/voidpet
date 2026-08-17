package Xa;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1652n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f16085q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f16086r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B f16093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f16094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f16095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f16096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final N f16097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final double f16098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f16099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1649l0 f16100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final EnumC1654o f16101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final H0 f16102p;

    /* JADX INFO: renamed from: Xa.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1652n(String currency, String str, String displayPrice, String str2, String str3, String str4, B b10, List list, String str5, Integer num, N n10, double d10, String str6, C1649l0 c1649l0, EnumC1654o type, H0 h10) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16087a = currency;
        this.f16088b = str;
        this.f16089c = displayPrice;
        this.f16090d = str2;
        this.f16091e = str3;
        this.f16092f = str4;
        this.f16093g = b10;
        this.f16094h = list;
        this.f16095i = str5;
        this.f16096j = num;
        this.f16097k = n10;
        this.f16098l = d10;
        this.f16099m = str6;
        this.f16100n = c1649l0;
        this.f16101o = type;
        this.f16102p = h10;
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "DiscountOffer");
        Pair pairA2 = Ad.v.a("currency", this.f16087a);
        Pair pairA3 = Ad.v.a("discountAmountMicrosAndroid", this.f16088b);
        Pair pairA4 = Ad.v.a("displayPrice", this.f16089c);
        Pair pairA5 = Ad.v.a("formattedDiscountAmountAndroid", this.f16090d);
        Pair pairA6 = Ad.v.a("fullPriceMicrosAndroid", this.f16091e);
        Pair pairA7 = Ad.v.a("id", this.f16092f);
        B b10 = this.f16093g;
        Pair pairA8 = Ad.v.a("limitedQuantityInfoAndroid", b10 != null ? b10.a() : null);
        Pair pairA9 = Ad.v.a("offerTagsAndroid", this.f16094h);
        Pair pairA10 = Ad.v.a("offerTokenAndroid", this.f16095i);
        Pair pairA11 = Ad.v.a("percentageDiscountAndroid", this.f16096j);
        N n10 = this.f16097k;
        Pair pairA12 = Ad.v.a("preorderDetailsAndroid", n10 != null ? n10.a() : null);
        Pair pairA13 = Ad.v.a("price", Double.valueOf(this.f16098l));
        Pair pairA14 = Ad.v.a("purchaseOptionIdAndroid", this.f16099m);
        C1649l0 c1649l0 = this.f16100n;
        Pair pairA15 = Ad.v.a("rentalDetailsAndroid", c1649l0 != null ? c1649l0.a() : null);
        Pair pairA16 = Ad.v.a("type", this.f16101o.g());
        H0 h10 = this.f16102p;
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, Ad.v.a("validTimeWindowAndroid", h10 != null ? h10.a() : null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1652n)) {
            return false;
        }
        C1652n c1652n = (C1652n) obj;
        return Intrinsics.b(this.f16087a, c1652n.f16087a) && Intrinsics.b(this.f16088b, c1652n.f16088b) && Intrinsics.b(this.f16089c, c1652n.f16089c) && Intrinsics.b(this.f16090d, c1652n.f16090d) && Intrinsics.b(this.f16091e, c1652n.f16091e) && Intrinsics.b(this.f16092f, c1652n.f16092f) && Intrinsics.b(this.f16093g, c1652n.f16093g) && Intrinsics.b(this.f16094h, c1652n.f16094h) && Intrinsics.b(this.f16095i, c1652n.f16095i) && Intrinsics.b(this.f16096j, c1652n.f16096j) && Intrinsics.b(this.f16097k, c1652n.f16097k) && Double.compare(this.f16098l, c1652n.f16098l) == 0 && Intrinsics.b(this.f16099m, c1652n.f16099m) && Intrinsics.b(this.f16100n, c1652n.f16100n) && this.f16101o == c1652n.f16101o && Intrinsics.b(this.f16102p, c1652n.f16102p);
    }

    public int hashCode() {
        int iHashCode = this.f16087a.hashCode() * 31;
        String str = this.f16088b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16089c.hashCode()) * 31;
        String str2 = this.f16090d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16091e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16092f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        B b10 = this.f16093g;
        int iHashCode6 = (iHashCode5 + (b10 == null ? 0 : b10.hashCode())) * 31;
        List list = this.f16094h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f16095i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f16096j;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        N n10 = this.f16097k;
        int iHashCode10 = (((iHashCode9 + (n10 == null ? 0 : n10.hashCode())) * 31) + Double.hashCode(this.f16098l)) * 31;
        String str6 = this.f16099m;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C1649l0 c1649l0 = this.f16100n;
        int iHashCode12 = (((iHashCode11 + (c1649l0 == null ? 0 : c1649l0.hashCode())) * 31) + this.f16101o.hashCode()) * 31;
        H0 h10 = this.f16102p;
        return iHashCode12 + (h10 != null ? h10.hashCode() : 0);
    }

    public String toString() {
        return "DiscountOffer(currency=" + this.f16087a + ", discountAmountMicrosAndroid=" + this.f16088b + ", displayPrice=" + this.f16089c + ", formattedDiscountAmountAndroid=" + this.f16090d + ", fullPriceMicrosAndroid=" + this.f16091e + ", id=" + this.f16092f + ", limitedQuantityInfoAndroid=" + this.f16093g + ", offerTagsAndroid=" + this.f16094h + ", offerTokenAndroid=" + this.f16095i + ", percentageDiscountAndroid=" + this.f16096j + ", preorderDetailsAndroid=" + this.f16097k + ", price=" + this.f16098l + ", purchaseOptionIdAndroid=" + this.f16099m + ", rentalDetailsAndroid=" + this.f16100n + ", type=" + this.f16101o + ", validTimeWindowAndroid=" + this.f16102p + ")";
    }
}
