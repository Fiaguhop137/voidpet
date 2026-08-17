package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public interface C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21550a = a.f21551a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21551a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C f21552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C f21553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final C f21554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final C f21555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C f21556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final C f21557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final C f21558h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final C f21559i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final C f21560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final C f21561k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final C f21562l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final C f21563m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final C f21564n;

        static {
            D d10 = new D("caption bar");
            f21552b = d10;
            D d11 = new D("display cutout");
            f21553c = d11;
            D d12 = new D("ime");
            f21554d = d12;
            D d13 = new D("mandatory system gestures");
            f21555e = d13;
            D d14 = new D("navigation bars");
            f21556f = d14;
            D d15 = new D("status bars");
            f21557g = d15;
            f21558h = new C1842e("system bars", new C[]{d15, d14, d10});
            D d16 = new D("system gestures");
            f21559i = d16;
            D d17 = new D("tappable element");
            f21560j = d17;
            D d18 = new D("waterfall");
            f21561k = d18;
            f21562l = new C1842e("safe drawing", new C[]{d15, d14, d10, d11, d12, d17});
            f21563m = new C1842e("safe gestures", new C[]{d13, d16, d17, d18});
            f21564n = new C1842e("safe content", new C[]{d15, d14, d10, d12, d16, d13, d17, d11, d18});
        }

        private a() {
        }

        public final C a() {
            return f21552b;
        }

        public final C b() {
            return f21553c;
        }

        public final C c() {
            return f21554d;
        }

        public final C d() {
            return f21555e;
        }

        public final C e() {
            return f21556f;
        }

        public final C f() {
            return f21557g;
        }

        public final C g() {
            return f21559i;
        }

        public final C h() {
            return f21560j;
        }

        public final C i() {
            return f21561k;
        }
    }

    r a();

    r b();
}
