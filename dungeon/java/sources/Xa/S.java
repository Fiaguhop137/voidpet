package Xa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements U, Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15865q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f15866r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f15875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EnumC1661v f15876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Double f15877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final X f15878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f15879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f15880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f15881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final EnumC1629b0 f15882p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public S(String currency, String str, String description, List list, String str2, String displayPrice, String id2, String nameAndroid, List list2, EnumC1661v platform, Double d10, X x10, List list3, List list4, String title, EnumC1629b0 type) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(nameAndroid, "nameAndroid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15867a = currency;
        this.f15868b = str;
        this.f15869c = description;
        this.f15870d = list;
        this.f15871e = str2;
        this.f15872f = displayPrice;
        this.f15873g = id2;
        this.f15874h = nameAndroid;
        this.f15875i = list2;
        this.f15876j = platform;
        this.f15877k = d10;
        this.f15878l = x10;
        this.f15879m = list3;
        this.f15880n = list4;
        this.f15881o = title;
        this.f15882p = type;
    }

    public /* synthetic */ S(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, List list2, EnumC1661v enumC1661v, Double d10, X x10, List list3, List list4, String str8, EnumC1629b0 enumC1629b0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : str4, str5, str6, str7, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? EnumC1661v.Android : enumC1661v, (i10 & 1024) != 0 ? null : d10, (i10 & 2048) != 0 ? null : x10, (i10 & 4096) != 0 ? null : list3, (i10 & 8192) != 0 ? null : list4, str8, (i10 & 32768) != 0 ? EnumC1629b0.InApp : enumC1629b0);
    }

    @Override // Xa.Q
    public Map a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Pair pairA = Ad.v.a("__typename", "ProductAndroid");
        Pair pairA2 = Ad.v.a("currency", b());
        Pair pairA3 = Ad.v.a("debugDescription", c());
        Pair pairA4 = Ad.v.a("description", d());
        List list = this.f15870d;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1652n) it.next()).a());
            }
        } else {
            arrayList = null;
        }
        Pair pairA5 = Ad.v.a("discountOffers", arrayList);
        Pair pairA6 = Ad.v.a("displayName", e());
        Pair pairA7 = Ad.v.a("displayPrice", f());
        Pair pairA8 = Ad.v.a("id", getId());
        Pair pairA9 = Ad.v.a("nameAndroid", this.f15874h);
        List list2 = this.f15875i;
        if (list2 != null) {
            arrayList2 = new ArrayList(CollectionsKt.w(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((T) it2.next()).a());
            }
        } else {
            arrayList2 = null;
        }
        Pair pairA10 = Ad.v.a("oneTimePurchaseOfferDetailsAndroid", arrayList2);
        Pair pairA11 = Ad.v.a("platform", g().g());
        Pair pairA12 = Ad.v.a("price", h());
        X x10 = this.f15878l;
        Pair pairA13 = Ad.v.a("productStatusAndroid", x10 != null ? x10.g() : null);
        List list3 = this.f15879m;
        if (list3 != null) {
            arrayList3 = new ArrayList(CollectionsKt.w(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((C1627a0) it3.next()).a());
            }
        } else {
            arrayList3 = null;
        }
        Pair pairA14 = Ad.v.a("subscriptionOfferDetailsAndroid", arrayList3);
        List list4 = this.f15880n;
        if (list4 != null) {
            arrayList4 = new ArrayList(CollectionsKt.w(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((A0) it4.next()).a());
            }
        } else {
            arrayList4 = null;
        }
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, Ad.v.a("subscriptionOffers", arrayList4), Ad.v.a("title", i()), Ad.v.a("type", j().g()));
    }

    public String b() {
        return this.f15867a;
    }

    public String c() {
        return this.f15868b;
    }

    public String d() {
        return this.f15869c;
    }

    public String e() {
        return this.f15871e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return Intrinsics.b(this.f15867a, s10.f15867a) && Intrinsics.b(this.f15868b, s10.f15868b) && Intrinsics.b(this.f15869c, s10.f15869c) && Intrinsics.b(this.f15870d, s10.f15870d) && Intrinsics.b(this.f15871e, s10.f15871e) && Intrinsics.b(this.f15872f, s10.f15872f) && Intrinsics.b(this.f15873g, s10.f15873g) && Intrinsics.b(this.f15874h, s10.f15874h) && Intrinsics.b(this.f15875i, s10.f15875i) && this.f15876j == s10.f15876j && Intrinsics.b(this.f15877k, s10.f15877k) && this.f15878l == s10.f15878l && Intrinsics.b(this.f15879m, s10.f15879m) && Intrinsics.b(this.f15880n, s10.f15880n) && Intrinsics.b(this.f15881o, s10.f15881o) && this.f15882p == s10.f15882p;
    }

    public String f() {
        return this.f15872f;
    }

    public EnumC1661v g() {
        return this.f15876j;
    }

    @Override // Xa.U
    public String getId() {
        return this.f15873g;
    }

    public Double h() {
        return this.f15877k;
    }

    public int hashCode() {
        int iHashCode = this.f15867a.hashCode() * 31;
        String str = this.f15868b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15869c.hashCode()) * 31;
        List list = this.f15870d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f15871e;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15872f.hashCode()) * 31) + this.f15873g.hashCode()) * 31) + this.f15874h.hashCode()) * 31;
        List list2 = this.f15875i;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.f15876j.hashCode()) * 31;
        Double d10 = this.f15877k;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        X x10 = this.f15878l;
        int iHashCode7 = (iHashCode6 + (x10 == null ? 0 : x10.hashCode())) * 31;
        List list3 = this.f15879m;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f15880n;
        return ((((iHashCode8 + (list4 != null ? list4.hashCode() : 0)) * 31) + this.f15881o.hashCode()) * 31) + this.f15882p.hashCode();
    }

    public String i() {
        return this.f15881o;
    }

    public EnumC1629b0 j() {
        return this.f15882p;
    }

    public String toString() {
        return "ProductAndroid(currency=" + this.f15867a + ", debugDescription=" + this.f15868b + ", description=" + this.f15869c + ", discountOffers=" + this.f15870d + ", displayName=" + this.f15871e + ", displayPrice=" + this.f15872f + ", id=" + this.f15873g + ", nameAndroid=" + this.f15874h + ", oneTimePurchaseOfferDetailsAndroid=" + this.f15875i + ", platform=" + this.f15876j + ", price=" + this.f15877k + ", productStatusAndroid=" + this.f15878l + ", subscriptionOfferDetailsAndroid=" + this.f15879m + ", subscriptionOffers=" + this.f15880n + ", title=" + this.f15881o + ", type=" + this.f15882p + ")";
    }
}
