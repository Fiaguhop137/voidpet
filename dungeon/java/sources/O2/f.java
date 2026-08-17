package O2;

import J2.l;
import J2.n;
import R1.x;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import java.io.EOFException;
import java.math.RoundingMode;
import p380v2.B;
import p380v2.C4251n;
import p380v2.D;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.O;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC4253p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f8329v = new d();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final J2.h.a f8330w = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f8333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v2.F.a f8334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B f8335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D f8336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f8337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f8338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private O f8339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private O f8340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x f8342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f8346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f8348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f8351u;

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f8331a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f8332b = j10;
        this.f8333c = new F(10);
        this.f8334d = new v2.F.a();
        this.f8335e = new B();
        this.f8343m = -9223372036854775807L;
        this.f8336f = new D();
        C4251n c4251n = new C4251n();
        this.f8337g = c4251n;
        this.f8340j = c4251n;
        this.f8346p = -1L;
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new f()};
    }

    public static /* synthetic */ boolean d(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void e() {
        AbstractC1459a.i(this.f8339i);
        S.i(this.f8338h);
    }

    private g h(InterfaceC4254q interfaceC4254q) {
        long jO;
        long j10;
        long jH;
        g gVarS = s(interfaceC4254q);
        c cVarR = r(this.f8342l, interfaceC4254q.getPosition());
        if (this.f8349s) {
            return new g.a();
        }
        if ((this.f8331a & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.m();
                jH = cVarR.h();
            } else {
                if (gVarS != null) {
                    jO = gVarS.m();
                    jH = gVarS.h();
                } else {
                    jO = o(this.f8342l);
                    j10 = -1;
                }
                gVarS = new b(jO, interfaceC4254q.getPosition(), j10);
            }
            j10 = jH;
            gVarS = new b(jO, interfaceC4254q.getPosition(), j10);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        if (gVarS != null && x(gVarS) && gVarS.m() != -9223372036854775807L && (gVarS.h() != -1 || interfaceC4254q.getLength() != -1)) {
            long jD = gVarS.d() != -1 ? gVarS.d() : 0L;
            long jH2 = gVarS.h() != -1 ? gVarS.h() : interfaceC4254q.getLength();
            gVarS = new a(jH2, jD, F9.f.n(S.d1(jH2 - jD, 8000000L, gVarS.m(), RoundingMode.HALF_UP)), -1, false);
        } else if (gVarS == null || x(gVarS)) {
            gVarS = n(interfaceC4254q, (this.f8331a & 2) != 0);
        }
        this.f8339i.d(gVarS.m());
        return gVarS;
    }

    private long i(long j10) {
        return this.f8343m + ((j10 * 1000000) / ((long) this.f8334d.f55965d));
    }

    private g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f8360c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f8358a.f55964c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f8358a.f55964c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + ((long) iVar.f8358a.f55964c), F9.f.e(S.d1(j16, 8000000L, jA, roundingMode)), F9.f.e(E9.e.b(j16, iVar.f8359b, roundingMode)), false);
    }

    private g n(InterfaceC4254q interfaceC4254q, boolean z10) {
        interfaceC4254q.o(this.f8333c.f(), 0, 4);
        this.f8333c.a0(0);
        this.f8334d.a(this.f8333c.u());
        return new a(interfaceC4254q.getLength(), interfaceC4254q.getPosition(), this.f8334d, z10);
    }

    private static long o(x xVar) {
        if (xVar == null) {
            return -9223372036854775807L;
        }
        int iE = xVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            x.a aVarD = xVar.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f5714a.equals("TLEN")) {
                    return S.M0(Long.parseLong((String) nVar.f5728d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int p(F f10, int i10) {
        if (f10.j() >= i10 + 4) {
            f10.a0(i10);
            int iU = f10.u();
            if (iU == 1483304551 || iU == 1231971951) {
                return iU;
            }
        }
        if (f10.j() < 40) {
            return 0;
        }
        f10.a0(36);
        return f10.u() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean q(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private static c r(x xVar, long j10) {
        if (xVar == null) {
            return null;
        }
        int iE = xVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            x.a aVarD = xVar.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, o(xVar));
            }
        }
        return null;
    }

    private g s(InterfaceC4254q interfaceC4254q) {
        int i10;
        int i11;
        F f10 = new F(this.f8334d.f55964c);
        interfaceC4254q.o(f10.f(), 0, this.f8334d.f55964c);
        v2.F.a aVar = this.f8334d;
        int i12 = 21;
        if ((aVar.f55962a & 1) != 0) {
            if (aVar.f55966e != 1) {
                i12 = 36;
            }
        } else if (aVar.f55966e == 1) {
            i12 = 13;
        }
        int iP = p(f10, i12);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(interfaceC4254q.getLength(), interfaceC4254q.getPosition(), this.f8334d, f10);
                interfaceC4254q.l(this.f8334d.f55964c);
                return hVarA;
            }
            if (iP != 1483304551) {
                interfaceC4254q.d();
                return null;
            }
        }
        i iVarB = i.b(this.f8334d, f10);
        if (!this.f8335e.a() && (i10 = iVarB.f8361d) != -1 && (i11 = iVarB.f8362e) != -1) {
            B b10 = this.f8335e;
            b10.f55932a = i10;
            b10.f55933b = i11;
        }
        long position = interfaceC4254q.getPosition();
        if (interfaceC4254q.getLength() != -1 && iVarB.f8360c != -1 && interfaceC4254q.getLength() != iVarB.f8360c + position) {
            AbstractC1477t.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC4254q.getLength() + ") and Xing frame (" + (iVarB.f8360c + position) + "), using Xing value.");
        }
        interfaceC4254q.l(this.f8334d.f55964c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, interfaceC4254q.getLength());
    }

    private void t() {
        g gVar = this.f8348r;
        if ((gVar instanceof a) && gVar.i()) {
            long j10 = this.f8346p;
            if (j10 == -1 || j10 == this.f8348r.h()) {
                return;
            }
            this.f8348r = ((a) this.f8348r).g(this.f8346p);
            ((r) AbstractC1459a.e(this.f8338h)).p(this.f8348r);
            ((O) AbstractC1459a.e(this.f8339i)).d(this.f8348r.m());
        }
    }

    private boolean u(InterfaceC4254q interfaceC4254q) {
        g gVar = this.f8348r;
        if (gVar != null) {
            long jH = gVar.h();
            if (jH != -1 && interfaceC4254q.h() > jH - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4254q.c(this.f8333c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int v(InterfaceC4254q interfaceC4254q) {
        if (this.f8341k == 0) {
            try {
                y(interfaceC4254q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8348r == null) {
            g gVarH = h(interfaceC4254q);
            this.f8348r = gVarH;
            this.f8338h.p(gVarH);
            R1.r.b bVarR0 = new R1.r.b().W("audio/mpeg").y0(this.f8334d.f55963b).o0(4096).T(this.f8334d.f55966e).z0(this.f8334d.f55965d).d0(this.f8335e.f55932a).e0(this.f8335e.f55933b).r0((this.f8331a & 8) != 0 ? null : this.f8342l);
            if (this.f8348r.l() != -2147483647) {
                bVarR0.S(this.f8348r.l());
            }
            this.f8340j.b(bVarR0.P());
            this.f8345o = interfaceC4254q.getPosition();
        } else if (this.f8345o != 0) {
            long position = interfaceC4254q.getPosition();
            long j10 = this.f8345o;
            if (position < j10) {
                interfaceC4254q.l((int) (j10 - position));
            }
        }
        return w(interfaceC4254q);
    }

    private int w(InterfaceC4254q interfaceC4254q) {
        if (this.f8347q == 0) {
            interfaceC4254q.d();
            if (u(interfaceC4254q)) {
                return -1;
            }
            this.f8333c.a0(0);
            int iU = this.f8333c.u();
            if (!q(iU, this.f8341k) || p380v2.F.j(iU) == -1) {
                interfaceC4254q.l(1);
                this.f8341k = 0;
                return 0;
            }
            this.f8334d.a(iU);
            if (this.f8343m == -9223372036854775807L) {
                this.f8343m = this.f8348r.c(interfaceC4254q.getPosition());
                if (this.f8332b != -9223372036854775807L) {
                    this.f8343m += this.f8332b - this.f8348r.c(0L);
                }
            }
            this.f8347q = this.f8334d.f55964c;
            long position = interfaceC4254q.getPosition();
            v2.F.a aVar = this.f8334d;
            this.f8346p = position + ((long) aVar.f55964c);
            g gVar = this.f8348r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(i(this.f8344n + ((long) aVar.f55968g)), this.f8346p);
                if (this.f8350t && bVar.a(this.f8351u)) {
                    this.f8350t = false;
                    this.f8340j = this.f8339i;
                }
            }
        }
        int iA = this.f8340j.a(interfaceC4254q, this.f8347q, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f8347q - iA;
        this.f8347q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f8340j.c(i(this.f8344n), 1, this.f8334d.f55964c, 0, null);
        this.f8344n += (long) this.f8334d.f55968g;
        this.f8347q = 0;
        return 0;
    }

    private boolean x(g gVar) {
        return (gVar.i() || (this.f8331a & 1) == 0) ? false : true;
    }

    private boolean y(InterfaceC4254q interfaceC4254q, boolean z10) throws EOFException {
        int iH;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        interfaceC4254q.d();
        if (interfaceC4254q.getPosition() == 0) {
            x xVarA = this.f8336f.a(interfaceC4254q, (this.f8331a & 8) == 0 ? null : f8330w);
            this.f8342l = xVarA;
            if (xVarA != null) {
                this.f8335e.c(xVarA);
            }
            iH = (int) interfaceC4254q.h();
            if (!z10) {
                interfaceC4254q.l(iH);
            }
            i10 = 0;
        } else {
            iH = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (u(interfaceC4254q)) {
                if (i12 > 0) {
                    break;
                }
                t();
                throw new EOFException();
            }
            this.f8333c.a0(0);
            int iU = this.f8333c.u();
            if ((i10 == 0 || q(iU, i10)) && (iJ = p380v2.F.j(iU)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f8334d.a(iU);
                    i10 = iU;
                }
                interfaceC4254q.i(iJ - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    t();
                    throw new EOFException();
                }
                if (z10) {
                    interfaceC4254q.d();
                    interfaceC4254q.i(iH + i14);
                } else {
                    interfaceC4254q.l(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            interfaceC4254q.l(iH + i13);
        } else {
            interfaceC4254q.d();
        }
        this.f8341k = i10;
        return true;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f8341k = 0;
        this.f8343m = -9223372036854775807L;
        this.f8344n = 0L;
        this.f8347q = 0;
        this.f8351u = j11;
        g gVar = this.f8348r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f8350t = true;
        this.f8340j = this.f8337g;
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f8338h = rVar;
        O oF = rVar.f(0, 1);
        this.f8339i = oF;
        this.f8340j = oF;
        this.f8338h.t();
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        return y(interfaceC4254q, true);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        e();
        int iV = v(interfaceC4254q);
        if (iV == -1 && (this.f8348r instanceof b)) {
            long jI = i(this.f8344n);
            if (this.f8348r.m() != jI) {
                ((b) this.f8348r).f(jI);
                this.f8338h.p(this.f8348r);
                this.f8339i.d(this.f8348r.m());
            }
        }
        return iV;
    }

    public void l() {
        this.f8349s = true;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
