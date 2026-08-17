package S;

import kotlin.collections.AbstractC3952n;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int a(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final long[] b(int i10) {
        return new long[i10];
    }

    public static final long c(int i10) {
        return i10;
    }

    public static final long[] d(long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        AbstractC3952n.k(jArr, jArr2, 0, 0, i10);
        AbstractC3952n.k(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }

    public static final long[] e(long[] jArr, int i10) {
        int length = jArr.length;
        int i11 = length - 1;
        if (i11 == 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        if (i10 > 0) {
            AbstractC3952n.k(jArr, jArr2, 0, 0, i10);
        }
        if (i10 < i11) {
            AbstractC3952n.k(jArr, jArr2, i10, i10 + 1, length);
        }
        return jArr2;
    }
}
