package N7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements P7.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f7964a = new k();
    }

    public static k a() {
        return a.f7964a;
    }

    public static Executor b() {
        return (Executor) P7.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
