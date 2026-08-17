package U7;

import V7.InterfaceC1561d;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1561d f13384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f13385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W7.b f13386d;

    v(Executor executor, InterfaceC1561d interfaceC1561d, x xVar, W7.b bVar) {
        this.f13383a = executor;
        this.f13384b = interfaceC1561d;
        this.f13385c = xVar;
        this.f13386d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f13384b.E0().iterator();
        while (it.hasNext()) {
            vVar.f13385c.b((N7.o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f13383a.execute(new t(this));
    }
}
