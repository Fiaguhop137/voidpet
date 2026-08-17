package Q7;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f9521c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9523b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9524a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f9525b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f9524a, this.f9525b);
        }

        public a b(long j10) {
            this.f9524a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f9525b = bVar;
            return this;
        }
    }

    public enum b implements S9.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9534a;

        b(int i10) {
            this.f9534a = i10;
        }

        @Override // S9.c
        public int getNumber() {
            return this.f9534a;
        }
    }

    c(long j10, b bVar) {
        this.f9522a = j10;
        this.f9523b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f9522a;
    }

    public b b() {
        return this.f9523b;
    }
}
