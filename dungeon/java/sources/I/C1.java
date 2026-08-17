package I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f4425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f4427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f4429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1043i0 f4434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4438o;

    public C1(D1 d10) {
        this.f4424a = d10;
        this.f4425b = d10.q();
        int iS = d10.s();
        this.f4426c = iS;
        this.f4427d = d10.t();
        this.f4428e = d10.v();
        this.f4432i = iS;
        this.f4433j = -1;
        this.f4434k = new C1043i0();
    }

    private final Object N(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.f4427d[iArr[i11 + 4]] : InterfaceC1054m.f4688a.a();
    }

    private final Object P(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.f4427d[F1.r(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f4427d[F1.m(iArr, i10)] : InterfaceC1054m.f4688a.a();
    }

    public final Object A(int i10) {
        return b(this.f4425b, i10);
    }

    public final Object B(int i10) {
        return C(this.f4431h, i10);
    }

    public final Object C(int i10, int i11) {
        int iT = F1.t(this.f4425b, i10);
        int i12 = i10 + 1;
        int i13 = iT + i11;
        return i13 < (i12 < this.f4426c ? this.f4425b[(i12 * 5) + 4] : this.f4428e) ? this.f4427d[i13] : InterfaceC1054m.f4688a.a();
    }

    public final int D(int i10) {
        return this.f4425b[i10 * 5];
    }

    public final Object E(int i10) {
        return P(this.f4425b, i10);
    }

    public final int F(int i10) {
        return F1.o(this.f4425b, i10);
    }

    public final boolean G(int i10) {
        return (this.f4425b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean H(int i10) {
        return (this.f4425b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean I() {
        return t() || this.f4431h == this.f4432i;
    }

    public final boolean J() {
        return (this.f4425b[(this.f4431h * 5) + 1] & 1073741824) != 0;
    }

    public final boolean K(int i10) {
        return (this.f4425b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object L() {
        int i10;
        if (this.f4435l > 0 || (i10 = this.f4436m) >= this.f4437n) {
            this.f4438o = false;
            return InterfaceC1054m.f4688a.a();
        }
        this.f4438o = true;
        Object[] objArr = this.f4427d;
        this.f4436m = i10 + 1;
        return objArr[i10];
    }

    public final Object M(int i10) {
        int[] iArr = this.f4425b;
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return N(iArr, i10);
        }
        return null;
    }

    public final int O(int i10) {
        return this.f4425b[(i10 * 5) + 1] & 67108863;
    }

    public final int Q(int i10) {
        return this.f4425b[(i10 * 5) + 2];
    }

    public final void R(int i10) {
        if (!(this.f4435l == 0)) {
            AbstractC1083w.t("Cannot reposition while in an empty region");
        }
        this.f4431h = i10;
        int i11 = this.f4426c;
        int i12 = i10 < i11 ? this.f4425b[(i10 * 5) + 2] : -1;
        if (i12 != this.f4433j) {
            this.f4433j = i12;
            if (i12 < 0) {
                this.f4432i = i11;
            } else {
                this.f4432i = i12 + F1.o(this.f4425b, i12);
            }
            this.f4436m = 0;
            this.f4437n = 0;
        }
    }

    public final void S(int i10) {
        int iO = F1.o(this.f4425b, i10) + i10;
        int i11 = this.f4431h;
        if (!(i11 >= i10 && i11 <= iO)) {
            AbstractC1083w.t("Index " + i10 + " is not a parent of " + i11);
        }
        this.f4433j = i10;
        this.f4432i = iO;
        this.f4436m = 0;
        this.f4437n = 0;
    }

    public final int T() {
        if (!(this.f4435l == 0)) {
            AbstractC1083w.t("Cannot skip while in an empty region");
        }
        int[] iArr = this.f4425b;
        int i10 = this.f4431h;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f4431h = i10 + F1.o(iArr, i10);
        return i11;
    }

    public final void U() {
        if (!(this.f4435l == 0)) {
            AbstractC1083w.t("Cannot skip the enclosing group while in an empty region");
        }
        this.f4431h = this.f4432i;
        this.f4436m = 0;
        this.f4437n = 0;
    }

    public final int V(int i10) {
        int iT = F1.t(this.f4425b, i10);
        int i11 = i10 + 1;
        return (i11 < this.f4426c ? this.f4425b[(i11 * 5) + 4] : this.f4428e) - iT;
    }

    public final void W() {
        if (this.f4435l <= 0) {
            int i10 = this.f4433j;
            int i11 = this.f4431h;
            if (!(this.f4425b[(i11 * 5) + 2] == i10)) {
                T0.a("Invalid slot table detected");
            }
            HashMap map = this.f4429f;
            if (map != null) {
            }
            C1043i0 c1043i0 = this.f4434k;
            int i12 = this.f4436m;
            int i13 = this.f4437n;
            if (i12 == 0 && i13 == 0) {
                c1043i0.h(-1);
            } else {
                c1043i0.h(i12);
            }
            this.f4433j = i11;
            this.f4432i = F1.o(this.f4425b, i11) + i11;
            int i14 = i11 + 1;
            this.f4431h = i14;
            this.f4436m = F1.t(this.f4425b, i11);
            this.f4437n = i11 >= this.f4426c - 1 ? this.f4428e : this.f4425b[(i14 * 5) + 4];
        }
    }

    public final void X() {
        if (this.f4435l <= 0) {
            if (!((this.f4425b[(this.f4431h * 5) + 1] & 1073741824) != 0)) {
                T0.a("Expected a node group");
            }
            W();
        }
    }

    public final C1021b a(int i10) {
        ArrayList arrayListN = this.f4424a.n();
        int iS = F1.s(arrayListN, i10, this.f4426c);
        if (iS >= 0) {
            return (C1021b) arrayListN.get(iS);
        }
        C1021b c1021b = new C1021b(i10);
        arrayListN.add(-(iS + 1), c1021b);
        return c1021b;
    }

    public final void c() {
        this.f4435l++;
    }

    public final void d() {
        this.f4430g = true;
        this.f4424a.e(this, this.f4429f);
        this.f4427d = new Object[0];
    }

    public final boolean e(int i10) {
        return (this.f4425b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void f() {
        if (!(this.f4435l > 0)) {
            T0.a("Unbalanced begin/end empty");
        }
        this.f4435l--;
    }

    public final void g() {
        if (this.f4435l == 0) {
            if (!(this.f4431h == this.f4432i)) {
                AbstractC1083w.t("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f4425b;
            int i10 = iArr[(this.f4433j * 5) + 2];
            this.f4433j = i10;
            this.f4432i = i10 < 0 ? this.f4426c : F1.o(iArr, i10) + i10;
            int iG = this.f4434k.g();
            if (iG < 0) {
                this.f4436m = 0;
                this.f4437n = 0;
            } else {
                this.f4436m = iG;
                this.f4437n = i10 >= this.f4426c - 1 ? this.f4428e : this.f4425b[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f4435l <= 0) {
            int i10 = 0;
            int iO = this.f4431h;
            while (true) {
                int i11 = i10;
                if (iO >= this.f4432i) {
                    break;
                }
                int[] iArr = this.f4425b;
                int i12 = iO * 5;
                int i13 = iArr[i12];
                Object objP = P(iArr, iO);
                int i14 = 1;
                int i15 = this.f4425b[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & 67108863;
                }
                i10 = i11 + 1;
                arrayList.add(new C1058n0(i13, objP, iO, i14, i11));
                iO += F1.o(this.f4425b, iO);
            }
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f4430g;
    }

    public final int j() {
        return this.f4432i;
    }

    public final int k() {
        return this.f4431h;
    }

    public final Object l() {
        int i10 = this.f4431h;
        if (i10 < this.f4432i) {
            return b(this.f4425b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f4432i;
    }

    public final int n() {
        int i10 = this.f4431h;
        if (i10 < this.f4432i) {
            return this.f4425b[i10 * 5];
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f4431h;
        if (i10 < this.f4432i) {
            return P(this.f4425b, i10);
        }
        return null;
    }

    public final int p() {
        return F1.o(this.f4425b, this.f4431h);
    }

    public final int q() {
        return this.f4436m - F1.t(this.f4425b, this.f4433j);
    }

    public final boolean r() {
        return this.f4438o;
    }

    public final boolean s() {
        int i10 = this.f4431h;
        return i10 < this.f4432i && (this.f4425b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean t() {
        return this.f4435l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f4431h + ", key=" + n() + ", parent=" + this.f4433j + ", end=" + this.f4432i + ')';
    }

    public final int u() {
        return this.f4433j;
    }

    public final int v() {
        int i10 = this.f4433j;
        if (i10 >= 0) {
            return this.f4425b[(i10 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int w() {
        return this.f4437n - this.f4436m;
    }

    public final int x() {
        return this.f4426c;
    }

    public final int y() {
        return this.f4436m - F1.t(this.f4425b, this.f4433j);
    }

    public final D1 z() {
        return this.f4424a;
    }
}
