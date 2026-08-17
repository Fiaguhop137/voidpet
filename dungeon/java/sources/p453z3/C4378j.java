package p453z3;

import kotlin.jvm.internal.Intrinsics;
import p435y3.n;

/* JADX INFO: renamed from: z3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4378j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f58433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58434b;

    public C4378j(n nVar, boolean z10) {
        this.f58433a = nVar;
        this.f58434b = z10;
    }

    public final n a() {
        return this.f58433a;
    }

    public final boolean b() {
        return this.f58434b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4378j)) {
            return false;
        }
        C4378j c4378j = (C4378j) obj;
        return Intrinsics.b(this.f58433a, c4378j.f58433a) && this.f58434b == c4378j.f58434b;
    }

    public int hashCode() {
        return (this.f58433a.hashCode() * 31) + Boolean.hashCode(this.f58434b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f58433a + ", isSampled=" + this.f58434b + ')';
    }
}
