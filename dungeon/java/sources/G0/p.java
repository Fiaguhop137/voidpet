package G0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3783b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3784c = j(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3785d = j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f3786e = j(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f3787f = j(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f3788g = j(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f3789h = j(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3790i = j(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f3791j = j(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f3792k = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3793a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return p.f3785d;
        }

        public final int b() {
            return p.f3792k;
        }

        public final int c() {
            return p.f3787f;
        }

        public final int d() {
            return p.f3791j;
        }

        public final int e() {
            return p.f3786e;
        }

        public final int f() {
            return p.f3790i;
        }

        public final int g() {
            return p.f3788g;
        }

        public final int h() {
            return p.f3789h;
        }
    }

    private /* synthetic */ p(int i10) {
        this.f3793a = i10;
    }

    public static final /* synthetic */ p i(int i10) {
        return new p(i10);
    }

    private static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof p) && i10 == ((p) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        if (l(i10, f3784c)) {
            return "Unspecified";
        }
        if (l(i10, f3786e)) {
            return "None";
        }
        if (l(i10, f3785d)) {
            return "Default";
        }
        if (l(i10, f3787f)) {
            return "Go";
        }
        if (l(i10, f3788g)) {
            return "Search";
        }
        if (l(i10, f3789h)) {
            return "Send";
        }
        if (l(i10, f3790i)) {
            return "Previous";
        }
        if (l(i10, f3791j)) {
            return "Next";
        }
        return l(i10, f3792k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f3793a, obj);
    }

    public int hashCode() {
        return m(this.f3793a);
    }

    public final /* synthetic */ int o() {
        return this.f3793a;
    }

    public String toString() {
        return n(this.f3793a);
    }
}
