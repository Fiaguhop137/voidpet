package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements P7.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f15306a = new d();
    }

    public static d a() {
        return a.f15306a;
    }

    public static X7.a c() {
        return (X7.a) P7.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public X7.a get() {
        return c();
    }
}
