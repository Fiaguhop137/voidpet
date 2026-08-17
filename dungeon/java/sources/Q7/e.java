package Q7;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f9540c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9542b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9543a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9544b = 0;

        a() {
        }

        public e a() {
            return new e(this.f9543a, this.f9544b);
        }

        public a b(long j10) {
            this.f9543a = j10;
            return this;
        }

        public a c(long j10) {
            this.f9544b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f9541a = j10;
        this.f9542b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9541a;
    }

    public long b() {
        return this.f9542b;
    }
}
