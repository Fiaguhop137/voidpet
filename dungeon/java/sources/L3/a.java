package L3;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: L3.a$a, reason: collision with other inner class name */
    public static final class C0117a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6306a;

        private /* synthetic */ C0117a(int i10) {
            this.f6306a = i10;
        }

        public static final /* synthetic */ C0117a a(int i10) {
            return new C0117a(i10);
        }

        public static int b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        public static boolean c(int i10, Object obj) {
            return (obj instanceof C0117a) && i10 == ((C0117a) obj).f();
        }

        public static int d(int i10) {
            return Integer.hashCode(i10);
        }

        public static String e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f6306a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f6306a;
        }

        public int hashCode() {
            return d(this.f6306a);
        }

        public String toString() {
            return e(this.f6306a);
        }
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6307a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2093724603;
        }

        public String toString() {
            return "Undefined";
        }
    }
}
