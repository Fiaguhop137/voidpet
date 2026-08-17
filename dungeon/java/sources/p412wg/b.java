package p412wg;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f57006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f57007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f57008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f57009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f57010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f57011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f57012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f57013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f57014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f57016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f57017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f57018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f57019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f57020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a f57021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f57022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final boolean f57023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final g f57024w;

    public b(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        this.f57017p = i11;
        this.f57022u = z10;
        this.f57023v = z11;
        this.f57002a = i10;
        if (i10 == 2) {
            this.f57003b = 10;
            this.f57004c = 3;
        } else {
            if (i10 == 3) {
                this.f57003b = 8;
                i12 = 4;
            } else {
                i12 = 6;
                this.f57003b = 6;
            }
            this.f57004c = i12;
        }
        this.f57024w = z10 ? new g.a() : new g.b();
        if (z11) {
            this.f57006e = 12;
            this.f57005d = 64;
        } else {
            this.f57006e = 13;
            this.f57005d = (this.f57003b * 256) / 8;
        }
        int i13 = this.f57006e;
        int i14 = (i13 * 256) / 8;
        this.f57007f = i14;
        int i15 = i14 * i10;
        this.f57008g = i15;
        this.f57009h = 320;
        int i16 = i10 * 320;
        this.f57010i = i16;
        int i17 = this.f57004c;
        int i18 = (i17 * 256) / 8;
        this.f57011j = i18;
        int i19 = i16 + 32;
        this.f57012k = i19;
        this.f57013l = i15;
        this.f57014m = i19;
        this.f57015n = i15 + i19 + 64;
        this.f57016o = i16 + i18;
        this.f57018q = 1 << (i13 - 11);
        this.f57019r = (256 - (1 << (9 - i17))) + (1 << (i13 - 11));
        this.f57020s = new h(this);
        this.f57021t = new a(this);
    }

    public int a() {
        return 10;
    }

    public int b() {
        return this.f57004c;
    }

    public int c() {
        return 32;
    }

    public int d() {
        return this.f57002a;
    }

    public int e() {
        return 256;
    }

    public int f() {
        return this.f57007f;
    }

    public h g() {
        return this.f57020s;
    }
}
