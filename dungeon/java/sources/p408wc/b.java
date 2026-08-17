package p408wc;

import Ic.a;
import Ic.h;
import Rc.c;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import p227mb.l;

/* JADX INFO: loaded from: classes2.dex */
public class b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f56825b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f56826c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f56824a = new WeakHashMap();

    public b() {
        c.f10988b.a(this);
    }

    public void a(Hc.c cVar) {
        if (this.f56824a.containsKey(cVar)) {
            return;
        }
        this.f56824a.put(cVar, new WeakReference(cVar));
        if (!this.f56825b.isEmpty()) {
            Iterator it = this.f56825b.iterator();
            while (it.hasNext()) {
                cVar.e((h) it.next());
            }
        }
        if (this.f56826c.isEmpty()) {
            return;
        }
        Iterator it2 = this.f56826c.iterator();
        while (it2.hasNext()) {
            cVar.c((Bundle) it2.next());
        }
    }

    public void b(a aVar) {
        Iterator it = this.f56824a.values().iterator();
        while (it.hasNext()) {
            Hc.c cVar = (Hc.c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.b(aVar);
            }
        }
    }

    public void c(Bundle bundle) {
        if (this.f56824a.isEmpty()) {
            if (this.f56826c.isEmpty()) {
                this.f56826c.add(bundle);
            }
        } else {
            Iterator it = this.f56824a.values().iterator();
            while (it.hasNext()) {
                Hc.c cVar = (Hc.c) ((WeakReference) it.next()).get();
                if (cVar != null) {
                    cVar.c(bundle);
                }
            }
        }
    }

    public void d(h hVar) {
        if (this.f56824a.isEmpty()) {
            this.f56825b.add(hVar);
            return;
        }
        Iterator it = this.f56824a.values().iterator();
        while (it.hasNext()) {
            Hc.c cVar = (Hc.c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.e(hVar);
            }
        }
    }

    public void e() {
        Iterator it = this.f56824a.values().iterator();
        while (it.hasNext()) {
            Hc.c cVar = (Hc.c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public void f(Hc.c cVar) {
        this.f56824a.remove(cVar);
    }

    @Override // p227mb.l
    public String getName() {
        return "NotificationManager";
    }
}
