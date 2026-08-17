package p196kg;

import Ug.f;

/* JADX INFO: loaded from: classes3.dex */
abstract class l {
    static short a(short s10, int i10) {
        short s11 = (short) (((s10 & 65280) >> 8) | ((s10 & 255) << 8));
        short s12 = (short) (((s11 & 61680) >> 4) | ((s11 & 3855) << 4));
        short s13 = (short) (((s12 & 52428) >> 2) | ((s12 & 13107) << 2));
        short s14 = (short) (((s13 & 43690) >> 1) | ((s13 & 21845) << 1));
        return (short) (i10 == 12 ? s14 >> 4 : s14 >> 3);
    }

    static int b(byte[] bArr, int i10) {
        return f.e(bArr, i10);
    }

    static long c(byte[] bArr, int i10) {
        return f.f(bArr, i10);
    }

    static short d(byte[] bArr, int i10, int i11) {
        return (short) (f.g(bArr, i10) & i11);
    }

    static void e(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >> 56) & 255);
    }
}
