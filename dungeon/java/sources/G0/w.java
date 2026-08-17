package G0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3812a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f3813b = j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3814c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3815d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f3816e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f3817f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f3818g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f3819h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3820i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f3821j = j(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f3822k = j(9);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w.f3815d;
        }

        public final int b() {
            return w.f3822k;
        }

        public final int c() {
            return w.f3819h;
        }

        public final int d() {
            return w.f3816e;
        }

        public final int e() {
            return w.f3821j;
        }

        public final int f() {
            return w.f3820i;
        }

        public final int g() {
            return w.f3817f;
        }

        public final int h() {
            return w.f3814c;
        }

        public final int i() {
            return w.f3818g;
        }
    }

    private static int j(int i10) {
        return i10;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        if (k(i10, f3813b)) {
            return "Unspecified";
        }
        if (k(i10, f3814c)) {
            return "Text";
        }
        if (k(i10, f3815d)) {
            return "Ascii";
        }
        if (k(i10, f3816e)) {
            return "Number";
        }
        if (k(i10, f3817f)) {
            return "Phone";
        }
        if (k(i10, f3818g)) {
            return "Uri";
        }
        if (k(i10, f3819h)) {
            return "Email";
        }
        if (k(i10, f3820i)) {
            return "Password";
        }
        if (k(i10, f3821j)) {
            return "NumberPassword";
        }
        return k(i10, f3822k) ? "Decimal" : "Invalid";
    }
}
