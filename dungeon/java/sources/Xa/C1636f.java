package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1636f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16011c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1634e f16012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16013b;

    /* JADX INFO: renamed from: Xa.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1636f(EnumC1634e billingProgram, boolean z10) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        this.f16012a = billingProgram;
        this.f16013b = z10;
    }

    public final boolean a() {
        return this.f16013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636f)) {
            return false;
        }
        C1636f c1636f = (C1636f) obj;
        return this.f16012a == c1636f.f16012a && this.f16013b == c1636f.f16013b;
    }

    public int hashCode() {
        return (this.f16012a.hashCode() * 31) + Boolean.hashCode(this.f16013b);
    }

    public String toString() {
        return "BillingProgramAvailabilityResultAndroid(billingProgram=" + this.f16012a + ", isAvailable=" + this.f16013b + ")";
    }
}
