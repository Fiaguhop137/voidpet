package S4;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f11549a;

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f11549a == null) {
                f11549a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11549a;
    }

    @Override // S4.b
    public void a(a aVar) {
    }
}
