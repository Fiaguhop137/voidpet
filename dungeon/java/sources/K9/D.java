package K9;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f6065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f6066b;

    private @interface a {
    }

    public D(Class cls, Class cls2) {
        this.f6065a = cls;
        this.f6066b = cls2;
    }

    public static D a(Class cls, Class cls2) {
        return new D(cls, cls2);
    }

    public static D b(Class cls) {
        return new D(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f6066b.equals(d10.f6066b)) {
            return this.f6065a.equals(d10.f6065a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6066b.hashCode() * 31) + this.f6065a.hashCode();
    }

    public String toString() {
        if (this.f6065a == a.class) {
            return this.f6066b.getName();
        }
        return "@" + this.f6065a.getName() + " " + this.f6066b.getName();
    }
}
