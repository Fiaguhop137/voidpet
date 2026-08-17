package Xa;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f15343t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f15344u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1665z f15349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Integer f15353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f15354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final L f15356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final B0 f15357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f15358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final double f15359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final P f15360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f15361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Double f15362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final EnumC1654o f15363s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public A0(String str, String str2, String displayPrice, String id2, C1665z c1665z, String str3, String str4, String str5, Integer num, List list, String str6, L l10, B0 b10, Integer num2, double d10, P p10, String str7, Double d11, EnumC1654o type) {
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15345a = str;
        this.f15346b = str2;
        this.f15347c = displayPrice;
        this.f15348d = id2;
        this.f15349e = c1665z;
        this.f15350f = str3;
        this.f15351g = str4;
        this.f15352h = str5;
        this.f15353i = num;
        this.f15354j = list;
        this.f15355k = str6;
        this.f15356l = l10;
        this.f15357m = b10;
        this.f15358n = num2;
        this.f15359o = d10;
        this.f15360p = p10;
        this.f15361q = str7;
        this.f15362r = d11;
        this.f15363s = type;
    }

    public /* synthetic */ A0(String str, String str2, String str3, String str4, C1665z c1665z, String str5, String str6, String str7, Integer num, List list, String str8, L l10, B0 b10, Integer num2, double d10, P p10, String str9, Double d11, EnumC1654o enumC1654o, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, str3, str4, (i10 & 16) != 0 ? null : c1665z, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : num, (i10 & 512) != 0 ? null : list, (i10 & 1024) != 0 ? null : str8, (i10 & 2048) != 0 ? null : l10, (i10 & 4096) != 0 ? null : b10, (i10 & 8192) != 0 ? null : num2, d10, (32768 & i10) != 0 ? null : p10, (65536 & i10) != 0 ? null : str9, (i10 & 131072) != 0 ? null : d11, enumC1654o);
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "SubscriptionOffer");
        Pair pairA2 = Ad.v.a("basePlanIdAndroid", this.f15345a);
        Pair pairA3 = Ad.v.a("currency", this.f15346b);
        Pair pairA4 = Ad.v.a("displayPrice", this.f15347c);
        Pair pairA5 = Ad.v.a("id", this.f15348d);
        C1665z c1665z = this.f15349e;
        Pair pairA6 = Ad.v.a("installmentPlanDetailsAndroid", c1665z != null ? c1665z.a() : null);
        Pair pairA7 = Ad.v.a("keyIdentifierIOS", this.f15350f);
        Pair pairA8 = Ad.v.a("localizedPriceIOS", this.f15351g);
        Pair pairA9 = Ad.v.a("nonceIOS", this.f15352h);
        Pair pairA10 = Ad.v.a("numberOfPeriodsIOS", this.f15353i);
        Pair pairA11 = Ad.v.a("offerTagsAndroid", this.f15354j);
        Pair pairA12 = Ad.v.a("offerTokenAndroid", this.f15355k);
        L l10 = this.f15356l;
        Pair pairA13 = Ad.v.a("paymentMode", l10 != null ? l10.g() : null);
        B0 b10 = this.f15357m;
        Pair pairA14 = Ad.v.a("period", b10 != null ? b10.a() : null);
        Pair pairA15 = Ad.v.a("periodCount", this.f15358n);
        Pair pairA16 = Ad.v.a("price", Double.valueOf(this.f15359o));
        P p10 = this.f15360p;
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, Ad.v.a("pricingPhasesAndroid", p10 != null ? p10.a() : null), Ad.v.a("signatureIOS", this.f15361q), Ad.v.a("timestampIOS", this.f15362r), Ad.v.a("type", this.f15363s.g()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a10 = (A0) obj;
        return Intrinsics.b(this.f15345a, a10.f15345a) && Intrinsics.b(this.f15346b, a10.f15346b) && Intrinsics.b(this.f15347c, a10.f15347c) && Intrinsics.b(this.f15348d, a10.f15348d) && Intrinsics.b(this.f15349e, a10.f15349e) && Intrinsics.b(this.f15350f, a10.f15350f) && Intrinsics.b(this.f15351g, a10.f15351g) && Intrinsics.b(this.f15352h, a10.f15352h) && Intrinsics.b(this.f15353i, a10.f15353i) && Intrinsics.b(this.f15354j, a10.f15354j) && Intrinsics.b(this.f15355k, a10.f15355k) && this.f15356l == a10.f15356l && Intrinsics.b(this.f15357m, a10.f15357m) && Intrinsics.b(this.f15358n, a10.f15358n) && Double.compare(this.f15359o, a10.f15359o) == 0 && Intrinsics.b(this.f15360p, a10.f15360p) && Intrinsics.b(this.f15361q, a10.f15361q) && Intrinsics.b(this.f15362r, a10.f15362r) && this.f15363s == a10.f15363s;
    }

    public int hashCode() {
        String str = this.f15345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15346b;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15347c.hashCode()) * 31) + this.f15348d.hashCode()) * 31;
        C1665z c1665z = this.f15349e;
        int iHashCode3 = (iHashCode2 + (c1665z == null ? 0 : c1665z.hashCode())) * 31;
        String str3 = this.f15350f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15351g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15352h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f15353i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f15354j;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.f15355k;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        L l10 = this.f15356l;
        int iHashCode10 = (iHashCode9 + (l10 == null ? 0 : l10.hashCode())) * 31;
        B0 b10 = this.f15357m;
        int iHashCode11 = (iHashCode10 + (b10 == null ? 0 : b10.hashCode())) * 31;
        Integer num2 = this.f15358n;
        int iHashCode12 = (((iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31) + Double.hashCode(this.f15359o)) * 31;
        P p10 = this.f15360p;
        int iHashCode13 = (iHashCode12 + (p10 == null ? 0 : p10.hashCode())) * 31;
        String str7 = this.f15361q;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d10 = this.f15362r;
        return ((iHashCode14 + (d10 != null ? d10.hashCode() : 0)) * 31) + this.f15363s.hashCode();
    }

    public String toString() {
        return "SubscriptionOffer(basePlanIdAndroid=" + this.f15345a + ", currency=" + this.f15346b + ", displayPrice=" + this.f15347c + ", id=" + this.f15348d + ", installmentPlanDetailsAndroid=" + this.f15349e + ", keyIdentifierIOS=" + this.f15350f + ", localizedPriceIOS=" + this.f15351g + ", nonceIOS=" + this.f15352h + ", numberOfPeriodsIOS=" + this.f15353i + ", offerTagsAndroid=" + this.f15354j + ", offerTokenAndroid=" + this.f15355k + ", paymentMode=" + this.f15356l + ", period=" + this.f15357m + ", periodCount=" + this.f15358n + ", price=" + this.f15359o + ", pricingPhasesAndroid=" + this.f15360p + ", signatureIOS=" + this.f15361q + ", timestampIOS=" + this.f15362r + ", type=" + this.f15363s + ")";
    }
}
