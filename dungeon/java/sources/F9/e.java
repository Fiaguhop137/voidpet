package F9;

import B9.n;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f2991d = new e(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f2993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2994c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private e(int[] iArr, int i10, int i11) {
        this.f2992a = iArr;
        this.f2993b = i10;
        this.f2994c = i11;
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f2991d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e e() {
        return f2991d;
    }

    public int b(int i10) {
        n.h(i10, d());
        return this.f2992a[this.f2993b + i10];
    }

    public boolean c() {
        return this.f2994c == this.f2993b;
    }

    public int d() {
        return this.f2994c - this.f2993b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (d() != eVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iJ = 1;
        for (int i10 = this.f2993b; i10 < this.f2994c; i10++) {
            iJ = (iJ * 31) + f.j(this.f2992a[i10]);
        }
        return iJ;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(d() * 5);
        sb2.append('[');
        sb2.append(this.f2992a[this.f2993b]);
        int i10 = this.f2993b;
        while (true) {
            i10++;
            if (i10 >= this.f2994c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f2992a[i10]);
        }
    }
}
