package p394vg;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
class a {
    public short[][] a(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i10 = 0; i10 < sArr.length; i10++) {
                    for (int i11 = 0; i11 < sArr[0].length; i11++) {
                        sArr4[i10][i11] = b.a(sArr[i10][i11], sArr2[i10][i11]);
                    }
                }
                return sArr4;
            }
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[][] b(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return a(sArr, f(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[][] c(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                for (int i12 = 0; i12 < sArr2[0].length; i12++) {
                    short sK = b.k(sArr[i10][i11], sArr2[i11][i12]);
                    short[] sArr4 = sArr3[i10];
                    sArr4[i12] = b.a(sArr4[i12], sK);
                }
            }
        }
        return sArr3;
    }

    public short[][][] d(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i10 = 0; i10 < sArr2[0].length; i10++) {
                    for (int i11 = 0; i11 < sArr2[0][0].length; i11++) {
                        for (int i12 = 0; i12 < sArr.length; i12++) {
                            for (int i13 = 0; i13 < sArr[0].length; i13++) {
                                short sK = b.k(sArr[i12][i13], sArr2[i13][i10][i11]);
                                short[] sArr8 = sArr7[i12][i10];
                                sArr8[i11] = b.a(sArr8[i11], sK);
                            }
                            short[] sArr9 = sArr7[i12][i10];
                            sArr9[i11] = b.a(sArr3[i12][i10][i11], sArr9[i11]);
                        }
                    }
                }
                return sArr7;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public short[][] e(short[][] sArr) {
        if (sArr.length != sArr[0].length) {
            throw new RuntimeException("Computation to upper triangular matrix is not possible!");
        }
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        int i10 = 0;
        while (i10 < sArr.length) {
            sArr2[i10][i10] = sArr[i10][i10];
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < sArr[0].length; i12++) {
                sArr2[i10][i12] = b.a(sArr[i10][i12], sArr[i12][i10]);
            }
            i10 = i11;
        }
        return sArr2;
    }

    public short[][] f(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i11][i10] = sArr[i10][i11];
            }
        }
        return sArr2;
    }
}
