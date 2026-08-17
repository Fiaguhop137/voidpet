package D2;

import P2.n;
import R1.x;
import S2.s;
import U1.AbstractC1459a;
import U1.F;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
final class b implements InterfaceC4253p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f2114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2117e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private K2.a f2119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC4254q f2120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f2121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f2122j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f2113a = new F(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2118f = -1;

    private void c(InterfaceC4254q interfaceC4254q) {
        this.f2113a.W(2);
        interfaceC4254q.o(this.f2113a.f(), 0, 2);
        interfaceC4254q.i(this.f2113a.T() - 2);
    }

    private void d() {
        ((r) AbstractC1459a.e(this.f2114b)).t();
        this.f2114b.p(new J.b(-9223372036854775807L));
        this.f2115c = 6;
    }

    private static K2.a e(String str, long j10) {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void h(K2.a aVar) {
        ((r) AbstractC1459a.e(this.f2114b)).f(1024, 4).b(new R1.r.b().W("image/jpeg").r0(new x(aVar)).P());
    }

    private int i(InterfaceC4254q interfaceC4254q) {
        this.f2113a.W(2);
        interfaceC4254q.o(this.f2113a.f(), 0, 2);
        return this.f2113a.T();
    }

    private void l(InterfaceC4254q interfaceC4254q) {
        this.f2113a.W(2);
        interfaceC4254q.readFully(this.f2113a.f(), 0, 2);
        int iT = this.f2113a.T();
        this.f2116d = iT;
        if (iT == 65498) {
            if (this.f2118f != -1) {
                this.f2115c = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((iT < 65488 || iT > 65497) && iT != 65281) {
            this.f2115c = 1;
        }
    }

    private void m(InterfaceC4254q interfaceC4254q) {
        String strF;
        if (this.f2116d == 65505) {
            F f10 = new F(this.f2117e);
            interfaceC4254q.readFully(f10.f(), 0, this.f2117e);
            if (this.f2119g == null && "http://ns.adobe.com/xap/1.0/".equals(f10.F()) && (strF = f10.F()) != null) {
                K2.a aVarE = e(strF, interfaceC4254q.getLength());
                this.f2119g = aVarE;
                if (aVarE != null) {
                    this.f2118f = aVarE.f5895d;
                }
            }
        } else {
            interfaceC4254q.l(this.f2117e);
        }
        this.f2115c = 0;
    }

    private void n(InterfaceC4254q interfaceC4254q) {
        this.f2113a.W(2);
        interfaceC4254q.readFully(this.f2113a.f(), 0, 2);
        this.f2117e = this.f2113a.T() - 2;
        this.f2115c = 2;
    }

    private void o(InterfaceC4254q interfaceC4254q) {
        if (!interfaceC4254q.c(this.f2113a.f(), 0, 1, true)) {
            d();
            return;
        }
        interfaceC4254q.d();
        if (this.f2122j == null) {
            this.f2122j = new n(s.a.f11528a, 8);
        }
        d dVar = new d(interfaceC4254q, this.f2118f);
        this.f2121i = dVar;
        if (!this.f2122j.f(dVar)) {
            d();
        } else {
            this.f2122j.b(new e(this.f2118f, (r) AbstractC1459a.e(this.f2114b)));
            p();
        }
    }

    private void p() {
        h((K2.a) AbstractC1459a.e(this.f2119g));
        this.f2115c = 5;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f2115c = 0;
            this.f2122j = null;
        } else if (this.f2115c == 5) {
            ((n) AbstractC1459a.e(this.f2122j)).a(j10, j11);
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f2114b = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        if (i(interfaceC4254q) != 65496) {
            return false;
        }
        int i10 = i(interfaceC4254q);
        this.f2116d = i10;
        if (i10 == 65504) {
            c(interfaceC4254q);
            this.f2116d = i(interfaceC4254q);
        }
        return this.f2116d == 65505;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        int i11 = this.f2115c;
        if (i11 == 0) {
            l(interfaceC4254q);
            return 0;
        }
        if (i11 == 1) {
            n(interfaceC4254q);
            return 0;
        }
        if (i11 == 2) {
            m(interfaceC4254q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC4254q.getPosition();
            long j10 = this.f2118f;
            if (position != j10) {
                i10.f55969a = j10;
                return 1;
            }
            o(interfaceC4254q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f2121i == null || interfaceC4254q != this.f2120h) {
            this.f2120h = interfaceC4254q;
            this.f2121i = new d(interfaceC4254q, this.f2118f);
        }
        int iJ = ((n) AbstractC1459a.e(this.f2122j)).j(this.f2121i, i10);
        if (iJ == 1) {
            i10.f55969a += this.f2118f;
        }
        return iJ;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
        n nVar = this.f2122j;
        if (nVar != null) {
            nVar.release();
        }
    }
}
