package p196kg;

import p143hg.a;

/* JADX INFO: loaded from: classes3.dex */
final class j extends k {
    j() {
    }

    private short e(short s10) {
        return d(a.a(d(a.a(s10))));
    }

    private short f(short s10, short s11) {
        long j10 = s10;
        long j11 = s11;
        long j12 = (j11 << 18) * (64 & j10);
        long j13 = j10 ^ (j10 << 21);
        long j14 = ((j11 << 15) * (j13 & 8589934624L)) ^ (((((j12 ^ ((268435457 & j13) * j11)) ^ ((j11 << 3) * (536870914 & j13))) ^ ((j11 << 6) * (1073741828 & j13))) ^ ((j11 << 9) * (2147483656L & j13))) ^ ((j11 << 12) * (4294967312L & j13)));
        long j15 = 2305834213120671744L & j14;
        long j16 = j14 ^ ((j15 >>> 26) ^ (((j15 >>> 18) ^ (j15 >>> 20)) ^ (j15 >>> 24)));
        long j17 = 8796025913344L & j16;
        return d(((int) (j16 ^ ((j17 >>> 26) ^ (((j17 >>> 18) ^ (j17 >>> 20)) ^ (j17 >>> 24))))) & 67108863);
    }

    private short g(short s10, short s11) {
        long j10 = s10;
        long j11 = s11;
        long j12 = (j11 << 6) * (64 & j10);
        long j13 = j10 ^ (j10 << 7);
        long j14 = ((j11 << 5) * (j13 & 524320)) ^ (((((j12 ^ ((16385 & j13) * j11)) ^ ((j11 << 1) * (32770 & j13))) ^ ((j11 << 2) * (65540 & j13))) ^ ((j11 << 3) * (131080 & j13))) ^ ((j11 << 4) * (262160 & j13)));
        long j15 = 137371844608L & j14;
        return d(((int) (j14 ^ ((j15 >>> 26) ^ (((j15 >>> 18) ^ (j15 >>> 20)) ^ (j15 >>> 24))))) & 67108863);
    }

    @Override // p196kg.k
    protected short a(short s10) {
        return c(s10, (short) 1);
    }

    @Override // p196kg.k
    protected short b(short s10, short s11) {
        int i10 = (s11 & 1) * s10;
        for (int i11 = 1; i11 < 13; i11++) {
            i10 ^= ((1 << i11) & s11) * s10;
        }
        return d(i10);
    }

    protected short c(short s10, short s11) {
        short sG = g(s10, s10);
        short sF = f(sG, sG);
        return g(f(e(f(e(sF), sF)), sF), s11);
    }

    protected short d(int i10) {
        int i11 = i10 & 8191;
        int i12 = i10 >>> 13;
        int i13 = ((i12 << 4) ^ (i12 << 3)) ^ (i12 << 1);
        int i14 = i13 >>> 13;
        return (short) ((((i12 ^ i11) ^ i14) ^ (i13 & 8191)) ^ (((i14 << 4) ^ (i14 << 3)) ^ (i14 << 1)));
    }
}
