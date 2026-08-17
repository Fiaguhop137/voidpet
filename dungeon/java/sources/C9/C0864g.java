package C9;

import java.io.Serializable;

/* JADX INFO: renamed from: C9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0864g extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final B9.f f1575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final J f1576b;

    C0864g(B9.f fVar, J j10) {
        this.f1575a = (B9.f) B9.n.j(fVar);
        this.f1576b = (J) B9.n.j(j10);
    }

    @Override // C9.J, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f1576b.compare(this.f1575a.apply(obj), this.f1575a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0864g) {
            C0864g c0864g = (C0864g) obj;
            if (this.f1575a.equals(c0864g.f1575a) && this.f1576b.equals(c0864g.f1576b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return B9.j.b(this.f1575a, this.f1576b);
    }

    public String toString() {
        return this.f1576b + ".onResultOf(" + this.f1575a + ")";
    }
}
