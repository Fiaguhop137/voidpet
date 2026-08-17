package O8;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static W f8490a;

    private W() {
    }

    public static synchronized W a() {
        try {
            if (f8490a == null) {
                f8490a = new W();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8490a;
    }
}
