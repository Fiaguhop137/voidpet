package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Xa.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1665z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16234c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16236b;

    /* JADX INFO: renamed from: Xa.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1665z(int i10, int i11) {
        this.f16235a = i10;
        this.f16236b = i11;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "InstallmentPlanDetailsAndroid"), Ad.v.a("commitmentPaymentsCount", Integer.valueOf(this.f16235a)), Ad.v.a("subsequentCommitmentPaymentsCount", Integer.valueOf(this.f16236b)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665z)) {
            return false;
        }
        C1665z c1665z = (C1665z) obj;
        return this.f16235a == c1665z.f16235a && this.f16236b == c1665z.f16236b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f16235a) * 31) + Integer.hashCode(this.f16236b);
    }

    public String toString() {
        return "InstallmentPlanDetailsAndroid(commitmentPaymentsCount=" + this.f16235a + ", subsequentCommitmentPaymentsCount=" + this.f16236b + ")";
    }
}
