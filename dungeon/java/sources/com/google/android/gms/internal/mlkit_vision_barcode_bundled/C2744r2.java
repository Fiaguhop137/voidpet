package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2744r2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2744r2 f34294f = new C2744r2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f34296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f34297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34298d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34299e;

    private C2744r2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f34295a = i10;
        this.f34296b = iArr;
        this.f34297c = objArr;
        this.f34299e = z10;
    }

    public static C2744r2 c() {
        return f34294f;
    }

    static C2744r2 e(C2744r2 c2744r2, C2744r2 c2744r3) {
        int i10 = c2744r2.f34295a + c2744r3.f34295a;
        int[] iArrCopyOf = Arrays.copyOf(c2744r2.f34296b, i10);
        System.arraycopy(c2744r3.f34296b, 0, iArrCopyOf, c2744r2.f34295a, c2744r3.f34295a);
        Object[] objArrCopyOf = Arrays.copyOf(c2744r2.f34297c, i10);
        System.arraycopy(c2744r3.f34297c, 0, objArrCopyOf, c2744r2.f34295a, c2744r3.f34295a);
        return new C2744r2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C2744r2 f() {
        return new C2744r2(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f34296b;
        if (i10 > iArr.length) {
            int i11 = this.f34295a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f34296b = Arrays.copyOf(iArr, i10);
            this.f34297c = Arrays.copyOf(this.f34297c, i10);
        }
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i10 = this.f34298d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34295a; i12++) {
            int i13 = this.f34296b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f34297c[i12]).getClass();
                    iA2 = Q0.a(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    I0 i17 = (I0) this.f34297c[i12];
                    int iA3 = Q0.a(i16);
                    int iG = i17.g();
                    iA2 = iA3 + Q0.a(iG) + iG;
                } else if (i15 == 3) {
                    int iA4 = Q0.a(i14 << 3);
                    iA = iA4 + iA4;
                    iB = ((C2744r2) this.f34297c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C2748s1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f34297c[i12]).getClass();
                    iA2 = Q0.a(i14 << 3) + 4;
                }
                i11 += iA2;
            } else {
                int i18 = i14 << 3;
                long jLongValue = ((Long) this.f34297c[i12]).longValue();
                iA = Q0.a(i18);
                iB = Q0.b(jLongValue);
            }
            iA2 = iA + iB;
            i11 += iA2;
        }
        this.f34298d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f34298d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f34295a; i11++) {
            int i12 = this.f34296b[i11] >>> 3;
            I0 i13 = (I0) this.f34297c[i11];
            int iA2 = Q0.a(8);
            int iA3 = Q0.a(16) + Q0.a(i12);
            int iA4 = Q0.a(24);
            int iG = i13.g();
            iA += iA2 + iA2 + iA3 + iA4 + Q0.a(iG) + iG;
        }
        this.f34298d = iA;
        return iA;
    }

    final C2744r2 d(C2744r2 c2744r2) {
        if (c2744r2.equals(f34294f)) {
            return this;
        }
        g();
        int i10 = this.f34295a + c2744r2.f34295a;
        m(i10);
        System.arraycopy(c2744r2.f34296b, 0, this.f34296b, this.f34295a, c2744r2.f34295a);
        System.arraycopy(c2744r2.f34297c, 0, this.f34297c, this.f34295a, c2744r2.f34295a);
        this.f34295a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2744r2)) {
            return false;
        }
        C2744r2 c2744r2 = (C2744r2) obj;
        int i10 = this.f34295a;
        if (i10 == c2744r2.f34295a) {
            int[] iArr = this.f34296b;
            int[] iArr2 = c2744r2.f34296b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f34297c;
            Object[] objArr2 = c2744r2.f34297c;
            int i12 = this.f34295a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f34299e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f34299e) {
            this.f34299e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f34295a;
        int i11 = i10 + 527;
        int[] iArr = this.f34296b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f34297c;
        int i15 = this.f34295a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f34295a; i11++) {
            N1.b(sb2, i10, String.valueOf(this.f34296b[i11] >>> 3), this.f34297c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f34295a + 1);
        int[] iArr = this.f34296b;
        int i11 = this.f34295a;
        iArr[i11] = i10;
        this.f34297c[i11] = obj;
        this.f34295a = i11 + 1;
    }

    final void k(G2 g10) {
        for (int i10 = 0; i10 < this.f34295a; i10++) {
            g10.L(this.f34296b[i10] >>> 3, this.f34297c[i10]);
        }
    }

    public final void l(G2 g10) {
        if (this.f34295a != 0) {
            for (int i10 = 0; i10 < this.f34295a; i10++) {
                int i11 = this.f34296b[i10];
                Object obj = this.f34297c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    g10.f(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    g10.A(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    g10.D(i13, (I0) obj);
                } else if (i12 == 3) {
                    g10.H(i13);
                    ((C2744r2) obj).l(g10);
                    g10.o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C2748s1("Protocol message tag had invalid wire type."));
                    }
                    g10.b(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
