package p459z9;

/* JADX INFO: loaded from: classes2.dex */
final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58536b;

    s(int i10, long j10) {
        this.f58535a = i10;
        this.f58536b = j10;
    }

    @Override // p459z9.t
    public final int a() {
        return this.f58535a;
    }

    @Override // p459z9.t
    public final long b() {
        return this.f58536b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f58535a == tVar.a() && this.f58536b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f58536b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f58535a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f58535a + ", eventTimestamp=" + this.f58536b + "}";
    }
}
