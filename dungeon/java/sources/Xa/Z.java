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
public final class Z implements U, Y {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15917q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f15918r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f15922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f15927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EnumC1661v f15928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Double f15929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final X f15930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f15931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f15932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f15933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final EnumC1629b0 f15934p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Z(String currency, String str, String description, List list, String str2, String displayPrice, String id2, String nameAndroid, List list2, EnumC1661v platform, Double d10, X x10, List subscriptionOfferDetailsAndroid, List subscriptionOffers, String title, EnumC1629b0 type) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(nameAndroid, "nameAndroid");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(subscriptionOfferDetailsAndroid, "subscriptionOfferDetailsAndroid");
        Intrinsics.checkNotNullParameter(subscriptionOffers, "subscriptionOffers");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15919a = currency;
        this.f15920b = str;
        this.f15921c = description;
        this.f15922d = list;
        this.f15923e = str2;
        this.f15924f = displayPrice;
        this.f15925g = id2;
        this.f15926h = nameAndroid;
        this.f15927i = list2;
        this.f15928j = platform;
        this.f15929k = d10;
        this.f15930l = x10;
        this.f15931m = subscriptionOfferDetailsAndroid;
        this.f15932n = subscriptionOffers;
        this.f15933o = title;
        this.f15934p = type;
    }

    @Override // Xa.Y
    public Map a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pairA = Ad.v.a("__typename", "ProductSubscriptionAndroid");
        Pair pairA2 = Ad.v.a("currency", b());
        Pair pairA3 = Ad.v.a("debugDescription", c());
        Pair pairA4 = Ad.v.a("description", d());
        List list = this.f15922d;
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
        Pair pairA9 = Ad.v.a("nameAndroid", this.f15926h);
        List list2 = this.f15927i;
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
        Pair pairA11 = Ad.v.a("platform", i().g());
        Pair pairA12 = Ad.v.a("price", j());
        X x10 = this.f15930l;
        Pair pairA13 = Ad.v.a("productStatusAndroid", x10 != null ? x10.g() : null);
        List list3 = this.f15931m;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C1627a0) it3.next()).a());
        }
        Pair pairA14 = Ad.v.a("subscriptionOfferDetailsAndroid", arrayList3);
        List list4 = this.f15932n;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.w(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((A0) it4.next()).a());
        }
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, Ad.v.a("subscriptionOffers", arrayList4), Ad.v.a("title", l()), Ad.v.a("type", m().g()));
    }

    public String b() {
        return this.f15919a;
    }

    public String c() {
        return this.f15920b;
    }

    public String d() {
        return this.f15921c;
    }

    public String e() {
        return this.f15923e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return Intrinsics.b(this.f15919a, z10.f15919a) && Intrinsics.b(this.f15920b, z10.f15920b) && Intrinsics.b(this.f15921c, z10.f15921c) && Intrinsics.b(this.f15922d, z10.f15922d) && Intrinsics.b(this.f15923e, z10.f15923e) && Intrinsics.b(this.f15924f, z10.f15924f) && Intrinsics.b(this.f15925g, z10.f15925g) && Intrinsics.b(this.f15926h, z10.f15926h) && Intrinsics.b(this.f15927i, z10.f15927i) && this.f15928j == z10.f15928j && Intrinsics.b(this.f15929k, z10.f15929k) && this.f15930l == z10.f15930l && Intrinsics.b(this.f15931m, z10.f15931m) && Intrinsics.b(this.f15932n, z10.f15932n) && Intrinsics.b(this.f15933o, z10.f15933o) && this.f15934p == z10.f15934p;
    }

    public String f() {
        return this.f15924f;
    }

    public final String g() {
        return this.f15926h;
    }

    @Override // Xa.U
    public String getId() {
        return this.f15925g;
    }

    public final List h() {
        return this.f15927i;
    }

    public int hashCode() {
        int iHashCode = this.f15919a.hashCode() * 31;
        String str = this.f15920b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15921c.hashCode()) * 31;
        List list = this.f15922d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f15923e;
        int iHashCode4 = (((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15924f.hashCode()) * 31) + this.f15925g.hashCode()) * 31) + this.f15926h.hashCode()) * 31;
        List list2 = this.f15927i;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.f15928j.hashCode()) * 31;
        Double d10 = this.f15929k;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        X x10 = this.f15930l;
        return ((((((((iHashCode6 + (x10 != null ? x10.hashCode() : 0)) * 31) + this.f15931m.hashCode()) * 31) + this.f15932n.hashCode()) * 31) + this.f15933o.hashCode()) * 31) + this.f15934p.hashCode();
    }

    public EnumC1661v i() {
        return this.f15928j;
    }

    public Double j() {
        return this.f15929k;
    }

    public final List k() {
        return this.f15931m;
    }

    public String l() {
        return this.f15933o;
    }

    public EnumC1629b0 m() {
        return this.f15934p;
    }

    public String toString() {
        return "ProductSubscriptionAndroid(currency=" + this.f15919a + ", debugDescription=" + this.f15920b + ", description=" + this.f15921c + ", discountOffers=" + this.f15922d + ", displayName=" + this.f15923e + ", displayPrice=" + this.f15924f + ", id=" + this.f15925g + ", nameAndroid=" + this.f15926h + ", oneTimePurchaseOfferDetailsAndroid=" + this.f15927i + ", platform=" + this.f15928j + ", price=" + this.f15929k + ", productStatusAndroid=" + this.f15930l + ", subscriptionOfferDetailsAndroid=" + this.f15931m + ", subscriptionOffers=" + this.f15932n + ", title=" + this.f15933o + ", type=" + this.f15934p + ")";
    }
}
