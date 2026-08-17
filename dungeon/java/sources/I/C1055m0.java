package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4692b;

    public C1055m0(Object obj, Object obj2) {
        this.f4691a = obj;
        this.f4692b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1055m0)) {
            return false;
        }
        C1055m0 c1055m0 = (C1055m0) obj;
        return Intrinsics.b(this.f4691a, c1055m0.f4691a) && Intrinsics.b(this.f4692b, c1055m0.f4692b);
    }

    public int hashCode() {
        return (a(this.f4691a) * 31) + a(this.f4692b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f4691a + ", right=" + this.f4692b + ')';
    }
}
