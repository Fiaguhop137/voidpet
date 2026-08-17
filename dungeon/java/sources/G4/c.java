package G4;

import D4.g;
import L4.j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p310r4.i;
import p310r4.t;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t f3933c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4101a f3934a = new C4101a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f3935b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f3935b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f3934a) {
            tVar = (t) this.f3934a.get(jVarB);
        }
        this.f3935b.set(jVarB);
        return tVar;
    }

    public boolean c(t tVar) {
        return f3933c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f3934a) {
            C4101a c4101a = this.f3934a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f3933c;
            }
            c4101a.put(jVar, tVar);
        }
    }
}
