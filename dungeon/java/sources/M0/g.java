package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6703d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f6704e = new g(a.f6708b.a(), d.f6718b.a(), c.f6714b.a(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6707c;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0122a f6708b = new C0122a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f6709c = c(0.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f6710d = c(0.5f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f6711e = c(-1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final float f6712f = c(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f6713a;

        /* JADX INFO: renamed from: M0.g$a$a, reason: collision with other inner class name */
        public static final class C0122a {
            private C0122a() {
            }

            public /* synthetic */ C0122a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f6711e;
            }
        }

        private /* synthetic */ a(float f10) {
            this.f6713a = f10;
        }

        public static final /* synthetic */ a b(float f10) {
            return new a(f10);
        }

        public static float c(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                H0.a.c("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static boolean d(float f10, Object obj) {
            return (obj instanceof a) && Float.compare(f10, ((a) obj).h()) == 0;
        }

        public static final boolean e(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int f(float f10) {
            return Float.hashCode(f10);
        }

        public static String g(float f10) {
            if (f10 == f6709c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f6710d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f6711e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f6712f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return d(this.f6713a, obj);
        }

        public final /* synthetic */ float h() {
            return this.f6713a;
        }

        public int hashCode() {
            return f(this.f6713a);
        }

        public String toString() {
            return g(this.f6713a);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f6704e;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6714b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6715c = d(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6716d = d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6717a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f6715c;
            }

            public final int b() {
                return c.f6716d;
            }
        }

        private /* synthetic */ c(int i10) {
            this.f6717a = i10;
        }

        public static final /* synthetic */ c c(int i10) {
            return new c(i10);
        }

        private static int d(int i10) {
            return i10;
        }

        public static boolean e(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).i();
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return Integer.hashCode(i10);
        }

        public static String h(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f6717a, obj);
        }

        public int hashCode() {
            return g(this.f6717a);
        }

        public final /* synthetic */ int i() {
            return this.f6717a;
        }

        public String toString() {
            return h(this.f6717a);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6718b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6719c = c(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6720d = c(16);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f6721e = c(17);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f6722f = c(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6723a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f6721e;
            }
        }

        private /* synthetic */ d(int i10) {
            this.f6723a = i10;
        }

        public static final /* synthetic */ d b(int i10) {
            return new d(i10);
        }

        private static int c(int i10) {
            return i10;
        }

        public static boolean d(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).j();
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean g(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean h(int i10) {
            return (i10 & 16) > 0;
        }

        public static String i(int i10) {
            if (i10 == f6719c) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f6720d) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f6721e) {
                return "LineHeightStyle.Trim.Both";
            }
            return i10 == f6722f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return d(this.f6723a, obj);
        }

        public int hashCode() {
            return f(this.f6723a);
        }

        public final /* synthetic */ int j() {
            return this.f6723a;
        }

        public String toString() {
            return i(this.f6723a);
        }
    }

    private g(float f10, int i10, int i11) {
        this.f6705a = f10;
        this.f6706b = i10;
        this.f6707c = i11;
    }

    public /* synthetic */ g(float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10, i11);
    }

    public final float b() {
        return this.f6705a;
    }

    public final int c() {
        return this.f6707c;
    }

    public final int d() {
        return this.f6706b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return a.e(this.f6705a, gVar.f6705a) && d.e(this.f6706b, gVar.f6706b) && c.f(this.f6707c, gVar.f6707c);
    }

    public int hashCode() {
        return (((a.f(this.f6705a) * 31) + d.f(this.f6706b)) * 31) + c.g(this.f6707c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.g(this.f6705a)) + ", trim=" + ((Object) d.i(this.f6706b)) + ",mode=" + ((Object) c.h(this.f6707c)) + ')';
    }
}
