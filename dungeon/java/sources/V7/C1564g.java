package V7;

/* JADX INFO: renamed from: V7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1564g implements P7.b {

    /* JADX INFO: renamed from: V7.g$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C1564g f14200a = new C1564g();
    }

    public static C1564g a() {
        return a.f14200a;
    }

    public static String b() {
        return (String) P7.d.c(AbstractC1563f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
