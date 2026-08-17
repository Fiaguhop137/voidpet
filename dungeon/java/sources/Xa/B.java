package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15364c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15366b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public B(int i10, int i11) {
        this.f15365a = i10;
        this.f15366b = i11;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "LimitedQuantityInfoAndroid"), Ad.v.a("maximumQuantity", Integer.valueOf(this.f15365a)), Ad.v.a("remainingQuantity", Integer.valueOf(this.f15366b)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f15365a == b10.f15365a && this.f15366b == b10.f15366b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f15365a) * 31) + Integer.hashCode(this.f15366b);
    }

    public String toString() {
        return "LimitedQuantityInfoAndroid(maximumQuantity=" + this.f15365a + ", remainingQuantity=" + this.f15366b + ")";
    }
}
