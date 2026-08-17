package C0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1115b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f1116c = O0.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1117a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return N0.f1116c;
        }
    }

    private /* synthetic */ N0(long j10) {
        this.f1117a = j10;
    }

    public static final /* synthetic */ N0 b(long j10) {
        return new N0(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof N0) && j10 == ((N0) obj).n();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean f(long j10) {
        return k(j10) == g(j10);
    }

    public static final int g(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int h(long j10) {
        return i(j10) - j(j10);
    }

    public static final int i(long j10) {
        return Math.max(k(j10), g(j10));
    }

    public static final int j(long j10) {
        return Math.min(k(j10), g(j10));
    }

    public static final int k(long j10) {
        return (int) (j10 >> 32);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return "TextRange(" + k(j10) + ", " + g(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f1117a, obj);
    }

    public int hashCode() {
        return l(this.f1117a);
    }

    public final /* synthetic */ long n() {
        return this.f1117a;
    }

    public String toString() {
        return m(this.f1117a);
    }
}
