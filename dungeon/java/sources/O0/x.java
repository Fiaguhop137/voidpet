package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8301b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8302c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f8303d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f8304e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8305a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.f8304e;
        }

        public final long b() {
            return x.f8303d;
        }

        public final long c() {
            return x.f8302c;
        }
    }

    private /* synthetic */ x(long j10) {
        this.f8305a = j10;
    }

    public static final /* synthetic */ x d(long j10) {
        return new x(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        if (g(j10, f8302c)) {
            return "Unspecified";
        }
        if (g(j10, f8303d)) {
            return "Sp";
        }
        return g(j10, f8304e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f8305a, obj);
    }

    public int hashCode() {
        return h(this.f8305a);
    }

    public final /* synthetic */ long j() {
        return this.f8305a;
    }

    public String toString() {
        return i(this.f8305a);
    }
}
