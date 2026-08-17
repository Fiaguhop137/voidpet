package F0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2867b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2868c = c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2869d = c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2870e = c(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f2871f = c(65535);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2872a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return q.f2871f;
        }
    }

    private /* synthetic */ q(int i10) {
        this.f2872a = i10;
    }

    public static final /* synthetic */ q b(int i10) {
        return new q(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof q) && i10 == ((q) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f2868c)) {
            return "None";
        }
        if (e(i10, f2869d)) {
            return "Weight";
        }
        if (e(i10, f2870e)) {
            return "Style";
        }
        return e(i10, f2871f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.f2872a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f2872a;
    }

    public int hashCode() {
        return f(this.f2872a);
    }

    public String toString() {
        return g(this.f2872a);
    }
}
