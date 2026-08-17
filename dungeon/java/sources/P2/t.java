package P2;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R1.r f8766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f8768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f8769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u[] f8771l;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, R1.r rVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f8760a = i10;
        this.f8761b = i11;
        this.f8762c = j10;
        this.f8763d = j11;
        this.f8764e = j12;
        this.f8765f = j13;
        this.f8766g = rVar;
        this.f8767h = i12;
        this.f8771l = uVarArr;
        this.f8770k = i13;
        this.f8768i = jArr;
        this.f8769j = jArr2;
    }

    public t a(R1.r rVar) {
        return new t(this.f8760a, this.f8761b, this.f8762c, this.f8763d, this.f8764e, this.f8765f, rVar, this.f8767h, this.f8771l, this.f8770k, this.f8768i, this.f8769j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f8771l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
