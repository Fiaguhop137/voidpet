package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8297b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x[] f8298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f8299d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8300a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return v.f8299d;
        }
    }

    static {
        x.a aVar = x.f8301b;
        f8298c = new x[]{x.d(aVar.c()), x.d(aVar.b()), x.d(aVar.a())};
        f8299d = w.e(0L, Float.NaN);
    }

    private /* synthetic */ v(long j10) {
        this.f8300a = j10;
    }

    public static final /* synthetic */ v b(long j10) {
        return new v(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f8298c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long jG = g(j10);
        x.a aVar = x.f8301b;
        if (x.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (x.g(jG, aVar.b())) {
            return h(j10) + ".sp";
        }
        if (!x.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j10) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.f8300a, obj);
    }

    public int hashCode() {
        return i(this.f8300a);
    }

    public final /* synthetic */ long k() {
        return this.f8300a;
    }

    public String toString() {
        return j(this.f8300a);
    }
}
