package p040c3;

import R1.r;
import R1.z;
import U1.AbstractC1459a;
import U1.E;
import U1.F;
import java.util.Collections;
import p380v2.AbstractC4238a;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC2111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f27103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f27104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O f27105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f27106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f27107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f27112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27114o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f27118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f27120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f27122w;

    public s(String str, int i10, String str2) {
        this.f27100a = str;
        this.f27101b = i10;
        this.f27102c = str2;
        F f10 = new F(1024);
        this.f27103d = f10;
        this.f27104e = new E(f10.f());
        this.f27112m = -9223372036854775807L;
    }

    private static long b(E e10) {
        return e10.h((e10.h(2) + 1) * 8);
    }

    private void g(E e10) throws z {
        if (!e10.g()) {
            this.f27113n = true;
            l(e10);
        } else if (!this.f27113n) {
            return;
        }
        if (this.f27114o != 0) {
            throw z.a(null, null);
        }
        if (this.f27115p != 0) {
            throw z.a(null, null);
        }
        k(e10, j(e10));
        if (this.f27117r) {
            e10.r((int) this.f27118s);
        }
    }

    private int h(E e10) throws z {
        int iB = e10.b();
        AbstractC4238a.b bVarE = AbstractC4238a.e(e10, true);
        this.f27122w = bVarE.f56022c;
        this.f27119t = bVarE.f56020a;
        this.f27121v = bVarE.f56021b;
        return iB - e10.b();
    }

    private void i(E e10) {
        int iH = e10.h(3);
        this.f27116q = iH;
        if (iH == 0) {
            e10.r(8);
            return;
        }
        if (iH == 1) {
            e10.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            e10.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            e10.r(1);
        }
    }

    private int j(E e10) throws z {
        int iH;
        if (this.f27116q != 0) {
            throw z.a(null, null);
        }
        int i10 = 0;
        do {
            iH = e10.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void k(E e10, int i10) {
        int iE = e10.e();
        if ((iE & 7) == 0) {
            this.f27103d.a0(iE >> 3);
        } else {
            e10.i(this.f27103d.f(), 0, i10 * 8);
            this.f27103d.a0(0);
        }
        this.f27105f.f(this.f27103d, i10);
        AbstractC1459a.g(this.f27112m != -9223372036854775807L);
        this.f27105f.c(this.f27112m, 1, i10, 0, null);
        this.f27112m += this.f27120u;
    }

    private void l(E e10) throws z {
        boolean zG;
        int iH = e10.h(1);
        int iH2 = iH == 1 ? e10.h(1) : 0;
        this.f27114o = iH2;
        if (iH2 != 0) {
            throw z.a(null, null);
        }
        if (iH == 1) {
            b(e10);
        }
        if (!e10.g()) {
            throw z.a(null, null);
        }
        this.f27115p = e10.h(6);
        int iH3 = e10.h(4);
        int iH4 = e10.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw z.a(null, null);
        }
        if (iH == 0) {
            int iE = e10.e();
            int iH5 = h(e10);
            e10.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            e10.i(bArr, 0, iH5);
            r rVarP = new r.b().j0(this.f27106g).W(this.f27102c).y0("audio/mp4a-latm").U(this.f27122w).T(this.f27121v).z0(this.f27119t).k0(Collections.singletonList(bArr)).n0(this.f27100a).w0(this.f27101b).P();
            if (!rVarP.equals(this.f27107h)) {
                this.f27107h = rVarP;
                this.f27120u = 1024000000 / ((long) rVarP.f10253H);
                this.f27105f.b(rVarP);
            }
        } else {
            e10.r(((int) b(e10)) - h(e10));
        }
        i(e10);
        boolean zG2 = e10.g();
        this.f27117r = zG2;
        this.f27118s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f27118s = b(e10);
            } else {
                do {
                    zG = e10.g();
                    this.f27118s = (this.f27118s << 8) + ((long) e10.h(8));
                } while (zG);
            }
        }
        if (e10.g()) {
            e10.r(8);
        }
    }

    private void m(int i10) {
        this.f27103d.W(i10);
        this.f27104e.n(this.f27103d.f());
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        this.f27108i = 0;
        this.f27112m = -9223372036854775807L;
        this.f27113n = false;
    }

    @Override // p040c3.InterfaceC2111m
    public void c(F f10) throws z {
        AbstractC1459a.i(this.f27105f);
        while (f10.a() > 0) {
            int i10 = this.f27108i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iL = f10.L();
                    if ((iL & 224) == 224) {
                        this.f27111l = iL;
                        this.f27108i = 2;
                    } else if (iL != 86) {
                        this.f27108i = 0;
                    }
                } else if (i10 == 2) {
                    int iL2 = ((this.f27111l & (-225)) << 8) | f10.L();
                    this.f27110k = iL2;
                    if (iL2 > this.f27103d.f().length) {
                        m(this.f27110k);
                    }
                    this.f27109j = 0;
                    this.f27108i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(f10.a(), this.f27110k - this.f27109j);
                    f10.q(this.f27104e.f12848a, this.f27109j, iMin);
                    int i11 = this.f27109j + iMin;
                    this.f27109j = i11;
                    if (i11 == this.f27110k) {
                        this.f27104e.p(0);
                        g(this.f27104e);
                        this.f27108i = 0;
                    }
                }
            } else if (f10.L() == 86) {
                this.f27108i = 1;
            }
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
    }

    @Override // p040c3.InterfaceC2111m
    public void e(p380v2.r rVar, L.d dVar) {
        dVar.a();
        this.f27105f = rVar.f(dVar.c(), 1);
        this.f27106g = dVar.b();
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        this.f27112m = j10;
    }
}
