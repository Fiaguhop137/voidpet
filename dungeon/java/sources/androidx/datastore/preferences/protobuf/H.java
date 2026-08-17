package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f23366a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F f23367b = new G();

    static F a() {
        return f23366a;
    }

    static F b() {
        return f23367b;
    }

    private static F c() {
        if (W.f23399d) {
            return null;
        }
        try {
            return (F) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
