package M7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f6884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f6886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f6888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f6889g;

    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f6890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f6891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f6892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f6893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f6894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f6895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f6896g;

        b() {
        }

        @Override // M7.l.a
        public l a() {
            String str = "";
            if (this.f6890a == null) {
                str = " eventTimeMs";
            }
            if (this.f6892c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f6895f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f6890a.longValue(), this.f6891b, this.f6892c.longValue(), this.f6893d, this.f6894e, this.f6895f.longValue(), this.f6896g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M7.l.a
        public l.a b(Integer num) {
            this.f6891b = num;
            return this;
        }

        @Override // M7.l.a
        public l.a c(long j10) {
            this.f6890a = Long.valueOf(j10);
            return this;
        }

        @Override // M7.l.a
        public l.a d(long j10) {
            this.f6892c = Long.valueOf(j10);
            return this;
        }

        @Override // M7.l.a
        public l.a e(o oVar) {
            this.f6896g = oVar;
            return this;
        }

        @Override // M7.l.a
        l.a f(byte[] bArr) {
            this.f6893d = bArr;
            return this;
        }

        @Override // M7.l.a
        l.a g(String str) {
            this.f6894e = str;
            return this;
        }

        @Override // M7.l.a
        public l.a h(long j10) {
            this.f6895f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f6883a = j10;
        this.f6884b = num;
        this.f6885c = j11;
        this.f6886d = bArr;
        this.f6887e = str;
        this.f6888f = j12;
        this.f6889g = oVar;
    }

    /* synthetic */ f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar, a aVar) {
        this(j10, num, j11, bArr, str, j12, oVar);
    }

    @Override // M7.l
    public Integer b() {
        return this.f6884b;
    }

    @Override // M7.l
    public long c() {
        return this.f6883a;
    }

    @Override // M7.l
    public long d() {
        return this.f6885c;
    }

    @Override // M7.l
    public o e() {
        return this.f6889g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f6883a == lVar.c() && ((num = this.f6884b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f6885c == lVar.d()) {
                if (Arrays.equals(this.f6886d, lVar instanceof f ? ((f) lVar).f6886d : lVar.f()) && ((str = this.f6887e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f6888f == lVar.h() && ((oVar = this.f6889g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // M7.l
    public byte[] f() {
        return this.f6886d;
    }

    @Override // M7.l
    public String g() {
        return this.f6887e;
    }

    @Override // M7.l
    public long h() {
        return this.f6888f;
    }

    public int hashCode() {
        long j10 = this.f6883a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6884b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f6885c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6886d)) * 1000003;
        String str = this.f6887e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f6888f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f6889g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f6883a + ", eventCode=" + this.f6884b + ", eventUptimeMs=" + this.f6885c + ", sourceExtension=" + Arrays.toString(this.f6886d) + ", sourceExtensionJsonProto3=" + this.f6887e + ", timezoneOffsetSeconds=" + this.f6888f + ", networkConnectionInfo=" + this.f6889g + "}";
    }
}
