package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements P7.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f15305a = new c();
    }

    public static c a() {
        return a.f15305a;
    }

    public static X7.a b() {
        return (X7.a) P7.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public X7.a get() {
        return b();
    }
}
