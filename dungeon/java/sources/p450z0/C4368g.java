package p450z0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4368g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58251b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58252c = k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58253d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58254e = k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f58255f = k(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f58256g = k(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f58257h = k(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58258i = k(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f58259j = k(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f58260k = k(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58261a;

    /* JADX INFO: renamed from: z0.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4368g.f58252c;
        }

        public final int b() {
            return C4368g.f58260k;
        }

        public final int c() {
            return C4368g.f58253d;
        }

        public final int d() {
            return C4368g.f58258i;
        }

        public final int e() {
            return C4368g.f58257h;
        }

        public final int f() {
            return C4368g.f58255f;
        }

        public final int g() {
            return C4368g.f58254e;
        }

        public final int h() {
            return C4368g.f58256g;
        }

        public final int i() {
            return C4368g.f58259j;
        }
    }

    private /* synthetic */ C4368g(int i10) {
        this.f58261a = i10;
    }

    public static final /* synthetic */ C4368g j(int i10) {
        return new C4368g(i10);
    }

    private static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof C4368g) && i10 == ((C4368g) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        if (m(i10, f58252c)) {
            return "Button";
        }
        if (m(i10, f58253d)) {
            return "Checkbox";
        }
        if (m(i10, f58254e)) {
            return "Switch";
        }
        if (m(i10, f58255f)) {
            return "RadioButton";
        }
        if (m(i10, f58256g)) {
            return "Tab";
        }
        if (m(i10, f58257h)) {
            return "Image";
        }
        if (m(i10, f58258i)) {
            return "DropdownList";
        }
        if (m(i10, f58259j)) {
            return "Picker";
        }
        return m(i10, f58260k) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return l(this.f58261a, obj);
    }

    public int hashCode() {
        return n(this.f58261a);
    }

    public final /* synthetic */ int p() {
        return this.f58261a;
    }

    public String toString() {
        return o(this.f58261a);
    }
}
