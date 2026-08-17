package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1960p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1958n f23563a = new C1959o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1958n f23564b = c();

    static AbstractC1958n a() {
        AbstractC1958n abstractC1958n = f23564b;
        if (abstractC1958n != null) {
            return abstractC1958n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1958n b() {
        return f23563a;
    }

    private static AbstractC1958n c() {
        if (W.f23399d) {
            return null;
        }
        try {
            return (AbstractC1958n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
