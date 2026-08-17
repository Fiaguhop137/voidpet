package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0121a f6669b = new C0121a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f6670c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f6671d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f6672e = c(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6673a;

    /* JADX INFO: renamed from: M0.a$a, reason: collision with other inner class name */
    public static final class C0121a {
        private C0121a() {
        }

        public /* synthetic */ C0121a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f6672e;
        }
    }

    private /* synthetic */ a(float f10) {
        this.f6673a = f10;
    }

    public static final /* synthetic */ a b(float f10) {
        return new a(f10);
    }

    public static float c(float f10) {
        return f10;
    }

    public static boolean d(float f10, Object obj) {
        return (obj instanceof a) && Float.compare(f10, ((a) obj).h()) == 0;
    }

    public static final boolean e(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f6673a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f6673a;
    }

    public int hashCode() {
        return f(this.f6673a);
    }

    public String toString() {
        return g(this.f6673a);
    }
}
