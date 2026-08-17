package N7;

/* JADX INFO: loaded from: classes2.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f7932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.d f7934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L7.g f7935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L7.c f7936e;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f7937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private L7.d f7939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private L7.g f7940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private L7.c f7941e;

        b() {
        }

        @Override // N7.n.a
        public n a() {
            String str = "";
            if (this.f7937a == null) {
                str = " transportContext";
            }
            if (this.f7938b == null) {
                str = str + " transportName";
            }
            if (this.f7939c == null) {
                str = str + " event";
            }
            if (this.f7940d == null) {
                str = str + " transformer";
            }
            if (this.f7941e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f7937a, this.f7938b, this.f7939c, this.f7940d, this.f7941e, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // N7.n.a
        n.a b(L7.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f7941e = cVar;
            return this;
        }

        @Override // N7.n.a
        n.a c(L7.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f7939c = dVar;
            return this;
        }

        @Override // N7.n.a
        n.a d(L7.g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f7940d = gVar;
            return this;
        }

        @Override // N7.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f7937a = oVar;
            return this;
        }

        @Override // N7.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f7938b = str;
            return this;
        }
    }

    private c(o oVar, String str, L7.d dVar, L7.g gVar, L7.c cVar) {
        this.f7932a = oVar;
        this.f7933b = str;
        this.f7934c = dVar;
        this.f7935d = gVar;
        this.f7936e = cVar;
    }

    /* synthetic */ c(o oVar, String str, L7.d dVar, L7.g gVar, L7.c cVar, a aVar) {
        this(oVar, str, dVar, gVar, cVar);
    }

    @Override // N7.n
    public L7.c b() {
        return this.f7936e;
    }

    @Override // N7.n
    L7.d c() {
        return this.f7934c;
    }

    @Override // N7.n
    L7.g e() {
        return this.f7935d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f7932a.equals(nVar.f()) && this.f7933b.equals(nVar.g()) && this.f7934c.equals(nVar.c()) && this.f7935d.equals(nVar.e()) && this.f7936e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // N7.n
    public o f() {
        return this.f7932a;
    }

    @Override // N7.n
    public String g() {
        return this.f7933b;
    }

    public int hashCode() {
        return ((((((((this.f7932a.hashCode() ^ 1000003) * 1000003) ^ this.f7933b.hashCode()) * 1000003) ^ this.f7934c.hashCode()) * 1000003) ^ this.f7935d.hashCode()) * 1000003) ^ this.f7936e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f7932a + ", transportName=" + this.f7933b + ", event=" + this.f7934c + ", transformer=" + this.f7935d + ", encoding=" + this.f7936e + "}";
    }
}
