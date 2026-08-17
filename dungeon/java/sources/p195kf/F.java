package p195kf;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f48126a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f48126a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
