package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37416c;

    static final class b extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f37418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f37419c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f37417a == null) {
                str = " token";
            }
            if (this.f37418b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f37419c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f37417a, this.f37418b.longValue(), this.f37419c.longValue(), null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f37417a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f37419c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f37418b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f37414a = str;
        this.f37415b = j10;
        this.f37416c = j11;
    }

    /* synthetic */ a(String str, long j10, long j11, C0409a c0409a) {
        this(str, j10, j11);
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f37414a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f37416c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f37415b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f37414a.equals(gVar.b()) && this.f37415b == gVar.d() && this.f37416c == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f37414a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f37415b;
        long j11 = this.f37416c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f37414a + ", tokenExpirationTimestamp=" + this.f37415b + ", tokenCreationTimestamp=" + this.f37416c + "}";
    }
}
