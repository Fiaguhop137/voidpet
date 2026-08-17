package Q;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f9228a = new AtomicReference(r.f9231a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9229b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f9230c;

    public final Object a() {
        long jA = v.a();
        return jA == u.a() ? this.f9230c : ((t) this.f9228a.get()).b(jA);
    }

    public final void b(Object obj) {
        long jA = v.a();
        if (jA == u.a()) {
            this.f9230c = obj;
            return;
        }
        synchronized (this.f9229b) {
            t tVar = (t) this.f9228a.get();
            if (tVar.d(jA, obj)) {
                return;
            }
            this.f9228a.set(tVar.c(jA, obj));
            Unit unit = Unit.f48228a;
        }
    }
}
