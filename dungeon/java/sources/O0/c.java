package O0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    public static final int c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long d(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iN = b.n(j10);
        int iL = b.l(j10);
        if (i10 < iN) {
            i10 = iN;
        }
        if (i10 <= iL) {
            iL = i10;
        }
        int i11 = (int) (j11 & 4294967295L);
        int iM = b.m(j10);
        int iK = b.k(j10);
        if (i11 < iM) {
            i11 = iM;
        }
        if (i11 <= iK) {
            iK = i11;
        }
        return r.c((((long) iL) << 32) | (((long) iK) & 4294967295L));
    }

    public static final long e(long j10, long j11) {
        int iN = b.n(j10);
        int iL = b.l(j10);
        int iM = b.m(j10);
        int iK = b.k(j10);
        int iN2 = b.n(j11);
        if (iN2 < iN) {
            iN2 = iN;
        }
        if (iN2 > iL) {
            iN2 = iL;
        }
        int iL2 = b.l(j11);
        if (iL2 >= iN) {
            iN = iL2;
        }
        if (iN <= iL) {
            iL = iN;
        }
        int iM2 = b.m(j11);
        if (iM2 < iM) {
            iM2 = iM;
        }
        if (iM2 > iK) {
            iM2 = iK;
        }
        int iK2 = b.k(j11);
        if (iK2 >= iM) {
            iM = iK2;
        }
        if (iM <= iK) {
            iK = iM;
        }
        return a(iN2, iL, iM2, iK);
    }

    public static final int f(long j10, int i10) {
        int iM = b.m(j10);
        int iK = b.k(j10);
        if (i10 < iM) {
            i10 = iM;
        }
        return i10 > iK ? iK : i10;
    }

    public static final int g(long j10, int i10) {
        int iN = b.n(j10);
        int iL = b.l(j10);
        if (i10 < iN) {
            i10 = iN;
        }
        return i10 > iL ? iL : i10;
    }

    public static final long h(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iC = c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iC2 = c(i15);
        if (iC + iC2 > 31) {
            j(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iC2 - 13;
        return b.b((((long) (i16 & (~(i16 >> 31)))) << 33) | ((long) ((i18 >> 1) + (i18 & 1))) | (((long) i10) << 2) | (((long) i12) << (iC2 + 2)) | (((long) (i17 & (~(i17 >> 31)))) << (iC2 + 33)));
    }

    public static final long i(long j10, int i10, int i11) {
        int iN = b.n(j10) + i10;
        if (iN < 0) {
            iN = 0;
        }
        int iL = b.l(j10);
        if (iL != Integer.MAX_VALUE && (iL = iL + i10) < 0) {
            iL = 0;
        }
        int iM = b.m(j10) + i11;
        if (iM < 0) {
            iM = 0;
        }
        int iK = b.k(j10);
        return a(iN, iL, iM, (iK == Integer.MAX_VALUE || (iK = iK + i11) >= 0) ? iK : 0);
    }

    public static final void j(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    @NotNull
    public static final Void k(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }
}
