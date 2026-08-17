package Y4;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f16939a;

    public static synchronized e b() {
        try {
            if (f16939a == null) {
                f16939a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16939a;
    }

    @Override // Y4.d
    public void a(c cVar) {
    }
}
