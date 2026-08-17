package Db;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f2255a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2256b = "ExpoImage";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f2257c = "load new image";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f2258d;

    private B() {
    }

    public final String a() {
        return f2257c;
    }

    public final int b() {
        int i10;
        synchronized (this) {
            i10 = f2258d;
            f2258d = i10 + 1;
        }
        return i10;
    }

    public final String c() {
        return f2256b;
    }
}
