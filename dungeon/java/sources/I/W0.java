package I;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {
    public static final void a(p323s.E e10, int i10) {
        if (e10.f52736b == 0 || !(e10.b(0) == i10 || e10.b(e10.f52736b - 1) == i10)) {
            int i11 = e10.f52736b;
            e10.f(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iB = e10.b(i12);
                if (i10 <= iB) {
                    break;
                }
                e10.l(i11, iB);
                i11 = i12;
            }
            e10.l(i11, i10);
        }
    }

    public static p323s.E b(p323s.E e10) {
        return e10;
    }

    public static /* synthetic */ p323s.E c(p323s.E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            e10 = new p323s.E(0, 1, null);
        }
        return b(e10);
    }

    public static final boolean d(p323s.E e10) {
        return e10.f52736b != 0;
    }

    public static final int e(p323s.E e10) {
        return e10.a();
    }

    public static final int f(p323s.E e10) {
        int iB;
        int i10 = e10.f52736b;
        int iB2 = e10.b(0);
        while (e10.f52736b != 0 && e10.b(0) == iB2) {
            e10.l(0, e10.e());
            e10.j(e10.f52736b - 1);
            int i11 = e10.f52736b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iB3 = e10.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iB4 = e10.b(i15);
                if (i14 < i11 && (iB = e10.b(i14)) > iB4) {
                    if (iB <= iB3) {
                        break;
                    }
                    e10.l(i13, iB);
                    e10.l(i14, iB3);
                    i13 = i14;
                } else {
                    if (iB4 <= iB3) {
                        break;
                    }
                    e10.l(i13, iB4);
                    e10.l(i15, iB3);
                    i13 = i15;
                }
            }
        }
        return iB2;
    }
}
