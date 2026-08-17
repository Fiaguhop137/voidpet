package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15850g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15856f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public O(int i10, String billingPeriod, String formattedPrice, String priceAmountMicros, String priceCurrencyCode, int i11) {
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.f15851a = i10;
        this.f15852b = billingPeriod;
        this.f15853c = formattedPrice;
        this.f15854d = priceAmountMicros;
        this.f15855e = priceCurrencyCode;
        this.f15856f = i11;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "PricingPhaseAndroid"), Ad.v.a("billingCycleCount", Integer.valueOf(this.f15851a)), Ad.v.a("billingPeriod", this.f15852b), Ad.v.a("formattedPrice", this.f15853c), Ad.v.a("priceAmountMicros", this.f15854d), Ad.v.a("priceCurrencyCode", this.f15855e), Ad.v.a("recurrenceMode", Integer.valueOf(this.f15856f)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f15851a == o10.f15851a && Intrinsics.b(this.f15852b, o10.f15852b) && Intrinsics.b(this.f15853c, o10.f15853c) && Intrinsics.b(this.f15854d, o10.f15854d) && Intrinsics.b(this.f15855e, o10.f15855e) && this.f15856f == o10.f15856f;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f15851a) * 31) + this.f15852b.hashCode()) * 31) + this.f15853c.hashCode()) * 31) + this.f15854d.hashCode()) * 31) + this.f15855e.hashCode()) * 31) + Integer.hashCode(this.f15856f);
    }

    public String toString() {
        return "PricingPhaseAndroid(billingCycleCount=" + this.f15851a + ", billingPeriod=" + this.f15852b + ", formattedPrice=" + this.f15853c + ", priceAmountMicros=" + this.f15854d + ", priceCurrencyCode=" + this.f15855e + ", recurrenceMode=" + this.f15856f + ")";
    }
}
