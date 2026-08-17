package O7;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f8418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f8419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f8420c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f8418a = provider;
        this.f8419b = provider2;
        this.f8420c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, X7.a aVar, X7.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f8418a.get(), (X7.a) this.f8419b.get(), (X7.a) this.f8420c.get());
    }
}
