package p412wg;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f56999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f57000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f57001g;

    public a(b bVar) {
        this.f57000f = bVar;
        this.f56999e = bVar.d();
        int iE = bVar.e();
        this.f56998d = iE;
        this.f56995a = iE << 1;
        int i10 = iE >> 2;
        this.f56996b = i10;
        this.f56997c = (i10 * 2) - 1;
        this.f57001g = bVar.g();
    }
}
