package p380v2;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f55974c = new K(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55976b;

    public K(long j10, long j11) {
        this.f55975a = j10;
        this.f55976b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f55975a == k10.f55975a && this.f55976b == k10.f55976b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f55975a) * 31) + ((int) this.f55976b);
    }

    public String toString() {
        return "[timeUs=" + this.f55975a + ", position=" + this.f55976b + "]";
    }
}
