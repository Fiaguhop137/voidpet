package V7;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f14169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f14170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f14171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f14172e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f14168a = provider;
        this.f14169b = provider2;
        this.f14170c = provider3;
        this.f14171d = provider4;
        this.f14172e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(X7.a aVar, X7.a aVar2, Object obj, Object obj2, Provider provider) {
        return new M(aVar, aVar2, (AbstractC1562e) obj, (U) obj2, provider);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((X7.a) this.f14168a.get(), (X7.a) this.f14169b.get(), this.f14170c.get(), this.f14171d.get(), this.f14172e);
    }
}
