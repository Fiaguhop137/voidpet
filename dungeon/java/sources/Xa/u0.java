package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16188c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16189d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f16190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f16191b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u0(s0 s0Var, t0 t0Var, s0 s0Var2, t0 t0Var2) {
        this.f16190a = s0Var;
        this.f16191b = s0Var2;
    }

    public /* synthetic */ u0(s0 s0Var, t0 t0Var, s0 s0Var2, t0 t0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : s0Var, (i10 & 2) != 0 ? null : t0Var, (i10 & 4) != 0 ? null : s0Var2, (i10 & 8) != 0 ? null : t0Var2);
    }

    public final s0 a() {
        return this.f16190a;
    }

    public final s0 b() {
        return this.f16191b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.b(this.f16190a, u0Var.f16190a) && Intrinsics.b(null, null) && Intrinsics.b(this.f16191b, u0Var.f16191b) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        s0 s0Var = this.f16190a;
        int iHashCode = (s0Var == null ? 0 : s0Var.hashCode()) * 961;
        s0 s0Var2 = this.f16191b;
        return (iHashCode + (s0Var2 != null ? s0Var2.hashCode() : 0)) * 31;
    }

    public String toString() {
        return "RequestSubscriptionPropsByPlatforms(android=" + this.f16190a + ", apple=" + ((Object) null) + ", google=" + this.f16191b + ", ios=" + ((Object) null) + ")";
    }
}
