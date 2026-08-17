package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6742b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6743c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6744d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6745e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6746f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f6747g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f6748h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6749a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k.f6745e;
        }

        public final int b() {
            return k.f6746f;
        }

        public final int c() {
            return k.f6747g;
        }

        public final int d() {
            return k.f6743c;
        }

        public final int e() {
            return k.f6744d;
        }

        public final int f() {
            return k.f6748h;
        }
    }

    private /* synthetic */ k(int i10) {
        this.f6749a = i10;
    }

    public static final /* synthetic */ k g(int i10) {
        return new k(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof k) && i10 == ((k) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        if (j(i10, f6743c)) {
            return "Ltr";
        }
        if (j(i10, f6744d)) {
            return "Rtl";
        }
        if (j(i10, f6745e)) {
            return "Content";
        }
        if (j(i10, f6746f)) {
            return "ContentOrLtr";
        }
        if (j(i10, f6747g)) {
            return "ContentOrRtl";
        }
        return j(i10, f6748h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f6749a, obj);
    }

    public int hashCode() {
        return k(this.f6749a);
    }

    public final /* synthetic */ int m() {
        return this.f6749a;
    }

    public String toString() {
        return l(this.f6749a);
    }
}
