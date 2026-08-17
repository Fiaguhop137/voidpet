package p380v2;

/* JADX INFO: renamed from: v2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4246i implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f56091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f56094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f56095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f56096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f56097g;

    public C4246i(long j10, long j11, int i10, int i11, boolean z10) {
        this.f56091a = j10;
        this.f56092b = j11;
        this.f56093c = i11 == -1 ? 1 : i11;
        this.f56095e = i10;
        this.f56097g = z10;
        if (j10 == -1) {
            this.f56094d = -1L;
            this.f56096f = -9223372036854775807L;
        } else {
            this.f56094d = j10 - j11;
            this.f56096f = f(j10, j11, i10);
        }
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f56095e)) / 8000000;
        int i10 = this.f56093c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f56094d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f56092b + Math.max(jMin, 0L);
    }

    private static long f(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public long b(long j10) {
        return f(j10, this.f56092b, this.f56095e);
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        if (this.f56094d == -1 && !this.f56097g) {
            return new J.a(new K(0L, this.f56092b));
        }
        long jA = a(j10);
        long jB = b(jA);
        K k10 = new K(jB, jA);
        if (this.f56094d != -1 && jB < j10) {
            int i10 = this.f56093c;
            if (((long) i10) + jA < this.f56091a) {
                long j11 = jA + ((long) i10);
                return new J.a(k10, new K(b(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // p380v2.J
    public boolean i() {
        return this.f56094d != -1 || this.f56097g;
    }

    @Override // p380v2.J
    public long m() {
        return this.f56096f;
    }
}
