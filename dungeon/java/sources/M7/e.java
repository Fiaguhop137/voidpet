package M7;

/* JADX INFO: loaded from: classes2.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f6879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M7.a f6880b;

    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f6881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private M7.a f6882b;

        b() {
        }

        @Override // M7.k.a
        public k a() {
            return new e(this.f6881a, this.f6882b, null);
        }

        @Override // M7.k.a
        public k.a b(M7.a aVar) {
            this.f6882b = aVar;
            return this;
        }

        @Override // M7.k.a
        public k.a c(k.b bVar) {
            this.f6881a = bVar;
            return this;
        }
    }

    private e(k.b bVar, M7.a aVar) {
        this.f6879a = bVar;
        this.f6880b = aVar;
    }

    /* synthetic */ e(k.b bVar, M7.a aVar, a aVar2) {
        this(bVar, aVar);
    }

    @Override // M7.k
    public M7.a b() {
        return this.f6880b;
    }

    @Override // M7.k
    public k.b c() {
        return this.f6879a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f6879a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                M7.a aVar = this.f6880b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f6879a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        M7.a aVar = this.f6880b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6879a + ", androidClientInfo=" + this.f6880b + "}";
    }
}
