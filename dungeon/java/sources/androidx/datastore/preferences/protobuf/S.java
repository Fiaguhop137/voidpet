package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f23392a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P f23393b = new Q();

    static P a() {
        return f23392a;
    }

    static P b() {
        return f23393b;
    }

    private static P c() {
        if (W.f23399d) {
            return null;
        }
        try {
            return (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
