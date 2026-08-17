package Ag;

/* JADX INFO: loaded from: classes3.dex */
final class g extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f408g;

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f410f;

        protected b() {
            super(2);
            this.f409e = 0;
            this.f410f = 0;
        }

        protected o k() {
            return new g(this, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ag.o.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        protected b m(int i10) {
            this.f409e = i10;
            return this;
        }

        protected b n(int i10) {
            this.f410f = i10;
            return this;
        }
    }

    private g(b bVar) {
        super(bVar);
        this.f406e = 0;
        this.f407f = bVar.f409e;
        this.f408g = bVar.f410f;
    }

    /* synthetic */ g(b bVar, a aVar) {
        this(bVar);
    }

    @Override // Ag.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Ug.f.c(this.f406e, bArrD, 16);
        Ug.f.c(this.f407f, bArrD, 20);
        Ug.f.c(this.f408g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f407f;
    }

    protected int f() {
        return this.f408g;
    }
}
