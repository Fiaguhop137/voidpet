package B2;

import U1.AbstractC1459a;
import U1.F;
import p380v2.E;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC4253p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f532q = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f538f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f548p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f533a = new F(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f534b = new F(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f535c = new F(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f536d = new F();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f537e = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f539g = 1;

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new c()};
    }

    private void d() {
        if (this.f546n) {
            return;
        }
        this.f538f.p(new J.b(-9223372036854775807L));
        this.f546n = true;
    }

    private long e() {
        if (this.f540h) {
            return this.f541i + this.f545m;
        }
        if (this.f537e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f545m;
    }

    private F h(InterfaceC4254q interfaceC4254q) {
        if (this.f544l > this.f536d.b()) {
            F f10 = this.f536d;
            f10.Y(new byte[Math.max(f10.b() * 2, this.f544l)], 0);
        } else {
            this.f536d.a0(0);
        }
        this.f536d.Z(this.f544l);
        interfaceC4254q.readFully(this.f536d.f(), 0, this.f544l);
        return this.f536d;
    }

    private boolean i(InterfaceC4254q interfaceC4254q) {
        if (!interfaceC4254q.g(this.f534b.f(), 0, 9, true)) {
            return false;
        }
        this.f534b.a0(0);
        this.f534b.b0(4);
        int iL = this.f534b.L();
        boolean z10 = (iL & 4) != 0;
        boolean z11 = (iL & 1) != 0;
        if (z10 && this.f547o == null) {
            this.f547o = new a(this.f538f.f(8, 1));
        }
        if (z11 && this.f548p == null) {
            this.f548p = new f(this.f538f.f(9, 2));
        }
        this.f538f.t();
        this.f542j = this.f534b.u() - 5;
        this.f539g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean l(InterfaceC4254q interfaceC4254q) {
        boolean zA;
        boolean z10;
        long j10;
        long jE = e();
        int i10 = this.f543k;
        if (i10 == 8 && this.f547o != null) {
            d();
            zA = this.f547o.a(h(interfaceC4254q), jE);
        } else {
            if (i10 != 9 || this.f548p == null) {
                if (i10 != 18 || this.f546n) {
                    interfaceC4254q.l(this.f544l);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f537e.a(h(interfaceC4254q), jE);
                    long jD = this.f537e.d();
                    if (jD != -9223372036854775807L) {
                        this.f538f.p(new E(this.f537e.e(), this.f537e.f(), jD));
                        this.f546n = true;
                    }
                }
                if (!this.f540h && zA) {
                    this.f540h = true;
                    if (this.f537e.d() == -9223372036854775807L) {
                        j10 = -this.f545m;
                    } else {
                        j10 = 0;
                    }
                    this.f541i = j10;
                }
                this.f542j = 4;
                this.f539g = 2;
                return z10;
            }
            d();
            zA = this.f548p.a(h(interfaceC4254q), jE);
        }
        z10 = true;
        if (!this.f540h) {
            this.f540h = true;
            if (this.f537e.d() == -9223372036854775807L) {
                j10 = -this.f545m;
            } else {
                j10 = 0;
            }
            this.f541i = j10;
        }
        this.f542j = 4;
        this.f539g = 2;
        return z10;
    }

    private boolean m(InterfaceC4254q interfaceC4254q) {
        if (!interfaceC4254q.g(this.f535c.f(), 0, 11, true)) {
            return false;
        }
        this.f535c.a0(0);
        this.f543k = this.f535c.L();
        this.f544l = this.f535c.O();
        this.f545m = this.f535c.O();
        this.f545m = (((long) (this.f535c.L() << 24)) | this.f545m) * 1000;
        this.f535c.b0(3);
        this.f539g = 4;
        return true;
    }

    private void n(InterfaceC4254q interfaceC4254q) {
        interfaceC4254q.l(this.f542j);
        this.f542j = 0;
        this.f539g = 3;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f539g = 1;
            this.f540h = false;
        } else {
            this.f539g = 3;
        }
        this.f542j = 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f538f = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        interfaceC4254q.o(this.f533a.f(), 0, 3);
        this.f533a.a0(0);
        if (this.f533a.O() != 4607062) {
            return false;
        }
        interfaceC4254q.o(this.f533a.f(), 0, 2);
        this.f533a.a0(0);
        if ((this.f533a.T() & 250) != 0) {
            return false;
        }
        interfaceC4254q.o(this.f533a.f(), 0, 4);
        this.f533a.a0(0);
        int iU = this.f533a.u();
        interfaceC4254q.d();
        interfaceC4254q.i(iU);
        interfaceC4254q.o(this.f533a.f(), 0, 4);
        this.f533a.a0(0);
        return this.f533a.u() == 0;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        AbstractC1459a.i(this.f538f);
        while (true) {
            int i11 = this.f539g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(interfaceC4254q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC4254q)) {
                        return 0;
                    }
                } else if (!m(interfaceC4254q)) {
                    return -1;
                }
            } else if (!i(interfaceC4254q)) {
                return -1;
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
