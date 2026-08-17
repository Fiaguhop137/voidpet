package Xa;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15584c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15585d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15587b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public G0(String externalTransactionToken, List products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f15586a = externalTransactionToken;
        this.f15587b = products;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "UserChoiceBillingDetails"), Ad.v.a("externalTransactionToken", this.f15586a), Ad.v.a("products", this.f15587b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g10 = (G0) obj;
        return Intrinsics.b(this.f15586a, g10.f15586a) && Intrinsics.b(this.f15587b, g10.f15587b);
    }

    public int hashCode() {
        return (this.f15586a.hashCode() * 31) + this.f15587b.hashCode();
    }

    public String toString() {
        return "UserChoiceBillingDetails(externalTransactionToken=" + this.f15586a + ", products=" + this.f15587b + ")";
    }
}
