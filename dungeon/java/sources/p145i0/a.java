package p145i0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0511a f43499b = new C0511a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f43500c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f43501d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43502a;

    /* JADX INFO: renamed from: i0.a$a, reason: collision with other inner class name */
    public static final class C0511a {
        private C0511a() {
        }

        public /* synthetic */ C0511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f43501d;
        }

        public final int b() {
            return a.f43500c;
        }
    }

    private /* synthetic */ a(int i10) {
        this.f43502a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f43500c)) {
            return "Touch";
        }
        return f(i10, f43501d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f43502a, obj);
    }

    public int hashCode() {
        return g(this.f43502a);
    }

    public final /* synthetic */ int i() {
        return this.f43502a;
    }

    public String toString() {
        return h(this.f43502a);
    }
}
