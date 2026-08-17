package V7;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: V7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1565h implements P7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f14201a;

    public C1565h(Provider provider) {
        this.f14201a = provider;
    }

    public static C1565h a(Provider provider) {
        return new C1565h(provider);
    }

    public static String c(Context context) {
        return (String) P7.d.c(AbstractC1563f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f14201a.get());
    }
}
