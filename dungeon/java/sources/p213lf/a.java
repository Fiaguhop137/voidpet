package p213lf;

import Ad.q;
import Ad.r;
import Ed.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p195kf.AbstractC3931i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static final void a(b bVar, Throwable th) throws Throwable {
        q.a aVar = q.f327b;
        bVar.resumeWith(q.b(r.a(th)));
        throw th;
    }

    public static final void b(b bVar, b bVar2) throws Throwable {
        try {
            b bVarC = Fd.b.c(bVar);
            q.a aVar = q.f327b;
            AbstractC3931i.b(bVarC, q.b(Unit.f48228a));
        } catch (Throwable th) {
            a(bVar2, th);
        }
    }

    public static final void c(Function2 function2, Object obj, b bVar) {
        try {
            b bVarC = Fd.b.c(Fd.b.a(function2, obj, bVar));
            q.a aVar = q.f327b;
            AbstractC3931i.b(bVarC, q.b(Unit.f48228a));
        } catch (Throwable th) {
            a(bVar, th);
        }
    }
}
