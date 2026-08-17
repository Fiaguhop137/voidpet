package p173jb;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p227mb.d;
import p227mb.k;
import p227mb.l;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47187a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f47188b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47189c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f47190d = false;

    public b(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f((d) it.next());
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            g((l) it2.next());
        }
    }

    public synchronized void a() {
        if (!this.f47190d) {
            d();
            this.f47190d = true;
        }
    }

    public Object b(Class cls) {
        return this.f47187a.get(cls);
    }

    public Object c(String str, Class cls) {
        return this.f47188b.get(str);
    }

    public void d() {
        ArrayList arrayList = new ArrayList(this.f47187a.values());
        Iterator it = this.f47189c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f(this);
        }
    }

    public void e() {
        ArrayList arrayList = new ArrayList(this.f47187a.values());
        Iterator it = this.f47189c.iterator();
        while (it.hasNext()) {
            k kVar = (k) ((WeakReference) it.next()).get();
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).d();
        }
    }

    public void f(d dVar) {
        Iterator it = dVar.h().iterator();
        while (it.hasNext()) {
            this.f47187a.put((Class) it.next(), dVar);
        }
    }

    public void g(l lVar) {
        this.f47188b.put(lVar.getName(), lVar);
    }
}
