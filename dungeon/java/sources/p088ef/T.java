package p088ef;

import Ad.q;
import Ad.r;
import Ed.b;
import p195kf.C3930h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(b bVar) {
        Object objB;
        if (bVar instanceof C3930h) {
            return ((C3930h) bVar).toString();
        }
        try {
            q.a aVar = q.f327b;
            objB = q.b(bVar + '@' + b(bVar));
        } catch (Throwable th) {
            q.a aVar2 = q.f327b;
            objB = q.b(r.a(th));
        }
        if (q.d(objB) != null) {
            objB = bVar.getClass().getName() + '@' + b(bVar);
        }
        return (String) objB;
    }
}
