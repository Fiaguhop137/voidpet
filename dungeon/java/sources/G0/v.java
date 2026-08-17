package G0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3806a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f3807b = e(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3808c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3809d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f3810e = e(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f3811f = e(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v.f3809d;
        }

        public final int b() {
            return v.f3808c;
        }

        public final int c() {
            return v.f3811f;
        }

        public final int d() {
            return v.f3810e;
        }
    }

    private static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f3807b)) {
            return "Unspecified";
        }
        if (f(i10, f3808c)) {
            return "None";
        }
        if (f(i10, f3809d)) {
            return "Characters";
        }
        if (f(i10, f3810e)) {
            return "Words";
        }
        return f(i10, f3811f) ? "Sentences" : "Invalid";
    }
}
