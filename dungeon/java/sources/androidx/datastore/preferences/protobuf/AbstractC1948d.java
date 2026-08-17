package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1948d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f23415b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f23416c;

    static {
        f23416c = (f23414a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f23415b;
    }

    static boolean c() {
        if (f23414a) {
            return true;
        }
        return (f23415b == null || f23416c) ? false : true;
    }
}
