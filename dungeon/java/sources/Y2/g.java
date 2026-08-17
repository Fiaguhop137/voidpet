package Y2;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16886e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f16892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f16893l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f16896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f16897p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f16899r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f16901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f16902u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16887f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16888g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16889h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16890i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16891j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16894m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16895n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16898q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f16900s = Float.MAX_VALUE;

    private g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f16884c && gVar.f16884c) {
                z(gVar.f16883b);
            }
            if (this.f16889h == -1) {
                this.f16889h = gVar.f16889h;
            }
            if (this.f16890i == -1) {
                this.f16890i = gVar.f16890i;
            }
            if (this.f16882a == null && (str = gVar.f16882a) != null) {
                this.f16882a = str;
            }
            if (this.f16887f == -1) {
                this.f16887f = gVar.f16887f;
            }
            if (this.f16888g == -1) {
                this.f16888g = gVar.f16888g;
            }
            if (this.f16895n == -1) {
                this.f16895n = gVar.f16895n;
            }
            if (this.f16896o == null && (alignment2 = gVar.f16896o) != null) {
                this.f16896o = alignment2;
            }
            if (this.f16897p == null && (alignment = gVar.f16897p) != null) {
                this.f16897p = alignment;
            }
            if (this.f16898q == -1) {
                this.f16898q = gVar.f16898q;
            }
            if (this.f16891j == -1) {
                this.f16891j = gVar.f16891j;
                this.f16892k = gVar.f16892k;
            }
            if (this.f16899r == null) {
                this.f16899r = gVar.f16899r;
            }
            if (this.f16900s == Float.MAX_VALUE) {
                this.f16900s = gVar.f16900s;
            }
            if (this.f16901t == null) {
                this.f16901t = gVar.f16901t;
            }
            if (this.f16902u == null) {
                this.f16902u = gVar.f16902u;
            }
            if (z10 && !this.f16886e && gVar.f16886e) {
                w(gVar.f16885d);
            }
            if (z10 && this.f16894m == -1 && (i10 = gVar.f16894m) != -1) {
                this.f16894m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f16882a = str;
        return this;
    }

    public g B(float f10) {
        this.f16892k = f10;
        return this;
    }

    public g C(int i10) {
        this.f16891j = i10;
        return this;
    }

    public g D(String str) {
        this.f16893l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f16890i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f16887f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f16897p = alignment;
        return this;
    }

    public g H(String str) {
        this.f16901t = str;
        return this;
    }

    public g I(int i10) {
        this.f16895n = i10;
        return this;
    }

    public g J(int i10) {
        this.f16894m = i10;
        return this;
    }

    public g K(float f10) {
        this.f16900s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f16896o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f16898q = z10 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f16899r = bVar;
        return this;
    }

    public g O(boolean z10) {
        this.f16888g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f16886e) {
            return this.f16885d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f16902u;
    }

    public int d() {
        if (this.f16884c) {
            return this.f16883b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f16882a;
    }

    public float f() {
        return this.f16892k;
    }

    public int g() {
        return this.f16891j;
    }

    public String h() {
        return this.f16893l;
    }

    public Layout.Alignment i() {
        return this.f16897p;
    }

    public String j() {
        return this.f16901t;
    }

    public int k() {
        return this.f16895n;
    }

    public int l() {
        return this.f16894m;
    }

    public float m() {
        return this.f16900s;
    }

    public int n() {
        int i10 = this.f16889h;
        if (i10 == -1 && this.f16890i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f16890i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f16896o;
    }

    public boolean p() {
        return this.f16898q == 1;
    }

    public b q() {
        return this.f16899r;
    }

    public boolean r() {
        return this.f16886e;
    }

    public boolean s() {
        return this.f16884c;
    }

    public boolean u() {
        return this.f16887f == 1;
    }

    public boolean v() {
        return this.f16888g == 1;
    }

    public g w(int i10) {
        this.f16885d = i10;
        this.f16886e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f16889h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f16902u = str;
        return this;
    }

    public g z(int i10) {
        this.f16883b = i10;
        this.f16884c = true;
        return this;
    }
}
