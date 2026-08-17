package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w0 f38107f = new w0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f38109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f38110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38112e;

    private w0() {
        this(0, new int[8], new Object[8], true);
    }

    private w0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f38111d = -1;
        this.f38108a = i10;
        this.f38109b = iArr;
        this.f38110c = objArr;
        this.f38112e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f38109b;
        if (i10 > iArr.length) {
            int i11 = this.f38108a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f38109b = Arrays.copyOf(iArr, i10);
            this.f38110c = Arrays.copyOf(this.f38110c, i10);
        }
    }

    public static w0 c() {
        return f38107f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    private w0 j(AbstractC3143i abstractC3143i) {
        int iJ;
        do {
            iJ = abstractC3143i.J();
            if (iJ == 0) {
                break;
            }
        } while (i(iJ, abstractC3143i));
        return this;
    }

    static w0 n(w0 w0Var, w0 w0Var2) {
        int i10 = w0Var.f38108a + w0Var2.f38108a;
        int[] iArrCopyOf = Arrays.copyOf(w0Var.f38109b, i10);
        System.arraycopy(w0Var2.f38109b, 0, iArrCopyOf, w0Var.f38108a, w0Var2.f38108a);
        Object[] objArrCopyOf = Arrays.copyOf(w0Var.f38110c, i10);
        System.arraycopy(w0Var2.f38110c, 0, objArrCopyOf, w0Var.f38108a, w0Var2.f38108a);
        return new w0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static w0 o() {
        return new w0();
    }

    private static boolean p(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean s(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void u(int i10, Object obj, D0 d10) {
        int iA = C0.a(i10);
        int iB = C0.b(i10);
        if (iB == 0) {
            d10.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            d10.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            d10.L(iA, (AbstractC3142h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(B.e());
            }
            d10.c(iA, ((Integer) obj).intValue());
        } else if (d10.t() == D0.a.ASCENDING) {
            d10.x(iA);
            ((w0) obj).v(d10);
            d10.C(iA);
        } else {
            d10.C(iA);
            ((w0) obj).v(d10);
            d10.x(iA);
        }
    }

    void a() {
        if (!this.f38112e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iV;
        int i10 = this.f38111d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38108a; i12++) {
            int i13 = this.f38109b[i12];
            int iA = C0.a(i13);
            int iB = C0.b(i13);
            if (iB == 0) {
                iV = AbstractC3145k.V(iA, ((Long) this.f38110c[i12]).longValue());
            } else if (iB == 1) {
                iV = AbstractC3145k.p(iA, ((Long) this.f38110c[i12]).longValue());
            } else if (iB == 2) {
                iV = AbstractC3145k.h(iA, (AbstractC3142h) this.f38110c[i12]);
            } else if (iB == 3) {
                iV = (AbstractC3145k.S(iA) * 2) + ((w0) this.f38110c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(B.e());
                }
                iV = AbstractC3145k.n(iA, ((Integer) this.f38110c[i12]).intValue());
            }
            i11 += iV;
        }
        this.f38111d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f38111d;
        if (i10 != -1) {
            return i10;
        }
        int iH = 0;
        for (int i11 = 0; i11 < this.f38108a; i11++) {
            iH += AbstractC3145k.H(C0.a(this.f38109b[i11]), (AbstractC3142h) this.f38110c[i11]);
        }
        this.f38111d = iH;
        return iH;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        int i10 = this.f38108a;
        return i10 == w0Var.f38108a && s(this.f38109b, w0Var.f38109b, i10) && p(this.f38110c, w0Var.f38110c, this.f38108a);
    }

    public void h() {
        if (this.f38112e) {
            this.f38112e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f38108a;
        return ((((527 + i10) * 31) + f(this.f38109b, i10)) * 31) + g(this.f38110c, this.f38108a);
    }

    boolean i(int i10, AbstractC3143i abstractC3143i) throws B.a {
        a();
        int iA = C0.a(i10);
        int iB = C0.b(i10);
        if (iB == 0) {
            r(i10, Long.valueOf(abstractC3143i.z()));
            return true;
        }
        if (iB == 1) {
            r(i10, Long.valueOf(abstractC3143i.v()));
            return true;
        }
        if (iB == 2) {
            r(i10, abstractC3143i.r());
            return true;
        }
        if (iB == 3) {
            w0 w0Var = new w0();
            w0Var.j(abstractC3143i);
            abstractC3143i.a(C0.c(iA, 4));
            r(i10, w0Var);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw B.e();
        }
        r(i10, Integer.valueOf(abstractC3143i.u()));
        return true;
    }

    w0 k(w0 w0Var) {
        if (w0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f38108a + w0Var.f38108a;
        b(i10);
        System.arraycopy(w0Var.f38109b, 0, this.f38109b, this.f38108a, w0Var.f38108a);
        System.arraycopy(w0Var.f38110c, 0, this.f38110c, this.f38108a, w0Var.f38108a);
        this.f38108a = i10;
        return this;
    }

    w0 l(int i10, AbstractC3142h abstractC3142h) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(C0.c(i10, 2), abstractC3142h);
        return this;
    }

    w0 m(int i10, int i11) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(C0.c(i10, 0), Long.valueOf(i11));
        return this;
    }

    final void q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f38108a; i11++) {
            V.d(sb2, i10, String.valueOf(C0.a(this.f38109b[i11])), this.f38110c[i11]);
        }
    }

    void r(int i10, Object obj) {
        a();
        b(this.f38108a + 1);
        int[] iArr = this.f38109b;
        int i11 = this.f38108a;
        iArr[i11] = i10;
        this.f38110c[i11] = obj;
        this.f38108a = i11 + 1;
    }

    void t(D0 d10) {
        if (d10.t() == D0.a.DESCENDING) {
            for (int i10 = this.f38108a - 1; i10 >= 0; i10--) {
                d10.b(C0.a(this.f38109b[i10]), this.f38110c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f38108a; i11++) {
            d10.b(C0.a(this.f38109b[i11]), this.f38110c[i11]);
        }
    }

    public void v(D0 d10) {
        if (this.f38108a == 0) {
            return;
        }
        if (d10.t() == D0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f38108a; i10++) {
                u(this.f38109b[i10], this.f38110c[i10], d10);
            }
            return;
        }
        for (int i11 = this.f38108a - 1; i11 >= 0; i11--) {
            u(this.f38109b[i11], this.f38110c[i11], d10);
        }
    }
}
