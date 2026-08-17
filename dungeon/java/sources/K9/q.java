package K9;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f6122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6124c;

    private q(D d10, int i10, int i11) {
        this.f6122a = (D) C.c(d10, "Null dependency anInterface.");
        this.f6123b = i10;
        this.f6124c = i11;
    }

    private q(Class cls, int i10, int i11) {
        this(D.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(D d10) {
        return new q(d10, 0, 1);
    }

    public static q i(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q j(D d10) {
        return new q(d10, 1, 0);
    }

    public static q k(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public D b() {
        return this.f6122a;
    }

    public boolean c() {
        return this.f6124c == 2;
    }

    public boolean d() {
        return this.f6124c == 0;
    }

    public boolean e() {
        return this.f6123b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f6122a.equals(qVar.f6122a) && this.f6123b == qVar.f6123b && this.f6124c == qVar.f6124c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f6123b == 2;
    }

    public int hashCode() {
        return ((((this.f6122a.hashCode() ^ 1000003) * 1000003) ^ this.f6123b) * 1000003) ^ this.f6124c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f6122a);
        sb2.append(", type=");
        int i10 = this.f6123b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(a(this.f6124c));
        sb2.append("}");
        return sb2.toString();
    }
}
