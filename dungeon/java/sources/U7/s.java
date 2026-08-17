package U7;

import V7.InterfaceC1560c;
import V7.InterfaceC1561d;
import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f13372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f13373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f13374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f13375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f13376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f13377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f13378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider f13379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider f13380i;

    public s(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f13372a = provider;
        this.f13373b = provider2;
        this.f13374c = provider3;
        this.f13375d = provider4;
        this.f13376e = provider5;
        this.f13377f = provider6;
        this.f13378g = provider7;
        this.f13379h = provider8;
        this.f13380i = provider9;
    }

    public static s a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, O7.e eVar, InterfaceC1561d interfaceC1561d, x xVar, Executor executor, W7.b bVar, X7.a aVar, X7.a aVar2, InterfaceC1560c interfaceC1560c) {
        return new r(context, eVar, interfaceC1561d, xVar, executor, bVar, aVar, aVar2, interfaceC1560c);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f13372a.get(), (O7.e) this.f13373b.get(), (InterfaceC1561d) this.f13374c.get(), (x) this.f13375d.get(), (Executor) this.f13376e.get(), (W7.b) this.f13377f.get(), (X7.a) this.f13378g.get(), (X7.a) this.f13379h.get(), (InterfaceC1560c) this.f13380i.get());
    }
}
