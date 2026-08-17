package p323s;

import Ad.z;
import kotlin.collections.AbstractC3952n;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC4121v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52606e;

    public J(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        k(a0.e(i10));
    }

    private final int g(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f52771c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f52769a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f52770b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iH = h(i11);
                if (this.f52606e == 0 && ((this.f52769a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    e();
                    iH = h(i11);
                }
                this.f52772d++;
                int i19 = this.f52606e;
                long[] jArr2 = this.f52769a;
                int i20 = iH >> 3;
                long j15 = jArr2[i20];
                int i21 = (iH & 7) << 3;
                this.f52606e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f52771c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iH - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iH;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int h(int i10) {
        int i11 = this.f52771c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f52769a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void i() {
        this.f52606e = a0.a(b()) - this.f52772d;
    }

    private final void j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = a0.f52677a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3952n.x(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f52769a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        i();
    }

    private final void k(int i10) {
        int iMax = i10 > 0 ? Math.max(7, a0.d(i10)) : 0;
        this.f52771c = iMax;
        j(iMax);
        this.f52770b = new long[iMax];
    }

    private final void n(int i10) {
        this.f52772d--;
        long[] jArr = this.f52769a;
        int i11 = this.f52771c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void e() {
        if (this.f52771c <= 8 || Long.compare(z.g(z.g(this.f52772d) * 32) ^ Long.MIN_VALUE, z.g(z.g(this.f52771c) * 25) ^ Long.MIN_VALUE) > 0) {
            o(a0.c(this.f52771c));
        } else {
            f();
        }
    }

    public final void f() {
        long[] jArr = this.f52769a;
        int i10 = this.f52771c;
        long[] jArr2 = this.f52770b;
        int i11 = (i10 + 7) >> 3;
        char c10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iW = AbstractC3952n.W(jArr);
        int i13 = iW - 1;
        long j11 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[iW] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j12 = (jArr[i15] >> i16) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Long.hashCode(jArr2[i14]) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iH = h(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iH - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[AbstractC3952n.W(jArr)] = (jArr[c11] & j11) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iH >> 3;
                    long j13 = jArr[i20];
                    int i21 = (iH & 7) << 3;
                    if (((j13 >> i21) & 255) == 128) {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iH] = jArr2[i14];
                        jArr2[i14] = 0;
                    } else {
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j13 & (~(255 << i21)));
                        long j14 = jArr2[iH];
                        jArr2[iH] = jArr2[i14];
                        jArr2[i14] = j14;
                        i14--;
                    }
                    jArr[AbstractC3952n.W(jArr)] = (jArr[c11] & j11) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                    j11 = j11;
                }
            } else {
                i14++;
            }
        }
        i();
    }

    public final void l(long j10) {
        this.f52770b[g(j10)] = j10;
    }

    public final boolean m(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f52771c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f52769a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f52770b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            n(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void o(int i10) {
        long[] jArr = this.f52769a;
        long[] jArr2 = this.f52770b;
        int i11 = this.f52771c;
        k(i10);
        long[] jArr3 = this.f52769a;
        long[] jArr4 = this.f52770b;
        int i12 = this.f52771c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iH = h(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iH >> 3;
                int i16 = (iH & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iH - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iH] = j10;
            }
        }
    }
}
