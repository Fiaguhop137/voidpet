package L4;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f6348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f6349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f6350c;

    public j() {
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f6348a = cls;
        this.f6349b = cls2;
        this.f6350c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6348a.equals(jVar.f6348a) && this.f6349b.equals(jVar.f6349b) && l.e(this.f6350c, jVar.f6350c);
    }

    public int hashCode() {
        int iHashCode = ((this.f6348a.hashCode() * 31) + this.f6349b.hashCode()) * 31;
        Class cls = this.f6350c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f6348a + ", second=" + this.f6349b + '}';
    }
}
