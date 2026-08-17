package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i0 f23485f = new i0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f23487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f23488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23490e;

    private i0() {
        this(0, new int[8], new Object[8], true);
    }

    private i0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f23489d = -1;
        this.f23486a = i10;
        this.f23487b = iArr;
        this.f23488c = objArr;
        this.f23490e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f23487b;
        if (i10 > iArr.length) {
            int i11 = this.f23486a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f23487b = Arrays.copyOf(iArr, i10);
            this.f23488c = Arrays.copyOf(this.f23488c, i10);
        }
    }

    public static i0 c() {
        return f23485f;
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

    static i0 j(i0 i0Var, i0 i0Var2) {
        int i10 = i0Var.f23486a + i0Var2.f23486a;
        int[] iArrCopyOf = Arrays.copyOf(i0Var.f23487b, i10);
        System.arraycopy(i0Var2.f23487b, 0, iArrCopyOf, i0Var.f23486a, i0Var2.f23486a);
        Object[] objArrCopyOf = Arrays.copyOf(i0Var.f23488c, i10);
        System.arraycopy(i0Var2.f23488c, 0, objArrCopyOf, i0Var.f23486a, i0Var2.f23486a);
        return new i0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static i0 k() {
        return new i0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, n0 n0Var) {
        int iA = m0.a(i10);
        int iB = m0.b(i10);
        if (iB == 0) {
            n0Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            n0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            n0Var.K(iA, (AbstractC1950f) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C1965v.e());
            }
            n0Var.c(iA, ((Integer) obj).intValue());
        } else if (n0Var.t() == n0.a.ASCENDING) {
            n0Var.x(iA);
            ((i0) obj).r(n0Var);
            n0Var.C(iA);
        } else {
            n0Var.C(iA);
            ((i0) obj).r(n0Var);
            n0Var.x(iA);
        }
    }

    void a() {
        if (!this.f23490e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i10 = this.f23489d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f23486a; i12++) {
            int i13 = this.f23487b[i12];
            int iA = m0.a(i13);
            int iB = m0.b(i13);
            if (iB == 0) {
                iR = AbstractC1953i.R(iA, ((Long) this.f23488c[i12]).longValue());
            } else if (iB == 1) {
                iR = AbstractC1953i.n(iA, ((Long) this.f23488c[i12]).longValue());
            } else if (iB == 2) {
                iR = AbstractC1953i.f(iA, (AbstractC1950f) this.f23488c[i12]);
            } else if (iB == 3) {
                iR = (AbstractC1953i.O(iA) * 2) + ((i0) this.f23488c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C1965v.e());
                }
                iR = AbstractC1953i.l(iA, ((Integer) this.f23488c[i12]).intValue());
            }
            i11 += iR;
        }
        this.f23489d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f23489d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f23486a; i11++) {
            iD += AbstractC1953i.D(m0.a(this.f23487b[i11]), (AbstractC1950f) this.f23488c[i11]);
        }
        this.f23489d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        int i10 = this.f23486a;
        return i10 == i0Var.f23486a && o(this.f23487b, i0Var.f23487b, i10) && l(this.f23488c, i0Var.f23488c, this.f23486a);
    }

    public void h() {
        if (this.f23490e) {
            this.f23490e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f23486a;
        return ((((527 + i10) * 31) + f(this.f23487b, i10)) * 31) + g(this.f23488c, this.f23486a);
    }

    i0 i(i0 i0Var) {
        if (i0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f23486a + i0Var.f23486a;
        b(i10);
        System.arraycopy(i0Var.f23487b, 0, this.f23487b, this.f23486a, i0Var.f23486a);
        System.arraycopy(i0Var.f23488c, 0, this.f23488c, this.f23486a, i0Var.f23486a);
        this.f23486a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f23486a; i11++) {
            M.d(sb2, i10, String.valueOf(m0.a(this.f23487b[i11])), this.f23488c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f23486a + 1);
        int[] iArr = this.f23487b;
        int i11 = this.f23486a;
        iArr[i11] = i10;
        this.f23488c[i11] = obj;
        this.f23486a = i11 + 1;
    }

    void p(n0 n0Var) {
        if (n0Var.t() == n0.a.DESCENDING) {
            for (int i10 = this.f23486a - 1; i10 >= 0; i10--) {
                n0Var.b(m0.a(this.f23487b[i10]), this.f23488c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f23486a; i11++) {
            n0Var.b(m0.a(this.f23487b[i11]), this.f23488c[i11]);
        }
    }

    public void r(n0 n0Var) {
        if (this.f23486a == 0) {
            return;
        }
        if (n0Var.t() == n0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f23486a; i10++) {
                q(this.f23487b[i10], this.f23488c[i10], n0Var);
            }
            return;
        }
        for (int i11 = this.f23486a - 1; i11 >= 0; i11--) {
            q(this.f23487b[i11], this.f23488c[i11], n0Var);
        }
    }
}
