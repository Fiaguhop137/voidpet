package P2;

import U1.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    private static int a(int i10, F f10, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && f10.a() >= 8 && f10.g() + 8 <= i11) {
            int iU = f10.u();
            int iU2 = f10.u();
            if (iU >= 12 && iU2 == 1936877170) {
                return f10.M();
            }
        }
        return -2147483647;
    }

    public static R1.x b(F f10, int i10) {
        f10.b0(12);
        while (f10.g() < i10) {
            int iG = f10.g();
            int iU = f10.u();
            if (f10.u() == 1935766900) {
                if (iU < 16) {
                    return null;
                }
                f10.b0(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iL = f10.L();
                    int iL2 = f10.L();
                    if (iL == 0) {
                        i11 = iL2;
                    } else if (iL == 1) {
                        i12 = iL2;
                    }
                }
                int iA = a(i11, f10, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new R1.x(new K2.d(iA, i12));
            }
            f10.a0(iG + iU);
        }
        return null;
    }
}
