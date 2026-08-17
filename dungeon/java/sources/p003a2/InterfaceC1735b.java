package p003a2;

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
import Z1.C1694j;
import Z1.C1697k;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p021b2.InterfaceC2069z;
import p236n2.B;
import p236n2.C4027y;
import p236n2.D;

/* JADX INFO: renamed from: a2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1735b {

    /* JADX INFO: renamed from: a2.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F f19184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D.b f19186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final F f19188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final D.b f19190h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f19191i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f19192j;

        public a(long j10, F f10, int i10, D.b bVar, long j11, F f11, int i11, D.b bVar2, long j12, long j13) {
            this.f19183a = j10;
            this.f19184b = f10;
            this.f19185c = i10;
            this.f19186d = bVar;
            this.f19187e = j11;
            this.f19188f = f11;
            this.f19189g = i11;
            this.f19190h = bVar2;
            this.f19191i = j12;
            this.f19192j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f19183a == aVar.f19183a && this.f19185c == aVar.f19185c && this.f19187e == aVar.f19187e && this.f19189g == aVar.f19189g && this.f19191i == aVar.f19191i && this.f19192j == aVar.f19192j && Objects.equals(this.f19184b, aVar.f19184b) && Objects.equals(this.f19186d, aVar.f19186d) && Objects.equals(this.f19188f, aVar.f19188f) && Objects.equals(this.f19190h, aVar.f19190h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f19183a), this.f19184b, Integer.valueOf(this.f19185c), this.f19186d, Long.valueOf(this.f19187e), this.f19188f, Integer.valueOf(this.f19189g), this.f19190h, Long.valueOf(this.f19191i), Long.valueOf(this.f19192j));
        }
    }

    /* JADX INFO: renamed from: a2.b$b, reason: collision with other inner class name */
    public static final class C0241b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f19193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f19194b;

        public C0241b(p pVar, SparseArray sparseArray) {
            this.f19193a = pVar;
            SparseArray sparseArray2 = new SparseArray(pVar.c());
            for (int i10 = 0; i10 < pVar.c(); i10++) {
                int iB = pVar.b(i10);
                sparseArray2.append(iB, (a) AbstractC1459a.e((a) sparseArray.get(iB)));
            }
            this.f19194b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f19193a.a(i10);
        }

        public int b(int i10) {
            return this.f19193a.b(i10);
        }

        public a c(int i10) {
            return (a) AbstractC1459a.e((a) this.f19194b.get(i10));
        }

        public int d() {
            return this.f19193a.c();
        }
    }

    default void A(a aVar, C4027y c4027y, B b10) {
    }

    default void B(a aVar, Exception exc) {
    }

    default void C(a aVar, C4027y c4027y, B b10, int i10) {
    }

    default void D(a aVar, int i10) {
    }

    default void E(a aVar, Exception exc) {
    }

    default void F(a aVar, InterfaceC2069z.a aVar2) {
    }

    default void G(a aVar, x xVar) {
    }

    default void H(a aVar, C1694j c1694j) {
    }

    default void I(a aVar, u uVar, int i10) {
    }

    default void J(a aVar, r rVar, C1697k c1697k) {
    }

    default void K(a aVar, int i10) {
    }

    default void L(a aVar, C4027y c4027y, B b10) {
    }

    default void M(a aVar, B b10) {
    }

    default void O(a aVar, boolean z10) {
    }

    default void P(a aVar, C4027y c4027y, B b10) {
    }

    default void Q(a aVar, float f10) {
    }

    default void R(a aVar, int i10, boolean z10) {
    }

    default void S(a aVar, R1.B b10) {
    }

    default void T(a aVar, String str, long j10, long j11) {
    }

    default void U(a aVar, boolean z10) {
    }

    default void V(a aVar, c cVar) {
    }

    default void W(a aVar, List list) {
    }

    default void X(a aVar) {
    }

    default void Y(a aVar, boolean z10, int i10) {
    }

    default void Z(a aVar, String str, long j10, long j11) {
    }

    default void a(a aVar, int i10) {
    }

    default void a0(a aVar, C1694j c1694j) {
    }

    default void b(a aVar, boolean z10) {
    }

    void b0(a aVar, int i10, long j10, long j11);

    default void c(a aVar, int i10) {
    }

    default void c0(a aVar, int i10, long j10) {
    }

    void d(a aVar, B b10);

    default void d0(a aVar, r rVar, C1697k c1697k) {
    }

    default void e(a aVar, String str) {
    }

    default void e0(a aVar) {
    }

    default void f(a aVar, I i10) {
    }

    default void g(a aVar, InterfaceC2069z.a aVar2) {
    }

    default void g0(a aVar) {
    }

    default void h(a aVar, long j10, int i10) {
    }

    default void h0(a aVar, int i10) {
    }

    default void i(a aVar, C.b bVar) {
    }

    default void j(a aVar, int i10) {
    }

    void j0(a aVar, C.e eVar, C.e eVar2, int i10);

    default void k(a aVar, Exception exc) {
    }

    default void k0(a aVar, Exception exc) {
    }

    default void l(a aVar, int i10, int i11, boolean z10) {
    }

    default void l0(a aVar, int i10, long j10, long j11) {
    }

    default void m(a aVar, String str) {
    }

    default void m0(a aVar) {
    }

    default void n(a aVar, String str, long j10) {
    }

    default void o(a aVar) {
    }

    default void o0(a aVar) {
    }

    default void p(a aVar, String str, long j10) {
    }

    void p0(a aVar, C1694j c1694j);

    default void q(a aVar, boolean z10, int i10) {
    }

    default void q0(a aVar, w wVar) {
    }

    void r(a aVar, C4027y c4027y, B b10, IOException iOException, boolean z10);

    void r0(a aVar, M m10);

    default void s(a aVar, A a10) {
    }

    default void s0(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void t(a aVar, long j10) {
    }

    default void t0(a aVar, boolean z10) {
    }

    void u(C c10, C0241b c0241b);

    default void u0(a aVar, Object obj, long j10) {
    }

    default void v(a aVar, int i10) {
    }

    void v0(a aVar, A a10);

    default void w(a aVar, int i10, int i11) {
    }

    default void x(a aVar) {
    }

    default void y(a aVar, C1694j c1694j) {
    }

    default void z(a aVar, C1353m c1353m) {
    }
}
