package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15367c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f15368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15369b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public B0(C0 unit, int i10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f15368a = unit;
        this.f15369b = i10;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "SubscriptionPeriod"), Ad.v.a("unit", this.f15368a.g()), Ad.v.a("value", Integer.valueOf(this.f15369b)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b10 = (B0) obj;
        return this.f15368a == b10.f15368a && this.f15369b == b10.f15369b;
    }

    public int hashCode() {
        return (this.f15368a.hashCode() * 31) + Integer.hashCode(this.f15369b);
    }

    public String toString() {
        return "SubscriptionPeriod(unit=" + this.f15368a + ", value=" + this.f15369b + ")";
    }
}
