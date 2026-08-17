package p142hf;

import kotlin.coroutines.CoroutineContext;
import p124gf.a;
import p177jf.p;
import p195kf.D;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f42901a = new D("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f42902b = new D("PENDING");

    public static final t a(Object obj) {
        if (obj == null) {
            obj = p.f47424a;
        }
        return new I(obj);
    }

    public static final InterfaceC3564c d(H h10, CoroutineContext coroutineContext, int i10, a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != a.DROP_OLDEST) ? z.e(h10, coroutineContext, i10, aVar) : h10;
    }
}
