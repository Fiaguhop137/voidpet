package p178jg;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f47450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f47452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47453j;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f47444a = i10;
        this.f47445b = i11;
        this.f47447d = i12;
        this.f47448e = i14;
        this.f47449f = i15;
        this.f47446c = i11 / 2;
        this.f47451h = i13 / 8;
        this.f47452i = (i10 + 7) >>> 3;
        this.f47453j = ((i10 * 2) + 7) >>> 3;
        this.f47450g = new f(i10);
    }
}
