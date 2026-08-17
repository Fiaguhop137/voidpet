package F0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2863b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2864c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2865d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2866a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return p.f2865d;
        }

        public final int b() {
            return p.f2864c;
        }
    }

    private /* synthetic */ p(int i10) {
        this.f2866a = i10;
    }

    public static final /* synthetic */ p c(int i10) {
        return new p(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof p) && i10 == ((p) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f2864c)) {
            return "Normal";
        }
        return f(i10, f2865d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f2866a, obj);
    }

    public int hashCode() {
        return g(this.f2866a);
    }

    public final /* synthetic */ int i() {
        return this.f2866a;
    }

    public String toString() {
        return h(this.f2866a);
    }
}
