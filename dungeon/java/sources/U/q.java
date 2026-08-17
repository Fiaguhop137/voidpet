package U;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f12614b;

    public q(int i10, Integer num) {
        this.f12613a = i10;
        this.f12614b = num;
    }

    public final int a() {
        return this.f12613a;
    }

    public final Integer b() {
        return this.f12614b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f12613a == qVar.f12613a && Intrinsics.b(this.f12614b, qVar.f12614b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f12613a) * 31;
        Integer num = this.f12614b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f12613a + ", dataOffset=" + this.f12614b + ')';
    }
}
