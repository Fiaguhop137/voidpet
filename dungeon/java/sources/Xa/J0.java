package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15824f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f15826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15829e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public J0(String accessToken, Boolean bool, String packageName, String purchaseToken, String sku) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f15825a = accessToken;
        this.f15826b = bool;
        this.f15827c = packageName;
        this.f15828d = purchaseToken;
        this.f15829e = sku;
    }

    public final String a() {
        return this.f15825a;
    }

    public final String b() {
        return this.f15827c;
    }

    public final String c() {
        return this.f15828d;
    }

    public final String d() {
        return this.f15829e;
    }

    public final Boolean e() {
        return this.f15826b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j10 = (J0) obj;
        return Intrinsics.b(this.f15825a, j10.f15825a) && Intrinsics.b(this.f15826b, j10.f15826b) && Intrinsics.b(this.f15827c, j10.f15827c) && Intrinsics.b(this.f15828d, j10.f15828d) && Intrinsics.b(this.f15829e, j10.f15829e);
    }

    public int hashCode() {
        int iHashCode = this.f15825a.hashCode() * 31;
        Boolean bool = this.f15826b;
        return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f15827c.hashCode()) * 31) + this.f15828d.hashCode()) * 31) + this.f15829e.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseGoogleOptions(accessToken=" + this.f15825a + ", isSub=" + this.f15826b + ", packageName=" + this.f15827c + ", purchaseToken=" + this.f15828d + ", sku=" + this.f15829e + ")";
    }
}
