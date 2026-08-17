package Z9;

/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f18816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f18817e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f18821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f18822e;

        b() {
        }

        @Override // Z9.d.a
        public d a() {
            return new a(this.f18818a, this.f18819b, this.f18820c, this.f18821d, this.f18822e, null);
        }

        @Override // Z9.d.a
        public d.a b(f fVar) {
            this.f18821d = fVar;
            return this;
        }

        @Override // Z9.d.a
        public d.a c(String str) {
            this.f18819b = str;
            return this;
        }

        @Override // Z9.d.a
        public d.a d(String str) {
            this.f18820c = str;
            return this;
        }

        @Override // Z9.d.a
        public d.a e(d.b bVar) {
            this.f18822e = bVar;
            return this;
        }

        @Override // Z9.d.a
        public d.a f(String str) {
            this.f18818a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f18813a = str;
        this.f18814b = str2;
        this.f18815c = str3;
        this.f18816d = fVar;
        this.f18817e = bVar;
    }

    /* synthetic */ a(String str, String str2, String str3, f fVar, d.b bVar, C0236a c0236a) {
        this(str, str2, str3, fVar, bVar);
    }

    @Override // Z9.d
    public f b() {
        return this.f18816d;
    }

    @Override // Z9.d
    public String c() {
        return this.f18814b;
    }

    @Override // Z9.d
    public String d() {
        return this.f18815c;
    }

    @Override // Z9.d
    public d.b e() {
        return this.f18817e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f18813a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f18814b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f18815c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f18816d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f18817e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // Z9.d
    public String f() {
        return this.f18813a;
    }

    public int hashCode() {
        String str = this.f18813a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f18814b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18815c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f18816d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f18817e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f18813a + ", fid=" + this.f18814b + ", refreshToken=" + this.f18815c + ", authToken=" + this.f18816d + ", responseCode=" + this.f18817e + "}";
    }
}
