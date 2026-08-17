package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6728b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6729c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6730d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6731e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6732f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f6733g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f6734h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f6735i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6736a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return i.f6731e;
        }

        public final int b() {
            return i.f6734h;
        }

        public final int c() {
            return i.f6732f;
        }

        public final int d() {
            return i.f6729c;
        }

        public final int e() {
            return i.f6730d;
        }

        public final int f() {
            return i.f6733g;
        }

        public final int g() {
            return i.f6735i;
        }
    }

    private /* synthetic */ i(int i10) {
        this.f6736a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        if (k(i10, f6729c)) {
            return "Left";
        }
        if (k(i10, f6730d)) {
            return "Right";
        }
        if (k(i10, f6731e)) {
            return "Center";
        }
        if (k(i10, f6732f)) {
            return "Justify";
        }
        if (k(i10, f6733g)) {
            return "Start";
        }
        if (k(i10, f6734h)) {
            return "End";
        }
        return k(i10, f6735i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f6736a, obj);
    }

    public int hashCode() {
        return l(this.f6736a);
    }

    public final /* synthetic */ int n() {
        return this.f6736a;
    }

    public String toString() {
        return m(this.f6736a);
    }
}
