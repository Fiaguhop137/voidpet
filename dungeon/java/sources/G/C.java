package G;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3108b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3109c = c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3110d = c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3111a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C.f3110d;
        }
    }

    private /* synthetic */ C(int i10) {
        this.f3111a = i10;
    }

    public static final /* synthetic */ C b(int i10) {
        return new C(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof C) && i10 == ((C) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f3109c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.f3111a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f3111a;
    }

    public int hashCode() {
        return f(this.f3111a);
    }

    public String toString() {
        return g(this.f3111a);
    }
}
