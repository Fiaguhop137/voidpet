package O7;

/* JADX INFO: loaded from: classes2.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f8404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8405b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f8404a = aVar;
        this.f8405b = j10;
    }

    @Override // O7.g
    public long b() {
        return this.f8405b;
    }

    @Override // O7.g
    public g.a c() {
        return this.f8404a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f8404a.equals(gVar.c()) && this.f8405b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f8404a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f8405b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f8404a + ", nextRequestWaitMillis=" + this.f8405b + "}";
    }
}
