package p040c3;

import R1.r;
import U1.AbstractC1459a;
import U1.E;
import U1.F;
import java.util.Objects;
import p380v2.AbstractC4239b;
import p380v2.O;

/* JADX INFO: renamed from: c3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2101c implements InterfaceC2111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f26868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f26869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f26874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f26879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f26881n;

    public C2101c(String str) {
        this(null, 0, str);
    }

    public C2101c(String str, int i10, String str2) {
        E e10 = new E(new byte[128]);
        this.f26868a = e10;
        this.f26869b = new F(e10.f12848a);
        this.f26875h = 0;
        this.f26881n = -9223372036854775807L;
        this.f26870c = str;
        this.f26871d = i10;
        this.f26872e = str2;
    }

    private boolean b(F f10, byte[] bArr, int i10) {
        int iMin = Math.min(f10.a(), i10 - this.f26876i);
        f10.q(bArr, this.f26876i, iMin);
        int i11 = this.f26876i + iMin;
        this.f26876i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f26868a.p(0);
        AbstractC4239b.C0710b c0710bF = AbstractC4239b.f(this.f26868a);
        r rVar = this.f26879l;
        if (rVar == null || c0710bF.f56032d != rVar.f10252G || c0710bF.f56031c != rVar.f10253H || !Objects.equals(c0710bF.f56029a, rVar.f10277o)) {
            r.b bVarT0 = new r.b().j0(this.f26873f).W(this.f26872e).y0(c0710bF.f56029a).T(c0710bF.f56032d).z0(c0710bF.f56031c).n0(this.f26870c).w0(this.f26871d).t0(c0710bF.f56035g);
            if ("audio/ac3".equals(c0710bF.f56029a)) {
                bVarT0.S(c0710bF.f56035g);
            }
            r rVarP = bVarT0.P();
            this.f26879l = rVarP;
            this.f26874g.b(rVarP);
        }
        this.f26880m = c0710bF.f56033e;
        this.f26878k = (((long) c0710bF.f56034f) * 1000000) / ((long) this.f26879l.f10253H);
    }

    private boolean h(F f10) {
        while (true) {
            if (f10.a() <= 0) {
                return false;
            }
            if (this.f26877j) {
                int iL = f10.L();
                if (iL == 119) {
                    this.f26877j = false;
                    return true;
                }
                this.f26877j = iL == 11;
            } else {
                this.f26877j = f10.L() == 11;
            }
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        this.f26875h = 0;
        this.f26876i = 0;
        this.f26877j = false;
        this.f26881n = -9223372036854775807L;
    }

    @Override // p040c3.InterfaceC2111m
    public void c(F f10) {
        AbstractC1459a.i(this.f26874g);
        while (f10.a() > 0) {
            int i10 = this.f26875h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(f10.a(), this.f26880m - this.f26876i);
                        this.f26874g.f(f10, iMin);
                        int i11 = this.f26876i + iMin;
                        this.f26876i = i11;
                        if (i11 == this.f26880m) {
                            AbstractC1459a.g(this.f26881n != -9223372036854775807L);
                            this.f26874g.c(this.f26881n, 1, this.f26880m, 0, null);
                            this.f26881n += this.f26878k;
                            this.f26875h = 0;
                        }
                    }
                } else if (b(f10, this.f26869b.f(), 128)) {
                    g();
                    this.f26869b.a0(0);
                    this.f26874g.f(this.f26869b, 128);
                    this.f26875h = 2;
                }
            } else if (h(f10)) {
                this.f26875h = 1;
                this.f26869b.f()[0] = 11;
                this.f26869b.f()[1] = 119;
                this.f26876i = 2;
            }
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
    }

    @Override // p040c3.InterfaceC2111m
    public void e(p380v2.r rVar, L.d dVar) {
        dVar.a();
        this.f26873f = dVar.b();
        this.f26874g = rVar.f(dVar.c(), 1);
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        this.f26881n = j10;
    }
}
