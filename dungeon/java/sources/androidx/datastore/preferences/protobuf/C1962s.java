package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1962s implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1962s f23638a = new C1962s();

    private C1962s() {
    }

    public static C1962s c() {
        return f23638a;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public I a(Class cls) {
        if (!AbstractC1963t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I) AbstractC1963t.q(cls.asSubclass(AbstractC1963t.class)).f();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean b(Class cls) {
        return AbstractC1963t.class.isAssignableFrom(cls);
    }
}
