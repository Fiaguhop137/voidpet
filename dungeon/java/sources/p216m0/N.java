package p216m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48810a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48811b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f48812c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f48813d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f48814e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f48815f = f(4);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return N.f48815f;
        }

        public final int b() {
            return N.f48813d;
        }

        public final int c() {
            return N.f48814e;
        }

        public final int d() {
            return N.f48812c;
        }

        public final int e() {
            return N.f48811b;
        }
    }

    private static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }
}
