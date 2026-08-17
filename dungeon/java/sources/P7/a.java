package P7;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f8850c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f8851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f8852b = f8850c;

    private a(Provider provider) {
        this.f8851a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof a ? provider : new a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f8850c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f8852b;
        Object obj3 = f8850c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8852b;
                if (obj == obj3) {
                    obj = this.f8851a.get();
                    this.f8852b = b(this.f8852b, obj);
                    this.f8851a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
