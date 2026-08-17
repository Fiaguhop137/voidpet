package A2;

import R1.x;
import R1.z;
import U1.AbstractC1459a;
import U1.F;
import U1.S;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.O;
import p380v2.r;
import p380v2.u;
import p380v2.v;
import p380v2.w;
import p380v2.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC4253p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f137o = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O f143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x f145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f151n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f138a = new byte[42];
        this.f139b = new F(new byte[32768], 0);
        this.f140c = (i10 & 1) != 0;
        this.f141d = new v.a();
        this.f144g = 0;
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new d()};
    }

    private long d(F f10, boolean z10) {
        boolean zD;
        AbstractC1459a.e(this.f146i);
        int iG = f10.g();
        while (iG <= f10.j() - 16) {
            f10.a0(iG);
            if (v.d(f10, this.f146i, this.f148k, this.f141d)) {
                f10.a0(iG);
                return this.f141d.f56146a;
            }
            iG++;
        }
        if (!z10) {
            f10.a0(iG);
            return -1L;
        }
        while (iG <= f10.j() - this.f147j) {
            f10.a0(iG);
            try {
                zD = v.d(f10, this.f146i, this.f148k, this.f141d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (f10.g() <= f10.j() ? zD : false) {
                f10.a0(iG);
                return this.f141d.f56146a;
            }
            iG++;
        }
        f10.a0(f10.j());
        return -1L;
    }

    private void e(InterfaceC4254q interfaceC4254q) {
        this.f148k = w.b(interfaceC4254q);
        ((r) S.i(this.f142e)).p(h(interfaceC4254q.getPosition(), interfaceC4254q.getLength()));
        this.f144g = 5;
    }

    private J h(long j10, long j11) {
        AbstractC1459a.e(this.f146i);
        y yVar = this.f146i;
        y.a aVar = yVar.f56160k;
        if (aVar != null && aVar.f56162a.length > 0) {
            return new p380v2.x(yVar, j10);
        }
        if (j11 == -1 || yVar.f56159j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f148k, j10, j11);
        this.f149l = bVar;
        return bVar.b();
    }

    private void i(InterfaceC4254q interfaceC4254q) {
        byte[] bArr = this.f138a;
        interfaceC4254q.o(bArr, 0, bArr.length);
        interfaceC4254q.d();
        this.f144g = 2;
    }

    private void l() {
        ((O) S.i(this.f143f)).c((this.f151n * 1000000) / ((long) ((y) S.i(this.f146i)).f56154e), 1, this.f150m, 0, null);
    }

    private int m(InterfaceC4254q interfaceC4254q, I i10) {
        boolean z10;
        AbstractC1459a.e(this.f143f);
        AbstractC1459a.e(this.f146i);
        b bVar = this.f149l;
        if (bVar != null && bVar.d()) {
            return this.f149l.c(interfaceC4254q, i10);
        }
        if (this.f151n == -1) {
            this.f151n = v.i(interfaceC4254q, this.f146i);
            return 0;
        }
        int iJ = this.f139b.j();
        if (iJ < 32768) {
            int i11 = interfaceC4254q.read(this.f139b.f(), iJ, 32768 - iJ);
            z10 = i11 == -1;
            if (!z10) {
                this.f139b.Z(iJ + i11);
            } else if (this.f139b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iG = this.f139b.g();
        int i12 = this.f150m;
        int i13 = this.f147j;
        if (i12 < i13) {
            F f10 = this.f139b;
            f10.b0(Math.min(i13 - i12, f10.a()));
        }
        long jD = d(this.f139b, z10);
        int iG2 = this.f139b.g() - iG;
        this.f139b.a0(iG);
        this.f143f.f(this.f139b, iG2);
        this.f150m += iG2;
        if (jD != -1) {
            l();
            this.f150m = 0;
            this.f151n = jD;
        }
        int length = this.f139b.f().length - this.f139b.j();
        if (this.f139b.a() < 16 && length < 16) {
            int iA = this.f139b.a();
            System.arraycopy(this.f139b.f(), this.f139b.g(), this.f139b.f(), 0, iA);
            this.f139b.a0(0);
            this.f139b.Z(iA);
        }
        return 0;
    }

    private void n(InterfaceC4254q interfaceC4254q) {
        this.f145h = w.d(interfaceC4254q, !this.f140c);
        this.f144g = 1;
    }

    private void o(InterfaceC4254q interfaceC4254q) {
        w.a aVar = new w.a(this.f146i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC4254q, aVar);
            this.f146i = (y) S.i(aVar.f56147a);
        }
        AbstractC1459a.e(this.f146i);
        this.f147j = Math.max(this.f146i.f56152c, 6);
        ((O) S.i(this.f143f)).b(this.f146i.g(this.f138a, this.f145h).b().W("audio/flac").P());
        ((O) S.i(this.f143f)).d(this.f146i.f());
        this.f144g = 4;
    }

    private void p(InterfaceC4254q interfaceC4254q) throws z {
        w.i(interfaceC4254q);
        this.f144g = 3;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f144g = 0;
        } else {
            b bVar = this.f149l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f151n = j11 != 0 ? -1L : 0L;
        this.f150m = 0;
        this.f139b.W(0);
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        this.f142e = rVar;
        this.f143f = rVar.f(0, 1);
        rVar.t();
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        w.c(interfaceC4254q, false);
        return w.a(interfaceC4254q);
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        int i11 = this.f144g;
        if (i11 == 0) {
            n(interfaceC4254q);
            return 0;
        }
        if (i11 == 1) {
            i(interfaceC4254q);
            return 0;
        }
        if (i11 == 2) {
            p(interfaceC4254q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC4254q);
            return 0;
        }
        if (i11 == 4) {
            e(interfaceC4254q);
            return 0;
        }
        if (i11 == 5) {
            return m(interfaceC4254q, i10);
        }
        throw new IllegalStateException();
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
