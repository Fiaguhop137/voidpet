package G;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.a f3269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.a f3270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.a f3271c;

    public P(C.a small, C.a medium, C.a large) {
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        this.f3269a = small;
        this.f3270b = medium;
        this.f3271c = large;
    }

    public /* synthetic */ P(C.a aVar, C.a aVar2, C.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C.g.c(O0.h.o(4)) : aVar, (i10 & 2) != 0 ? C.g.c(O0.h.o(4)) : aVar2, (i10 & 4) != 0 ? C.g.c(O0.h.o(0)) : aVar3);
    }

    public final C.a a() {
        return this.f3271c;
    }

    public final C.a b() {
        return this.f3269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return Intrinsics.b(this.f3269a, p10.f3269a) && Intrinsics.b(this.f3270b, p10.f3270b) && Intrinsics.b(this.f3271c, p10.f3271c);
    }

    public int hashCode() {
        return (((this.f3269a.hashCode() * 31) + this.f3270b.hashCode()) * 31) + this.f3271c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f3269a + ", medium=" + this.f3270b + ", large=" + this.f3271c + ')';
    }
}
