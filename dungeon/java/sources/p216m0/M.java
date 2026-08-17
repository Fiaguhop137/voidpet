package p216m0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48809a;

    private /* synthetic */ M(int i10) {
        this.f48809a = i10;
    }

    public static final /* synthetic */ M a(int i10) {
        return new M(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof M) && i10 == ((M) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f48809a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f48809a;
    }

    public int hashCode() {
        return d(this.f48809a);
    }

    public String toString() {
        return e(this.f48809a);
    }
}
