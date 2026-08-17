package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1649l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16072c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16074b;

    /* JADX INFO: renamed from: Xa.l0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1649l0(String str, String rentalPeriod) {
        Intrinsics.checkNotNullParameter(rentalPeriod, "rentalPeriod");
        this.f16073a = str;
        this.f16074b = rentalPeriod;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "RentalDetailsAndroid"), Ad.v.a("rentalExpirationPeriod", this.f16073a), Ad.v.a("rentalPeriod", this.f16074b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1649l0)) {
            return false;
        }
        C1649l0 c1649l0 = (C1649l0) obj;
        return Intrinsics.b(this.f16073a, c1649l0.f16073a) && Intrinsics.b(this.f16074b, c1649l0.f16074b);
    }

    public int hashCode() {
        String str = this.f16073a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f16074b.hashCode();
    }

    public String toString() {
        return "RentalDetailsAndroid(rentalExpirationPeriod=" + this.f16073a + ", rentalPeriod=" + this.f16074b + ")";
    }
}
