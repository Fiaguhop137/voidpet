package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8289b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8290c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8291a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f8290c;
        }
    }

    private /* synthetic */ r(long j10) {
        this.f8291a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.f8291a, obj);
    }

    public int hashCode() {
        return h(this.f8291a);
    }

    public final /* synthetic */ long j() {
        return this.f8291a;
    }

    public String toString() {
        return i(this.f8291a);
    }
}
