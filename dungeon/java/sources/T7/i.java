package T7;

import U7.x;
import V7.InterfaceC1561d;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f12331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f12332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f12333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f12334d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f12331a = provider;
        this.f12332b = provider2;
        this.f12333c = provider3;
        this.f12334d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, InterfaceC1561d interfaceC1561d, U7.f fVar, X7.a aVar) {
        return (x) P7.d.c(h.a(context, interfaceC1561d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f12331a.get(), (InterfaceC1561d) this.f12332b.get(), (U7.f) this.f12333c.get(), (X7.a) this.f12334d.get());
    }
}
