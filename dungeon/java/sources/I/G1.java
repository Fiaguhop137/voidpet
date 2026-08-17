package I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p323s.AbstractC4117q;

/* JADX INFO: loaded from: classes.dex */
public final class G1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f4466y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f4467z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D1 f4468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f4469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f4470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f4471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap f4472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p323s.F f4473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4482o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p323s.F f4486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4488u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p323s.E f4491x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1043i0 f4483p = new C1043i0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1043i0 f4484q = new C1043i0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1043i0 f4485r = new C1043i0();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4489v = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(G1 g10, int i10, G1 g11, boolean z10, boolean z11, boolean z12) {
            boolean zK0;
            List listL;
            int iH0 = g10.h0(i10);
            int i11 = i10 + iH0;
            int iN = g10.N(i10);
            int iN2 = g10.N(i11);
            int i12 = iN2 - iN;
            boolean zK = g10.K(i10);
            g11.m0(iH0);
            g11.n0(i12, g11.Z());
            if (g10.f4474g < i11) {
                g10.v0(i11);
            }
            if (g10.f4478k < iN2) {
                g10.x0(iN2, i11);
            }
            int[] iArr = g11.f4469b;
            int iZ = g11.Z();
            int i13 = iZ * 5;
            AbstractC3952n.j(g10.f4469b, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = g11.f4470c;
            int i14 = g11.f4476i;
            System.arraycopy(g10.f4470c, iN, objArr, i14, i12);
            int iA0 = g11.a0();
            iArr[i13 + 2] = iA0;
            int i15 = iZ - i10;
            int i16 = iZ + iH0;
            int iO = i14 - g11.O(iArr, iZ);
            int i17 = g11.f4480m;
            int i18 = g11.f4479l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = iZ;
            while (true) {
                zK0 = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != iZ) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = iZ;
                iArr2[(i20 * 5) + 4] = g11.Q(g11.O(iArr, i20) + iO, i19 >= i20 ? g11.f4478k : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                iZ = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            g11.f4480m = i19;
            int iQ = F1.q(g10.f4471d, i10, g10.b0());
            int iQ2 = F1.q(g10.f4471d, i11, g10.b0());
            if (iQ < iQ2) {
                ArrayList arrayList = g10.f4471d;
                ArrayList arrayList2 = new ArrayList(iQ2 - iQ);
                for (int i23 = iQ; i23 < iQ2; i23++) {
                    C1021b c1021b = (C1021b) arrayList.get(i23);
                    c1021b.c(c1021b.a() + i15);
                    arrayList2.add(c1021b);
                }
                g11.f4471d.addAll(F1.q(g11.f4471d, g11.Z(), g11.b0()), arrayList2);
                arrayList.subList(iQ, iQ2).clear();
                listL = arrayList2;
            } else {
                listL = CollectionsKt.l();
            }
            if (!listL.isEmpty()) {
                HashMap map = g10.f4472e;
                HashMap map2 = g11.f4472e;
                if (map != null && map2 != null) {
                    int size = listL.size();
                    for (int i24 = 0; i24 < size; i24++) {
                    }
                }
            }
            g11.a0();
            g11.b1(iA0);
            int iC0 = g10.C0(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iC0 >= 0;
                    if (z13) {
                        g10.d1();
                        g10.A(iC0 - g10.Z());
                        g10.d1();
                    }
                    g10.A(i10 - g10.Z());
                    boolean zJ0 = g10.J0();
                    if (z13) {
                        g10.U0();
                        g10.R();
                        g10.U0();
                        g10.R();
                    }
                    zK0 = zJ0;
                } else {
                    zK0 = g10.K0(i10, iH0);
                    g10.L0(iN, i12, i10 - 1);
                }
            }
            if (zK0) {
                AbstractC1083w.t("Unexpectedly removed anchors");
            }
            int i25 = g11.f4482o;
            int i26 = iArr3[i13 + 1];
            g11.f4482o = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
            if (z11) {
                g11.f4487t = i16;
                g11.f4476i = i14 + i12;
            }
            if (zK) {
                g11.m1(iA0);
            }
            return listL;
        }

