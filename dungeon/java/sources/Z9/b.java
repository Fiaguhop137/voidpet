package Z9;

/* JADX INFO: loaded from: classes2.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f18825c;

    /* JADX INFO: renamed from: Z9.b$b, reason: collision with other inner class name */
    static final class C0237b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f18827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f18828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f18829d;

        C0237b() {
        }

        @Override // Z9.f.a
        public f a() {
            if (this.f18829d == 1) {
                return new b(this.f18826a, this.f18827b, this.f18828c, null);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // Z9.f.a
        public f.a b(f.b bVar) {
            this.f18828c = bVar;
            return this;
        }

        @Override // Z9.f.a
        public f.a c(String str) {
            this.f18826a = str;
            return this;
        }

        @Override // Z9.f.a
        public f.a d(long j10) {
            this.f18827b = j10;
            this.f18829d = (byte) (this.f18829d | 1);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f18823a = str;
        this.f18824b = j10;
        this.f18825c = bVar;
    }

    /* synthetic */ b(String str, long j10, f.b bVar, a aVar) {
        this(str, j10, bVar);
    }

    @Override // Z9.f
    public f.b b() {
        return this.f18825c;
    }

    @Override // Z9.f
    public String c() {
        return this.f18823a;
    }

    @Override // Z9.f
    public long d() {
        return this.f18824b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f18823a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f18824b == fVar.d() && ((bVar = this.f18825c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f18823a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f18824b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f18825c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f18823a + ", tokenExpirationTimestamp=" + this.f18824b + ", responseCode=" + this.f18825c + "}";
    }
}
