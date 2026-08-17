package K9;

/* JADX INFO: loaded from: classes2.dex */
class B implements W9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final W9.a f6061c = new z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final W9.b f6062d = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private W9.a f6063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile W9.b f6064b;

    private B(W9.a aVar, W9.b bVar) {
        this.f6063a = aVar;
        this.f6064b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(W9.b bVar) {
    }

    static B c() {
        return new B(f6061c, f6062d);
    }

    void d(W9.b bVar) {
        W9.a aVar;
        if (this.f6064b != f6062d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f6063a;
            this.f6063a = null;
            this.f6064b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // W9.b
    public Object get() {
        return this.f6064b.get();
    }
}
