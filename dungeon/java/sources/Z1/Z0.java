package Z1;

import C9.AbstractC0876t;
import U1.AbstractC1459a;
import U1.InterfaceC1474p;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import p003a2.InterfaceC1732a;

/* JADX INFO: loaded from: classes.dex */
final class Z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1732a f18208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1474p f18209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0.a f18210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Q.c f18214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private W0 f18215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private W0 f18216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W0 f18217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private W0 f18218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private W0 f18219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f18221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f18222q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R1.F.b f18206a = new R1.F.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R1.F.c f18207b = new R1.F.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f18223r = new ArrayList();

    public Z0(InterfaceC1732a interfaceC1732a, InterfaceC1474p interfaceC1474p, W0.a aVar, Q.c cVar) {
        this.f18208c = interfaceC1732a;
        this.f18209d = interfaceC1474p;
        this.f18210e = aVar;
        this.f18214i = cVar;
    }

    private boolean A(Object obj, R1.F f10) {
        int iC = f10.h(obj, this.f18206a).c();
        int iO = this.f18206a.o();
        if (iC <= 0 || !this.f18206a.r(iO)) {
            return false;
        }
        return iC > 1 || this.f18206a.f(iO) != Long.MIN_VALUE;
    }

    private boolean C(n2.D.b bVar) {
        return !bVar.b() && bVar.f49486e == -1;
    }

    private boolean D(R1.F f10, n2.D.b bVar, boolean z10) {
        int iB = f10.b(bVar.f49482a);
        return !f10.n(f10.f(iB, this.f18206a).f9924c, this.f18207b).f9953i && f10.r(iB, this.f18206a, this.f18207b, this.f18212g, this.f18213h) && z10;
    }

    private boolean E(R1.F f10, n2.D.b bVar) {
        if (C(bVar)) {
            return f10.n(f10.h(bVar.f49482a, this.f18206a).f9924c, this.f18207b).f9959o == f10.b(bVar.f49482a);
        }
        return false;
    }

    private static boolean H(R1.F.b bVar) {
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.q(0)) && bVar.r(bVar.o()))) {
            long jI = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f9925d == 0) {
                    return true;
                }
                int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jI += bVar.i(i11);
                }
                if (bVar.f9925d <= jI) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        for (W0 w0K = this.f18215j; w0K != null; w0K = w0K.k()) {
            aVarL.a(w0K.f18180h.f18190a);
        }
        W0 w10 = this.f18216k;
        this.f18209d.h(new Y0(this, aVarL, w10 == null ? null : w10.f18180h.f18190a));
    }

    private void L(List list) {
        for (int i10 = 0; i10 < this.f18223r.size(); i10++) {
            ((W0) this.f18223r.get(i10)).x();
        }
        this.f18223r = list;
        this.f18219n = null;
        I();
    }

    private W0 O(X0 x10) {
        for (int i10 = 0; i10 < this.f18223r.size(); i10++) {
            if (((W0) this.f18223r.get(i10)).d(x10)) {
                return (W0) this.f18223r.remove(i10);
            }
        }
        return null;
    }

    private static n2.D.b P(R1.F f10, Object obj, long j10, long j11, R1.F.c cVar, R1.F.b bVar) {
        f10.h(obj, bVar);
        f10.n(bVar.f9924c, cVar);
        for (int iB = f10.b(obj); H(bVar) && iB <= cVar.f9959o; iB++) {
            f10.g(iB, bVar, true);
            obj = AbstractC1459a.e(bVar.f9923b);
        }
        f10.h(obj, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new n2.D.b(obj, j11, bVar.d(j10)) : new n2.D.b(obj, iE, bVar.k(iE), j11);
    }

    private long R(R1.F f10, Object obj) {
        int iB;
        int i10 = f10.h(obj, this.f18206a).f9924c;
        Object obj2 = this.f18221p;
        if (obj2 != null && (iB = f10.b(obj2)) != -1 && f10.f(iB, this.f18206a).f9924c == i10) {
            return this.f18222q;
        }
        for (W0 w0K = this.f18215j; w0K != null; w0K = w0K.k()) {
            if (w0K.f18174b.equals(obj)) {
                return w0K.f18180h.f18190a.f49485d;
            }
        }
        for (W0 w0K2 = this.f18215j; w0K2 != null; w0K2 = w0K2.k()) {
            int iB2 = f10.b(w0K2.f18174b);
            if (iB2 != -1 && f10.f(iB2, this.f18206a).f9924c == i10) {
                return w0K2.f18180h.f18190a.f49485d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f18211f;
        this.f18211f = 1 + j10;
        if (this.f18215j == null) {
            this.f18221p = obj;
            this.f18222q = j10;
        }
        return j10;
    }

    private long S(Object obj) {
        for (int i10 = 0; i10 < this.f18223r.size(); i10++) {
            W0 w10 = (W0) this.f18223r.get(i10);
            if (w10.f18174b.equals(obj)) {
                return w10.f18180h.f18190a.f49485d;
            }
        }
        return -1L;
    }

    private int U(R1.F f10) {
        R1.F f11;
        W0 w0K = this.f18215j;
        if (w0K == null) {
            return 0;
        }
        int iB = f10.b(w0K.f18174b);
        while (true) {
            f11 = f10;
            iB = f11.d(iB, this.f18206a, this.f18207b, this.f18212g, this.f18213h);
            while (((W0) AbstractC1459a.e(w0K)).k() != null && !w0K.f18180h.f18197h) {
                w0K = w0K.k();
            }
            W0 w0K2 = w0K.k();
            if (iB == -1 || w0K2 == null || f11.b(w0K2.f18174b) != iB) {
                break;
            }
            w0K = w0K2;
            f10 = f11;
        }
        int iN = N(w0K);
        w0K.f18180h = z(f11, w0K.f18180h);
        return iN;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean f(X0 x10, X0 x11) {
        return x10.f18191b == x11.f18191b && x10.f18190a.equals(x11.f18190a);
    }

    private Pair i(R1.F f10, Object obj, long j10) {
        int iE = f10.e(f10.h(obj, this.f18206a).f9924c, this.f18212g, this.f18213h);
        if (iE != -1) {
            return f10.k(this.f18207b, this.f18206a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private X0 j(p1 p1Var) {
        return o(p1Var.f18432a, p1Var.f18433b, p1Var.f18434c, p1Var.f18450s);
    }

    private X0 k(R1.F f10, W0 w10, long j10) {
        Object obj;
        long j11;
        X0 x10 = w10.f18180h;
        int iD = f10.d(f10.b(x10.f18190a.f49482a), this.f18206a, this.f18207b, this.f18212g, this.f18213h);
        if (iD == -1) {
            return null;
        }
        int i10 = f10.g(iD, this.f18206a, true).f9924c;
        Object objE = AbstractC1459a.e(this.f18206a.f9923b);
        long j12 = x10.f18190a.f49485d;
        long j13 = 0;
        if (f10.n(i10, this.f18207b).f9958n == iD) {
            Pair pairK = f10.k(this.f18207b, this.f18206a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            W0 w0K = w10.k();
            if (w0K == null || !w0K.f18174b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f18211f;
                    this.f18211f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = w0K.f18180h.f18190a.f49485d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        n2.D.b bVarP = P(f10, obj, j11, j12, this.f18207b, this.f18206a);
        if (j13 != -9223372036854775807L && x10.f18192c != -9223372036854775807L) {
            boolean zA = A(x10.f18190a.f49482a, f10);
            if (bVarP.b() && zA) {
                j13 = x10.f18192c;
            } else if (zA) {
                j11 = x10.f18192c;
            }
        }
        return o(f10, bVarP, j13, j11);
    }

    private X0 l(R1.F f10, W0 w10, long j10) {
        X0 x10 = w10.f18180h;
        long jM = (w10.m() + x10.f18194e) - j10;
        return x10.f18197h ? k(f10, w10, jM) : m(f10, w10, jM);
    }

    private X0 m(R1.F f10, W0 w10, long j10) {
        X0 x10 = w10.f18180h;
        n2.D.b bVar = x10.f18190a;
        f10.h(bVar.f49482a, this.f18206a);
        boolean z10 = x10.f18196g;
        if (!bVar.b()) {
            int i10 = bVar.f49486e;
            if (i10 != -1 && this.f18206a.q(i10)) {
                return k(f10, w10, j10);
            }
            int iK = this.f18206a.k(bVar.f49486e);
            boolean z11 = this.f18206a.r(bVar.f49486e) && this.f18206a.h(bVar.f49486e, iK) == 3;
            if (iK == this.f18206a.a(bVar.f49486e) || z11) {
                return q(f10, bVar.f49482a, s(f10, bVar.f49482a, bVar.f49486e), x10.f18194e, bVar.f49485d, false);
            }
            return p(f10, bVar.f49482a, bVar.f49486e, iK, x10.f18194e, bVar.f49485d, z10);
        }
        int i11 = bVar.f49483b;
        int iA = this.f18206a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f18206a.l(i11, bVar.f49484c);
        if (iL < iA) {
            return p(f10, bVar.f49482a, i11, iL, x10.f18192c, bVar.f49485d, z10);
        }
        long jLongValue = x10.f18192c;
        if (jLongValue == -9223372036854775807L) {
            R1.F.c cVar = this.f18207b;
            R1.F.b bVar2 = this.f18206a;
            Pair pairK = f10.k(cVar, bVar2, bVar2.f9924c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(f10, bVar.f49482a, Math.max(s(f10, bVar.f49482a, bVar.f49483b), jLongValue), x10.f18192c, bVar.f49485d, z10);
    }

    private X0 o(R1.F f10, n2.D.b bVar, long j10, long j11) {
        f10.h(bVar.f49482a, this.f18206a);
        return bVar.b() ? p(f10, bVar.f49482a, bVar.f49483b, bVar.f49484c, j10, bVar.f49485d, false) : q(f10, bVar.f49482a, j11, j10, bVar.f49485d, false);
    }

    private X0 p(R1.F f10, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        n2.D.b bVar = new n2.D.b(obj, i10, i11, j11);
        long jB = f10.h(bVar.f49482a, this.f18206a).b(bVar.f49483b, bVar.f49484c);
        long jG = i11 == this.f18206a.k(i10) ? this.f18206a.g() : 0L;
        boolean zR = this.f18206a.r(bVar.f49483b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new X0(bVar, jG, j10, -9223372036854775807L, jB, z10, zR, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    private X0 q(R1.F f10, Object obj, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        long j13;
        long jF;
        long j14;
        long jMax = j10;
        f10.h(obj, this.f18206a);
        int iD = this.f18206a.d(jMax);
        int i10 = 1;
        if (iD == -1) {
            if (this.f18206a.c() > 0) {
                R1.F.b bVar = this.f18206a;
                if (bVar.r(bVar.o())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else if (this.f18206a.r(iD)) {
            long jF2 = this.f18206a.f(iD);
            R1.F.b bVar2 = this.f18206a;
            if (jF2 == bVar2.f9925d && bVar2.p(iD)) {
                z11 = true;
                iD = -1;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        n2.D.b bVar3 = new n2.D.b(obj, j12, iD);
        boolean zC = C(bVar3);
        boolean zE = E(f10, bVar3);
        boolean zD = D(f10, bVar3, zC);
        boolean z12 = (iD == -1 || !this.f18206a.r(iD) || this.f18206a.q(iD)) ? false : true;
        boolean z13 = iD != -1 && this.f18206a.q(iD) && this.f18206a.r(iD);
        if (iD == -1 || z13) {
            if (z11) {
                jF = this.f18206a.f9925d;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != -9223372036854775807L || j13 == Long.MIN_VALUE) {
                j14 = this.f18206a.f9925d;
            } else {
                j14 = j13;
            }
            if (j14 != -9223372036854775807L && jMax >= j14) {
                if (!zD && z11) {
                    i10 = 0;
                }
                jMax = Math.max(0L, j14 - ((long) i10));
            }
            return new X0(bVar3, jMax, j11, j13, j14, z10, z12, zC, zE, zD);
        }
        jF = this.f18206a.f(iD);
        j13 = jF;
        if (j13 != -9223372036854775807L) {
            j14 = this.f18206a.f9925d;
        } else {
            j14 = this.f18206a.f9925d;
        }
        if (j14 != -9223372036854775807L) {
            if (!zD) {
                i10 = 0;
            }
            jMax = Math.max(0L, j14 - ((long) i10));
        }
        return new X0(bVar3, jMax, j11, j13, j14, z10, z12, zC, zE, zD);
    }

    private X0 r(R1.F f10, Object obj, long j10, long j11) {
        n2.D.b bVarP = P(f10, obj, j10, j11, this.f18207b, this.f18206a);
        return bVarP.b() ? p(f10, bVarP.f49482a, bVarP.f49483b, bVarP.f49484c, j10, bVarP.f49485d, false) : q(f10, bVarP.f49482a, j10, -9223372036854775807L, bVarP.f49485d, false);
    }

    private long s(R1.F f10, Object obj, int i10) {
        f10.h(obj, this.f18206a);
        long jF = this.f18206a.f(i10);
        return jF == Long.MIN_VALUE ? this.f18206a.f9925d : jF + this.f18206a.i(i10);
    }

    public void B(R1.F f10) {
        W0 w10;
        if (this.f18214i.f18149a == -9223372036854775807L || (w10 = this.f18218m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairI = i(f10, w10.f18180h.f18190a.f49482a, 0L);
        if (pairI != null && !f10.n(f10.h(pairI.first, this.f18206a).f9924c, this.f18207b).f()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f18211f;
                this.f18211f = 1 + jS;
            }
            X0 x0R = r(f10, pairI.first, ((Long) pairI.second).longValue(), jS);
            W0 w0O = O(x0R);
            if (w0O == null) {
                w0O = this.f18210e.a(x0R, (w10.m() + w10.f18180h.f18194e) - x0R.f18191b);
            }
            arrayList.add(w0O);
        }
        L(arrayList);
    }

    public boolean F(p236n2.C c10) {
        W0 w10 = this.f18218m;
        return w10 != null && w10.f18173a == c10;
    }

    public boolean G(p236n2.C c10) {
        W0 w10 = this.f18219n;
        return w10 != null && w10.f18173a == c10;
    }

    public void I() {
        W0 w10 = this.f18219n;
        if (w10 == null || w10.t()) {
            this.f18219n = null;
            for (int i10 = 0; i10 < this.f18223r.size(); i10++) {
                W0 w11 = (W0) this.f18223r.get(i10);
                if (!w11.t()) {
                    this.f18219n = w11;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        W0 w10 = this.f18218m;
        if (w10 != null) {
            w10.w(j10);
        }
    }

    public void M() {
        if (this.f18223r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(W0 w10) {
        AbstractC1459a.i(w10);
        int i10 = 0;
        if (w10.equals(this.f18218m)) {
            return 0;
        }
        this.f18218m = w10;
        while (w10.k() != null) {
            w10 = (W0) AbstractC1459a.e(w10.k());
            if (w10 == this.f18216k) {
                W0 w11 = this.f18215j;
                this.f18216k = w11;
                this.f18217l = w11;
                i10 = 3;
            }
            if (w10 == this.f18217l) {
                this.f18217l = this.f18216k;
                i10 |= 2;
            }
            w10.x();
            this.f18220o--;
        }
        ((W0) AbstractC1459a.e(this.f18218m)).A(null);
        J();
        return i10;
    }

    public n2.D.b Q(R1.F f10, Object obj, long j10) {
        long jR = R(f10, obj);
        f10.h(obj, this.f18206a);
        f10.n(this.f18206a.f9924c, this.f18207b);
        boolean z10 = false;
        for (int iB = f10.b(obj); iB >= this.f18207b.f9958n; iB--) {
            f10.g(iB, this.f18206a, true);
            boolean z11 = this.f18206a.c() > 0;
            z10 |= z11;
            R1.F.b bVar = this.f18206a;
            if (bVar.e(bVar.f9925d) != -1) {
                obj = AbstractC1459a.e(this.f18206a.f9923b);
            }
            if (z10 && (!z11 || this.f18206a.f9925d != 0)) {
                break;
            }
        }
        return P(f10, obj, j10, jR, this.f18207b, this.f18206a);
    }

    public boolean T() {
        W0 w10 = this.f18218m;
        if (w10 != null) {
            return !w10.f18180h.f18199j && w10.s() && this.f18218m.f18180h.f18194e != -9223372036854775807L && this.f18220o < 100;
        }
        return true;
    }

    public void V(R1.F f10, Q.c cVar) {
        this.f18214i = cVar;
        B(f10);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    public int W(R1.F f10, long j10, long j11, long j12) {
        X0 x0Z;
        boolean z10;
        W0 w0K = this.f18215j;
        W0 w10 = null;
        while (w0K != null) {
            X0 x10 = w0K.f18180h;
            if (w10 == null) {
                x0Z = z(f10, x10);
            } else {
                X0 x0L = l(f10, w10, j10);
                if (x0L == null || !f(x10, x0L)) {
                    return N(w10);
                }
                x0Z = x0L;
            }
            w0K.f18180h = x0Z.a(x10.f18192c);
            if (x10.f18194e != x0Z.f18194e) {
                w0K.E();
                long j13 = x0Z.f18194e;
                long jD = j13 == -9223372036854775807L ? Long.MAX_VALUE : w0K.D(j13);
                boolean z11 = w0K == this.f18216k && !w0K.f18180h.f18196g && (j11 == Long.MIN_VALUE || j11 >= jD);
                boolean z12 = w0K == this.f18217l && (j12 == Long.MIN_VALUE || j12 >= jD);
                int iN = N(w0K);
                if (iN != 0) {
                    return iN;
                }
                long j14 = x10.f18194e;
                if (j14 == -9223372036854775807L && x10.f18193d == Long.MIN_VALUE) {
                    long j15 = x0Z.f18193d;
                    if (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                int i10 = (!z11 || (j14 == -9223372036854775807L && !z10)) ? 0 : 1;
                return z12 ? i10 | 2 : i10;
            }
            w10 = w0K;
            w0K = w0K.k();
        }
        return 0;
    }

    public int X(R1.F f10, int i10) {
        this.f18212g = i10;
        return U(f10);
    }

    public int Y(R1.F f10, boolean z10) {
        this.f18213h = z10;
        return U(f10);
    }

    public W0 b() {
        W0 w10 = this.f18215j;
        if (w10 == null) {
            return null;
        }
        if (w10 == this.f18216k) {
            this.f18216k = w10.k();
        }
        W0 w11 = this.f18215j;
        if (w11 == this.f18217l) {
            this.f18217l = w11.k();
        }
        this.f18215j.x();
        int i10 = this.f18220o - 1;
        this.f18220o = i10;
        if (i10 == 0) {
            this.f18218m = null;
            W0 w12 = this.f18215j;
            this.f18221p = w12.f18174b;
            this.f18222q = w12.f18180h.f18190a.f49485d;
        }
        this.f18215j = this.f18215j.k();
        J();
        return this.f18215j;
    }

    public W0 c() {
        this.f18217l = ((W0) AbstractC1459a.i(this.f18217l)).k();
        J();
        return (W0) AbstractC1459a.i(this.f18217l);
    }

    public W0 d() {
        W0 w10 = this.f18217l;
        W0 w11 = this.f18216k;
        if (w10 == w11) {
            this.f18217l = ((W0) AbstractC1459a.i(w11)).k();
        }
        this.f18216k = ((W0) AbstractC1459a.i(this.f18216k)).k();
        J();
        return (W0) AbstractC1459a.i(this.f18216k);
    }

    public void g() {
        if (this.f18220o == 0) {
            return;
        }
        W0 w0K = (W0) AbstractC1459a.i(this.f18215j);
        this.f18221p = w0K.f18174b;
        this.f18222q = w0K.f18180h.f18190a.f49485d;
        while (w0K != null) {
            w0K.x();
            w0K = w0K.k();
        }
        this.f18215j = null;
        this.f18218m = null;
        this.f18216k = null;
        this.f18217l = null;
        this.f18220o = 0;
        J();
    }

    public W0 h(X0 x10) {
        W0 w10 = this.f18218m;
        long jM = w10 == null ? 1000000000000L : (w10.m() + this.f18218m.f18180h.f18194e) - x10.f18191b;
        W0 w0O = O(x10);
        if (w0O == null) {
            w0O = this.f18210e.a(x10, jM);
        } else {
            w0O.f18180h = x10;
            w0O.B(jM);
        }
        W0 w11 = this.f18218m;
        if (w11 != null) {
            w11.A(w0O);
        } else {
            this.f18215j = w0O;
            this.f18216k = w0O;
            this.f18217l = w0O;
        }
        this.f18221p = null;
        this.f18218m = w0O;
        this.f18220o++;
        J();
        return w0O;
    }

    public W0 n() {
        return this.f18218m;
    }

    public X0 t(long j10, p1 p1Var) {
        W0 w10 = this.f18218m;
        return w10 == null ? j(p1Var) : l(p1Var.f18432a, w10, j10);
    }

    public W0 u() {
        return this.f18215j;
    }

    public W0 v(p236n2.C c10) {
        for (int i10 = 0; i10 < this.f18223r.size(); i10++) {
            W0 w10 = (W0) this.f18223r.get(i10);
            if (w10.f18173a == c10) {
                return w10;
            }
        }
        return null;
    }

    public W0 w() {
        return this.f18219n;
    }

    public W0 x() {
        return this.f18217l;
    }

    public W0 y() {
        return this.f18216k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public X0 z(R1.F f10, X0 x10) {
        long j10;
        long j11;
        int i10;
        boolean zR;
        int i11;
        n2.D.b bVar = x10.f18190a;
        boolean zC = C(bVar);
        boolean zE = E(f10, bVar);
        boolean zD = D(f10, bVar, zC);
        f10.h(x10.f18190a.f49482a, this.f18206a);
        long jF = (bVar.b() || (i11 = bVar.f49486e) == -1) ? -9223372036854775807L : this.f18206a.f(i11);
        if (!bVar.b()) {
            if (jF == -9223372036854775807L || jF == Long.MIN_VALUE) {
                j10 = this.f18206a.j();
            } else {
                j11 = jF;
            }
            if (bVar.b()) {
                zR = this.f18206a.r(bVar.f49483b);
            } else {
                i10 = bVar.f49486e;
                if (i10 == -1 && this.f18206a.r(i10)) {
                    zR = true;
                } else {
                    zR = false;
                }
            }
            return new X0(bVar, x10.f18191b, x10.f18192c, jF, j11, x10.f18195f, zR, zC, zE, zD);
        }
        j10 = this.f18206a.b(bVar.f49483b, bVar.f49484c);
        j11 = j10;
        if (bVar.b()) {
            zR = this.f18206a.r(bVar.f49483b);
        } else {
            i10 = bVar.f49486e;
            if (i10 == -1) {
                zR = false;
            } else {
                zR = false;
            }
        }
        return new X0(bVar, x10.f18191b, x10.f18192c, jF, j11, x10.f18195f, zR, zC, zE, zD);
    }
}
