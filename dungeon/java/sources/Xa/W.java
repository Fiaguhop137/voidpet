package Xa;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15905c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15906d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f15908b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public W(List skus, V v10) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.f15907a = skus;
        this.f15908b = v10;
    }

    public final List a() {
        return this.f15907a;
    }

    public final V b() {
        return this.f15908b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return Intrinsics.b(this.f15907a, w10.f15907a) && this.f15908b == w10.f15908b;
    }

    public int hashCode() {
        int iHashCode = this.f15907a.hashCode() * 31;
        V v10 = this.f15908b;
        return iHashCode + (v10 == null ? 0 : v10.hashCode());
    }

    public String toString() {
        return "ProductRequest(skus=" + this.f15907a + ", type=" + this.f15908b + ")";
    }
}
