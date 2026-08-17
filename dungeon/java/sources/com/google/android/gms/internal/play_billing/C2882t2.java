package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2882t2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2882t2 f34810f = new C2882t2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f34812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f34813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34814d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34815e;

    private C2882t2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f34811a = i10;
        this.f34812b = iArr;
        this.f34813c = objArr;
        this.f34815e = z10;
    }

    public static C2882t2 c() {
        return f34810f;
    }

    static C2882t2 e(C2882t2 c2882t2, C2882t2 c2882t3) {
        int i10 = c2882t2.f34811a + c2882t3.f34811a;
        int[] iArrCopyOf = Arrays.copyOf(c2882t2.f34812b, i10);
        System.arraycopy(c2882t3.f34812b, 0, iArrCopyOf, c2882t2.f34811a, c2882t3.f34811a);
        Object[] objArrCopyOf = Arrays.copyOf(c2882t2.f34813c, i10);
        System.arraycopy(c2882t3.f34813c, 0, objArrCopyOf, c2882t2.f34811a, c2882t3.f34811a);
        return new C2882t2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C2882t2 f() {
        return new C2882t2(0, new int[8], new Object[8], true);
    }

    private final void l(int i10) {
        int[] iArr = this.f34812b;
        if (i10 > iArr.length) {
            int i11 = this.f34811a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f34812b = Arrays.copyOf(iArr, i10);
            this.f34813c = Arrays.copyOf(this.f34813c, i10);
        }
    }

    public final int a() {
        int iS;
        int iT;
        int iS2;
        int i10 = this.f34814d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34811a; i12++) {
            int i13 = this.f34812b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f34813c[i12]).getClass();
                    iS2 = AbstractC2881t1.s(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC2843l1 abstractC2843l1 = (AbstractC2843l1) this.f34813c[i12];
                    int iS3 = AbstractC2881t1.s(i16);
                    int iG = abstractC2843l1.g();
                    iS2 = iS3 + AbstractC2881t1.s(iG) + iG;
                } else if (i15 == 3) {
                    int iS4 = AbstractC2881t1.s(i14 << 3);
                    iS = iS4 + iS4;
                    iT = ((C2882t2) this.f34813c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new N1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f34813c[i12]).getClass();
                    iS2 = AbstractC2881t1.s(i14 << 3) + 4;
                }
                i11 += iS2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f34813c[i12]).longValue();
                iS = AbstractC2881t1.s(i17);
                iT = AbstractC2881t1.t(jLongValue);
            }
            iS2 = iS + iT;
            i11 += iS2;
        }
        this.f34814d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f34814d;
        if (i10 != -1) {
            return i10;
        }
        int iS = 0;
        for (int i11 = 0; i11 < this.f34811a; i11++) {
            int i12 = this.f34812b[i11] >>> 3;
            AbstractC2843l1 abstractC2843l1 = (AbstractC2843l1) this.f34813c[i11];
            int iS2 = AbstractC2881t1.s(8);
            int iS3 = AbstractC2881t1.s(16) + AbstractC2881t1.s(i12);
            int iS4 = AbstractC2881t1.s(24);
            int iG = abstractC2843l1.g();
            iS += iS2 + iS2 + iS3 + iS4 + AbstractC2881t1.s(iG) + iG;
        }
        this.f34814d = iS;
        return iS;
    }

    final C2882t2 d(C2882t2 c2882t2) {
        if (c2882t2.equals(f34810f)) {
            return this;
        }
        g();
        int i10 = this.f34811a + c2882t2.f34811a;
        l(i10);
        System.arraycopy(c2882t2.f34812b, 0, this.f34812b, this.f34811a, c2882t2.f34811a);
        System.arraycopy(c2882t2.f34813c, 0, this.f34813c, this.f34811a, c2882t2.f34811a);
        this.f34811a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2882t2)) {
            return false;
        }
        C2882t2 c2882t2 = (C2882t2) obj;
        int i10 = this.f34811a;
        if (i10 == c2882t2.f34811a) {
            int[] iArr = this.f34812b;
            int[] iArr2 = c2882t2.f34812b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f34813c;
            Object[] objArr2 = c2882t2.f34813c;
            int i12 = this.f34811a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f34815e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f34815e) {
            this.f34815e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f34811a;
        int i11 = i10 + 527;
        int[] iArr = this.f34812b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f34813c;
        int i15 = this.f34811a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f34811a; i11++) {
            AbstractC2809e2.b(sb2, i10, String.valueOf(this.f34812b[i11] >>> 3), this.f34813c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        l(this.f34811a + 1);
        int[] iArr = this.f34812b;
        int i11 = this.f34811a;
        iArr[i11] = i10;
        this.f34813c[i11] = obj;
        this.f34811a = i11 + 1;
    }

    public final void k(E2 e10) {
        if (this.f34811a != 0) {
            for (int i10 = 0; i10 < this.f34811a; i10++) {
                int i11 = this.f34812b[i10];
                Object obj = this.f34813c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    e10.f(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    e10.A(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    e10.G(i13, (AbstractC2843l1) obj);
                } else if (i12 == 3) {
                    e10.q(i13);
                    ((C2882t2) obj).k(e10);
                    e10.o(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new N1("Protocol message tag had invalid wire type."));
                    }
                    e10.b(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
