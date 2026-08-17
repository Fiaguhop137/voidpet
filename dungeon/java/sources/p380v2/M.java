package p380v2;

/* JADX INFO: loaded from: classes.dex */
public final class M implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55985b;

    public M(long j10) {
        this(j10, 0L);
    }

    public M(long j10, long j11) {
        this.f55984a = j10;
        this.f55985b = j11;
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        return new J.a(new K(j10, this.f55985b));
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // p380v2.J
    public long m() {
        return this.f55984a;
    }
}
