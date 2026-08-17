package p055d0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3218b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39547a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f39548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f39549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f39550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f39551e;

    /* JADX INFO: renamed from: d0.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return AbstractC3218b.f39550d;
        }

        public final long b() {
            return AbstractC3218b.f39548b;
        }

        public final long c() {
            return AbstractC3218b.f39549c;
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f39548b = d((((long) 0) & 4294967295L) | j11);
        f39549c = d((((long) 1) & 4294967295L) | j11);
        f39550d = d(j11 | (((long) 2) & 4294967295L));
        f39551e = d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (e(j10, f39548b)) {
            return "Rgb";
        }
        if (e(j10, f39549c)) {
            return "Xyz";
        }
        if (e(j10, f39550d)) {
            return "Lab";
        }
        return e(j10, f39551e) ? "Cmyk" : "Unknown";
    }
}
