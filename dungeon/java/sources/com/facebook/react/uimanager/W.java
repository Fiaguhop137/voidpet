package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class W implements V {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final com.facebook.yoga.c f30358x = C2244b0.f30385a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2262k0 f30362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30363e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f30365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private W f30366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private W f30367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30368j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W f30370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f30371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f30375q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float[] f30377s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.facebook.yoga.r f30379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f30380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f30381w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30364f = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30369k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean[] f30378t = new boolean[9];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C2258i0 f30376r = new C2258i0(0.0f);

    static {
        p348t6.b.a("ReactShadowNodeImpl", p348t6.a.ERROR);
    }

    public W() {
        float[] fArr = new float[9];
        this.f30377s = fArr;
        if (P()) {
            this.f30379u = null;
            return;
        }
        com.facebook.yoga.r rVarA = (com.facebook.yoga.r) Q0.b().acquire();
        rVarA = rVarA == null ? com.facebook.yoga.s.a(f30358x) : rVarA;
        this.f30379u = rVarA;
        rVarA.B(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private int m0() {
        C cT = T();
        if (cT == C.NONE) {
            return this.f30369k;
        }
        if (cT == C.LEAF) {
            return this.f30369k + 1;
        }
        return 1;
    }

    private void s1(int i10) {
        if (T() != C.PARENT) {
            for (W parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f30369k += i10;
                if (parent.T() == C.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void t1() {
        for (int i10 = 0; i10 <= 8; i10++) {
            if (i10 == 0 || i10 == 2 || i10 == 4 || i10 == 5) {
                if (com.facebook.yoga.g.a(this.f30377s[i10]) && com.facebook.yoga.g.a(this.f30377s[6]) && com.facebook.yoga.g.a(this.f30377s[8])) {
                    this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30376r.b(i10));
                } else if (this.f30378t[i10]) {
                    this.f30379u.k0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
                } else {
                    this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
                }
            } else if (i10 == 1 || i10 == 3) {
                if (com.facebook.yoga.g.a(this.f30377s[i10]) && com.facebook.yoga.g.a(this.f30377s[7]) && com.facebook.yoga.g.a(this.f30377s[8])) {
                    this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30376r.b(i10));
                } else if (this.f30378t[i10]) {
                    this.f30379u.k0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
                } else {
                    this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
                }
            } else if (com.facebook.yoga.g.a(this.f30377s[i10])) {
                this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30376r.b(i10));
            } else if (this.f30378t[i10]) {
                this.f30379u.k0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
            } else {
                this.f30379u.j0(com.facebook.yoga.j.g(i10), this.f30377s[i10]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public W H(int i10) {
        ArrayList arrayList = this.f30365g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
        }
        W w10 = (W) arrayList.remove(i10);
        w10.f30366h = null;
        if (this.f30379u != null && !v0()) {
            this.f30379u.s(i10);
        }
        x0();
        int iM0 = w10.m0();
        this.f30369k -= iM0;
        s1(-iM0);
        return w10;
    }

    @Override // com.facebook.react.uimanager.V
    public final float B() {
        return this.f30379u.l();
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final W A(int i10) {
        p240n6.a.c(this.f30371m);
        W w10 = (W) this.f30371m.remove(i10);
        w10.f30370l = null;
        return w10;
    }

    public void C0(com.facebook.yoga.a aVar) {
        this.f30379u.v(aVar);
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f30379u.w(aVar);
    }

    @Override // com.facebook.react.uimanager.V
    public final void E(boolean z10) {
        p240n6.a.b(getParent() == null, "Must remove from no opt parent first");
        p240n6.a.b(this.f30370l == null, "Must remove from native parent first");
        p240n6.a.b(m() == 0, "Must remove all native children first");
        this.f30368j = z10;
    }

    public void E0(com.facebook.yoga.a aVar) {
        this.f30379u.x(aVar);
    }

    @Override // com.facebook.react.uimanager.V
    public final void F(X x10) {
        C0.g(this, x10);
        y0();
    }

    public void F0(com.facebook.yoga.b bVar) {
        this.f30379u.z(bVar);
    }

    @Override // com.facebook.react.uimanager.V
    public int G() {
        return this.f30375q;
    }

    public void G0(int i10, float f10) {
        this.f30379u.A(com.facebook.yoga.j.g(i10), f10);
    }

    public void H0(float f10) {
        this.f30379u.N(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void I() {
        if (!P()) {
            this.f30379u.d();
        } else if (getParent() != null) {
            getParent().I();
        }
    }

    public void I0(float f10) {
        this.f30379u.O(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final void J(String str) {
        this.f30360b = str;
    }

    public void J0(int i10, float f10) {
        this.f30376r.c(i10, f10);
        t1();
    }

    @Override // com.facebook.react.uimanager.V
    public final YogaValue K() {
        return this.f30379u.e();
    }

    public void K0(com.facebook.yoga.i iVar) {
        this.f30379u.D(iVar);
    }

    @Override // com.facebook.react.uimanager.V
    public Iterable L() {
        if (u0()) {
            return null;
        }
        return this.f30365g;
    }

    public void L0(float f10) {
        this.f30379u.F(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final int M() {
        return this.f30359a;
    }

    public void M0() {
        this.f30379u.H();
    }

    @Override // com.facebook.react.uimanager.V
    public final void N() {
        ArrayList arrayList = this.f30371m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((W) this.f30371m.get(size)).f30370l = null;
            }
            this.f30371m.clear();
        }
    }

    public void N0(float f10) {
        this.f30379u.I(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void O() {
        Y(Float.NaN, Float.NaN);
    }

    public void O0(com.facebook.yoga.l lVar) {
        this.f30379u.J(lVar);
    }

    @Override // com.facebook.react.uimanager.V
    public boolean P() {
        return false;
    }

    public void P0(com.facebook.yoga.x xVar) {
        this.f30379u.r0(xVar);
    }

    @Override // com.facebook.react.uimanager.V
    public void Q(float f10) {
        this.f30379u.o0(f10);
    }

    public void Q0(float f10) {
        this.f30379u.N(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public int R() {
        return this.f30374p;
    }

    public void R0(float f10) {
        this.f30379u.N(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final C2262k0 S() {
        return (C2262k0) p240n6.a.c(this.f30362d);
    }

    public void S0(com.facebook.yoga.n nVar) {
        this.f30379u.S(nVar);
    }

    @Override // com.facebook.react.uimanager.V
    public C T() {
        if (P() || c0()) {
            return C.NONE;
        }
        return o0() ? C.LEAF : C.PARENT;
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final void w(W w10) {
        this.f30367i = w10;
    }

    @Override // com.facebook.react.uimanager.V
    public final int U() {
        p240n6.a.a(this.f30361c != 0);
        return this.f30361c;
    }

    public void U0(int i10, float f10) {
        this.f30379u.T(com.facebook.yoga.j.g(i10), f10);
    }

    @Override // com.facebook.react.uimanager.V
    public boolean V(float f10, float f11) {
        if (!n0()) {
            return false;
        }
        float fB = B();
        float fY = y();
        float f12 = f10 + fB;
        int iRound = Math.round(f12);
        float f13 = f11 + fY;
        int iRound2 = Math.round(f13);
        return (Math.round(fB) == this.f30372n && Math.round(fY) == this.f30373o && Math.round(f12 + d0()) - iRound == this.f30374p && Math.round(f13 + g()) - iRound2 == this.f30375q) ? false : true;
    }

    public void V0(int i10) {
        this.f30379u.U(com.facebook.yoga.j.g(i10));
    }

    @Override // com.facebook.react.uimanager.V
    public final boolean W() {
        return this.f30363e;
    }

    public void W0(int i10, float f10) {
        this.f30379u.V(com.facebook.yoga.j.g(i10), f10);
    }

    public void X0(com.facebook.yoga.o oVar) {
        this.f30379u.a0(oVar);
    }

    @Override // com.facebook.react.uimanager.V
    public void Y(float f10, float f11) {
        this.f30379u.c(f10, f11);
    }

    public void Y0(com.facebook.yoga.u uVar) {
        this.f30379u.i0(uVar);
    }

    @Override // com.facebook.react.uimanager.V
    public void Z(E e10) {
    }

    public void Z0(int i10, float f10) {
        this.f30377s[i10] = f10;
        this.f30378t[i10] = !com.facebook.yoga.g.a(f10);
        t1();
    }

    public void a1(int i10, float f10) {
        this.f30379u.l0(com.facebook.yoga.j.g(i10), f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final int b() {
        ArrayList arrayList = this.f30365g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void b1(int i10, float f10) {
        this.f30379u.m0(com.facebook.yoga.j.g(i10), f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final void c() {
        this.f30364f = false;
        if (n0()) {
            w0();
        }
    }

    @Override // com.facebook.react.uimanager.V
    public final boolean c0() {
        return this.f30368j;
    }

    public void c1(com.facebook.yoga.v vVar) {
        this.f30379u.n0(vVar);
    }

    @Override // com.facebook.react.uimanager.V
    public void d(float f10) {
        this.f30379u.P(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final float d0() {
        return this.f30379u.j();
    }

    public void d1(float f10) {
        this.f30379u.N(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void dispose() {
        com.facebook.yoga.r rVar = this.f30379u;
        if (rVar != null) {
            rVar.u();
            Q0.b().a(this.f30379u);
        }
    }

    @Override // com.facebook.react.uimanager.V
    public void e(int i10, int i11) {
        this.f30380v = Integer.valueOf(i10);
        this.f30381w = Integer.valueOf(i11);
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void u(W w10, int i10) {
        if (this.f30365g == null) {
            this.f30365g = new ArrayList(4);
        }
        this.f30365g.add(i10, w10);
        w10.f30366h = this;
        if (this.f30379u != null && !v0()) {
            com.facebook.yoga.r rVar = w10.f30379u;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + w10.toString() + "' to a '" + toString() + "')");
            }
            this.f30379u.b(rVar, i10);
        }
        x0();
        int iM0 = w10.m0();
        this.f30369k += iM0;
        s1(iM0);
    }

    public void e1(float f10) {
        this.f30379u.O(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void f(com.facebook.yoga.h hVar) {
        this.f30379u.C(hVar);
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final void o(W w10, int i10) {
        p240n6.a.a(T() == C.PARENT);
        p240n6.a.a(w10.T() != C.NONE);
        if (this.f30371m == null) {
            this.f30371m = new ArrayList(4);
        }
        this.f30371m.add(i10, w10);
        w10.f30370l = this;
    }

    public void f1(float f10) {
        this.f30379u.y(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final float g() {
        return this.f30379u.g();
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final W a(int i10) {
        ArrayList arrayList = this.f30365g;
        if (arrayList != null) {
            return (W) arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public void g1() {
        this.f30379u.Q();
    }

    @Override // com.facebook.react.uimanager.V
    public Integer getHeightMeasureSpec() {
        return this.f30381w;
    }

    @Override // com.facebook.react.uimanager.V
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.f30379u.f();
    }

    @Override // com.facebook.react.uimanager.V
    public Integer getWidthMeasureSpec() {
        return this.f30380v;
    }

    @Override // com.facebook.react.uimanager.V
    public final boolean h() {
        return this.f30364f || n0() || s0();
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final W a0() {
        W w10 = this.f30367i;
        return w10 != null ? w10 : b0();
    }

    public void h1(float f10) {
        this.f30379u.R(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void i(float f10, float f11, u0 u0Var, E e10) {
        if (this.f30364f) {
            z0(u0Var);
        }
        if (n0()) {
            float fB = B();
            float fY = y();
            float f12 = f10 + fB;
            int iRound = Math.round(f12);
            float f13 = f11 + fY;
            int iRound2 = Math.round(f13);
            int iRound3 = Math.round(f12 + d0());
            int iRound4 = Math.round(f13 + g());
            int iRound5 = Math.round(fB);
            int iRound6 = Math.round(fY);
            int i10 = iRound3 - iRound;
            int i11 = iRound4 - iRound2;
            boolean z10 = (iRound5 == this.f30372n && iRound6 == this.f30373o && i10 == this.f30374p && i11 == this.f30375q) ? false : true;
            this.f30372n = iRound5;
            this.f30373o = iRound6;
            this.f30374p = i10;
            this.f30375q = i11;
            if (z10) {
                if (e10 != null) {
                    e10.l(this);
                } else {
                    u0Var.P(getParent().M(), M(), z(), s(), R(), G(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final int l(W w10) {
        int iM0 = 0;
        for (int i10 = 0; i10 < b(); i10++) {
            W wA = a(i10);
            if (w10 == wA) {
                return iM0;
            }
            iM0 += wA.m0();
        }
        throw new RuntimeException("Child " + w10.M() + " was not a child of " + this.f30359a);
    }

    public void i1(float f10) {
        this.f30379u.W(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void j() {
        if (b() == 0) {
            return;
        }
        int iM0 = 0;
        for (int iB = b() - 1; iB >= 0; iB--) {
            if (this.f30379u != null && !v0()) {
                this.f30379u.s(iB);
            }
            W wA = a(iB);
            wA.f30366h = null;
            iM0 += wA.m0();
            wA.dispose();
        }
        ((ArrayList) p240n6.a.c(this.f30365g)).clear();
        x0();
        this.f30369k -= iM0;
        s1(-iM0);
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final W b0() {
        return this.f30370l;
    }

    public void j1(float f10) {
        this.f30379u.X(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void k(int i10, float f10) {
        this.f30377s[i10] = f10;
        this.f30378t[i10] = false;
        t1();
    }

    public final float k0(int i10) {
        return this.f30379u.h(com.facebook.yoga.j.g(i10));
    }

    public void k1(float f10) {
        this.f30379u.Y(f10);
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final W getParent() {
        return this.f30366h;
    }

    public void l1(float f10) {
        this.f30379u.Z(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final int m() {
        ArrayList arrayList = this.f30371m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void m1(float f10) {
        this.f30379u.b0(f10);
    }

    public final boolean n0() {
        com.facebook.yoga.r rVar = this.f30379u;
        return rVar != null && rVar.o();
    }

    public void n1(float f10) {
        this.f30379u.d0(f10);
    }

    public boolean o0() {
        return false;
    }

    public void o1(float f10) {
        this.f30379u.f0(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public final void p(int i10) {
        this.f30361c = i10;
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final int X(W w10) {
        ArrayList arrayList = this.f30365g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(w10);
    }

    public void p1(float f10) {
        this.f30379u.g0(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public void q(C2262k0 c2262k0) {
        this.f30362d = c2262k0;
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final int n(W w10) {
        p240n6.a.c(this.f30371m);
        return this.f30371m.indexOf(w10);
    }

    public void q1() {
        this.f30379u.p0();
    }

    @Override // com.facebook.react.uimanager.V
    public final YogaValue r() {
        return this.f30379u.n();
    }

    @Override // com.facebook.react.uimanager.V
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public boolean D(W w10) {
        for (W parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == w10) {
                return true;
            }
        }
        return false;
    }

    public void r1(float f10) {
        this.f30379u.q0(f10);
    }

    @Override // com.facebook.react.uimanager.V
    public int s() {
        return this.f30373o;
    }

    public final boolean s0() {
        com.facebook.yoga.r rVar = this.f30379u;
        return rVar != null && rVar.p();
    }

    public void setFlex(float f10) {
        this.f30379u.E(f10);
    }

    public void setFlexGrow(float f10) {
        this.f30379u.K(f10);
    }

    public void setFlexShrink(float f10) {
        this.f30379u.M(f10);
    }

    public void setShouldNotifyOnLayout(boolean z10) {
        this.f30363e = z10;
    }

    @Override // com.facebook.react.uimanager.V
    public void t(Object obj) {
    }

    public boolean t0() {
        return this.f30379u.q();
    }

    public String toString() {
        return "[" + this.f30360b + " " + M() + "]";
    }

    public boolean u0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.V
    public final String v() {
        return (String) p240n6.a.c(this.f30360b);
    }

    public boolean v0() {
        return t0();
    }

    public final void w0() {
        com.facebook.yoga.r rVar = this.f30379u;
        if (rVar != null) {
            rVar.r();
        }
    }

    @Override // com.facebook.react.uimanager.V
    public void x(int i10) {
        this.f30359a = i10;
    }

    public void x0() {
        if (this.f30364f) {
            return;
        }
        this.f30364f = true;
        W parent = getParent();
        if (parent != null) {
            parent.x0();
        }
    }

    @Override // com.facebook.react.uimanager.V
    public final float y() {
        return this.f30379u.m();
    }

    public void y0() {
    }

    @Override // com.facebook.react.uimanager.V
    public int z() {
        return this.f30372n;
    }

    public void z0(u0 u0Var) {
    }
}
