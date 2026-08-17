package H9;

/* JADX INFO: loaded from: classes2.dex */
final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4243c;

    a(long j10, long j11, long j12) {
        this.f4241a = j10;
        this.f4242b = j11;
        this.f4243c = j12;
    }

    @Override // H9.l
    public long b() {
        return this.f4242b;
    }

    @Override // H9.l
    public long c() {
        return this.f4241a;
    }

    @Override // H9.l
    public long d() {
        return this.f4243c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f4241a == lVar.c() && this.f4242b == lVar.b() && this.f4243c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f4241a;
        long j11 = this.f4242b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f4243c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f4241a + ", elapsedRealtime=" + this.f4242b + ", uptimeMillis=" + this.f4243c + "}";
    }
}
