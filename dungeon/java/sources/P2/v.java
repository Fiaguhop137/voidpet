package P2;

import U1.F;
import p380v2.InterfaceC4254q;

/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f8777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8782f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8788l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f8790n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8794r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f8783g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f8784h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f8785i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f8786j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f8787k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f8789m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F f8791o = new F();

    public void a(F f10) {
        f10.q(this.f8791o.f(), 0, this.f8791o.j());
        this.f8791o.a0(0);
        this.f8792p = false;
    }

    public void b(InterfaceC4254q interfaceC4254q) {
        interfaceC4254q.readFully(this.f8791o.f(), 0, this.f8791o.j());
        this.f8791o.a0(0);
        this.f8792p = false;
    }

    public long c(int i10) {
        return this.f8786j[i10];
    }

    public void d(int i10) {
        this.f8791o.W(i10);
        this.f8788l = true;
        this.f8792p = true;
    }

    public void e(int i10, int i11) {
        this.f8781e = i10;
        this.f8782f = i11;
        if (this.f8784h.length < i10) {
            this.f8783g = new long[i10];
            this.f8784h = new int[i10];
        }
        if (this.f8785i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f8785i = new int[i12];
            this.f8786j = new long[i12];
            this.f8787k = new boolean[i12];
            this.f8789m = new boolean[i12];
        }
    }

    public void f() {
        this.f8781e = 0;
        this.f8793q = 0L;
        this.f8794r = false;
        this.f8788l = false;
        this.f8792p = false;
        this.f8790n = null;
    }

    public boolean g(int i10) {
        return this.f8788l && this.f8789m[i10];
    }
}
