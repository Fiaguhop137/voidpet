package p232mg;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f49353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f49358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f49359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f49360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f49361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f49362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f49363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f49364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f49365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f49366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f49367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f49368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f49369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g f49370r;

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public a(int i10, boolean z10) {
        int i11;
        g bVar;
        this.f49354b = i10;
        if (i10 != 2) {
            if (i10 == 3) {
                this.f49358f = 2;
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("K: " + i10 + " is not supported for Crystals Kyber");
                }
                this.f49358f = 2;
                this.f49356d = 160;
                i11 = i10 * 352;
            }
            this.f49357e = i11;
            this.f49369q = 32;
            int i12 = i10 * 384;
            this.f49355c = i12;
            int i13 = i12 + 32;
            this.f49359g = i13;
            this.f49360h = i12;
            int i14 = this.f49357e + this.f49356d;
            this.f49361i = i14;
            this.f49362j = i13;
            int i15 = i12 + i13 + 64;
            this.f49363k = i15;
            this.f49364l = i14;
            this.f49365m = 32;
            this.f49366n = i15;
            this.f49367o = i13;
            this.f49368p = i14;
            if (z10) {
                bVar = new g.a();
            } else {
                bVar = new g.b();
            }
            this.f49370r = bVar;
            this.f49353a = new b(this);
        }
        this.f49358f = 3;
        this.f49356d = 128;
        i11 = i10 * 320;
        this.f49357e = i11;
        this.f49369q = 32;
        int i16 = i10 * 384;
        this.f49355c = i16;
        int i17 = i16 + 32;
        this.f49359g = i17;
        this.f49360h = i16;
        int i18 = this.f49357e + this.f49356d;
        this.f49361i = i18;
        this.f49362j = i17;
        int i19 = i16 + i17 + 64;
        this.f49363k = i19;
        this.f49364l = i18;
        this.f49365m = 32;
        this.f49366n = i19;
        this.f49367o = i17;
        this.f49368p = i18;
        if (z10) {
            bVar = new g.a();
        } else {
            bVar = new g.b();
        }
        this.f49370r = bVar;
        this.f49353a = new b(this);
    }

    public int a() {
        return this.f49358f;
    }

    public int b() {
        return this.f49361i;
    }

    public int c() {
        return this.f49359g;
    }

    public int d() {
        return this.f49360h;
    }

    public int e() {
        return this.f49354b;
    }

    public int f() {
        return this.f49356d;
    }

    public int g() {
        return this.f49355c;
    }

    public int h() {
        return this.f49357e;
    }

    public int i() {
        return this.f49362j;
    }

    public g j() {
        return this.f49370r;
    }
}
