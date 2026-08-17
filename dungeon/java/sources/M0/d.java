package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6677b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6678c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6679d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6680e = e(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6681a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f6679d;
        }

        public final int b() {
            return d.f6678c;
        }

        public final int c() {
            return d.f6680e;
        }
    }

    private /* synthetic */ d(int i10) {
        this.f6681a = i10;
    }

    public static final /* synthetic */ d d(int i10) {
        return new d(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (g(i10, f6678c)) {
            return "Hyphens.None";
        }
        if (g(i10, f6679d)) {
            return "Hyphens.Auto";
        }
        return g(i10, f6680e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f6681a, obj);
    }

    public int hashCode() {
        return h(this.f6681a);
    }

    public final /* synthetic */ int j() {
        return this.f6681a;
    }

    public String toString() {
        return i(this.f6681a);
    }
}
