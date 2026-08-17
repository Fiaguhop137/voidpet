package p323s;

import Ad.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.a;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class M extends W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f52608h;

    public M(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        s(a0.e(i10));
    }

    public /* synthetic */ M(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final int m(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f52655f;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f52650a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.b(this.f52651b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = n(i11);
                if (this.f52608h == 0 && ((this.f52650a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    i();
                    iN = n(i11);
                }
                this.f52656g++;
                int i19 = this.f52608h;
                long[] jArr2 = this.f52650a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f52608h = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f52655f;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iN;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int n(int i10) {
        int i11 = this.f52655f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f52650a;
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

    private final void o(int[] iArr) {
        long[] jArr = this.f52652c;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = iArr[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.f52653d;
        if (i14 != Integer.MAX_VALUE) {
            this.f52653d = iArr[i14];
        }
        int i15 = this.f52654e;
        if (i15 != Integer.MAX_VALUE) {
            this.f52654e = iArr[i15];
        }
    }

    private final void p(long[] jArr) {
        long[] jArr2 = this.f52652c;
        int length = jArr2.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr2[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i12] & 4294967295L)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & jArr[i13]);
            }
            jArr2[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.f52653d;
        if (i14 != Integer.MAX_VALUE) {
            this.f52653d = (int) (jArr[i14] & 4294967295L);
        }
        int i15 = this.f52654e;
        if (i15 != Integer.MAX_VALUE) {
            this.f52654e = (int) (jArr[i15] & 4294967295L);
        }
    }

    private final void q() {
        this.f52608h = a0.a(b()) - this.f52656g;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = a0.f52677a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3952n.x(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f52650a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        q();
    }

    private final void s(int i10) {
        long[] jArrA;
        int iMax = i10 > 0 ? Math.max(7, a0.d(i10)) : 0;
        this.f52655f = iMax;
        r(iMax);
        this.f52651b = iMax == 0 ? a.f54135c : new Object[iMax];
        if (iMax == 0) {
            jArrA = e0.a();
        } else {
            long[] jArr = new long[iMax];
            AbstractC3952n.x(jArr, 4611686018427387903L, 0, 0, 6, null);
            jArrA = jArr;
        }
        this.f52652c = jArrA;
    }

    public final void A(int i10) {
        long[] jArr = this.f52650a;
        Object[] objArr = this.f52651b;
        long[] jArr2 = this.f52652c;
        int i11 = this.f52655f;
        int[] iArr = new int[i11];
        s(i10);
        long[] jArr3 = this.f52650a;
        Object[] objArr2 = this.f52651b;
        long[] jArr4 = this.f52652c;
        int i12 = this.f52655f;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iN = n(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iN] = obj;
                jArr4[iN] = jArr2[i13];
                iArr[i13] = iN;
            }
            i13++;
            jArr = jArr;
            objArr = objArr;
        }
        o(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean B(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.f52651b;
        int i10 = this.f52656g;
        long[] jArr = this.f52650a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!CollectionsKt.b0(elements, objArr[i14])) {
                                z(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f52656g;
    }

    public final boolean g(Object obj) {
        int iC = c();
        int iM = m(obj);
        this.f52651b[iM] = obj;
        long[] jArr = this.f52652c;
        int i10 = this.f52653d;
        jArr[iM] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f52653d = iM;
        if (this.f52654e == Integer.MAX_VALUE) {
            this.f52654e = iM;
        }
        return c() != iC;
    }

    public final boolean h(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iC = c();
        v(elements);
        return iC != c();
    }

    public final void i() {
        if (this.f52655f <= 8 || Long.compare(z.g(z.g(this.f52656g) * 32) ^ Long.MIN_VALUE, z.g(z.g(this.f52655f) * 25) ^ Long.MIN_VALUE) > 0) {
            A(a0.c(this.f52655f));
        } else {
            l();
        }
    }

    public final Set j() {
        return new N(this);
    }

    public final void k() {
        this.f52656g = 0;
        long[] jArr = this.f52650a;
        if (jArr != a0.f52677a) {
            AbstractC3952n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f52650a;
            int i10 = this.f52655f;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC3952n.v(this.f52651b, null, 0, this.f52655f);
        AbstractC3952n.x(this.f52652c, 4611686018427387903L, 0, 0, 6, null);
        this.f52653d = Integer.MAX_VALUE;
        this.f52654e = Integer.MAX_VALUE;
        q();
    }

    public final void l() {
        int i10;
        long[] jArr = this.f52650a;
        if (jArr == null) {
            return;
        }
        int i11 = this.f52655f;
        Object[] objArr = this.f52651b;
        long[] jArr2 = this.f52652c;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        AbstractC3952n.u(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iW = AbstractC3952n.W(jArr);
        int i15 = iW - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[iW] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iN = n(i20);
                int i21 = i20 & i11;
                if (((iN - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = (((long) (i19 & 127)) << i18) | (jArr[i17] & (~(255 << i18)));
                    if (jArr3[i16] == j13) {
                        long j14 = i16;
                        jArr3[i16] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i12];
                    i16++;
                    j10 = j13;
                } else {
                    int i22 = iN >> 3;
                    long j15 = jArr[i22];
                    int i23 = (iN & 7) << 3;
                    int i24 = i12;
                    if (((j15 >> i23) & 255) == 128) {
                        int i25 = i16;
                        jArr[i22] = (j15 & (~(255 << i23))) | (((long) (i19 & 127)) << i23);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iN] = objArr[i25];
                        objArr[i25] = null;
                        jArr2[iN] = jArr2[i25];
                        jArr2[i25] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i25] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iN);
                            jArr3[i25] = (jArr3[i25] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iN);
                        }
                        i10 = i25;
                        jArr3[iN] = ((long) Integer.MAX_VALUE) | (((long) i10) << 32);
                    } else {
                        jArr[i22] = (((long) (i19 & 127)) << i23) | (j15 & (~(255 << i23)));
                        Object obj2 = objArr[iN];
                        objArr[iN] = objArr[i16];
                        objArr[i16] = obj2;
                        long j16 = jArr2[iN];
                        jArr2[iN] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iN;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iN;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iN] = (((long) i27) << 32) | ((long) i16);
                        i10 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16 = i10 + 1;
                    j10 = j13;
                    i12 = i24;
                }
            } else {
                i16++;
            }
        }
        q();
        p(jArr3);
    }

    public final void t(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    public final void u(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f52655f;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f52650a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.b(this.f52651b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            z(iNumberOfTrailingZeros);
        }
    }

    public final void v(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(Object obj) {
        int iM = m(obj);
        this.f52651b[iM] = obj;
        long[] jArr = this.f52652c;
        int i10 = this.f52653d;
        jArr[iM] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f52653d = iM;
        if (this.f52654e == Integer.MAX_VALUE) {
            this.f52654e = iM;
        }
    }

    public final boolean x(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f52655f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f52650a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.b(this.f52651b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            z(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean y(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int iC = c();
        t(elements);
        return iC != c();
    }

    public final void z(int i10) {
        this.f52656g--;
        long[] jArr = this.f52650a;
        int i11 = this.f52655f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f52651b[i10] = null;
        long[] jArr2 = this.f52652c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & 2147483647L);
        int i15 = (int) (j11 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f52653d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f52654e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }
}
