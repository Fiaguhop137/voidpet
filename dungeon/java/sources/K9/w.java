package K9;

/* JADX INFO: loaded from: classes2.dex */
public class w implements W9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6131c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f6132a = f6131c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile W9.b f6133b;

    public w(W9.b bVar) {
        this.f6133b = bVar;
    }

    @Override // W9.b
    public Object get() {
        Object obj;
        Object obj2 = this.f6132a;
        Object obj3 = f6131c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f6132a;
                if (obj == obj3) {
                    obj = this.f6133b.get();
                    this.f6132a = obj;
                    this.f6133b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
