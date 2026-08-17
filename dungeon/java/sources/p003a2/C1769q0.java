package p003a2;

import C9.AbstractC0876t;
import C9.AbstractC0877u;
import C9.AbstractC0879w;
import R1.A;
import R1.C;
import R1.C1353m;
import R1.F;
import R1.I;
import R1.M;
import R1.p;
import R1.r;
import R1.u;
import R1.w;
import R1.x;
import T1.c;
import U1.AbstractC1459a;
import U1.C1476s;
import U1.InterfaceC1466h;
import U1.InterfaceC1474p;
import U1.S;
import Z1.C1694j;
import Z1.C1697k;
import Z1.P;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p021b2.InterfaceC2069z;
import p236n2.B;
import p236n2.C4027y;
import p236n2.D;

/* JADX INFO: renamed from: a2.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1769q0 implements InterfaceC1732a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1466h f19260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.b f19261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.c f19262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f19263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f19264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1476s f19265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C f19266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC1474p f19267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19268i;

    /* JADX INFO: renamed from: a2.q0$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F.b f19269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC0876t f19270b = AbstractC0876t.w();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC0877u f19271c = AbstractC0877u.k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D.b f19272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private D.b f19273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private D.b f19274f;

        public a(F.b bVar) {
            this.f19269a = bVar;
        }

        private void b(AbstractC0877u.a aVar, D.b bVar, F f10) {
            if (bVar == null) {
                return;
            }
            if (f10.b(bVar.f49482a) != -1) {
                aVar.f(bVar, f10);
                return;
            }
            F f11 = (F) this.f19271c.get(bVar);
            if (f11 != null) {
                aVar.f(bVar, f11);
            }
        }

        private static D.b c(C c10, AbstractC0876t abstractC0876t, D.b bVar, F.b bVar2) {
            F fQ = c10.q();
            int iT = c10.t();
            Object objM = fQ.q() ? null : fQ.m(iT);
            int iD = (c10.h() || fQ.q()) ? -1 : fQ.f(iT, bVar2).d(S.M0(c10.H()) - bVar2.n());
            for (int i10 = 0; i10 < abstractC0876t.size(); i10++) {
                D.b bVar3 = (D.b) abstractC0876t.get(i10);
                if (i(bVar3, objM, c10.h(), c10.n(), c10.x(), iD)) {
                    return bVar3;
                }
            }
            if (abstractC0876t.isEmpty() && bVar != null && i(bVar, objM, c10.h(), c10.n(), c10.x(), iD)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(D.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f49482a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f49483b == i10 && bVar.f49484c == i11) {
                return true;
            }
            return !z10 && bVar.f49483b == -1 && bVar.f49486e == i12;
        }

        private void m(F f10) {
            AbstractC0877u.a aVarA = AbstractC0877u.a();
            if (this.f19270b.isEmpty()) {
                b(aVarA, this.f19273e, f10);
                if (!Objects.equals(this.f19274f, this.f19273e)) {
                    b(aVarA, this.f19274f, f10);
                }
                if (!Objects.equals(this.f19272d, this.f19273e) && !Objects.equals(this.f19272d, this.f19274f)) {
                    b(aVarA, this.f19272d, f10);
                }
            } else {
                for (int i10 = 0; i10 < this.f19270b.size(); i10++) {
                    b(aVarA, (D.b) this.f19270b.get(i10), f10);
                }
                if (!this.f19270b.contains(this.f19272d)) {
                    b(aVarA, this.f19272d, f10);
                }
            }
            this.f19271c = aVarA.c();
        }

        public D.b d() {
            return this.f19272d;
        }

        public D.b e() {
            if (this.f19270b.isEmpty()) {
                return null;
            }
            return (D.b) AbstractC0879w.d(this.f19270b);
        }

        public F f(D.b bVar) {
            return (F) this.f19271c.get(bVar);
        }

        public D.b g() {
            return this.f19273e;
        }

        public D.b h() {
            return this.f19274f;
        }

        public void j(C c10) {
            this.f19272d = c(c10, this.f19270b, this.f19273e, this.f19269a);
        }

        public void k(List list, D.b bVar, C c10) {
            this.f19270b = AbstractC0876t.p(list);
            if (!list.isEmpty()) {
                this.f19273e = (D.b) list.get(0);
                this.f19274f = (D.b) AbstractC1459a.e(bVar);
            }
            if (this.f19272d == null) {
                this.f19272d = c(c10, this.f19270b, this.f19273e, this.f19269a);
            }
            m(c10.q());
        }

        public void l(C c10) {
            this.f19272d = c(c10, this.f19270b, this.f19273e, this.f19269a);
            m(c10.q());
        }
    }

    public C1769q0(InterfaceC1466h interfaceC1466h) {
        this.f19260a = (InterfaceC1466h) AbstractC1459a.e(interfaceC1466h);
        this.f19265f = new C1476s(S.Y(), interfaceC1466h, new C1768q());
        F.b bVar = new F.b();
        this.f19261b = bVar;
        this.f19262c = new F.c();
        this.f19263d = new a(bVar);
        this.f19264e = new SparseArray();
    }

    public static /* synthetic */ void A0(InterfaceC1735b.a aVar, M m10, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.r0(aVar, m10);
        interfaceC1735b.s0(aVar, m10.f10094a, m10.f10095b, 0, m10.f10097d);
    }

    public static /* synthetic */ void B0(InterfaceC1735b.a aVar, C4027y c4027y, B b10, int i10, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.A(aVar, c4027y, b10);
        interfaceC1735b.C(aVar, c4027y, b10, i10);
    }

    private InterfaceC1735b.a F1(D.b bVar) {
        AbstractC1459a.e(this.f19266g);
        F f10 = bVar == null ? null : this.f19263d.f(bVar);
        if (bVar != null && f10 != null) {
            return E1(f10, f10.h(bVar.f49482a, this.f19261b).f9924c, bVar);
        }
        int iD = this.f19266g.D();
        F fQ = this.f19266g.q();
        if (iD >= fQ.p()) {
            fQ = F.f9913a;
        }
        return E1(fQ, iD, null);
    }

    private InterfaceC1735b.a G1() {
        return F1(this.f19263d.e());
    }

    private InterfaceC1735b.a H1(int i10, D.b bVar) {
        AbstractC1459a.e(this.f19266g);
        if (bVar != null) {
            return this.f19263d.f(bVar) != null ? F1(bVar) : E1(F.f9913a, i10, bVar);
        }
        F fQ = this.f19266g.q();
        if (i10 >= fQ.p()) {
            fQ = F.f9913a;
        }
        return E1(fQ, i10, null);
    }

    private InterfaceC1735b.a I1() {
        return F1(this.f19263d.g());
    }

    private InterfaceC1735b.a J1() {
        return F1(this.f19263d.h());
    }

    private InterfaceC1735b.a K1(A a10) {
        D.b bVar;
        return (!(a10 instanceof P) || (bVar = ((P) a10).f18025o) == null) ? D1() : F1(bVar);
    }

    public static /* synthetic */ void L0(InterfaceC1735b.a aVar, String str, long j10, long j11, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.p(aVar, str, j10);
        interfaceC1735b.Z(aVar, str, j11, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 1028, new E(aVarD1));
        this.f19265f.i();
    }

    public static /* synthetic */ void R0(InterfaceC1735b.a aVar, boolean z10, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.b(aVar, z10);
        interfaceC1735b.O(aVar, z10);
    }

    public static /* synthetic */ void a1(InterfaceC1735b.a aVar, int i10, C.e eVar, C.e eVar2, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.K(aVar, i10);
        interfaceC1735b.j0(aVar, eVar, eVar2, i10);
    }

    public static /* synthetic */ void s0(InterfaceC1735b.a aVar, int i10, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.g0(aVar);
        interfaceC1735b.j(aVar, i10);
    }

    public static /* synthetic */ void u0(InterfaceC1735b.a aVar, String str, long j10, long j11, InterfaceC1735b interfaceC1735b) {
        interfaceC1735b.n(aVar, str, j10);
        interfaceC1735b.T(aVar, str, j11, j10);
    }

    public static /* synthetic */ void y1(InterfaceC1735b interfaceC1735b, p pVar) {
    }

    @Override // p003a2.InterfaceC1732a
    public final void A(long j10, int i10) {
        InterfaceC1735b.a aVarI1 = I1();
        M1(aVarI1, 1021, new L(aVarI1, j10, i10));
    }

    @Override // R1.C.d
    public final void B(int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 6, new C1754j(aVarD1, i10));
    }

    @Override // R1.C.d
    public void C(boolean z10) {
    }

    @Override // R1.C.d
    public void D(I i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 2, new C1762n(aVarD1, i10));
    }

    protected final InterfaceC1735b.a D1() {
        return F1(this.f19263d.d());
    }

    @Override // p003a2.InterfaceC1732a
    public void E(C c10, Looper looper) {
        AbstractC1459a.g(this.f19266g == null || this.f19263d.f19270b.isEmpty());
        this.f19266g = (C) AbstractC1459a.e(c10);
        this.f19267h = this.f19260a.e(looper, null);
        this.f19265f = this.f19265f.e(looper, new C1744e(this, c10));
    }

    protected final InterfaceC1735b.a E1(F f10, int i10, D.b bVar) {
        D.b bVar2 = f10.q() ? null : bVar;
        long jC = this.f19260a.c();
        boolean z10 = f10.equals(this.f19266g.q()) && i10 == this.f19266g.D();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f19266g.z();
            } else if (!f10.q()) {
                jB = f10.n(i10, this.f19262c).b();
            }
        } else if (z10 && this.f19266g.n() == bVar2.f49483b && this.f19266g.x() == bVar2.f49484c) {
            jB = this.f19266g.H();
        }
        return new InterfaceC1735b.a(jC, f10, i10, bVar2, jB, this.f19266g.q(), this.f19266g.D(), this.f19263d.d(), this.f19266g.H(), this.f19266g.i());
    }

    @Override // p075e2.t
    public final void F(int i10, D.b bVar) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1023, new C1753i0(aVarH1));
    }

    @Override // R1.C.d
    public void G(C.b bVar) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 13, new C1761m0(aVarD1, bVar));
    }

    @Override // p075e2.t
    public final void H(int i10, D.b bVar) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1027, new C1736b0(aVarH1));
    }

    @Override // R1.C.d
    public final void I(int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 4, new C1771s(aVarD1, i10));
    }

    @Override // r2.d.a
    public final void J(int i10, long j10, long j11) {
        InterfaceC1735b.a aVarG1 = G1();
        M1(aVarG1, 1006, new C1742d0(aVarG1, i10, j10, j11));
    }

    @Override // p003a2.InterfaceC1732a
    public final void K() {
        if (this.f19268i) {
            return;
        }
        InterfaceC1735b.a aVarD1 = D1();
        this.f19268i = true;
        M1(aVarD1, -1, new C1773t(aVarD1));
    }

    @Override // p236n2.L
    public final void L(int i10, D.b bVar, C4027y c4027y, B b10) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1001, new S(aVarH1, c4027y, b10));
    }

    @Override // R1.C.d
    public void M(int i10, boolean z10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 30, new K(aVarD1, i10, z10));
    }

    protected final void M1(InterfaceC1735b.a aVar, int i10, C1476s.a aVar2) {
        this.f19264e.put(i10, aVar);
        this.f19265f.j(i10, aVar2);
    }

    @Override // p236n2.L
    public final void N(int i10, D.b bVar, B b10) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1004, new B(aVarH1, b10));
    }

    @Override // R1.C.d
    public void O(A a10) {
        InterfaceC1735b.a aVarK1 = K1(a10);
        M1(aVarK1, 10, new C1758l(aVarK1, a10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void P(List list, D.b bVar) {
        this.f19263d.k(list, bVar, (C) AbstractC1459a.e(this.f19266g));
    }

    @Override // R1.C.d
    public void Q() {
    }

    @Override // p236n2.L
    public final void R(int i10, D.b bVar, C4027y c4027y, B b10, IOException iOException, boolean z10) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1003, new G(aVarH1, c4027y, b10, iOException, z10));
    }

    @Override // R1.C.d
    public void S(C1353m c1353m) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 29, new P(aVarD1, c1353m));
    }

    @Override // R1.C.d
    public final void T(int i10, int i11) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 24, new A(aVarJ1, i10, i11));
    }

    @Override // R1.C.d
    public void U(int i10) {
    }

    @Override // p075e2.t
    public final void V(int i10, D.b bVar) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1026, new C1747f0(aVarH1));
    }

    @Override // R1.C.d
    public void W(C c10, C.c cVar) {
    }

    @Override // R1.C.d
    public final void X(boolean z10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 3, new V(aVarD1, z10));
    }

    @Override // R1.C.d
    public final void Y(float f10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 22, new C1767p0(aVarJ1, f10));
    }

    @Override // R1.C.d
    public final void Z(u uVar, int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 1, new C1765o0(aVarD1, uVar, i10));
    }

    @Override // R1.C.d
    public final void a(M m10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 25, new W(aVarJ1, m10));
    }

    @Override // p003a2.InterfaceC1732a
    public void a0(InterfaceC1735b interfaceC1735b) {
        AbstractC1459a.e(interfaceC1735b);
        this.f19265f.c(interfaceC1735b);
    }

    @Override // p003a2.InterfaceC1732a
    public void b(InterfaceC2069z.a aVar) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1031, new C1759l0(aVarJ1, aVar));
    }

    @Override // R1.C.d
    public final void b0(F f10, int i10) {
        this.f19263d.l((C) AbstractC1459a.e(this.f19266g));
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 0, new C1763n0(aVarD1, i10));
    }

    @Override // R1.C.d
    public final void c(int i10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 21, new U(aVarJ1, i10));
    }

    @Override // p075e2.t
    public final void c0(int i10, D.b bVar) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1025, new C1751h0(aVarH1));
    }

    @Override // R1.C.d
    public final void d(boolean z10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 23, new C1757k0(aVarJ1, z10));
    }

    @Override // p003a2.InterfaceC1732a
    public void d0(int i10, int i11, boolean z10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1033, new C1764o(aVarJ1, i10, i11, z10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void e(Exception exc) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1014, new C1739c0(aVarJ1, exc));
    }

    @Override // R1.C.d
    public final void e0(boolean z10, int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, -1, new C1746f(aVarD1, z10, i10));
    }

    @Override // p003a2.InterfaceC1732a
    public void f(InterfaceC2069z.a aVar) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1032, new C1755j0(aVarJ1, aVar));
    }

    @Override // p236n2.L
    public final void f0(int i10, D.b bVar, B b10) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1005, new C1733a0(aVarH1, b10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void g(String str) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1019, new C1756k(aVarJ1, str));
    }

    @Override // R1.C.d
    public final void g0(int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 8, new C1779w(aVarD1, i10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void h(String str, long j10, long j11) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1016, new C1785z(aVarJ1, str, j11, j10));
    }

    @Override // p236n2.L
    public final void h0(int i10, D.b bVar, C4027y c4027y, B b10, int i11) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1000, new D(aVarH1, c4027y, b10, i11));
    }

    @Override // p003a2.InterfaceC1732a
    public final void i(r rVar, C1697k c1697k) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1017, new T(aVarJ1, rVar, c1697k));
    }

    @Override // R1.C.d
    public final void i0(C.e eVar, C.e eVar2, int i10) {
        if (i10 == 1) {
            this.f19268i = false;
        }
        this.f19263d.j((C) AbstractC1459a.e(this.f19266g));
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 11, new C1775u(aVarD1, i10, eVar, eVar2));
    }

    @Override // p003a2.InterfaceC1732a
    public final void j(r rVar, C1697k c1697k) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1009, new X(aVarJ1, rVar, c1697k));
    }

    @Override // p236n2.L
    public final void j0(int i10, D.b bVar, C4027y c4027y, B b10) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1002, new M(aVarH1, c4027y, b10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void k(String str) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1012, new C1749g0(aVarJ1, str));
    }

    @Override // R1.C.d
    public final void k0(boolean z10, int i10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 5, new C1760m(aVarD1, z10, i10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void l(String str, long j10, long j11) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1008, new C1752i(aVarJ1, str, j11, j10));
    }

    @Override // p075e2.t
    public final void l0(int i10, D.b bVar, int i11) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1022, new O(aVarH1, i11));
    }

    @Override // R1.C.d
    public final void m(x xVar) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 28, new C1748g(aVarD1, xVar));
    }

    @Override // R1.C.d
    public void m0(w wVar) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 14, new J(aVarD1, wVar));
    }

    @Override // R1.C.d
    public void n(List list) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 27, new C1766p(aVarD1, list));
    }

    @Override // R1.C.d
    public final void n0(A a10) {
        InterfaceC1735b.a aVarK1 = K1(a10);
        M1(aVarK1, 10, new r(aVarK1, a10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void o(long j10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1010, new H(aVarJ1, j10));
    }

    @Override // p075e2.t
    public final void o0(int i10, D.b bVar, Exception exc) {
        InterfaceC1735b.a aVarH1 = H1(i10, bVar);
        M1(aVarH1, 1024, new Q(aVarH1, exc));
    }

    @Override // p003a2.InterfaceC1732a
    public final void p(C1694j c1694j) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1015, new Y(aVarJ1, c1694j));
    }

    @Override // R1.C.d
    public void p0(boolean z10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 7, new C1750h(aVarD1, z10));
    }

    @Override // R1.C.d
    public final void q(R1.B b10) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 12, new C1738c(aVarD1, b10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void r(Exception exc) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1030, new C1741d(aVarJ1, exc));
    }

    @Override // p003a2.InterfaceC1732a
    public void release() {
        ((InterfaceC1474p) AbstractC1459a.i(this.f19267h)).h(new RunnableC1777v(this));
    }

    @Override // p003a2.InterfaceC1732a
    public final void s(C1694j c1694j) {
        InterfaceC1735b.a aVarI1 = I1();
        M1(aVarI1, 1013, new N(aVarI1, c1694j));
    }

    @Override // p003a2.InterfaceC1732a
    public final void t(C1694j c1694j) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1007, new F(aVarJ1, c1694j));
    }

    @Override // R1.C.d
    public void u(c cVar) {
        InterfaceC1735b.a aVarD1 = D1();
        M1(aVarD1, 27, new C1783y(aVarD1, cVar));
    }

    @Override // p003a2.InterfaceC1732a
    public final void v(int i10, long j10) {
        InterfaceC1735b.a aVarI1 = I1();
        M1(aVarI1, 1018, new I(aVarI1, i10, j10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void w(C1694j c1694j) {
        InterfaceC1735b.a aVarI1 = I1();
        M1(aVarI1, 1020, new C(aVarI1, c1694j));
    }

    @Override // p003a2.InterfaceC1732a
    public final void x(Object obj, long j10) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 26, new Z(aVarJ1, obj, j10));
    }

    @Override // p003a2.InterfaceC1732a
    public final void y(Exception exc) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1029, new C1781x(aVarJ1, exc));
    }

    @Override // p003a2.InterfaceC1732a
    public final void z(int i10, long j10, long j11) {
        InterfaceC1735b.a aVarJ1 = J1();
        M1(aVarJ1, 1011, new C1745e0(aVarJ1, i10, j10, j11));
    }
}
