package G4;

import L4.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f3936a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4101a f3937b = new C4101a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f3936a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f3937b) {
            list = (List) this.f3937b.get(jVar);
        }
        this.f3936a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f3937b) {
            this.f3937b.put(new j(cls, cls2, cls3), list);
        }
    }
}
