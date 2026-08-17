package Q7;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f9545c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9547b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9548a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9549b = 0;

        a() {
        }

        public f a() {
            return new f(this.f9548a, this.f9549b);
        }

        public a b(long j10) {
            this.f9549b = j10;
            return this;
        }

        public a c(long j10) {
            this.f9548a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f9546a = j10;
        this.f9547b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9547b;
    }

    public long b() {
        return this.f9546a;
    }
}
