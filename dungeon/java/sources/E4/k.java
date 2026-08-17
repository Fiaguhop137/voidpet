package E4;

import androidx.annotation.NonNull;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.InterfaceC1993p;
import androidx.lifecycle.InterfaceC1994q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class k implements j, InterfaceC1993p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f2650a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1987j f2651b;

    k(AbstractC1987j abstractC1987j) {
        this.f2651b = abstractC1987j;
        abstractC1987j.a(this);
    }

    @Override // E4.j
    public void a(l lVar) {
        this.f2650a.add(lVar);
        if (this.f2651b.b() == AbstractC1987j.b.DESTROYED) {
            lVar.d();
        } else if (this.f2651b.b().g(AbstractC1987j.b.STARTED)) {
            lVar.c();
        } else {
            lVar.a();
        }
    }

    @Override // E4.j
    public void b(l lVar) {
        this.f2650a.remove(lVar);
    }

    @A(AbstractC1987j.a.ON_DESTROY)
    public void onDestroy(@NonNull InterfaceC1994q interfaceC1994q) {
        Iterator it = L4.l.k(this.f2650a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).d();
        }
        interfaceC1994q.y().d(this);
    }

    @A(AbstractC1987j.a.ON_START)
    public void onStart(@NonNull InterfaceC1994q interfaceC1994q) {
        Iterator it = L4.l.k(this.f2650a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).c();
        }
    }

    @A(AbstractC1987j.a.ON_STOP)
    public void onStop(@NonNull InterfaceC1994q interfaceC1994q) {
        Iterator it = L4.l.k(this.f2650a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }
}
