package V7;

/* JADX INFO: renamed from: V7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1566i implements P7.b {

    /* JADX INFO: renamed from: V7.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C1566i f14202a = new C1566i();
    }

    public static C1566i a() {
        return a.f14202a;
    }

    public static int c() {
        return AbstractC1563f.c();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
