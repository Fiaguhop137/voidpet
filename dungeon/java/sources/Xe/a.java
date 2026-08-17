package Xe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16474b;

    public a(Object obj, Object obj2) {
        this.f16473a = obj;
        this.f16474b = obj2;
    }

    public final Object a() {
        return this.f16473a;
    }

    public final Object b() {
        return this.f16474b;
    }

    public final Object c() {
        return this.f16473a;
    }

    public final Object d() {
        return this.f16474b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f16473a, aVar.f16473a) && Intrinsics.b(this.f16474b, aVar.f16474b);
    }

    public int hashCode() {
        Object obj = this.f16473a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f16474b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f16473a + ", upper=" + this.f16474b + ')';
    }
}
