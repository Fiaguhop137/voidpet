package p323s;

import Ad.z;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC4110j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52602f;

    public D(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        o(a0.e(i10));
    }

    public /* synthetic */ D(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int k(int i10) {
        int i11 = this.f52732d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f52729a;
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

    private final int l(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f52732d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f52729a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f52730b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f52602f == 0 && ((this.f52729a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i12);
                }
                this.f52733e++;
                int i23 = this.f52602f;
                long[] jArr2 = this.f52729a;
                int i24 = iK >> 3;
                long j14 = jArr2[i24];
                int i25 = (iK & 7) << 3;
                this.f52602f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f52732d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iK - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return ~iK;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.f52602f = a0.a(d()) - this.f52733e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = a0.f52677a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3952n.x(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f52729a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, a0.d(i10)) : 0;
        this.f52732d = iMax;
        n(iMax);
        this.f52730b = new int[iMax];
        this.f52731c = new int[iMax];
    }

    public final void h() {
        if (this.f52732d <= 8 || Long.compare(z.g(z.g(this.f52733e) * 32) ^ Long.MIN_VALUE, z.g(z.g(this.f52732d) * 25) ^ Long.MIN_VALUE) > 0) {
            q(a0.c(this.f52732d));
        } else {
            j();
        }
    }

    public final void i() {
        this.f52733e = 0;
        long[] jArr = this.f52729a;
        if (jArr != a0.f52677a) {
            AbstractC3952n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f52729a;
            int i10 = this.f52732d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m();
    }

    public final void j() {
        long[] jArr = this.f52729a;
        int i10 = this.f52732d;
        int[] iArr = this.f52730b;
        int[] iArr2 = this.f52731c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iW = AbstractC3952n.W(jArr);
        int i14 = iW - 1;
        long j11 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iW] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j12 = (jArr[i16] >> i17) & 255;
            if (j12 != 128 && j12 == 254) {
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iK = k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iK - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC3952n.W(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iK >> 3;
                    long j13 = jArr[i22];
                    int i23 = (iK & 7) << 3;
                    if (((j13 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i21;
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i21;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j13 & (~(255 << i23)));
                        int i24 = iArr[iK];
                        iArr[iK] = iArr[i15];
                        iArr[i15] = i24;
                        int i25 = iArr2[iK];
                        iArr2[iK] = iArr2[i15];
                        iArr2[i15] = i25;
                        i15--;
                    }
                    jArr[AbstractC3952n.W(jArr)] = (jArr[i21] & j11) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j11 = j11;
                }
            } else {
                i15++;
            }
        }
        m();
    }

    public final void p(int i10, int i11) {
        r(i10, i11);
    }

    public final void q(int i10) {
        D d10 = this;
        long[] jArr = d10.f52729a;
        int[] iArr = d10.f52730b;
        int[] iArr2 = d10.f52731c;
        int i11 = d10.f52732d;
        o(i10);
        long[] jArr2 = d10.f52729a;
        int[] iArr3 = d10.f52730b;
        int[] iArr4 = d10.f52731c;
        int i12 = d10.f52732d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = d10.k(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j11 = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                jArr2[i16] = j11;
                jArr2[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iK] = i14;
                iArr4[iK] = iArr2[i13];
            }
            i13++;
            d10 = this;
            jArr = jArr;
        }
    }

    public final void r(int i10, int i11) {
        int iL = l(i10);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f52730b[iL] = i10;
        this.f52731c[iL] = i11;
    }
}
