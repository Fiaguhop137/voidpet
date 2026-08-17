package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1648l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16069c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16071b;

    /* JADX INFO: renamed from: Xa.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1648l(String discountAmountMicros, String formattedDiscountAmount) {
        Intrinsics.checkNotNullParameter(discountAmountMicros, "discountAmountMicros");
        Intrinsics.checkNotNullParameter(formattedDiscountAmount, "formattedDiscountAmount");
        this.f16070a = discountAmountMicros;
        this.f16071b = formattedDiscountAmount;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "DiscountAmountAndroid"), Ad.v.a("discountAmountMicros", this.f16070a), Ad.v.a("formattedDiscountAmount", this.f16071b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1648l)) {
            return false;
        }
        C1648l c1648l = (C1648l) obj;
        return Intrinsics.b(this.f16070a, c1648l.f16070a) && Intrinsics.b(this.f16071b, c1648l.f16071b);
    }

    public int hashCode() {
        return (this.f16070a.hashCode() * 31) + this.f16071b.hashCode();
    }

    public String toString() {
        return "DiscountAmountAndroid(discountAmountMicros=" + this.f16070a + ", formattedDiscountAmount=" + this.f16071b + ")";
    }
}
