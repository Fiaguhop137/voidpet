package p328s4;

import L4.l;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f53260a = l.g(20);

    c() {
    }

    abstract l a();

    l b() {
        l lVar = (l) this.f53260a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f53260a.size() < 20) {
            this.f53260a.offer(lVar);
        }
    }
}
