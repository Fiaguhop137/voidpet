package V7;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f14183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f14184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f14185c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f14183a = provider;
        this.f14184b = provider2;
        this.f14185c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f14183a.get(), (String) this.f14184b.get(), ((Integer) this.f14185c.get()).intValue());
    }
}
