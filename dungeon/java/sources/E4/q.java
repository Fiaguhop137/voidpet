package E4;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f2664a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f2665b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2666c;

    public boolean a(H4.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f2664a.remove(cVar);
        if (!this.f2665b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = L4.l.k(this.f2664a).iterator();
        while (it.hasNext()) {
            a((H4.c) it.next());
        }
        this.f2665b.clear();
    }

    public void c() {
        this.f2666c = true;
        for (H4.c cVar : L4.l.k(this.f2664a)) {
            if (cVar.isRunning() || cVar.isComplete()) {
                cVar.clear();
                this.f2665b.add(cVar);
            }
        }
    }

    public void d() {
        this.f2666c = true;
        for (H4.c cVar : L4.l.k(this.f2664a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f2665b.add(cVar);
            }
        }
    }

    public void e() {
        for (H4.c cVar : L4.l.k(this.f2664a)) {
            if (!cVar.isComplete() && !cVar.isCleared()) {
                cVar.clear();
                if (this.f2666c) {
                    this.f2665b.add(cVar);
                } else {
                    cVar.begin();
                }
            }
        }
    }

    public void f() {
        this.f2666c = false;
        for (H4.c cVar : L4.l.k(this.f2664a)) {
            if (!cVar.isComplete() && !cVar.isRunning()) {
                cVar.begin();
            }
        }
        this.f2665b.clear();
    }

    public void g(H4.c cVar) {
        this.f2664a.add(cVar);
        if (!this.f2666c) {
            cVar.begin();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f2665b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f2664a.size() + ", isPaused=" + this.f2666c + "}";
    }
}
