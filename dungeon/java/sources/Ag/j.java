package Ag;

/* JADX INFO: loaded from: classes3.dex */
final class j extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f421g;

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f424g;

        protected b() {
            super(0);
            this.f422e = 0;
            this.f423f = 0;
            this.f424g = 0;
        }

        protected o l() {
            return new j(this, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Ag.o.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        protected b n(int i10) {
            this.f423f = i10;
            return this;
        }

        protected b o(int i10) {
            this.f424g = i10;
            return this;
        }

        protected b p(int i10) {
            this.f422e = i10;
            return this;
        }
    }

    private j(b bVar) {
        super(bVar);
        this.f419e = bVar.f422e;
        this.f420f = bVar.f423f;
        this.f421g = bVar.f424g;
    }

    /* synthetic */ j(b bVar, a aVar) {
        this(bVar);
    }

    @Override // Ag.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Ug.f.c(this.f419e, bArrD, 16);
        Ug.f.c(this.f420f, bArrD, 20);
        Ug.f.c(this.f421g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f420f;
    }

    protected int f() {
        return this.f421g;
    }

    protected int g() {
        return this.f419e;
    }
}
