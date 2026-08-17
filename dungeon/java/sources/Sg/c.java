package Sg;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static a a(b bVar, i iVar) {
        int iD = bVar.d();
        int i10 = 1;
        int i11 = 1 << iD;
        int iG = iVar.g();
        int i12 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, iG, i11);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iG, i11);
        for (int i13 = 0; i13 < i11; i13++) {
            iArr2[0][i13] = bVar.f(iVar.e(i13));
        }
        for (int i14 = 1; i14 < iG; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                iArr2[i14][i15] = bVar.h(iArr2[i14 - 1][i15], i15);
            }
        }
        for (int i16 = 0; i16 < iG; i16++) {
            for (int i17 = i12; i17 < i11; i17++) {
                int i18 = i12;
                while (i18 <= i16) {
                    int[] iArr3 = iArr[i16];
                    iArr3[i17] = bVar.a(iArr3[i17], bVar.h(iArr2[i18][i17], iVar.f((iG + i18) - i16)));
                    i18++;
                    i10 = i10;
                    i12 = i12;
                }
            }
        }
        int i19 = i10;
        int i20 = i12;
        int[] iArr4 = new int[2];
        iArr4[i19] = (i11 + 31) >>> 5;
        iArr4[i20] = iG * iD;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iArr4);
        for (int i21 = i20; i21 < i11; i21++) {
            int i22 = i21 >>> 5;
            int i23 = i19 << (i21 & 31);
            for (int i24 = i20; i24 < iG; i24++) {
                int i25 = iArr[i24][i21];
                for (int i26 = i20; i26 < iD; i26++) {
                    if (((i25 >>> i26) & 1) != 0) {
                        int[] iArr6 = iArr5[(((i24 + 1) * iD) - i26) - 1];
                        iArr6[i22] = iArr6[i22] ^ i23;
                    }
                }
            }
        }
        return new a(i11, iArr5);
    }
}
