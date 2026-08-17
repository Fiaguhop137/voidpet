package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21373b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21374c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21375d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21376e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21377f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21378g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21379h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21380i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f21381j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21382a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.f21379h;
        }

        public final int b() {
            return b.f21380i;
        }

        public final int c() {
            return b.f21381j;
        }

        public final int d() {
            return b.f21376e;
        }

        public final int e() {
            return b.f21374c;
        }

        public final int f() {
            return b.f21375d;
        }

        public final int g() {
            return b.f21377f;
        }

        public final int h() {
            return b.f21378g;
        }
    }

    private /* synthetic */ b(int i10) {
        this.f21382a = i10;
    }

    public static final /* synthetic */ b i(int i10) {
        return new b(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        if (l(i10, f21374c)) {
            return "Next";
        }
        if (l(i10, f21375d)) {
            return "Previous";
        }
        if (l(i10, f21376e)) {
            return "Left";
        }
        if (l(i10, f21377f)) {
            return "Right";
        }
        if (l(i10, f21378g)) {
            return "Up";
        }
        if (l(i10, f21379h)) {
            return "Down";
        }
        if (l(i10, f21380i)) {
            return "Enter";
        }
        return l(i10, f21381j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f21382a, obj);
    }

    public int hashCode() {
        return m(this.f21382a);
    }

    public final /* synthetic */ int o() {
        return this.f21382a;
    }

    public String toString() {
        return n(this.f21382a);
    }
}
