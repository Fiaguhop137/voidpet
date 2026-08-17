package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16157c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16158d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1651m0 f16159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1651m0 f16160b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p0(C1651m0 c1651m0, AbstractC1653n0 abstractC1653n0, C1651m0 c1651m1, AbstractC1653n0 abstractC1653n1) {
        this.f16159a = c1651m0;
        this.f16160b = c1651m1;
    }

    public /* synthetic */ p0(C1651m0 c1651m0, AbstractC1653n0 abstractC1653n0, C1651m0 c1651m1, AbstractC1653n0 abstractC1653n1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c1651m0, (i10 & 2) != 0 ? null : abstractC1653n0, (i10 & 4) != 0 ? null : c1651m1, (i10 & 8) != 0 ? null : abstractC1653n1);
    }

    public final C1651m0 a() {
        return this.f16159a;
    }

    public final C1651m0 b() {
        return this.f16160b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.b(this.f16159a, p0Var.f16159a) && Intrinsics.b(null, null) && Intrinsics.b(this.f16160b, p0Var.f16160b) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        C1651m0 c1651m0 = this.f16159a;
        int iHashCode = (c1651m0 == null ? 0 : c1651m0.hashCode()) * 961;
        C1651m0 c1651m1 = this.f16160b;
        return (iHashCode + (c1651m1 != null ? c1651m1.hashCode() : 0)) * 31;
    }

    public String toString() {
        return "RequestPurchasePropsByPlatforms(android=" + this.f16159a + ", apple=" + ((Object) null) + ", google=" + this.f16160b + ", ios=" + ((Object) null) + ")";
    }
}
