package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1638g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16018c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1634e f16019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16020b;

    /* JADX INFO: renamed from: Xa.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1638g(EnumC1634e billingProgram, String externalTransactionToken) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        this.f16019a = billingProgram;
        this.f16020b = externalTransactionToken;
    }

    public final String a() {
        return this.f16020b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1638g)) {
            return false;
        }
        C1638g c1638g = (C1638g) obj;
        return this.f16019a == c1638g.f16019a && Intrinsics.b(this.f16020b, c1638g.f16020b);
    }

    public int hashCode() {
        return (this.f16019a.hashCode() * 31) + this.f16020b.hashCode();
    }

    public String toString() {
        return "BillingProgramReportingDetailsAndroid(billingProgram=" + this.f16019a + ", externalTransactionToken=" + this.f16020b + ")";
    }
}
