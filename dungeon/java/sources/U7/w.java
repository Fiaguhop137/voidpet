package U7;

import V7.InterfaceC1561d;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f13387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f13388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f13389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f13390d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f13387a = provider;
        this.f13388b = provider2;
        this.f13389c = provider3;
        this.f13390d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, InterfaceC1561d interfaceC1561d, x xVar, W7.b bVar) {
        return new v(executor, interfaceC1561d, xVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f13387a.get(), (InterfaceC1561d) this.f13388b.get(), (x) this.f13389c.get(), (W7.b) this.f13390d.get());
    }
}
