package Z4;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    c(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }

    @Override // Z4.a
    /* JADX INFO: renamed from: c */
    public a clone() {
        return this;
    }

    @Override // Z4.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f18771a) {
                    super.finalize();
                    return;
                }
                Object objF = this.f18772b.f();
                W4.a.K("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f18772b)), objF == null ? null : objF.getClass().getName());
                this.f18772b.d();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
