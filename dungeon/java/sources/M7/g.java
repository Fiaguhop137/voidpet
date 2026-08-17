package M7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f6899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f6900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f6902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f6903g;

    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f6904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f6905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k f6906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f6907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f6908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f6909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f6910g;

        b() {
        }

        @Override // M7.m.a
        public m a() {
            String str = "";
            if (this.f6904a == null) {
                str = " requestTimeMs";
            }
            if (this.f6905b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f6904a.longValue(), this.f6905b.longValue(), this.f6906c, this.f6907d, this.f6908e, this.f6909f, this.f6910g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M7.m.a
        public m.a b(k kVar) {
            this.f6906c = kVar;
            return this;
        }

        @Override // M7.m.a
        public m.a c(List list) {
            this.f6909f = list;
            return this;
        }

        @Override // M7.m.a
        m.a d(Integer num) {
            this.f6907d = num;
            return this;
        }

        @Override // M7.m.a
        m.a e(String str) {
            this.f6908e = str;
            return this;
        }

        @Override // M7.m.a
        public m.a f(p pVar) {
            this.f6910g = pVar;
            return this;
        }

        @Override // M7.m.a
        public m.a g(long j10) {
            this.f6904a = Long.valueOf(j10);
            return this;
        }

        @Override // M7.m.a
        public m.a h(long j10) {
            this.f6905b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f6897a = j10;
        this.f6898b = j11;
        this.f6899c = kVar;
        this.f6900d = num;
        this.f6901e = str;
        this.f6902f = list;
        this.f6903g = pVar;
    }

    /* synthetic */ g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this(j10, j11, kVar, num, str, list, pVar);
    }

    @Override // M7.m
    public k b() {
        return this.f6899c;
    }

    @Override // M7.m
    public List c() {
        return this.f6902f;
    }

    @Override // M7.m
    public Integer d() {
        return this.f6900d;
    }

    @Override // M7.m
    public String e() {
        return this.f6901e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f6897a == mVar.g() && this.f6898b == mVar.h() && ((kVar = this.f6899c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f6900d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f6901e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f6902f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f6903g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // M7.m
    public p f() {
        return this.f6903g;
    }

    @Override // M7.m
    public long g() {
        return this.f6897a;
    }

    @Override // M7.m
    public long h() {
        return this.f6898b;
    }

    public int hashCode() {
        long j10 = this.f6897a;
        long j11 = this.f6898b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f6899c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f6900d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6901e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f6902f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f6903g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f6897a + ", requestUptimeMs=" + this.f6898b + ", clientInfo=" + this.f6899c + ", logSource=" + this.f6900d + ", logSourceName=" + this.f6901e + ", logEvents=" + this.f6902f + ", qosTier=" + this.f6903g + "}";
    }
}
