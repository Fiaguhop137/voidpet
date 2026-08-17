package W;

/* JADX INFO: renamed from: W.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1587i implements I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14437b;

    private /* synthetic */ C1587i(int i10) {
        this.f14437b = i10;
    }

    public static final /* synthetic */ C1587i a(int i10) {
        return new C1587i(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C1587i) && i10 == ((C1587i) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14437b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f14437b;
    }

    public int hashCode() {
        return d(this.f14437b);
    }

    public String toString() {
        return e(this.f14437b);
    }
}
