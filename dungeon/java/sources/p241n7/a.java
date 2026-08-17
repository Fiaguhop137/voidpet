package p241n7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f49913a;

    public static void a(b bVar) {
        synchronized (a.class) {
            try {
                if (f49913a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f49913a = bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(b bVar) {
        if (c()) {
            return;
        }
        a(bVar);
    }

    public static boolean c() {
        boolean z10;
        synchronized (a.class) {
            z10 = f49913a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        b bVar;
        synchronized (a.class) {
            bVar = f49913a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i10);
    }
}
