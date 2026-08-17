package U7;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f13323c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f13324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f13325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f13326c;

        b() {
        }

        @Override // U7.f.b.a
        public f.b a() {
            String str = "";
            if (this.f13324a == null) {
                str = " delta";
            }
            if (this.f13325b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f13326c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f13324a.longValue(), this.f13325b.longValue(), this.f13326c, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // U7.f.b.a
        public f.b.a b(long j10) {
            this.f13324a = Long.valueOf(j10);
            return this;
        }

        @Override // U7.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f13326c = set;
            return this;
        }

        @Override // U7.f.b.a
        public f.b.a d(long j10) {
            this.f13325b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set set) {
        this.f13321a = j10;
        this.f13322b = j11;
        this.f13323c = set;
    }

    /* synthetic */ c(long j10, long j11, Set set, a aVar) {
        this(j10, j11, set);
    }

    @Override // U7.f.b
    long b() {
        return this.f13321a;
    }

    @Override // U7.f.b
    Set c() {
        return this.f13323c;
    }

    @Override // U7.f.b
    long d() {
        return this.f13322b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f13321a == bVar.b() && this.f13322b == bVar.d() && this.f13323c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13321a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13322b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13323c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f13321a + ", maxAllowedDelay=" + this.f13322b + ", flags=" + this.f13323c + "}";
    }
}
