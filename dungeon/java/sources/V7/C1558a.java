package V7;

/* JADX INFO: renamed from: V7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1558a extends AbstractC1562e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14190f;

    /* JADX INFO: renamed from: V7.a$b */
    static final class b extends AbstractC1562e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f14191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f14192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f14193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f14194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f14195e;

        b() {
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e a() {
            String str = "";
            if (this.f14191a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f14192b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f14193c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f14194d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f14195e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1558a(this.f14191a.longValue(), this.f14192b.intValue(), this.f14193c.intValue(), this.f14194d.longValue(), this.f14195e.intValue(), null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e.a b(int i10) {
            this.f14193c = Integer.valueOf(i10);
            return this;
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e.a c(long j10) {
            this.f14194d = Long.valueOf(j10);
            return this;
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e.a d(int i10) {
            this.f14192b = Integer.valueOf(i10);
            return this;
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e.a e(int i10) {
            this.f14195e = Integer.valueOf(i10);
            return this;
        }

        @Override // V7.AbstractC1562e.a
        AbstractC1562e.a f(long j10) {
            this.f14191a = Long.valueOf(j10);
            return this;
        }
    }

    private C1558a(long j10, int i10, int i11, long j11, int i12) {
        this.f14186b = j10;
        this.f14187c = i10;
        this.f14188d = i11;
        this.f14189e = j11;
        this.f14190f = i12;
    }

    /* synthetic */ C1558a(long j10, int i10, int i11, long j11, int i12, C0195a c0195a) {
        this(j10, i10, i11, j11, i12);
    }

    @Override // V7.AbstractC1562e
    int b() {
        return this.f14188d;
    }

    @Override // V7.AbstractC1562e
    long c() {
        return this.f14189e;
    }

    @Override // V7.AbstractC1562e
    int d() {
        return this.f14187c;
    }

    @Override // V7.AbstractC1562e
    int e() {
        return this.f14190f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1562e) {
            AbstractC1562e abstractC1562e = (AbstractC1562e) obj;
            if (this.f14186b == abstractC1562e.f() && this.f14187c == abstractC1562e.d() && this.f14188d == abstractC1562e.b() && this.f14189e == abstractC1562e.c() && this.f14190f == abstractC1562e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // V7.AbstractC1562e
    long f() {
        return this.f14186b;
    }

    public int hashCode() {
        long j10 = this.f14186b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14187c) * 1000003) ^ this.f14188d) * 1000003;
        long j11 = this.f14189e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14190f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f14186b + ", loadBatchSize=" + this.f14187c + ", criticalSectionEnterTimeoutMs=" + this.f14188d + ", eventCleanUpAge=" + this.f14189e + ", maxBlobByteSizePerRow=" + this.f14190f + "}";
    }
}
