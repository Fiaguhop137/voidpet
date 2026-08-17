package C9;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: C9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0869l extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f1602a;

    C0869l(Comparator comparator) {
        this.f1602a = (Comparator) B9.n.j(comparator);
    }

    @Override // C9.J, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f1602a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0869l) {
            return this.f1602a.equals(((C0869l) obj).f1602a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1602a.hashCode();
    }

    public String toString() {
        return this.f1602a.toString();
    }
}