        static /* synthetic */ List c(a aVar, G1 g10, int i10, G1 g11, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(g10, i10, g11, z10, z11, z12);
        }
    }

    public G1(D1 d10) {
        this.f4468a = d10;
        this.f4469b = d10.q();
        this.f4470c = d10.t();
        this.f4471d = d10.n();
        this.f4472e = d10.w();
        this.f4473f = d10.p();
        this.f4474g = d10.s();
        this.f4475h = (this.f4469b.length / 5) - d10.s();
        this.f4478k = d10.v();
        this.f4479l = this.f4470c.length - d10.v();
        this.f4480m = d10.s();
        this.f4488u = d10.s();
    }

    private final int B0(int[] iArr, int i10) {
        return O(iArr, i10);
    }

    private final int D0(int[] iArr, int i10) {
        return E0(iArr[(e0(i10) * 5) + 2]);
    }

    private final int E(int[] iArr, int i10) {
        return O(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final int E0(int i10) {
        return i10 > -2 ? i10 : (b0() + i10) - (-2);
    }

    private final int F0(int i10, int i11) {
        return i10 < i11 ? i10 : -((b0() - i10) + 2);
    }

    private final boolean G(int i10) {
        int iH0 = i10 + 1;
        int iH1 = i10 + h0(i10);
        while (iH0 < iH1) {
            if ((this.f4469b[(e0(iH0) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iH0 += h0(iH0);
        }
        return false;
    }

    private final Object G0(Object obj) {
        Object objS0 = S0();
        R0(obj);
        return objS0;
    }

    private final void H0() {
        p323s.E e10 = this.f4491x;
        if (e10 != null) {
            while (W0.d(e10)) {
                n1(W0.f(e10), e10);
            }
        }
    }

    private final void I() {
        int i10 = this.f4478k;
        AbstractC3952n.v(this.f4470c, null, i10, this.f4479l + i10);
    }

    private final boolean I0(int i10, int i11, HashMap map) {
        int i12 = i11 + i10;
        int iQ = F1.q(this.f4471d, i12, X() - this.f4475h);
        if (iQ >= this.f4471d.size()) {
            iQ--;
        }
        int i13 = iQ + 1;
        int i14 = 0;
        while (iQ >= 0) {
            C1021b c1021b = (C1021b) this.f4471d.get(iQ);
            int iC = C(c1021b);
            if (iC < i10) {
                break;
            }
            if (iC < i12) {
                c1021b.c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i14 == 0) {
                    i14 = iQ + 1;
                }
                i13 = iQ;
            }
            iQ--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f4471d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K(int i10) {
        return i10 >= 0 && (this.f4469b[(e0(i10) * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K0(int i10, int i11) {
        boolean zI0 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f4471d;
            v0(i10);
            zI0 = arrayList.isEmpty() ? false : I0(i10, i11, this.f4472e);
            this.f4474g = i10;
            this.f4475h += i11;
            int i12 = this.f4480m;
            if (i12 > i10) {
                this.f4480m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f4488u;
            if (i13 >= this.f4474g) {
                this.f4488u = i13 - i11;
            }
            int i14 = this.f4489v;
            if (L(i14)) {
                m1(i14);
            }
        }
        return zI0;
    }

    private final boolean L(int i10) {
        return i10 >= 0 && (this.f4469b[(e0(i10) * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f4479l;
            int i14 = i10 + i11;
            x0(i14, i12);
            this.f4478k = i10;
            this.f4479l = i13 + i11;
            AbstractC3952n.v(this.f4470c, null, i10, i14);
            int i15 = this.f4477j;
            if (i15 >= i10) {
                this.f4477j = i15 - i11;
            }
        }
    }

    private final int M(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N(int i10) {
        return O(this.f4469b, e0(i10));
    }

    private final int N0() {
        int iX = (X() - this.f4475h) - this.f4484q.g();
        this.f4488u = iX;
        return iX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int[] iArr, int i10) {
        return i10 >= X() ? this.f4470c.length - this.f4479l : M(iArr[(i10 * 5) + 4], this.f4479l, this.f4470c.length);
    }

    private final void O0() {
        this.f4484q.h((X() - this.f4475h) - this.f4488u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int i10) {
        return i10 + (this.f4479l * (i10 < this.f4478k ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final void V(int i10, int i11, int i12) {
        int iF0 = F0(i10, this.f4474g);
        while (i12 < i11) {
            this.f4469b[(e0(i12) * 5) + 2] = iF0;
            int iO = F1.o(this.f4469b, e0(i12)) + i12;
            V(i12, iO, i12 + 1);
            i12 = iO;
        }
    }

    private final int X() {
        return this.f4469b.length / 5;
    }

    private final int X0(int[] iArr, int i10) {
        return i10 >= X() ? this.f4470c.length - this.f4479l : M(F1.t(iArr, i10), this.f4479l, this.f4470c.length);
    }

    private final int e0(int i10) {
        return i10 + (this.f4475h * (i10 < this.f4474g ? 0 : 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void f1(int i10, Object obj, boolean z10, Object obj2) {
        int iO;
        int i11 = this.f4489v;
        Object[] objArr = this.f4481n > 0;
        this.f4485r.h(this.f4482o);
        if (objArr == true) {
            int i12 = this.f4487t;
            int iO2 = O(this.f4469b, e0(i12));
            m0(1);
            this.f4476i = iO2;
            this.f4477j = iO2;
            int iE0 = e0(i12);
            InterfaceC1054m.a aVar = InterfaceC1054m.f4688a;
            ?? r12 = obj != aVar.a() ? 1 : 0;
            ?? r13 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            int iQ = Q(iO2, this.f4478k, this.f4479l, this.f4470c.length);
            if (iQ >= 0 && this.f4480m < i12) {
                iQ = -(((this.f4470c.length - this.f4479l) - iQ) + 1);
            }
            F1.p(this.f4469b, iE0, i10, z10, r12, r13, this.f4489v, iQ);
            int i13 = (z10 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                n0(i13, i12);
                Object[] objArr2 = this.f4470c;
                int i14 = this.f4476i;
                if (z10) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f4476i = i14;
            }
            this.f4482o = 0;
            iO = i12 + 1;
            this.f4489v = i12;
            this.f4487t = iO;
            if (i11 >= 0) {
                b1(i11);
            }
        } else {
            this.f4483p.h(i11);
            O0();
            int i15 = this.f4487t;
            int iE1 = e0(i15);
            if (!Intrinsics.b(obj2, InterfaceC1054m.f4688a.a())) {
                if (z10) {
                    q1(obj2);
                } else {
                    l1(obj2);
                }
            }
            this.f4476i = X0(this.f4469b, iE1);
            this.f4477j = O(this.f4469b, e0(this.f4487t + 1));
            int[] iArr = this.f4469b;
            this.f4482o = iArr[(iE1 * 5) + 1] & 67108863;
            this.f4489v = i15;
            this.f4487t = i15 + 1;
            iO = i15 + F1.o(iArr, iE1);
        }
        this.f4488u = iO;
    }

    private final void k1(int i10, int i11) {
        C1021b c1021b;
        int iA;
        C1021b c1021b2;
        int iA2;
        int i12;
        int iX = X() - this.f4475h;
        if (i10 >= i11) {
            for (int iQ = F1.q(this.f4471d, i11, iX); iQ < this.f4471d.size() && (iA = (c1021b = (C1021b) this.f4471d.get(iQ)).a()) >= 0; iQ++) {
                c1021b.c(-(iX - iA));
            }
            return;
        }
        for (int iQ2 = F1.q(this.f4471d, i10, iX); iQ2 < this.f4471d.size() && (iA2 = (c1021b2 = (C1021b) this.f4471d.get(iQ2)).a()) < 0 && (i12 = iA2 + iX) < i11; iQ2++) {
            c1021b2.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(int i10) {
        if (i10 > 0) {
            int i11 = this.f4487t;
            v0(i11);
            int i12 = this.f4474g;
            int i13 = this.f4475h;
            int[] iArr = this.f4469b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC3952n.j(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC3952n.j(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f4469b = iArr2;
                i13 = i15;
            }
            int i16 = this.f4488u;
            if (i16 >= i12) {
                this.f4488u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f4474g = i17;
            this.f4475h = i13 - i10;
            int iQ = Q(i14 > 0 ? N(i11 + i10) : 0, this.f4480m >= i12 ? this.f4478k : 0, this.f4479l, this.f4470c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f4469b[(i18 * 5) + 4] = iQ;
            }
            int i19 = this.f4480m;
            if (i19 >= i12) {
                this.f4480m = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(int i10) {
        if (i10 >= 0) {
            p323s.E eC = this.f4491x;
            if (eC == null) {
                eC = W0.c(null, 1, null);
                this.f4491x = eC;
            }
            W0.a(eC, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(int i10, int i11) {
        if (i10 > 0) {
            x0(this.f4476i, i11);
            int i12 = this.f4478k;
            int i13 = this.f4479l;
            if (i13 < i10) {
                Object[] objArr = this.f4470c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f4470c = objArr2;
                i13 = i16;
            }
            int i18 = this.f4477j;
            if (i18 >= i12) {
                this.f4477j = i18 + i10;
            }
            this.f4478k = i12 + i10;
            this.f4479l = i13 - i10;
        }
    }

    private final void n1(int i10, p323s.E e10) {
        int iE0 = e0(i10);
        boolean zG = G(i10);
        int[] iArr = this.f4469b;
        if (((iArr[(iE0 * 5) + 1] & 67108864) != 0) != zG) {
            F1.v(iArr, iE0, zG);
            int iC0 = C0(i10);
            if (iC0 >= 0) {
                W0.a(e10, iC0);
            }
        }
    }

    private final void o1(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = Q(i11, this.f4478k, this.f4479l, this.f4470c.length);
    }

    public static /* synthetic */ void r0(G1 g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = g10.f4489v;
        }
        g10.q0(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    private final void r1(int i10, Object obj) {
        boolean z10;
        int iE0 = e0(i10);
        int[] iArr = this.f4469b;
        if (iE0 < iArr.length) {
            z10 = (iArr[(iE0 * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            AbstractC1083w.t("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f4470c[P(B0(this.f4469b, iE0))] = obj;
    }

    private final void s0(int i10, int i11, int i12) {
        C1021b c1021b;
        int iC;
        int i13 = i12 + i10;
        int iB0 = b0();
        int iQ = F1.q(this.f4471d, i10, iB0);
        ArrayList arrayList = new ArrayList();
        if (iQ >= 0) {
            while (iQ < this.f4471d.size() && (iC = C((c1021b = (C1021b) this.f4471d.get(iQ)))) >= i10 && iC < i13) {
                arrayList.add(c1021b);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            C1021b c1021b2 = (C1021b) arrayList.get(i15);
            int iC2 = C(c1021b2) + i14;
            if (iC2 >= this.f4474g) {
                c1021b2.c(-(iB0 - iC2));
            } else {
                c1021b2.c(iC2);
            }
            this.f4471d.add(F1.q(this.f4471d, iC2, iB0), c1021b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(int i10) {
        int i11 = this.f4475h;
        int i12 = this.f4474g;
        if (i12 != i10) {
            if (!this.f4471d.isEmpty()) {
                k1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f4469b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC3952n.j(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC3952n.j(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iX = X();
            if (!(i12 < iX)) {
                AbstractC1083w.t("Check failed");
            }
            while (i12 < iX) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f4469b[i16];
                int iF0 = F0(E0(i17), i10);
                if (iF0 != i17) {
                    this.f4469b[i16] = iF0;
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f4474g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i10, int i11) {
        int i12 = this.f4479l;
        int i13 = this.f4478k;
        int i14 = this.f4480m;
        if (i13 != i10) {
            Object[] objArr = this.f4470c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, b0());
        if (i14 != iMin) {
            int length = this.f4470c.length - i12;
            if (iMin < i14) {
                int iE0 = e0(iMin);
                int iE1 = e0(i14);
                int i16 = this.f4474g;
                while (iE0 < iE1) {
                    int i17 = (iE0 * 5) + 4;
                    int i18 = this.f4469b[i17];
                    if (!(i18 >= 0)) {
                        AbstractC1083w.t("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f4469b[i17] = -((length - i18) + 1);
                    iE0++;
                    if (iE0 == i16) {
                        iE0 += this.f4475h;
                    }
                }
            } else {
                int iE2 = e0(i14);
                int iE3 = e0(iMin);
                while (iE2 < iE3) {
                    int i19 = (iE2 * 5) + 4;
                    int i20 = this.f4469b[i19];
                    if (!(i20 < 0)) {
                        AbstractC1083w.t("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f4469b[i19] = i20 + length + 1;
                    iE2++;
                    if (iE2 == this.f4474g) {
                        iE2 += this.f4475h;
                    }
                }
            }
            this.f4480m = iMin;
        }
        this.f4478k = i10;
    }

    public final void A(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            AbstractC1083w.t("Cannot seek backwards");
        }
        if (!(this.f4481n <= 0)) {
            T0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f4487t + i10;
        if (i11 >= this.f4489v && i11 <= this.f4488u) {
            z10 = true;
        }
        if (!z10) {
            AbstractC1083w.t("Cannot seek outside the current group (" + this.f4489v + '-' + this.f4488u + ')');
        }
        this.f4487t = i11;
        int iO = O(this.f4469b, e0(i11));
        this.f4476i = iO;
        this.f4477j = iO;
    }

    public final int A0(int i10) {
        return this.f4469b[(e0(i10) * 5) + 1] & 67108863;
    }

    public final C1021b B(int i10) {
        ArrayList arrayList = this.f4471d;
        int iS = F1.s(arrayList, i10, b0());
        if (iS >= 0) {
            return (C1021b) arrayList.get(iS);
        }
        if (i10 > this.f4474g) {
            i10 = -(b0() - i10);
        }
        C1021b c1021b = new C1021b(i10);
        arrayList.add(-(iS + 1), c1021b);
        return c1021b;
    }

    public final int C(C1021b c1021b) {
        int iA = c1021b.a();
        return iA < 0 ? b0() + iA : iA;
    }

    public final int C0(int i10) {
        return D0(this.f4469b, i10);
    }

    public final void D(C1021b c1021b, Object obj) {
        if (!(this.f4481n == 0)) {
            AbstractC1083w.t("Can only append a slot if not current inserting");
        }
        int i10 = this.f4476i;
        int i11 = this.f4477j;
        int iC = C(c1021b);
        int iO = O(this.f4469b, e0(iC + 1));
        this.f4476i = iO;
        this.f4477j = iO;
        n0(1, iC);
        if (i10 >= iO) {
            i10++;
            i11++;
        }
        this.f4470c[iO] = obj;
        this.f4476i = i10;
        this.f4477j = i11;
    }

    public final void F() {
        int i10 = this.f4481n;
        this.f4481n = i10 + 1;
        if (i10 == 0) {
            O0();
        }
    }

    public final Object H(int i10) {
        int iP = P(i10);
        Object[] objArr = this.f4470c;
        Object obj = objArr[iP];
        objArr[iP] = InterfaceC1054m.f4688a.a();
        return obj;
    }

    public final void J(boolean z10) {
        this.f4490w = true;
        if (z10 && this.f4483p.f4657b == 0) {
            v0(b0());
            x0(this.f4470c.length - this.f4479l, this.f4474g);
            I();
            H0();
        }
        this.f4468a.g(this, this.f4469b, this.f4474g, this.f4470c, this.f4478k, this.f4471d, this.f4472e, this.f4473f);
    }

    public final boolean J0() {
        if (!(this.f4481n == 0)) {
            AbstractC1083w.t("Cannot remove group while inserting");
        }
        int i10 = this.f4487t;
        int i11 = this.f4476i;
        int iO = O(this.f4469b, e0(i10));
        int iT0 = T0();
        b1(this.f4489v);
        p323s.E e10 = this.f4491x;
        if (e10 != null) {
            while (W0.d(e10) && W0.e(e10) >= i10) {
                W0.f(e10);
            }
        }
        boolean zK0 = K0(i10, this.f4487t - i10);
        L0(iO, this.f4476i - iO, i10 - 1);
        this.f4487t = i10;
        this.f4476i = i11;
        this.f4482o -= iT0;
        return zK0;
    }

    public final void M0() {
        if (!(this.f4481n == 0)) {
            AbstractC1083w.t("Cannot reset when inserting");
        }
        H0();
        this.f4487t = 0;
        this.f4488u = X() - this.f4475h;
        this.f4476i = 0;
        this.f4477j = 0;
        this.f4482o = 0;
    }

    public final void P0(C1021b c1021b) {
        A(c1021b.e(this) - this.f4487t);
    }

    public final Object Q0(int i10, int i11, Object obj) {
        int iP = P(Y0(i10, i11));
        Object[] objArr = this.f4470c;
        Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    public final int R() {
        p323s.L l10;
        boolean z10 = this.f4481n > 0;
        int i10 = this.f4487t;
        int i11 = this.f4488u;
        int i12 = this.f4489v;
        int iE0 = e0(i12);
        int i13 = this.f4482o;
        int i14 = i10 - i12;
        int i15 = (iE0 * 5) + 1;
        boolean z11 = (this.f4469b[i15] & 1073741824) != 0;
        if (z10) {
            p323s.F f10 = this.f4486s;
            if (f10 != null && (l10 = (p323s.L) f10.b(i12)) != null) {
                Object[] objArr = l10.f52645a;
                int i16 = l10.f52646b;
                for (int i17 = 0; i17 < i16; i17++) {
                    G0(objArr[i17]);
                }
            }
            F1.w(this.f4469b, iE0, i14);
            F1.y(this.f4469b, iE0, i13);
            this.f4482o = this.f4485r.g() + (z11 ? 1 : i13);
            int iD0 = D0(this.f4469b, i12);
            this.f4489v = iD0;
            int iB0 = iD0 < 0 ? b0() : e0(iD0 + 1);
            int iO = iB0 >= 0 ? O(this.f4469b, iB0) : 0;
            this.f4476i = iO;
            this.f4477j = iO;
            return i13;
        }
        if (!(i10 == i11)) {
            AbstractC1083w.t("Expected to be at the end of a group");
        }
        int iO2 = F1.o(this.f4469b, iE0);
        int[] iArr = this.f4469b;
        int i18 = iArr[i15] & 67108863;
        F1.w(iArr, iE0, i14);
        F1.y(this.f4469b, iE0, i13);
        int iG = this.f4483p.g();
        N0();
        this.f4489v = iG;
        int iD1 = D0(this.f4469b, i12);
        int iG2 = this.f4485r.g();
        this.f4482o = iG2;
        if (iD1 == iG) {
            this.f4482o = iG2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iO2;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iD1 != 0 && iD1 != iG && (i20 != 0 || i19 != 0)) {
                int iE1 = e0(iD1);
                if (i19 != 0) {
                    F1.w(this.f4469b, iE1, F1.o(this.f4469b, iE1) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.f4469b;
                    F1.y(iArr2, iE1, (iArr2[(iE1 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr3 = this.f4469b;
                if ((iArr3[(iE1 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iD1 = D0(iArr3, iD1);
            }
        }
        this.f4482o += i20;
        return i13;
    }

    public final void R0(Object obj) {
        if (!(this.f4476i <= this.f4477j)) {
            AbstractC1083w.t("Writing to an invalid slot");
        }
        this.f4470c[P(this.f4476i - 1)] = obj;
    }

    public final void S() {
        if (!(this.f4481n > 0)) {
            T0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f4481n - 1;
        this.f4481n = i10;
        if (i10 == 0) {
            if (!(this.f4485r.f4657b == this.f4483p.f4657b)) {
                AbstractC1083w.t("startGroup/endGroup mismatch while inserting");
            }
            N0();
        }
    }

    public final Object S0() {
        if (this.f4481n > 0) {
            n0(1, this.f4489v);
        }
        Object[] objArr = this.f4470c;
        int i10 = this.f4476i;
        this.f4476i = i10 + 1;
        return objArr[P(i10)];
    }

    public final void T(int i10) {
        boolean z10 = false;
        if (!(this.f4481n <= 0)) {
            AbstractC1083w.t("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f4489v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f4488u) {
                z10 = true;
            }
            if (!z10) {
                AbstractC1083w.t("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f4487t;
            int i13 = this.f4476i;
            int i14 = this.f4477j;
            this.f4487t = i10;
            d1();
            this.f4487t = i12;
            this.f4476i = i13;
            this.f4477j = i14;
        }
    }

    public final int T0() {
        int iE0 = e0(this.f4487t);
        int iO = this.f4487t + F1.o(this.f4469b, iE0);
        this.f4487t = iO;
        this.f4476i = O(this.f4469b, e0(iO));
        int i10 = this.f4469b[(iE0 * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void U(C1021b c1021b) {
        T(c1021b.e(this));
    }

    public final void U0() {
        int i10 = this.f4488u;
        this.f4487t = i10;
        this.f4476i = O(this.f4469b, e0(i10));
    }

    public final Object V0(int i10, int i11) {
        int iX0 = X0(this.f4469b, e0(i10));
        int iO = O(this.f4469b, e0(i10 + 1));
        int i12 = i11 + iX0;
        if (iX0 > i12 || i12 >= iO) {
            return InterfaceC1054m.f4688a.a();
        }
        return this.f4470c[P(i12)];
    }

    public final void W(int i10, Function2 function2) {
        int i11;
        int i12;
        C1021b c1021bA;
        int iC0 = C0(i10);
        int iB0 = b0();
        int iH0 = h0(i10) + i10;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i13 = i10;
        p323s.G gB = null;
        p323s.E e10 = null;
        while (i13 < iH0) {
            int iN = N(i13);
            int i14 = i13 + 1;
            int iN2 = N(i14);
            while (true) {
                i11 = 0;
                if (iN >= iN2) {
                    break;
                }
                Object obj = this.f4470c[P(iN)];
                if ((obj instanceof C1079u1) && (c1021bA = ((C1079u1) obj).a()) != null && c1021bA.b()) {
                    int iC = C(c1021bA);
                    if (gB == null) {
                        gB = AbstractC4117q.b();
                    }
                    if (e10 == null) {
                        e10 = new p323s.E(0, 1, defaultConstructorMarker);
                    }
                    gB.g(iC);
                    e10.f(iC);
                    e10.f(iN);
                } else {
                    function2.invoke(Integer.valueOf(iN), obj);
                }
                iN++;
            }
            int iC1 = i14 < iB0 ? C0(i14) : -1;
            if (iC1 != i13) {
                while (true) {
                    if (e10 == null || gB == null || !gB.r(i13)) {
                        i12 = iB0;
                    } else {
                        int i15 = e10.f52736b;
                        int i16 = i15 / 2;
                        int i17 = i11;
                        int i18 = i17;
                        while (i18 < i16) {
                            int i19 = i18 * 2;
                            int i20 = iB0;
                            int iB = e10.b(i19);
                            if (iB == i13) {
                                int iB2 = e10.b(i19 + 1);
                                function2.invoke(Integer.valueOf(iB2), this.f4470c[P(iB2)]);
                            } else if (i19 != i17) {
                                int i21 = i17 + 1;
                                e10.l(i17, iB);
                                i17 += 2;
                                e10.l(i21, e10.b(i19 + 1));
                            } else {
                                i17 += 2;
                            }
                            i18++;
                            function2 = function2;
                            iB0 = i20;
                        }
                        i12 = iB0;
                        if (i17 != i15) {
                            e10.k(i17, i15);
                        }
                    }
                    if (i13 == i10 || iC0 == iC1) {
                        break;
                    }
                    i13 = iC0;
                    iB0 = i12;
                    i11 = 0;
                    iC0 = C0(iC0);
                    function2 = function2;
                }
            } else {
                i12 = iB0;
            }
            iC0 = iC1;
            i13 = i14;
            iB0 = i12;
            defaultConstructorMarker = null;
        }
    }

    public final Object W0(C1021b c1021b, int i10) {
        return V0(C(c1021b), i10);
    }

    public final boolean Y() {
        return this.f4490w;
    }

    public final int Y0(int i10, int i11) {
        int iX0 = X0(this.f4469b, e0(i10));
        int i12 = iX0 + i11;
        if (!(i12 >= iX0 && i12 < O(this.f4469b, e0(i10 + 1)))) {
            AbstractC1083w.t("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int Z() {
        return this.f4487t;
    }

    public final int Z0(int i10) {
        return O(this.f4469b, e0(i10 + 1));
    }

    public final int a0() {
        return this.f4489v;
    }

    public final int a1(int i10) {
        return X0(this.f4469b, e0(i10));
    }

    public final int b0() {
        return X() - this.f4475h;
    }

    public final AbstractC1040h0 b1(int i10) {
        C1021b c1021bI1;
        HashMap map = this.f4472e;
        if (map == null || (c1021bI1 = i1(i10)) == null) {
            return null;
        }
        return (AbstractC1040h0) map.get(c1021bI1);
    }

    public final D1 c0() {
        return this.f4468a;
    }

    public final void c1(int i10, Object obj, Object obj2) {
        f1(i10, obj, false, obj2);
    }

    public final Object d0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f4469b;
        return (iArr[(iE0 * 5) + 1] & 268435456) != 0 ? this.f4470c[E(iArr, iE0)] : InterfaceC1054m.f4688a.a();
    }

    public final void d1() {
        if (!(this.f4481n == 0)) {
            AbstractC1083w.t("Key must be supplied when inserting");
        }
        InterfaceC1054m.a aVar = InterfaceC1054m.f4688a;
        f1(0, aVar.a(), false, aVar.a());
    }

    public final void e1(int i10, Object obj) {
        f1(i10, obj, false, InterfaceC1054m.f4688a.a());
    }

    public final int f0(int i10) {
        return this.f4469b[e0(i10) * 5];
    }

    public final Object g0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f4469b;
        if ((iArr[(iE0 * 5) + 1] & 536870912) != 0) {
            return this.f4470c[F1.r(iArr, iE0)];
        }
        return null;
    }

    public final void g1(int i10, Object obj) {
        f1(i10, obj, true, InterfaceC1054m.f4688a.a());
    }

    public final int h0(int i10) {
        return F1.o(this.f4469b, e0(i10));
    }

    public final void h1(int i10) {
        if (!(i10 > 0)) {
            AbstractC1083w.t("Check failed");
        }
        int i11 = this.f4489v;
        int iX0 = X0(this.f4469b, e0(i11));
        int iO = O(this.f4469b, e0(i11 + 1)) - i10;
        if (!(iO >= iX0)) {
            AbstractC1083w.t("Check failed");
        }
        L0(iO, i10, i11);
        int i12 = this.f4476i;
        if (i12 >= iX0) {
            this.f4476i = i12 - i10;
        }
    }

    public final int i0(int i10) {
        p323s.L l10;
        int iA1 = this.f4476i - a1(i10);
        p323s.F f10 = this.f4486s;
        return iA1 + ((f10 == null || (l10 = (p323s.L) f10.b(i10)) == null) ? 0 : l10.d());
    }

    public final C1021b i1(int i10) {
        if (i10 < 0 || i10 >= b0()) {
            return null;
        }
        return F1.n(this.f4471d, i10, b0());
    }

    public final boolean j0(int i10) {
        return k0(i10, this.f4487t);
    }

    public final Object j1(Object obj) {
        if (this.f4481n <= 0 || this.f4476i == this.f4478k) {
            return G0(obj);
        }
        p323s.F f10 = this.f4486s;
        if (f10 == null) {
            f10 = new p323s.F(0, 1, null);
        }
        this.f4486s = f10;
        int i10 = this.f4489v;
        Object objB = f10.b(i10);
        if (objB == null) {
            objB = new p323s.L(0, 1, null);
            f10.q(i10, objB);
        }
        ((p323s.L) objB).k(obj);
        return InterfaceC1054m.f4688a.a();
    }

    public final boolean k0(int i10, int i11) {
        int iB;
        int iX;
        if (i11 == this.f4489v) {
            iX = this.f4488u;
        } else if (i11 <= this.f4483p.f(0) && (iB = this.f4483p.b(i11)) >= 0) {
            iX = (X() - this.f4475h) - this.f4484q.d(iB);
        } else {
            int iH0 = h0(i11);
            iX = iH0 + i11;
        }
        return i10 > i11 && i10 < iX;
    }

    public final boolean l0(int i10) {
        int i11 = this.f4489v;
        if (i10 <= i11 || i10 >= this.f4488u) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    public final void l1(Object obj) {
        int iE0 = e0(this.f4487t);
        if (!((this.f4469b[(iE0 * 5) + 1] & 268435456) != 0)) {
            AbstractC1083w.t("Updating the data of a group that was not created with a data slot");
        }
        this.f4470c[P(E(this.f4469b, iE0))] = obj;
    }

    public final boolean o0() {
        int i10 = this.f4487t;
        return i10 < this.f4488u && (this.f4469b[(e0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean p0(int i10) {
        return (this.f4469b[(e0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void p1(C1021b c1021b, Object obj) {
        r1(c1021b.e(this), obj);
    }

    public final void q0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f4469b;
        int i11 = (iE0 * 5) + 1;
        if ((iArr[i11] & 134217728) != 0) {
            return;
        }
        F1.x(iArr, iE0, true);
        if ((this.f4469b[i11] & 67108864) != 0) {
            return;
        }
        m1(C0(i10));
    }

    public final void q1(Object obj) {
        r1(this.f4487t, obj);
    }

    public final void s1() {
        this.f4472e = this.f4468a.w();
        this.f4473f = this.f4468a.p();
    }

    public final List t0(D1 d10, int i10, boolean z10) {
        boolean z11 = false;
        if (!(this.f4481n > 0 ? true : z11)) {
            AbstractC1083w.t("Check failed");
        }
        if (i10 != 0 || this.f4487t != 0 || this.f4468a.s() != 0 || F1.o(d10.q(), i10) != d10.s()) {
            G1 g1D = d10.D();
            try {
                return f4466y.b(g1D, i10, this, true, true, z10);
            } finally {
                g1D.J(z11);
            }
        }
        int[] iArr = this.f4469b;
        Object[] objArr = this.f4470c;
        ArrayList arrayList = this.f4471d;
        HashMap map = this.f4472e;
        p323s.F f10 = this.f4473f;
        int[] iArrQ = d10.q();
        int iS = d10.s();
        Object[] objArrT = d10.t();
        int iV = d10.v();
        HashMap mapW = d10.w();
        p323s.F fP = d10.p();
        this.f4469b = iArrQ;
        this.f4470c = objArrT;
        this.f4471d = d10.n();
        this.f4474g = iS;
        this.f4475h = (iArrQ.length / 5) - iS;
        this.f4478k = iV;
        this.f4479l = objArrT.length - iV;
        this.f4480m = iS;
        this.f4472e = mapW;
        this.f4473f = fP;
        d10.F(iArr, 0, objArr, 0, arrayList, map, f10);
        return this.f4471d;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f4487t + " end=" + this.f4488u + " size = " + b0() + " gap=" + this.f4474g + '-' + (this.f4474g + this.f4475h) + ')';
    }

    public final void u0(int i10) {
        boolean z10 = true;
        if (!(this.f4481n == 0)) {
            AbstractC1083w.t("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            AbstractC1083w.t("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f4487t;
        int i12 = this.f4489v;
        int i13 = this.f4488u;
        int iO = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iO += F1.o(this.f4469b, e0(iO));
            if (!(iO <= i13)) {
                AbstractC1083w.t("Parameter offset is out of bounds");
            }
        }
        int iO2 = F1.o(this.f4469b, e0(iO));
        int iO3 = O(this.f4469b, e0(this.f4487t));
        int iO4 = O(this.f4469b, e0(iO));
        int i15 = iO + iO2;
        int iO5 = O(this.f4469b, e0(i15));
        int i16 = iO5 - iO4;
        n0(i16, Math.max(this.f4487t - 1, 0));
        m0(iO2);
        int[] iArr = this.f4469b;
        int iE0 = e0(i15) * 5;
        AbstractC3952n.j(iArr, iArr, e0(i11) * 5, iE0, (iO2 * 5) + iE0);
        if (i16 > 0) {
            Object[] objArr = this.f4470c;
            int iP = P(iO4 + i16);
            System.arraycopy(objArr, iP, objArr, iO3, P(iO5 + i16) - iP);
        }
        int i17 = iO4 + i16;
        int i18 = i17 - iO3;
        int i19 = this.f4478k;
        int i20 = this.f4479l;
        int length = this.f4470c.length;
        int i21 = this.f4480m;
        int i22 = i11 + iO2;
        int i23 = i11;
        while (i23 < i22) {
            boolean z11 = z10;
            int iE1 = e0(i23);
            int i24 = i23;
            int i25 = i18;
            o1(iArr, iE1, Q(O(iArr, iE1) - i18, i21 < iE1 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        s0(i15, i11, iO2);
        if (K0(i15, iO2)) {
            AbstractC1083w.t("Unexpectedly removed anchors");
        }
        V(i12, this.f4488u, i11);
        if (i16 > 0) {
            L0(i17, i16, i15 - 1);
        }
    }

    public final List w0(int i10, D1 d10, int i11) {
        if (!(this.f4481n <= 0 && h0(this.f4487t + i10) == 1)) {
            AbstractC1083w.t("Check failed");
        }
        int i12 = this.f4487t;
        int i13 = this.f4476i;
        int i14 = this.f4477j;
        A(i10);
        d1();
        F();
        G1 g1D = d10.D();
        try {
            List listC = a.c(f4466y, g1D, i11, this, false, true, false, 32, null);
            g1D.J(true);
            S();
            R();
            this.f4487t = i12;
            this.f4476i = i13;
            this.f4477j = i14;
            return listC;
        } catch (Throwable th) {
            g1D.J(false);
            throw th;
        }
    }

    public final Object y0(int i10) {
        int iE0 = e0(i10);
        int[] iArr = this.f4469b;
        if ((iArr[(iE0 * 5) + 1] & 1073741824) != 0) {
            return this.f4470c[P(B0(iArr, iE0))];
        }
        return null;
    }

    public final Object z0(C1021b c1021b) {
        return y0(c1021b.e(this));
    }
}
