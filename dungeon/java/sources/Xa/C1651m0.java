package Xa;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1651m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16078f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16079g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f16080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f16084e;

    /* JADX INFO: renamed from: Xa.m0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1651m0(AbstractC1644j abstractC1644j, Boolean bool, String str, String str2, String str3, List skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.f16080a = bool;
        this.f16081b = str;
        this.f16082c = str2;
        this.f16083d = str3;
        this.f16084e = skus;
    }

    public /* synthetic */ C1651m0(AbstractC1644j abstractC1644j, Boolean bool, String str, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC1644j, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, list);
    }

    public final AbstractC1644j a() {
        return null;
    }

    public final String b() {
        return this.f16081b;
    }

    public final String c() {
        return this.f16082c;
    }

    public final String d() {
        return this.f16083d;
    }

    public final List e() {
        return this.f16084e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1651m0)) {
            return false;
        }
        C1651m0 c1651m0 = (C1651m0) obj;
        c1651m0.getClass();
        return Intrinsics.b(null, null) && Intrinsics.b(this.f16080a, c1651m0.f16080a) && Intrinsics.b(this.f16081b, c1651m0.f16081b) && Intrinsics.b(this.f16082c, c1651m0.f16082c) && Intrinsics.b(this.f16083d, c1651m0.f16083d) && Intrinsics.b(this.f16084e, c1651m0.f16084e);
    }

    public final Boolean f() {
        return this.f16080a;
    }

    public int hashCode() {
        Boolean bool = this.f16080a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f16081b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16082c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16083d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f16084e.hashCode();
    }

    public String toString() {
        return "RequestPurchaseAndroidProps(developerBillingOption=" + ((Object) null) + ", isOfferPersonalized=" + this.f16080a + ", obfuscatedAccountId=" + this.f16081b + ", obfuscatedProfileId=" + this.f16082c + ", offerToken=" + this.f16083d + ", skus=" + this.f16084e + ")";
    }
}
