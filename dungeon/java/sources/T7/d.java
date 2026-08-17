package T7;

import U7.x;
import V7.InterfaceC1561d;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f12326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f12327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f12328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f12329e;

    public d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f12325a = provider;
        this.f12326b = provider2;
        this.f12327c = provider3;
        this.f12328d = provider4;
        this.f12329e = provider5;
    }

    public static d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, O7.e eVar, x xVar, InterfaceC1561d interfaceC1561d, W7.b bVar) {
        return new c(executor, eVar, xVar, interfaceC1561d, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f12325a.get(), (O7.e) this.f12326b.get(), (x) this.f12327c.get(), (InterfaceC1561d) this.f12328d.get(), (W7.b) this.f12329e.get());
    }
}
