package p088ef;

import Ad.q;
import Ad.r;
import Ed.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public static final Object a(Object obj, b bVar) {
        if (!(obj instanceof C)) {
            return q.b(obj);
        }
        q.a aVar = q.f327b;
        return q.b(r.a(((C) obj).f40752a));
    }

    public static final Object b(Object obj) {
        Throwable thD = q.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC3299n interfaceC3299n) {
        Throwable thD = q.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }
}
