package L4;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f6338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6339b;

        a(b bVar) {
            this.f6339b = bVar;
        }

        @Override // L4.f.b
        public Object get() {
            if (this.f6338a == null) {
                synchronized (this) {
                    try {
                        if (this.f6338a == null) {
                            this.f6338a = k.d(this.f6339b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f6338a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
