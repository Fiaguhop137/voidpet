package p040c3;

import R1.r;
import U1.AbstractC1459a;
import U1.F;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC2111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f27123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v2.F.a f27124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O f27128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f27129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f27136n;

    public t(String str) {
        this(null, 0, str);
    }

    public t(String str, int i10, String str2) {
        this.f27130h = 0;
        F f10 = new F(4);
        this.f27123a = f10;
        f10.f()[0] = -1;
        this.f27124b = new v2.F.a();
        this.f27136n = -9223372036854775807L;
        this.f27125c = str;
        this.f27126d = i10;
        this.f27127e = str2;
    }

    private void b(F f10) {
        byte[] bArrF = f10.f();
        int iJ = f10.j();
        for (int iG = f10.g(); iG < iJ; iG++) {
            byte b10 = bArrF[iG];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f27133k && (b10 & 224) == 224;
            this.f27133k = z10;
            if (z11) {
                f10.a0(iG + 1);
                this.f27133k = false;
                this.f27123a.f()[1] = bArrF[iG];
                this.f27131i = 2;
                this.f27130h = 1;
                return;
            }
        }
        f10.a0(iJ);
    }

    private void g(F f10) {
        int iMin = Math.min(f10.a(), this.f27135m - this.f27131i);
        this.f27128f.f(f10, iMin);
        int i10 = this.f27131i + iMin;
        this.f27131i = i10;
        if (i10 < this.f27135m) {
            return;
        }
        AbstractC1459a.g(this.f27136n != -9223372036854775807L);
        this.f27128f.c(this.f27136n, 1, this.f27135m, 0, null);
        this.f27136n += this.f27134l;
        this.f27131i = 0;
        this.f27130h = 0;
    }

    private void h(F f10) {
        int iMin = Math.min(f10.a(), 4 - this.f27131i);
        f10.q(this.f27123a.f(), this.f27131i, iMin);
        int i10 = this.f27131i + iMin;
        this.f27131i = i10;
        if (i10 < 4) {
            return;
        }
        this.f27123a.a0(0);
        if (!this.f27124b.a(this.f27123a.u())) {
            this.f27131i = 0;
            this.f27130h = 1;
            return;
        }
        v2.F.a aVar = this.f27124b;
        this.f27135m = aVar.f55964c;
        if (!this.f27132j) {
            this.f27134l = (((long) aVar.f55968g) * 1000000) / ((long) aVar.f55965d);
            this.f27128f.b(new r.b().j0(this.f27129g).W(this.f27127e).y0(this.f27124b.f55963b).o0(4096).T(this.f27124b.f55966e).z0(this.f27124b.f55965d).n0(this.f27125c).w0(this.f27126d).P());
            this.f27132j = true;
        }
        this.f27123a.a0(0);
        this.f27128f.f(this.f27123a, 4);
        this.f27130h = 2;
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        this.f27130h = 0;
        this.f27131i = 0;
        this.f27133k = false;
        this.f27136n = -9223372036854775807L;
    }

    @Override // p040c3.InterfaceC2111m
    public void c(F f10) {
        AbstractC1459a.i(this.f27128f);
        while (f10.a() > 0) {
            int i10 = this.f27130h;
            if (i10 == 0) {
                b(f10);
            } else if (i10 == 1) {
                h(f10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(f10);
            }
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
    }

    @Override // p040c3.InterfaceC2111m
    public void e(p380v2.r rVar, L.d dVar) {
        dVar.a();
        this.f27129g = dVar.b();
        this.f27128f = rVar.f(dVar.c(), 1);
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        this.f27136n = j10;
    }
}
