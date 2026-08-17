package C9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: C9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0871n extends J implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator[] f1607a;

    C0871n(Comparator comparator, Comparator comparator2) {
        this.f1607a = new Comparator[]{comparator, comparator2};
    }

    @Override // C9.J, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f1607a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0871n) {
            return Arrays.equals(this.f1607a, ((C0871n) obj).f1607a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1607a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f1607a) + ")";
    }
}
