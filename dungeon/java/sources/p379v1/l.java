package p379v1;

import Ad.n;
import kotlin.jvm.internal.Intrinsics;
import p142hf.InterfaceC3564c;
import p142hf.J;
import p142hf.t;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f55876a;

    public l() {
        H h10 = H.f55696b;
        Intrinsics.d(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f55876a = J.a(h10);
    }

    public final D a() {
        return (D) this.f55876a.getValue();
    }

    public final InterfaceC3564c b() {
        return this.f55876a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final D c(D newState) {
        Object value;
        D d10;
        Intrinsics.checkNotNullParameter(newState, "newState");
        t tVar = this.f55876a;
        do {
            value = tVar.getValue();
            d10 = (D) value;
            if (d10 instanceof x ? true : Intrinsics.b(d10, H.f55696b)) {
                d10 = newState;
            } else if (d10 instanceof C4232f) {
                if (newState.a() > d10.a()) {
                    d10 = newState;
                }
            } else if (!(d10 instanceof r)) {
                throw new n();
            }
        } while (!tVar.f(value, d10));
        return d10;
    }
}
