package C9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class P extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final J f1513a;

    P(J j10) {
        this.f1513a = (J) B9.n.j(j10);
    }

    @Override // C9.J, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f1513a.compare(obj2, obj);
    }

    @Override // C9.J
    public J e() {
        return this.f1513a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P) {
            return this.f1513a.equals(((P) obj).f1513a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f1513a.hashCode();
    }

    public String toString() {
        return this.f1513a + ".reverse()";
    }
}
