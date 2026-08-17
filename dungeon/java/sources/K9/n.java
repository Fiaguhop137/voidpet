package K9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p359u.G;

/* JADX INFO: loaded from: classes2.dex */
public class n implements InterfaceC1136d, O9.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final W9.b f6103i = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f6108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f6109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f6110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f6111h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f6112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f6113b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6114c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f6115d = i.f6096a;

        b(Executor executor) {
            this.f6112a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C1135c c1135c) {
            this.f6114c.add(c1135c);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f6113b.add(new o(componentRegistrar));
            return this;
        }

        public b d(Collection collection) {
            this.f6113b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f6112a, this.f6113b, this.f6114c, this.f6115d, null);
        }

        public b f(i iVar) {
            this.f6115d = iVar;
            return this;
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f6104a = new HashMap();
        this.f6105b = new HashMap();
        this.f6106c = new HashMap();
        this.f6108e = new HashSet();
        this.f6110g = new AtomicReference();
        u uVar = new u(executor);
        this.f6109f = uVar;
        this.f6111h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1135c.q(uVar, u.class, T9.d.class, T9.c.class));
        arrayList.add(C1135c.q(this, O9.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1135c c1135c = (C1135c) it.next();
            if (c1135c != null) {
                arrayList.add(c1135c);
            }
        }
        this.f6107d = o(iterable);
        l(arrayList);
    }

    /* synthetic */ n(Executor executor, Iterable iterable, Collection collection, i iVar, a aVar) {
        this(executor, iterable, collection, iVar);
    }

    public static /* synthetic */ Object h(n nVar, C1135c c1135c) {
        nVar.getClass();
        return c1135c.h().a(new E(c1135c, nVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f6107d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((W9.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f6111h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : ((C1135c) it2.next()).j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f6108e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f6108e.add(obj.toString());
                    }
                }
            }
            if (this.f6104a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f6104a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C1135c c1135c = (C1135c) it3.next();
                this.f6104a.put(c1135c, new w(new k(this, c1135c)));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        p();
    }

    private void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C1135c c1135c = (C1135c) entry.getKey();
            W9.b bVar = (W9.b) entry.getValue();
            if (c1135c.n() || (c1135c.o() && z10)) {
                bVar.get();
            }
        }
        this.f6109f.e();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void p() {
        Boolean bool = (Boolean) this.f6110g.get();
        if (bool != null) {
            m(this.f6104a, bool.booleanValue());
        }
    }

    private void q() {
        for (C1135c c1135c : this.f6104a.keySet()) {
            for (q qVar : c1135c.g()) {
                if (qVar.f() && !this.f6106c.containsKey(qVar.b())) {
                    this.f6106c.put(qVar.b(), x.b(Collections.EMPTY_SET));
                } else if (this.f6105b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c1135c, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f6105b.put(qVar.b(), B.c());
                    }
                }
            }
        }
    }

    private List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1135c c1135c = (C1135c) it.next();
            if (c1135c.p()) {
                W9.b bVar = (W9.b) this.f6104a.get(c1135c);
                for (D d10 : c1135c.j()) {
                    if (this.f6105b.containsKey(d10)) {
                        arrayList.add(new l((B) ((W9.b) this.f6105b.get(d10)), bVar));
                    } else {
                        this.f6105b.put(d10, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f6104a.entrySet()) {
            C1135c c1135c = (C1135c) entry.getKey();
            if (!c1135c.p()) {
                W9.b bVar = (W9.b) entry.getValue();
                for (D d10 : c1135c.j()) {
                    if (!map.containsKey(d10)) {
                        map.put(d10, new HashSet());
                    }
                    ((Set) map.get(d10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f6106c.containsKey(entry2.getKey())) {
                x xVar = (x) this.f6106c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new m(xVar, (W9.b) it.next()));
                }
            } else {
                this.f6106c.put((D) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // K9.InterfaceC1136d
    public synchronized W9.b c(D d10) {
        x xVar = (x) this.f6106c.get(d10);
        if (xVar != null) {
            return xVar;
        }
        return f6103i;
    }

    @Override // K9.InterfaceC1136d
    public synchronized W9.b d(D d10) {
        C.c(d10, "Null interface requested.");
        return (W9.b) this.f6105b.get(d10);
    }

    public void n(boolean z10) {
        HashMap map;
        if (G.a(this.f6110g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f6104a);
            }
            m(map, z10);
        }
    }
}
