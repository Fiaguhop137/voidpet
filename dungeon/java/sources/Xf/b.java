package Xf;

import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long[] f16484h = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Vf.d f16485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long[] f16486b = new long[25];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte[] f16487c = new byte[192];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f16488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f16489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f16490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f16491g;

    public b(int i10, Vf.d dVar) {
        this.f16485a = dVar;
        m(i10);
        Vf.g.a(l());
    }

    private void f(byte[] bArr, int i10) {
        int i11 = this.f16488d >>> 6;
        for (int i12 = 0; i12 < i11; i12++) {
            long[] jArr = this.f16486b;
            jArr[i12] = jArr[i12] ^ Ug.f.f(bArr, i10);
            i10 += 8;
        }
        h();
    }

    private void g() {
        h();
        Ug.f.j(this.f16486b, 0, this.f16488d >>> 6, this.f16487c, 0);
        this.f16489e = this.f16488d;
    }

    private void h() {
        long[] jArr = this.f16486b;
        long j10 = jArr[0];
        long j11 = jArr[1];
        char c10 = 2;
        long j12 = jArr[2];
        char c11 = 3;
        long j13 = jArr[3];
        char c12 = 4;
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j20 = jArr[10];
        long j21 = jArr[11];
        long j22 = jArr[12];
        long j23 = jArr[13];
        long j24 = jArr[14];
        long j25 = jArr[15];
        long j26 = jArr[16];
        long j27 = jArr[17];
        long j28 = jArr[18];
        long j29 = jArr[19];
        long j30 = jArr[20];
        long j31 = jArr[21];
        long j32 = jArr[22];
        long j33 = jArr[23];
        int i10 = 24;
        long j34 = jArr[24];
        int i11 = 0;
        while (i11 < i10) {
            long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
            long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
            long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
            long j38 = (((j13 ^ j18) ^ j23) ^ j28) ^ j33;
            long j39 = (((j14 ^ j19) ^ j24) ^ j29) ^ j34;
            long j40 = ((j36 << 1) | (j36 >>> (-1))) ^ j39;
            long j41 = ((j37 << 1) | (j37 >>> (-1))) ^ j35;
            long j42 = ((j38 << 1) | (j38 >>> (-1))) ^ j36;
            long j43 = ((j39 << 1) | (j39 >>> (-1))) ^ j37;
            long j44 = ((j35 << 1) | (j35 >>> (-1))) ^ j38;
            long j45 = j10 ^ j40;
            long j46 = j15 ^ j40;
            long j47 = j20 ^ j40;
            long j48 = j25 ^ j40;
            long j49 = j30 ^ j40;
            long j50 = j11 ^ j41;
            long j51 = j16 ^ j41;
            long j52 = j21 ^ j41;
            long j53 = j26 ^ j41;
            long j54 = j31 ^ j41;
            long j55 = j12 ^ j42;
            long j56 = j17 ^ j42;
            long j57 = j22 ^ j42;
            long j58 = j27 ^ j42;
            long j59 = j32 ^ j42;
            long j60 = j13 ^ j43;
            long j61 = j18 ^ j43;
            long j62 = j23 ^ j43;
            long j63 = j28 ^ j43;
            long j64 = j33 ^ j43;
            long j65 = j14 ^ j44;
            long j66 = j19 ^ j44;
            long j67 = j24 ^ j44;
            long j68 = j29 ^ j44;
            long j69 = j34 ^ j44;
            long j70 = (j50 << 1) | (j50 >>> 63);
            char c13 = c10;
            long j71 = (j51 << 44) | (j51 >>> 20);
            char c14 = c11;
            long j72 = (j66 << 20) | (j66 >>> 44);
            char c15 = c12;
            long j73 = (j59 << 61) | (j59 >>> c14);
            int i12 = i10;
            long j74 = (j67 << 39) | (j67 >>> 25);
            long j75 = (j49 << 18) | (j49 >>> 46);
            int i13 = i11;
            long j76 = (j55 << 62) | (j55 >>> c13);
            long j77 = (j57 << 43) | (j57 >>> 21);
            long j78 = (j62 << 25) | (j62 >>> 39);
            long j79 = (j68 << 8) | (j68 >>> 56);
            long j80 = (j64 << 56) | (j64 >>> 8);
            long j81 = (j48 << 41) | (j48 >>> 23);
            long j82 = (j65 << 27) | (j65 >>> 37);
            long j83 = (j69 << 14) | (j69 >>> 50);
            long j84 = (j54 << c13) | (j54 >>> 62);
            long j85 = (j61 << 55) | (j61 >>> 9);
            long j86 = (j53 << 45) | (j53 >>> 19);
            long j87 = (j46 << 36) | (j46 >>> 28);
            long j88 = (j60 << 28) | (j60 >>> 36);
            long j89 = (j63 << 21) | (j63 >>> 43);
            long j90 = (j58 << 15) | (j58 >>> 49);
            long j91 = (j52 << 10) | (j52 >>> 54);
            long j92 = (j56 << 6) | (j56 >>> 58);
            long j93 = (j47 << c14) | (j47 >>> 61);
            long j94 = j45 ^ ((~j71) & j77);
            j11 = ((~j77) & j89) ^ j71;
            long j95 = j77 ^ ((~j89) & j83);
            long j96 = j89 ^ ((~j83) & j45);
            long j97 = j83 ^ ((~j45) & j71);
            long j98 = j88 ^ ((~j72) & j93);
            long j99 = ((~j93) & j86) ^ j72;
            long j100 = ((~j86) & j73) ^ j93;
            long j101 = j86 ^ ((~j73) & j88);
            long j102 = ((~j88) & j72) ^ j73;
            j20 = j70 ^ ((~j92) & j78);
            long j103 = ((~j78) & j79) ^ j92;
            long j104 = ((~j79) & j75) ^ j78;
            long j105 = j79 ^ ((~j75) & j70);
            j24 = j75 ^ ((~j70) & j92);
            long j106 = j82 ^ ((~j87) & j91);
            long j107 = j87 ^ ((~j91) & j90);
            long j108 = ((~j90) & j80) ^ j91;
            long j109 = j90 ^ ((~j80) & j82);
            long j110 = ((~j82) & j87) ^ j80;
            long j111 = j76 ^ ((~j85) & j74);
            long j112 = ((~j74) & j81) ^ j85;
            long j113 = j74 ^ ((~j81) & j84);
            j33 = j81 ^ ((~j84) & j76);
            j26 = j107;
            j17 = j100;
            j31 = j112;
            j30 = j111;
            j32 = j113;
            j19 = j102;
            j18 = j101;
            j27 = j108;
            j23 = j105;
            j29 = j110;
            j15 = j98;
            j22 = j104;
            j16 = j99;
            c12 = c15;
            c10 = c13;
            j34 = j84 ^ ((~j76) & j85);
            jArr = jArr;
            i11 = i13 + 1;
            j10 = j94 ^ f16484h[i13];
            j13 = j96;
            j14 = j97;
            j21 = j103;
            i10 = i12;
            j28 = j109;
            j25 = j106;
            c11 = c14;
            j12 = j95;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j10;
        jArr2[1] = j11;
        jArr2[c10] = j12;
        jArr2[c11] = j13;
        jArr2[c12] = j14;
        jArr2[5] = j15;
        jArr2[6] = j16;
        jArr2[7] = j17;
        jArr2[8] = j18;
        jArr2[9] = j19;
        jArr2[10] = j20;
        jArr2[11] = j21;
        jArr2[12] = j22;
        jArr2[13] = j23;
        jArr2[14] = j24;
        jArr2[15] = j25;
        jArr2[16] = j26;
        jArr2[17] = j27;
        jArr2[18] = j28;
        jArr2[19] = j29;
        jArr2[20] = j30;
        jArr2[21] = j31;
        jArr2[22] = j32;
        jArr2[23] = j33;
        jArr2[i10] = j34;
    }

    private void m(int i10) {
        if (i10 != 128 && i10 != 224 && i10 != 256 && i10 != 288 && i10 != 384 && i10 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        n(1600 - (i10 << 1));
    }

    private void n(int i10) {
        if (i10 <= 0 || i10 >= 1600 || i10 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f16488d = i10;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f16486b;
            if (i11 >= jArr.length) {
                Ug.a.l(this.f16487c, (byte) 0);
                this.f16489e = 0;
                this.f16491g = false;
                this.f16490f = (1600 - i10) / 2;
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    private void o() {
        byte[] bArr = this.f16487c;
        int i10 = this.f16489e;
        int i11 = i10 >>> 3;
        bArr[i11] = (byte) (bArr[i11] | ((byte) (1 << (i10 & 7))));
        int i12 = i10 + 1;
        this.f16489e = i12;
        if (i12 == this.f16488d) {
            f(bArr, 0);
        } else {
            int i13 = i12 >>> 6;
            int i14 = i12 & 63;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                long[] jArr = this.f16486b;
                jArr[i16] = jArr[i16] ^ Ug.f.f(this.f16487c, i15);
                i15 += 8;
            }
            if (i14 > 0) {
                long[] jArr2 = this.f16486b;
                jArr2[i13] = (((1 << i14) - 1) & Ug.f.f(this.f16487c, i15)) ^ jArr2[i13];
            }
        }
        long[] jArr3 = this.f16486b;
        int i17 = (this.f16488d - 1) >>> 6;
        jArr3[i17] = jArr3[i17] ^ Long.MIN_VALUE;
        this.f16489e = 0;
        this.f16491g = true;
    }

    @Override // Vf.j
    public int a(byte[] bArr, int i10) {
        q(bArr, i10, this.f16490f);
        p();
        return d();
    }

    @Override // Vf.j
    public void b(byte b10) {
        i(b10);
    }

    @Override // Vf.j
    public int d() {
        return this.f16490f / 8;
    }

    protected void i(byte b10) {
        int i10 = this.f16489e;
        if (i10 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f16491g) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.f16487c;
        bArr[i10 >>> 3] = b10;
        int i11 = i10 + 8;
        this.f16489e = i11;
        if (i11 == this.f16488d) {
            f(bArr, 0);
            this.f16489e = 0;
        }
    }

    protected void j(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14 = this.f16489e;
        if (i14 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f16491g) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i15 = i14 >>> 3;
        int i16 = this.f16488d >>> 3;
        int i17 = i16 - i15;
        if (i11 < i17) {
            System.arraycopy(bArr, i10, this.f16487c, i15, i11);
            i13 = this.f16489e + (i11 << 3);
        } else {
            if (i15 > 0) {
                System.arraycopy(bArr, i10, this.f16487c, i15, i17);
                f(this.f16487c, 0);
            } else {
                i17 = 0;
            }
            while (true) {
                i12 = i11 - i17;
                if (i12 < i16) {
                    break;
                }
                f(bArr, i10 + i17);
                i17 += i16;
            }
            System.arraycopy(bArr, i10 + i17, this.f16487c, 0, i12);
            i13 = i12 << 3;
        }
        this.f16489e = i13;
    }

    protected void k(int i10, int i11) {
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i12 = this.f16489e;
        if (i12 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f16491g) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.f16487c[i12 >>> 3] = (byte) (i10 & ((1 << i11) - 1));
        this.f16489e = i12 + i11;
    }

    protected Vf.c l() {
        return i.a(this, d() * 8, this.f16485a);
    }

    public void p() {
        m(this.f16490f);
    }

    protected void q(byte[] bArr, int i10, long j10) {
        if (!this.f16491g) {
            o();
        }
        long j11 = 0;
        if (j10 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j11 < j10) {
            if (this.f16489e == 0) {
                g();
            }
            int iMin = (int) Math.min(this.f16489e, j10 - j11);
            System.arraycopy(this.f16487c, (this.f16488d - this.f16489e) / 8, bArr, ((int) (j11 / 8)) + i10, iMin / 8);
            this.f16489e -= iMin;
            j11 += (long) iMin;
        }
    }

    @Override // Vf.j
    public void update(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }
}
