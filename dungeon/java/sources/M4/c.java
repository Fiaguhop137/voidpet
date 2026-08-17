package M4;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f6805a;

        b() {
            super(null);
        }

        @Override // M4.c
        public void b(boolean z10) {
            this.f6805a = z10;
        }

        @Override // M4.c
        public void c() {
            if (this.f6805a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private c() {
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();
}
