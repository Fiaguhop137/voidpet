package M7;

/* JADX INFO: loaded from: classes2.dex */
final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6911a;

    h(long j10) {
        this.f6911a = j10;
    }

    @Override // M7.n
    public long c() {
        return this.f6911a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f6911a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f6911a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f6911a + "}";
    }
}
