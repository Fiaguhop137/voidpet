package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18150a;

    public Q0(int i10) {
        super(a(i10));
        this.f18150a = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
