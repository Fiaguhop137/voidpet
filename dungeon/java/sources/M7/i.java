package M7;

/* JADX INFO: loaded from: classes2.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f6912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f6913b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f6914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f6915b;

        b() {
        }

        @Override // M7.o.a
        public o a() {
            return new i(this.f6914a, this.f6915b, null);
        }

        @Override // M7.o.a
        public o.a b(o.b bVar) {
            this.f6915b = bVar;
            return this;
        }

        @Override // M7.o.a
        public o.a c(o.c cVar) {
            this.f6914a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f6912a = cVar;
        this.f6913b = bVar;
    }

    /* synthetic */ i(o.c cVar, o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // M7.o
    public o.b b() {
        return this.f6913b;
    }

    @Override // M7.o
    public o.c c() {
        return this.f6912a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f6912a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f6913b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f6912a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f6913b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6912a + ", mobileSubtype=" + this.f6913b + "}";
    }
}
