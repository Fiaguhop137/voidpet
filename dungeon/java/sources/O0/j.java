package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8272b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8273c = b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f8274d = b(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8275a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ j(long j10) {
        this.f8275a = j10;
    }

    public static final /* synthetic */ j a(long j10) {
        return new j(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).h();
    }

    public static final float d(long j10) {
        return h.o(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final float e(long j10) {
        return h.o(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.t(d(j10))) + ", " + ((Object) h.t(e(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f8275a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f8275a;
    }

    public int hashCode() {
        return f(this.f8275a);
    }

    public String toString() {
        return g(this.f8275a);
    }
}
