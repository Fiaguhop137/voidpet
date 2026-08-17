package Xa;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15840c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15841d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15843b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public M(List products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.f15842a = products;
        this.f15843b = purchaseToken;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "PendingPurchaseUpdateAndroid"), Ad.v.a("products", this.f15842a), Ad.v.a("purchaseToken", this.f15843b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return Intrinsics.b(this.f15842a, m10.f15842a) && Intrinsics.b(this.f15843b, m10.f15843b);
    }

    public int hashCode() {
        return (this.f15842a.hashCode() * 31) + this.f15843b.hashCode();
    }

    public String toString() {
        return "PendingPurchaseUpdateAndroid(products=" + this.f15842a + ", purchaseToken=" + this.f15843b + ")";
    }
}
