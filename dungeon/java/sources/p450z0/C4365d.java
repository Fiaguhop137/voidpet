package p450z0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4365d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58241b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58242c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58243d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58244a;

    /* JADX INFO: renamed from: z0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4365d.f58243d;
        }

        public final int b() {
            return C4365d.f58242c;
        }
    }

    private /* synthetic */ C4365d(int i10) {
        this.f58244a = i10;
    }

    public static final /* synthetic */ C4365d c(int i10) {
        return new C4365d(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C4365d) && i10 == ((C4365d) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f58242c)) {
            return "Polite";
        }
        return f(i10, f58243d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f58244a, obj);
    }

    public int hashCode() {
        return g(this.f58244a);
    }

    public final /* synthetic */ int i() {
        return this.f58244a;
    }

    public String toString() {
        return h(this.f58244a);
    }
}
