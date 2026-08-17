package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1956l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f23517a = c();

    public static C1957m a() {
        C1957m c1957mB = b("getEmptyRegistry");
        return c1957mB != null ? c1957mB : C1957m.f23520c;
    }

    private static final C1957m b(String str) {
        Class cls = f23517a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1957m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
