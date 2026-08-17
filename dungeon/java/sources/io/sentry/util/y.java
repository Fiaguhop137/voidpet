package io.sentry.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f46588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f46589b;

    static {
        try {
            f46588a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f46588a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f46589b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f46589b = false;
            }
        } catch (Throwable unused2) {
            f46589b = false;
        }
    }

    public static boolean a() {
        return f46588a;
    }

    public static boolean b() {
        return f46589b;
    }

    public static boolean c() {
        return !f46588a;
    }
}
