package Xa;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1633d0 implements InterfaceC1635e0, InterfaceC1631c0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f15978w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f15979x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f15980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f15985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Boolean f15986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f15987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Boolean f15988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f15991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final M f15992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC1661v f15993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f15994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final EnumC1641h0 f15995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f15996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f15997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f15998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EnumC1662w f15999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final double f16000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f16001v;

    /* JADX INFO: renamed from: Xa.d0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1633d0(Boolean bool, String str, String str2, String str3, String id2, List list, Boolean bool2, boolean z10, Boolean bool3, String str4, String str5, String str6, M m10, EnumC1661v platform, String productId, EnumC1641h0 purchaseState, String str7, int i10, String str8, EnumC1662w store, double d10, String str9) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        this.f15980a = bool;
        this.f15981b = str;
        this.f15982c = str2;
        this.f15983d = str3;
        this.f15984e = id2;
        this.f15985f = list;
        this.f15986g = bool2;
        this.f15987h = z10;
        this.f15988i = bool3;
        this.f15989j = str4;
        this.f15990k = str5;
        this.f15991l = str6;
        this.f15992m = m10;
        this.f15993n = platform;
        this.f15994o = productId;
        this.f15995p = purchaseState;
        this.f15996q = str7;
        this.f15997r = i10;
        this.f15998s = str8;
        this.f15999t = store;
        this.f16000u = d10;
        this.f16001v = str9;
    }

    public static /* synthetic */ C1633d0 e(C1633d0 c1633d0, Boolean bool, String str, String str2, String str3, String str4, List list, Boolean bool2, boolean z10, Boolean bool3, String str5, String str6, String str7, M m10, EnumC1661v enumC1661v, String str8, EnumC1641h0 enumC1641h0, String str9, int i10, String str10, EnumC1662w enumC1662w, double d10, String str11, int i11, Object obj) {
        String str12;
        double d11;
        Boolean bool4 = (i11 & 1) != 0 ? c1633d0.f15980a : bool;
        String str13 = (i11 & 2) != 0 ? c1633d0.f15981b : str;
        String str14 = (i11 & 4) != 0 ? c1633d0.f15982c : str2;
        String str15 = (i11 & 8) != 0 ? c1633d0.f15983d : str3;
        String str16 = (i11 & 16) != 0 ? c1633d0.f15984e : str4;
        List list2 = (i11 & 32) != 0 ? c1633d0.f15985f : list;
        Boolean bool5 = (i11 & 64) != 0 ? c1633d0.f15986g : bool2;
        boolean z11 = (i11 & 128) != 0 ? c1633d0.f15987h : z10;
        Boolean bool6 = (i11 & 256) != 0 ? c1633d0.f15988i : bool3;
        String str17 = (i11 & 512) != 0 ? c1633d0.f15989j : str5;
        String str18 = (i11 & 1024) != 0 ? c1633d0.f15990k : str6;
        String str19 = (i11 & 2048) != 0 ? c1633d0.f15991l : str7;
        M m11 = (i11 & 4096) != 0 ? c1633d0.f15992m : m10;
        EnumC1661v enumC1661v2 = (i11 & 8192) != 0 ? c1633d0.f15993n : enumC1661v;
        Boolean bool7 = bool4;
        String str20 = (i11 & 16384) != 0 ? c1633d0.f15994o : str8;
        EnumC1641h0 enumC1641h1 = (i11 & 32768) != 0 ? c1633d0.f15995p : enumC1641h0;
        String str21 = (i11 & 65536) != 0 ? c1633d0.f15996q : str9;
        int i12 = (i11 & 131072) != 0 ? c1633d0.f15997r : i10;
        String str22 = (i11 & 262144) != 0 ? c1633d0.f15998s : str10;
        EnumC1662w enumC1662w2 = (i11 & 524288) != 0 ? c1633d0.f15999t : enumC1662w;
        String str23 = str20;
        double d12 = (i11 & 1048576) != 0 ? c1633d0.f16000u : d10;
        if ((i11 & 2097152) != 0) {
            d11 = d12;
            str12 = c1633d0.f16001v;
        } else {
            str12 = str11;
            d11 = d12;
        }
        return c1633d0.d(bool7, str13, str14, str15, str16, list2, bool5, z11, bool6, str17, str18, str19, m11, enumC1661v2, str23, enumC1641h1, str21, i12, str22, enumC1662w2, d11, str12);
    }

    @Override // Xa.InterfaceC1631c0
    public Map a() {
        Pair pairA = Ad.v.a("__typename", "PurchaseAndroid");
        Pair pairA2 = Ad.v.a("autoRenewingAndroid", this.f15980a);
        Pair pairA3 = Ad.v.a("currentPlanId", g());
        Pair pairA4 = Ad.v.a("dataAndroid", this.f15982c);
        Pair pairA5 = Ad.v.a("developerPayloadAndroid", this.f15983d);
        Pair pairA6 = Ad.v.a("id", getId());
        Pair pairA7 = Ad.v.a("ids", h());
        Pair pairA8 = Ad.v.a("isAcknowledgedAndroid", this.f15986g);
        Pair pairA9 = Ad.v.a("isAutoRenewing", Boolean.valueOf(n()));
        Pair pairA10 = Ad.v.a("isSuspendedAndroid", this.f15988i);
        Pair pairA11 = Ad.v.a("obfuscatedAccountIdAndroid", this.f15989j);
        Pair pairA12 = Ad.v.a("obfuscatedProfileIdAndroid", this.f15990k);
        Pair pairA13 = Ad.v.a("packageNameAndroid", this.f15991l);
        M m10 = this.f15992m;
        return kotlin.collections.N.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, Ad.v.a("pendingPurchaseUpdateAndroid", m10 != null ? m10.a() : null), Ad.v.a("platform", i().g()), Ad.v.a("productId", b()), Ad.v.a("purchaseState", j().g()), Ad.v.a("purchaseToken", c()), Ad.v.a("quantity", Integer.valueOf(k())), Ad.v.a("signatureAndroid", this.f15998s), Ad.v.a("store", l().h()), Ad.v.a("transactionDate", Double.valueOf(m())), Ad.v.a("transactionId", this.f16001v));
    }

    @Override // Xa.InterfaceC1635e0
    public String b() {
        return this.f15994o;
    }

    @Override // Xa.InterfaceC1635e0
    public String c() {
        return this.f15996q;
    }

    public final C1633d0 d(Boolean bool, String str, String str2, String str3, String id2, List list, Boolean bool2, boolean z10, Boolean bool3, String str4, String str5, String str6, M m10, EnumC1661v platform, String productId, EnumC1641h0 purchaseState, String str7, int i10, String str8, EnumC1662w store, double d10, String str9) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(store, "store");
        return new C1633d0(bool, str, str2, str3, id2, list, bool2, z10, bool3, str4, str5, str6, m10, platform, productId, purchaseState, str7, i10, str8, store, d10, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633d0)) {
            return false;
        }
        C1633d0 c1633d0 = (C1633d0) obj;
        return Intrinsics.b(this.f15980a, c1633d0.f15980a) && Intrinsics.b(this.f15981b, c1633d0.f15981b) && Intrinsics.b(this.f15982c, c1633d0.f15982c) && Intrinsics.b(this.f15983d, c1633d0.f15983d) && Intrinsics.b(this.f15984e, c1633d0.f15984e) && Intrinsics.b(this.f15985f, c1633d0.f15985f) && Intrinsics.b(this.f15986g, c1633d0.f15986g) && this.f15987h == c1633d0.f15987h && Intrinsics.b(this.f15988i, c1633d0.f15988i) && Intrinsics.b(this.f15989j, c1633d0.f15989j) && Intrinsics.b(this.f15990k, c1633d0.f15990k) && Intrinsics.b(this.f15991l, c1633d0.f15991l) && Intrinsics.b(this.f15992m, c1633d0.f15992m) && this.f15993n == c1633d0.f15993n && Intrinsics.b(this.f15994o, c1633d0.f15994o) && this.f15995p == c1633d0.f15995p && Intrinsics.b(this.f15996q, c1633d0.f15996q) && this.f15997r == c1633d0.f15997r && Intrinsics.b(this.f15998s, c1633d0.f15998s) && this.f15999t == c1633d0.f15999t && Double.compare(this.f16000u, c1633d0.f16000u) == 0 && Intrinsics.b(this.f16001v, c1633d0.f16001v);
    }

    public final Boolean f() {
        return this.f15980a;
    }

    public String g() {
        return this.f15981b;
    }

    @Override // Xa.InterfaceC1635e0
    public String getId() {
        return this.f15984e;
    }

    public List h() {
        return this.f15985f;
    }

    public int hashCode() {
        Boolean bool = this.f15980a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f15981b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15982c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15983d;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f15984e.hashCode()) * 31;
        List list = this.f15985f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.f15986g;
        int iHashCode6 = (((iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.f15987h)) * 31;
        Boolean bool3 = this.f15988i;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.f15989j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f15990k;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f15991l;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        M m10 = this.f15992m;
        int iHashCode11 = (((((((iHashCode10 + (m10 == null ? 0 : m10.hashCode())) * 31) + this.f15993n.hashCode()) * 31) + this.f15994o.hashCode()) * 31) + this.f15995p.hashCode()) * 31;
        String str7 = this.f15996q;
        int iHashCode12 = (((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.f15997r)) * 31;
        String str8 = this.f15998s;
        int iHashCode13 = (((((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f15999t.hashCode()) * 31) + Double.hashCode(this.f16000u)) * 31;
        String str9 = this.f16001v;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public EnumC1661v i() {
        return this.f15993n;
    }

    public EnumC1641h0 j() {
        return this.f15995p;
    }

    public int k() {
        return this.f15997r;
    }

    public EnumC1662w l() {
        return this.f15999t;
    }

    public double m() {
        return this.f16000u;
    }

    public boolean n() {
        return this.f15987h;
    }

    public String toString() {
        return "PurchaseAndroid(autoRenewingAndroid=" + this.f15980a + ", currentPlanId=" + this.f15981b + ", dataAndroid=" + this.f15982c + ", developerPayloadAndroid=" + this.f15983d + ", id=" + this.f15984e + ", ids=" + this.f15985f + ", isAcknowledgedAndroid=" + this.f15986g + ", isAutoRenewing=" + this.f15987h + ", isSuspendedAndroid=" + this.f15988i + ", obfuscatedAccountIdAndroid=" + this.f15989j + ", obfuscatedProfileIdAndroid=" + this.f15990k + ", packageNameAndroid=" + this.f15991l + ", pendingPurchaseUpdateAndroid=" + this.f15992m + ", platform=" + this.f15993n + ", productId=" + this.f15994o + ", purchaseState=" + this.f15995p + ", purchaseToken=" + this.f15996q + ", quantity=" + this.f15997r + ", signatureAndroid=" + this.f15998s + ", store=" + this.f15999t + ", transactionDate=" + this.f16000u + ", transactionId=" + this.f16001v + ")";
    }
}
