package O8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static U f8489a;

    public static synchronized L a(H h10) {
        try {
            if (f8489a == null) {
                f8489a = new U(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (L) f8489a.b(h10);
    }

    public static synchronized L b(String str) {
        return a(H.d(str).c());
    }
}
