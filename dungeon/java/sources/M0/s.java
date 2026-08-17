package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6773a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f6774b = f(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6775c = f(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6776d = f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6777e = f(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6778f = f(5);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s.f6774b;
        }

        public final int b() {
            return s.f6775c;
        }

        public final int c() {
            return s.f6778f;
        }

        public final int d() {
            return s.f6777e;
        }

        public final int e() {
            return s.f6776d;
        }
    }

    public static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (g(i10, f6774b)) {
            return "Clip";
        }
        if (g(i10, f6775c)) {
            return "Ellipsis";
        }
        if (g(i10, f6778f)) {
            return "MiddleEllipsis";
        }
        if (g(i10, f6776d)) {
            return "Visible";
        }
        return g(i10, f6777e) ? "StartEllipsis" : "Invalid";
    }
}
