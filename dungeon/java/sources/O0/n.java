package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8279b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8280c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f8281d = d(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8282a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f8281d;
        }

        public final long b() {
            return n.f8280c;
        }
    }

    private /* synthetic */ n(long j10) {
        this.f8282a = j10;
    }

    public static final /* synthetic */ n c(long j10) {
        return new n(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).m();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int h(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static final long j(long j10, long j11) {
        return d((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long k(long j10, long j11) {
        return d((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static String l(long j10) {
        return '(' + g(j10) + ", " + h(j10) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f8282a, obj);
    }

    public int hashCode() {
        return i(this.f8282a);
    }

    public final /* synthetic */ long m() {
        return this.f8282a;
    }

    public String toString() {
        return l(this.f8282a);
    }
}
