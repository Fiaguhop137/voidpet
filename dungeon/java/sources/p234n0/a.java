package p234n0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f49438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f49439b;

    public a(long j10, float f10) {
        this.f49438a = j10;
        this.f49439b = f10;
    }

    public final float a() {
        return this.f49439b;
    }

    public final long b() {
        return this.f49438a;
    }

    public final void c(float f10) {
        this.f49439b = f10;
    }

    public final void d(long j10) {
        this.f49438a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f49438a == aVar.f49438a && Float.compare(this.f49439b, aVar.f49439b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f49438a) * 31) + Float.hashCode(this.f49439b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f49438a + ", dataPoint=" + this.f49439b + ')';
    }
}
