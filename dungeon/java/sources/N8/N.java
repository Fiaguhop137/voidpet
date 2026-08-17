package N8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static M f8003a;

    public static synchronized F a(B b10) {
        try {
            if (f8003a == null) {
                f8003a = new M(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (F) f8003a.b(b10);
    }

    public static synchronized F b(String str) {
        return a(B.d("common").c());
    }
}
