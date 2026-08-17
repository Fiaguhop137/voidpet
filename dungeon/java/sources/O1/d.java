package O1;

import P1.f;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S.c f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P1.d f8316d;

    public d(T store, S.c factory, a defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f8313a = store;
        this.f8314b = factory;
        this.f8315c = defaultExtras;
        this.f8316d = new P1.d();
    }

    public static /* synthetic */ Q e(d dVar, kotlin.reflect.d dVar2, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = f.f8586a.c(dVar2);
        }
        return dVar.d(dVar2, str);
    }

    public final Q d(kotlin.reflect.d modelClass, String key) {
        Q qB;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f8316d) {
            try {
                qB = this.f8313a.b(key);
                if (modelClass.i(qB)) {
                    if (this.f8314b instanceof S.e) {
                        S.e eVar = (S.e) this.f8314b;
                        Intrinsics.c(qB);
                        eVar.d(qB);
                    }
                    Intrinsics.d(qB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    b bVar = new b(this.f8315c);
                    bVar.c(S.f24317c, key);
                    qB = e.a(this.f8314b, modelClass, bVar);
                    this.f8313a.d(key, qB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qB;
    }
}
