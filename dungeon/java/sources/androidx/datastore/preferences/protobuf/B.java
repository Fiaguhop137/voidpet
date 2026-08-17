package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC1969z f23351a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC1969z f23352b = new A();

    static InterfaceC1969z a() {
        return f23351a;
    }

    static InterfaceC1969z b() {
        return f23352b;
    }

    private static InterfaceC1969z c() {
        if (W.f23399d) {
            return null;
        }
        try {
            return (InterfaceC1969z) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
