package p459z9;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f58529c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile o f58530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f58531b = f58529c;

    private k(o oVar) {
        this.f58530a = oVar;
    }

    public static o b(o oVar) {
        return oVar instanceof k ? oVar : new k(oVar);
    }

    @Override // p459z9.o
    public final Object a() {
        Object objA;
        Object obj = this.f58531b;
        Object obj2 = f58529c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f58531b;
                if (objA == obj2) {
                    objA = this.f58530a.a();
                    Object obj3 = this.f58531b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f58531b = objA;
                    this.f58530a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
