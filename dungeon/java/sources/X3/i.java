package X3;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f15291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f15292b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.f15291a = obj;
        this.f15292b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p199l1.d)) {
            return false;
        }
        p199l1.d dVar = (p199l1.d) obj;
        return a(dVar.f48588a, this.f15291a) && a(dVar.f48589b, this.f15292b);
    }

    public int hashCode() {
        Object obj = this.f15291a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15292b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f15291a + " " + this.f15292b + "}";
    }
}
