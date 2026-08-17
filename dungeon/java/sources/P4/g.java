package P4;

/* JADX INFO: loaded from: classes.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f8834a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f8834a == null) {
                f8834a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8834a;
    }

    @Override // P4.a
    public void a(a.EnumC0147a enumC0147a, Class cls, String str, Throwable th) {
    }
}
