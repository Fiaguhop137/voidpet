package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6763c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f6764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r f6765e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6767b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return r.f6764d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6768b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f6769c = e(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f6770d = e(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f6771e = e(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6772a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f6770d;
            }

            public final int b() {
                return b.f6769c;
            }

            public final int c() {
                return b.f6771e;
            }
        }

        private /* synthetic */ b(int i10) {
            this.f6772a = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        private static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).j();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }

        public static String i(int i10) {
            if (g(i10, f6769c)) {
                return "Linearity.Linear";
            }
            if (g(i10, f6770d)) {
                return "Linearity.FontHinting";
            }
            return g(i10, f6771e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f6772a, obj);
        }

        public int hashCode() {
            return h(this.f6772a);
        }

        public final /* synthetic */ int j() {
            return this.f6772a;
        }

        public String toString() {
            return i(this.f6772a);
        }
    }

    static {
        b.a aVar = b.f6768b;
        f6764d = new r(aVar.a(), false, null);
        f6765e = new r(aVar.b(), true, null);
    }

    private r(int i10, boolean z10) {
        this.f6766a = i10;
        this.f6767b = z10;
    }

    public /* synthetic */ r(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f6766a;
    }

    public final boolean c() {
        return this.f6767b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return b.g(this.f6766a, rVar.f6766a) && this.f6767b == rVar.f6767b;
    }

    public int hashCode() {
        return (b.h(this.f6766a) * 31) + Boolean.hashCode(this.f6767b);
    }

    public String toString() {
        if (Intrinsics.b(this, f6764d)) {
            return "TextMotion.Static";
        }
        return Intrinsics.b(this, f6765e) ? "TextMotion.Animated" : "Invalid";
    }
}
