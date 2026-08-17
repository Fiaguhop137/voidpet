package O;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8250b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        P.c cVar = P.c.f8568a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, P.c.f8568a);
    }

    public a(Object obj, Object obj2) {
        this.f8249a = obj;
        this.f8250b = obj2;
    }

    public final boolean a() {
        return this.f8250b != P.c.f8568a;
    }

    public final boolean b() {
        return this.f8249a != P.c.f8568a;
    }

    public final Object c() {
        return this.f8250b;
    }

    public final Object d() {
        return this.f8249a;
    }

    public final a e(Object obj) {
        return new a(this.f8249a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f8250b);
    }
}
