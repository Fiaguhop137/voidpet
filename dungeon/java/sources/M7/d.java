package M7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6878a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f6878a = list;
    }

    @Override // M7.j
    public List c() {
        return this.f6878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f6878a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f6878a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f6878a + "}";
    }
}
