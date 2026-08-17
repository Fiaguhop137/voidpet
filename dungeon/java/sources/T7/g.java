package T7;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12330a;

    public g(Provider provider) {
        this.f12330a = provider;
    }

    public static U7.f a(X7.a aVar) {
        return (U7.f) P7.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U7.f get() {
        return a((X7.a) this.f12330a.get());
    }
}
