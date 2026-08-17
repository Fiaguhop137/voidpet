package Y9;

/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f17694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f17699h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f17701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f17704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f17705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f17706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f17707h;

        b() {
        }

        private b(d dVar) {
            this.f17700a = dVar.d();
            this.f17701b = dVar.g();
            this.f17702c = dVar.b();
            this.f17703d = dVar.f();
            this.f17704e = dVar.c();
            this.f17705f = dVar.h();
            this.f17706g = dVar.e();
            this.f17707h = (byte) 3;
        }

        /* synthetic */ b(d dVar, C0226a c0226a) {
            this(dVar);
        }

        @Override // Y9.d.a
        public d a() {
            if (this.f17707h == 3 && this.f17701b != null) {
                return new a(this.f17700a, this.f17701b, this.f17702c, this.f17703d, this.f17704e, this.f17705f, this.f17706g, null);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f17701b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f17707h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f17707h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // Y9.d.a
        public d.a b(String str) {
            this.f17702c = str;
            return this;
        }

        @Override // Y9.d.a
        public d.a c(long j10) {
            this.f17704e = j10;
            this.f17707h = (byte) (this.f17707h | 1);
            return this;
        }

        @Override // Y9.d.a
        public d.a d(String str) {
            this.f17700a = str;
            return this;
        }

        @Override // Y9.d.a
        public d.a e(String str) {
            this.f17706g = str;
            return this;
        }

        @Override // Y9.d.a
        public d.a f(String str) {
            this.f17703d = str;
            return this;
        }

        @Override // Y9.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f17701b = aVar;
            return this;
        }

        @Override // Y9.d.a
        public d.a h(long j10) {
            this.f17705f = j10;
            this.f17707h = (byte) (this.f17707h | 2);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f17693b = str;
        this.f17694c = aVar;
        this.f17695d = str2;
        this.f17696e = str3;
        this.f17697f = j10;
        this.f17698g = j11;
        this.f17699h = str4;
    }

    /* synthetic */ a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4, C0226a c0226a) {
        this(str, aVar, str2, str3, j10, j11, str4);
    }

    @Override // Y9.d
    public String b() {
        return this.f17695d;
    }

    @Override // Y9.d
    public long c() {
        return this.f17697f;
    }

    @Override // Y9.d
    public String d() {
        return this.f17693b;
    }

    @Override // Y9.d
    public String e() {
        return this.f17699h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f17693b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f17694c.equals(dVar.g()) && ((str = this.f17695d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f17696e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f17697f == dVar.c() && this.f17698g == dVar.h() && ((str3 = this.f17699h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Y9.d
    public String f() {
        return this.f17696e;
    }

    @Override // Y9.d
    public c.a g() {
        return this.f17694c;
    }

    @Override // Y9.d
    public long h() {
        return this.f17698g;
    }

    public int hashCode() {
        String str = this.f17693b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f17694c.hashCode()) * 1000003;
        String str2 = this.f17695d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17696e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f17697f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f17698g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f17699h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // Y9.d
    public d.a n() {
        return new b(this, null);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f17693b + ", registrationStatus=" + this.f17694c + ", authToken=" + this.f17695d + ", refreshToken=" + this.f17696e + ", expiresInSecs=" + this.f17697f + ", tokenCreationEpochInSecs=" + this.f17698g + ", fisError=" + this.f17699h + "}";
    }
}
