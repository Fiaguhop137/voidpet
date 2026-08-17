package p286pg;

/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int[] f50969D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f50971F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private a f50972G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50984l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f50990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f50995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f50996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f50997y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50985m = 40;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f50986n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f50987o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f50988p = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f50998z = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f50966A = 4;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f50967B = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f50968C = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f50970E = 64;

    public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int[] iArr) {
        this.f50973a = i10;
        this.f50976d = i13;
        this.f50977e = i15;
        this.f50978f = i16;
        this.f50979g = i17;
        this.f50980h = i18;
        this.f50974b = i11;
        this.f50975c = i12;
        int i21 = i11 * i12;
        this.f50990r = i21;
        this.f50969D = iArr;
        this.f50981i = i14;
        this.f50982j = i19;
        this.f50983k = i20;
        this.f50984l = (int) Math.ceil(i12 / 128);
        this.f50989q = g.b(i10);
        this.f50992t = i13;
        this.f50991s = g.a(i10);
        this.f50993u = g.b(i13);
        this.f50994v = g.b(i11);
        this.f50995w = g.a(i21);
        this.f50996x = g.b(i21);
        this.f50997y = g.b(i11);
        long j10 = (1 << ((int) (((long) i10) % 64))) - 1;
        this.f50971F = j10;
        this.f50972G = new a(this.f50991s, i10, j10);
    }
}
