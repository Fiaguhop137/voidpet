package p394vg;

import Ug.a;
import Vf.j;
import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
abstract class i {
    public static short[][] a(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr2[i10] = a.f(sArr[i10]);
        }
        return sArr2;
    }

    public static short[][][] b(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = a.f(sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public static short[][][] c(SecureRandom secureRandom, int i10, int i11, int i12, boolean z10) {
        byte[] bArr = new byte[z10 ? (((i11 + 1) * i11) / 2) * i10 : i10 * i11 * i12];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i10, i11, i12);
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                for (int i16 = 0; i16 < i10; i16++) {
                    if (!z10 || i14 <= i15) {
                        sArr[i16][i14][i15] = (short) (bArr[i13] & 255);
                        i13++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] d(SecureRandom secureRandom, int i10, int i11) {
        byte[] bArr = new byte[i10 * i11];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sArr[i13][i12] = (short) (bArr[(i12 * i10) + i13] & 255);
            }
        }
        return sArr;
    }

    public static byte[] e(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                bArr[(i10 * length) + i11] = (byte) sArr[i11][i10];
            }
        }
        return bArr;
    }

    public static byte[] f(short[][][] sArr, boolean z10) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z10 ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length3; i12++) {
                for (short[][] sArr3 : sArr) {
                    if (!z10 || i11 <= i12) {
                        bArr[i10] = (byte) sArr3[i11][i12];
                        i10++;
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] g(j jVar, byte[] bArr, int i10) {
        int iD = jVar.d();
        jVar.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[iD];
        jVar.a(bArr2, 0);
        if (i10 == iD) {
            return bArr2;
        }
        if (i10 < iD) {
            return a.j(bArr2, i10);
        }
        byte[] bArrJ = a.j(bArr2, iD);
        while (true) {
            i10 -= iD;
            if (i10 < iD) {
                break;
            }
            jVar.update(bArr2, 0, iD);
            bArr2 = new byte[iD];
            jVar.a(bArr2, 0);
            bArrJ = a.g(bArrJ, bArr2);
        }
        if (i10 <= 0) {
            return bArrJ;
        }
        jVar.update(bArr2, 0, iD);
        byte[] bArr3 = new byte[iD];
        jVar.a(bArr3, 0);
        int length = bArrJ.length;
        byte[] bArrJ2 = a.j(bArrJ, length + i10);
        System.arraycopy(bArr3, 0, bArrJ2, length, i10);
        return bArrJ2;
    }

    public static int h(short[][] sArr, byte[] bArr, int i10) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                sArr[i12][i11] = (short) (bArr[(i11 * length) + i10 + i12] & 255);
            }
        }
        return length * length2;
    }

    public static int i(short[][][] sArr, byte[] bArr, int i10, boolean z10) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                for (short[][] sArr3 : sArr) {
                    if (!z10 || i12 <= i13) {
                        sArr3[i12][i13] = (short) (bArr[i11 + i10] & 255);
                        i11++;
                    }
                }
            }
        }
        return i11;
    }
}
