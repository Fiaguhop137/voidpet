package O7;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f8427b;

    public l(Provider provider, Provider provider2) {
        this.f8426a = provider;
        this.f8427b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f8426a.get(), this.f8427b.get());
    }
}
