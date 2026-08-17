package Xa;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1650m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16075c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1648l f16076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f16077b;

    /* JADX INFO: renamed from: Xa.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1650m(C1648l c1648l, Integer num) {
        this.f16076a = c1648l;
        this.f16077b = num;
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "DiscountDisplayInfoAndroid");
        C1648l c1648l = this.f16076a;
        return kotlin.collections.N.l(pairA, Ad.v.a("discountAmount", c1648l != null ? c1648l.a() : null), Ad.v.a("percentageDiscount", this.f16077b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650m)) {
            return false;
        }
        C1650m c1650m = (C1650m) obj;
        return Intrinsics.b(this.f16076a, c1650m.f16076a) && Intrinsics.b(this.f16077b, c1650m.f16077b);
    }

    public int hashCode() {
        C1648l c1648l = this.f16076a;
        int iHashCode = (c1648l == null ? 0 : c1648l.hashCode()) * 31;
        Integer num = this.f16077b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DiscountDisplayInfoAndroid(discountAmount=" + this.f16076a + ", percentageDiscount=" + this.f16077b + ")";
    }
}
