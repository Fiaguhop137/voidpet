package Ag;

/* JADX INFO: loaded from: classes3.dex */
final class i extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f415g;

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f418g;

        protected b() {
            super(1);
            this.f416e = 0;
            this.f417f = 0;
            this.f418g = 0;
        }

        protected o l() {
            return new i(this, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ag.o.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        protected b n(int i10) {
            this.f416e = i10;
            return this;
        }

        protected b o(int i10) {
            this.f417f = i10;
            return this;
        }

        protected b p(int i10) {
            this.f418g = i10;
            return this;
        }
    }

    private i(b bVar) {
        super(bVar);
        this.f413e = bVar.f416e;
        this.f414f = bVar.f417f;
        this.f415g = bVar.f418g;
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    @Override // Ag.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Ug.f.c(this.f413e, bArrD, 16);
        Ug.f.c(this.f414f, bArrD, 20);
        Ug.f.c(this.f415g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f413e;
    }

    protected int f() {
        return this.f414f;
    }

    protected int g() {
        return this.f415g;
    }
}
