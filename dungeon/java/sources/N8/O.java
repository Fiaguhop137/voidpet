package N8;

/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static O f8004a;

    private O() {
    }

    public static synchronized O a() {
        try {
            if (f8004a == null) {
                f8004a = new O();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8004a;
    }
}
