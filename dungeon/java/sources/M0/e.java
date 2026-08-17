package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6682b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6686f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6687a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f6683c;
        }

        public final int b() {
            return e.f6686f;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6688a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f6689b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6690c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6691d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f6692e = d(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f6691d;
            }

            public final int b() {
                return b.f6690c;
            }

            public final int c() {
                return b.f6689b;
            }
        }

        public static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            if (e(i10, f6689b)) {
                return "Strategy.Simple";
            }
            if (e(i10, f6690c)) {
                return "Strategy.HighQuality";
            }
            if (e(i10, f6691d)) {
                return "Strategy.Balanced";
            }
            return e(i10, f6692e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6693a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f6694b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6695c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6696d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f6697e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f6698f = e(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f6694b;
            }

            public final int b() {
                return c.f6695c;
            }

            public final int c() {
                return c.f6696d;
            }

            public final int d() {
                return c.f6697e;
            }
        }

        public static int e(int i10) {
            return i10;
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static String g(int i10) {
            if (f(i10, f6694b)) {
                return "Strictness.None";
            }
            if (f(i10, f6695c)) {
                return "Strictness.Loose";
            }
            if (f(i10, f6696d)) {
                return "Strictness.Normal";
            }
            if (f(i10, f6697e)) {
                return "Strictness.Strict";
            }
            return f(i10, f6698f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6699a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f6700b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6701c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6702d = c(0);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f6700b;
            }

            public final int b() {
                return d.f6701c;
            }
        }

        public static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            if (d(i10, f6700b)) {
                return "WordBreak.None";
            }
            if (d(i10, f6701c)) {
                return "WordBreak.Phrase";
            }
            return d(i10, f6702d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        b.a aVar = b.f6688a;
        int iC = aVar.c();
        c.a aVar2 = c.f6693a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f6699a;
        f6683c = d(f.e(iC, iC2, aVar3.a()));
        f6684d = d(f.e(aVar.a(), aVar2.b(), aVar3.b()));
        f6685e = d(f.e(aVar.b(), aVar2.d(), aVar3.a()));
        f6686f = d(0);
    }

    private /* synthetic */ e(int i10) {
        this.f6687a = i10;
    }

    public static final /* synthetic */ e c(int i10) {
        return new e(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).l();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final int g(int i10) {
        return b.d(f.f(i10));
    }

    public static final int h(int i10) {
        return c.e(f.g(i10));
    }

    public static final int i(int i10) {
        return d.c(f.h(i10));
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i10))) + ", strictness=" + ((Object) c.g(h(i10))) + ", wordBreak=" + ((Object) d.e(i(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f6687a, obj);
    }

    public int hashCode() {
        return j(this.f6687a);
    }

    public final /* synthetic */ int l() {
        return this.f6687a;
    }

    public String toString() {
        return k(this.f6687a);
    }
}
