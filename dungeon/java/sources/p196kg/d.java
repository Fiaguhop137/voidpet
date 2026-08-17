package p196kg;

import Xf.h;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f48194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f48195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f48196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f48197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f48200q;

    public d(int i10, int i11, int i12, int[] iArr, boolean z10, int i13) {
        c bVar;
        this.f48200q = z10;
        this.f48184a = i11;
        this.f48185b = i12;
        this.f48186c = i10;
        this.f48194k = iArr;
        this.f48195l = i13;
        this.f48187d = i12 * 2;
        this.f48188e = (1 << (i10 - 4)) * ((i10 * 2) - 1);
        int i14 = i12 * i10;
        this.f48189f = i14;
        int i15 = i11 - i14;
        this.f48190g = i15;
        this.f48191h = (i15 + 7) / 8;
        this.f48192i = (i14 + 7) / 8;
        this.f48193j = (1 << i10) - 1;
        if (i10 == 12) {
            this.f48196m = new i();
            bVar = new a(this.f48184a, this.f48185b, this.f48186c);
        } else {
            this.f48196m = new j();
            bVar = new b(this.f48184a, this.f48185b, this.f48186c);
        }
        this.f48197n = bVar;
        this.f48198o = this.f48185b % 8 != 0;
        this.f48199p = (1 << this.f48186c) > this.f48184a;
    }

    private static int a(long j10) {
        long j11 = ~j10;
        long j12 = 72340172838076673L;
        long j13 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j12 &= j11 >>> i10;
            j13 += j12;
        }
        long j14 = 578721382704613384L & j13;
        long j15 = j14 | (j14 >>> 1);
        long j16 = j15 | (j15 >>> 2);
        long j17 = j13 >>> 8;
        long j18 = j13 + (j17 & j16);
        for (int i11 = 2; i11 < 8; i11++) {
            j16 &= j16 >>> 8;
            j17 >>>= 8;
            j18 += j17 & j16;
        }
        return ((int) j18) & 255;
    }

    private short b(short[] sArr, short s10) {
        int i10 = this.f48185b;
        short sB = sArr[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            sB = (short) (this.f48196m.b(sB, s10) ^ sArr[i11]);
        }
        return sB;
    }

    private int e(byte[][] bArr, short[] sArr, long[] jArr) {
        long jC;
        int i10 = 64;
        long[] jArr2 = new long[64];
        int i11 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i12 = this.f48189f - 32;
        int i13 = i12 / 8;
        int i14 = i12 % 8;
        char c10 = 0;
        if (this.f48198o) {
            for (int i15 = 0; i15 < 32; i15++) {
                for (int i16 = 0; i16 < 9; i16++) {
                    bArr2[i16] = bArr[i12 + i15][i13 + i16];
                }
                int i17 = 0;
                while (i17 < 8) {
                    int i18 = i17 + 1;
                    bArr2[i17] = (byte) (((bArr2[i17] & 255) >> i14) | (bArr2[i18] << (8 - i14)));
                    i17 = i18;
                }
                jArr2[i15] = l.c(bArr2, 0);
            }
        } else {
            for (int i19 = 0; i19 < 32; i19++) {
                jArr2[i19] = l.c(bArr[i12 + i19], i13);
            }
        }
        long j10 = 0;
        jArr[0] = 0;
        int i20 = 0;
        while (true) {
            long j11 = 1;
            if (i20 >= 32) {
                int i21 = 0;
                while (i21 < i11) {
                    int i22 = i21 + 1;
                    int i23 = i22;
                    while (i23 < i10) {
                        int i24 = i12 + i21;
                        int i25 = i12 + i23;
                        long[] jArr4 = jArr3;
                        long jH = ((long) (sArr[i24] ^ sArr[i25])) & h((short) i23, (short) jArr4[i21]);
                        sArr[i24] = (short) (((long) sArr[i24]) ^ jH);
                        sArr[i25] = (short) (jH ^ ((long) sArr[i25]));
                        i23++;
                        i22 = i22;
                        jArr3 = jArr4;
                        i10 = 64;
                        i11 = 32;
                    }
                    i21 = i22;
                }
                long[] jArr5 = jArr3;
                for (int i26 = 0; i26 < this.f48189f; i26++) {
                    if (this.f48198o) {
                        for (int i27 = 0; i27 < 9; i27++) {
                            bArr2[i27] = bArr[i26][i13 + i27];
                        }
                        int i28 = 0;
                        while (i28 < 8) {
                            int i29 = i28 + 1;
                            bArr2[i28] = (byte) (((bArr2[i28] & 255) >> i14) | (bArr2[i29] << (8 - i14)));
                            i28 = i29;
                        }
                        jC = l.c(bArr2, 0);
                    } else {
                        jC = l.c(bArr[i26], i13);
                    }
                    for (int i30 = 0; i30 < 32; i30++) {
                        long j12 = jArr5[i30];
                        long j13 = ((jC >> i30) ^ (jC >> ((int) j12))) & 1;
                        jC = (jC ^ (j13 << ((int) j12))) ^ (j13 << i30);
                    }
                    if (this.f48198o) {
                        l.e(bArr2, 0, jC);
                        byte[] bArr3 = bArr[i26];
                        int i31 = i13 + 8;
                        int i32 = 8 - i14;
                        bArr3[i31] = (byte) ((((bArr3[i31] & 255) >>> i14) << i14) | ((bArr2[7] & 255) >>> i32));
                        bArr3[i13] = (byte) (((bArr2[0] & 255) << i14) | (((bArr3[i13] & 255) << i32) >>> i32));
                        for (int i33 = 7; i33 >= 1; i33--) {
                            bArr[i26][i13 + i33] = (byte) (((bArr2[i33] & 255) << i14) | ((bArr2[i33 - 1] & 255) >>> i32));
                        }
                    } else {
                        l.e(bArr[i26], i13, jC);
                    }
                }
                return 0;
            }
            long j14 = jArr2[i20];
            int i34 = i20 + 1;
            long j15 = j10;
            for (int i35 = i34; i35 < 32; i35++) {
                j14 |= jArr2[i35];
            }
            if (j14 == j15) {
                return -1;
            }
            int iA = a(j14);
            char c11 = c10;
            long j16 = iA;
            jArr3[i20] = j16;
            jArr[c11] = jArr[c11] | (1 << ((int) j16));
            for (int i36 = i34; i36 < 32; i36++) {
                long j17 = jArr2[i20];
                jArr2[i20] = j17 ^ (jArr2[i36] & (((j17 >> iA) & 1) - 1));
            }
            int i37 = i34;
            while (i37 < 32) {
                long j18 = jArr2[i37];
                long j19 = j11;
                jArr2[i37] = j18 ^ (jArr2[i20] & (-((j18 >> iA) & j19)));
                i37++;
                j11 = j19;
                c11 = 0;
            }
            c10 = c11;
            i20 = i34;
            j10 = j15;
        }
    }

    private int f(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i10;
        int i11;
        int i12 = this.f48185b;
        short[] sArr2 = new short[i12 + 1];
        byte b10 = 1;
        sArr2[i12] = 1;
        for (int i13 = 0; i13 < this.f48185b; i13++) {
            sArr2[i13] = l.d(bArr2, (i13 * 2) + 40, this.f48193j);
        }
        int i14 = 1 << this.f48186c;
        long[] jArr2 = new long[i14];
        for (int i15 = 0; i15 < (1 << this.f48186c); i15++) {
            long j10 = iArr[i15];
            jArr2[i15] = j10;
            long j11 = j10 << 31;
            jArr2[i15] = j11;
            long j12 = j11 | ((long) i15);
            jArr2[i15] = j12;
            jArr2[i15] = j12 & Long.MAX_VALUE;
        }
        i(jArr2, 0, i14);
        for (int i16 = 1; i16 < (1 << this.f48186c); i16++) {
            if ((jArr2[i16 - 1] >> 31) == (jArr2[i16] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.f48184a];
        for (int i17 = 0; i17 < (1 << this.f48186c); i17++) {
            sArr[i17] = (short) (jArr2[i17] & ((long) this.f48193j));
        }
        int i18 = 0;
        while (true) {
            i10 = this.f48184a;
            if (i18 >= i10) {
                break;
            }
            sArr3[i18] = l.a(sArr[i18], this.f48186c);
            i18++;
        }
        short[] sArr4 = new short[i10];
        g(sArr4, sArr2, sArr3);
        int i19 = 0;
        while (true) {
            i11 = this.f48184a;
            if (i19 >= i11) {
                break;
            }
            sArr4[i19] = this.f48196m.a(sArr4[i19]);
            i19++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f48189f, i11 / 8);
        for (int i20 = 0; i20 < this.f48189f; i20++) {
            for (int i21 = 0; i21 < this.f48184a / 8; i21++) {
                bArr3[i20][i21] = 0;
            }
        }
        int i22 = 0;
        while (i22 < this.f48185b) {
            for (int i23 = 0; i23 < this.f48184a; i23 += 8) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f48186c;
                    if (i24 < i25) {
                        bArr3[(i25 * i22) + i24][i23 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i23 + 7] >>> i24) & 1)) << 1)) | ((sArr4[i23 + 6] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 5] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 4] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 3] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 2] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 1] >>> i24) & 1))) << 1)) | ((sArr4[i23] >>> i24) & 1));
                        i24++;
                    }
                }
            }
            for (int i26 = 0; i26 < this.f48184a; i26++) {
                sArr4[i26] = this.f48196m.b(sArr4[i26], sArr3[i26]);
            }
            i22++;
        }
        int i27 = 0;
        while (true) {
            int i28 = this.f48189f;
            if (i27 >= i28) {
                if (bArr != null) {
                    if (!this.f48198o) {
                        int i29 = ((this.f48184a - i28) + 7) / 8;
                        int i30 = 0;
                        while (true) {
                            int i31 = this.f48189f;
                            if (i30 >= i31) {
                                break;
                            }
                            System.arraycopy(bArr3[i30], i31 / 8, bArr, i29 * i30, i29);
                            i30++;
                        }
                    } else {
                        int i32 = i28 % 8;
                        if (i32 != 0) {
                            int i33 = 0;
                            int i34 = 0;
                            while (true) {
                                int i35 = this.f48189f;
                                if (i33 >= i35) {
                                    break;
                                }
                                int i36 = (i35 - 1) / 8;
                                while (i36 < (this.f48184a / 8) - 1) {
                                    byte[] bArr4 = bArr3[i33];
                                    int i37 = (bArr4[i36] & 255) >>> i32;
                                    i36++;
                                    bArr[i34] = (byte) ((bArr4[i36] << (8 - i32)) | i37);
                                    i34++;
                                }
                                bArr[i34] = (byte) ((bArr3[i33][i36] & 255) >>> i32);
                                i33++;
                                i34++;
                            }
                        } else {
                            System.arraycopy(bArr3[i22], (i28 - 1) / 8, bArr, 0, this.f48184a / 8);
                        }
                    }
                }
                return 0;
            }
            i22 = i27 >>> 3;
            int i38 = i27 & 7;
            if (this.f48200q && i27 == i28 - 32) {
                if (e(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i39 = i27 + 1;
            for (int i40 = i39; i40 < this.f48189f; i40++) {
                byte b11 = (byte) (-((byte) (((byte) (((byte) (bArr3[i27][i22] ^ bArr3[i40][i22])) >> i38)) & b10)));
                int i41 = 0;
                while (i41 < this.f48184a / 8) {
                    byte[] bArr5 = bArr3[i27];
                    bArr5[i41] = (byte) (bArr5[i41] ^ (bArr3[i40][i41] & b11));
                    i41++;
                    b10 = b10;
                }
            }
            byte b12 = b10;
            if (((bArr3[i27][i22] >> i38) & 1) == 0) {
                return -1;
            }
            for (int i42 = 0; i42 < this.f48189f; i42++) {
                if (i42 != i27) {
                    byte b13 = (byte) (-((byte) (((byte) (bArr3[i42][i22] >> i38)) & 1)));
                    for (int i43 = 0; i43 < this.f48184a / 8; i43++) {
                        byte[] bArr6 = bArr3[i42];
                        bArr6[i43] = (byte) (bArr6[i43] ^ (bArr3[i27][i43] & b13));
                    }
                }
            }
            i27 = i39;
            b10 = b12;
        }
    }

    private void g(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < this.f48184a; i10++) {
            sArr[i10] = b(sArr2, sArr3[i10]);
        }
    }

    private static long h(short s10, short s11) {
        return -((((long) (s10 ^ s11)) - 1) >>> 63);
    }

    private static void i(long[] jArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        int i13 = 1;
        while (i13 < i12 - i13) {
            i13 += i13;
        }
        for (int i14 = i13; i14 > 0; i14 >>>= 1) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12 - i14; i16++) {
                if ((i16 & i14) == 0) {
                    int i17 = i10 + i16;
                    int i18 = i17 + i14;
                    long j10 = jArr[i18];
                    long j11 = jArr[i17];
                    long j12 = (j10 ^ j11) & (-((j10 - j11) >>> 63));
                    jArr[i17] = j11 ^ j12;
                    jArr[i18] = jArr[i18] ^ j12;
                }
            }
            for (int i19 = i13; i19 > i14; i19 >>>= 1) {
                while (i15 < i12 - i19) {
                    if ((i15 & i14) == 0) {
                        int i20 = i10 + i15;
                        int i21 = i20 + i14;
                        long j13 = jArr[i21];
                        for (int i22 = i19; i22 > i14; i22 >>>= 1) {
                            int i23 = i20 + i22;
                            long j14 = jArr[i23];
                            long j15 = (-((j14 - j13) >>> 63)) & (j13 ^ j14);
                            j13 ^= j15;
                            jArr[i23] = j14 ^ j15;
                        }
                        jArr[i21] = j13;
                    }
                    i15++;
                }
            }
        }
    }

    public byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[d()];
        int i10 = this.f48186c;
        short[] sArr = new short[1 << i10];
        long[] jArr = {0};
        int[] iArr = new int[1 << i10];
        int i11 = (this.f48184a / 8) + ((1 << i10) * 4);
        byte[] bArr3 = new byte[i11];
        int i12 = ((i11 - 32) - this.f48187d) - ((1 << i10) * 4);
        h hVar = new h(256);
        hVar.b((byte) 64);
        hVar.update(bArr, 0, 32);
        hVar.e(bArr3, 0, i11);
        for (int i13 = 0; i13 < (1 << this.f48186c); i13++) {
            iArr[i13] = l.b(bArr3, (i13 * 4) + i12);
        }
        f(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int d() {
        if (!this.f48198o) {
            return (this.f48189f * this.f48190g) / 8;
        }
        int i10 = this.f48189f;
        return i10 * ((this.f48184a / 8) - ((i10 - 1) / 8));
    }
}
