package V7;

/* JADX INFO: renamed from: V7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1567j implements P7.b {

    /* JADX INFO: renamed from: V7.j$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C1567j f14203a = new C1567j();
    }

    public static C1567j a() {
        return a.f14203a;
    }

    public static AbstractC1562e c() {
        return (AbstractC1562e) P7.d.c(AbstractC1563f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1562e get() {
        return c();
    }
}
