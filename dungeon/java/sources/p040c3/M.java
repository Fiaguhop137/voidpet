package p040c3;

import U1.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(F f10, int i10, int i11) {
        f10.a0(i10);
        if (f10.a() < 5) {
            return -9223372036854775807L;
        }
        int iU = f10.u();
        if ((8388608 & iU) != 0 || ((2096896 & iU) >> 8) != i11 || (iU & 32) == 0 || f10.L() < 7 || f10.a() < 7 || (f10.L() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        f10.q(bArr, 0, 6);
        return d(bArr);
    }

    private static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
