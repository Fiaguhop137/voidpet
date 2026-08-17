package C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return N0.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int iK = N0.k(j10);
        if (iK < i10) {
            iK = i10;
        }
        if (iK > i11) {
            iK = i11;
        }
        int iG = N0.g(j10);
        if (iG >= i10) {
            i10 = iG;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iK == N0.k(j10) && i11 == N0.g(j10)) ? j10 : b(iK, i11);
    }

    private static final long d(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            H0.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }
}
