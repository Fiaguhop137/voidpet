package N7;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f7921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f7922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f7925f;

    /* JADX INFO: renamed from: N7.b$b, reason: collision with other inner class name */
    static final class C0136b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f7927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f7928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f7929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f7930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f7931f;

        C0136b() {
        }

        @Override // N7.i.a
        public i d() {
            String str = "";
            if (this.f7926a == null) {
                str = " transportName";
            }
            if (this.f7928c == null) {
                str = str + " encodedPayload";
            }
            if (this.f7929d == null) {
                str = str + " eventMillis";
            }
            if (this.f7930e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f7931f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f7926a, this.f7927b, this.f7928c, this.f7929d.longValue(), this.f7930e.longValue(), this.f7931f, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // N7.i.a
        protected Map e() {
            Map map = this.f7931f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // N7.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f7931f = map;
            return this;
        }

        @Override // N7.i.a
        public i.a g(Integer num) {
            this.f7927b = num;
            return this;
        }

        @Override // N7.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f7928c = hVar;
            return this;
        }

        @Override // N7.i.a
        public i.a i(long j10) {
            this.f7929d = Long.valueOf(j10);
            return this;
        }

        @Override // N7.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f7926a = str;
            return this;
        }

        @Override // N7.i.a
        public i.a k(long j10) {
            this.f7930e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f7920a = str;
        this.f7921b = num;
        this.f7922c = hVar;
        this.f7923d = j10;
        this.f7924e = j11;
        this.f7925f = map;
    }

    /* synthetic */ b(String str, Integer num, h hVar, long j10, long j11, Map map, a aVar) {
        this(str, num, hVar, j10, j11, map);
    }

    @Override // N7.i
    protected Map c() {
        return this.f7925f;
    }

    @Override // N7.i
    public Integer d() {
        return this.f7921b;
    }

    @Override // N7.i
    public h e() {
        return this.f7922c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f7920a.equals(iVar.j()) && ((num = this.f7921b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f7922c.equals(iVar.e()) && this.f7923d == iVar.f() && this.f7924e == iVar.k() && this.f7925f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // N7.i
    public long f() {
        return this.f7923d;
    }

    public int hashCode() {
        int iHashCode = (this.f7920a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7921b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f7922c.hashCode()) * 1000003;
        long j10 = this.f7923d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f7924e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f7925f.hashCode();
    }

    @Override // N7.i
    public String j() {
        return this.f7920a;
    }

    @Override // N7.i
    public long k() {
        return this.f7924e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f7920a + ", code=" + this.f7921b + ", encodedPayload=" + this.f7922c + ", eventMillis=" + this.f7923d + ", uptimeMillis=" + this.f7924e + ", autoMetadata=" + this.f7925f + "}";
    }
}
