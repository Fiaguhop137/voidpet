package K9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class p {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1135c f6117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f6118b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f6119c = new HashSet();

        b(C1135c c1135c) {
            this.f6117a = c1135c;
        }

        void a(b bVar) {
            this.f6118b.add(bVar);
        }

        void b(b bVar) {
            this.f6119c.add(bVar);
        }

        C1135c c() {
            return this.f6117a;
        }

        Set d() {
            return this.f6118b;
        }

        boolean e() {
            return this.f6118b.isEmpty();
        }

        boolean f() {
            return this.f6119c.isEmpty();
        }

        void g(b bVar) {
            this.f6119c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f6120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6121b;

        private c(D d10, boolean z10) {
            this.f6120a = d10;
            this.f6121b = z10;
        }

        /* synthetic */ c(D d10, boolean z10, a aVar) {
            this(d10, z10);
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f6120a.equals(this.f6120a) && cVar.f6121b == this.f6121b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f6120a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f6121b).hashCode();
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1135c c1135c = (C1135c) it.next();
            b bVar = new b(c1135c);
            for (D d10 : c1135c.j()) {
                c cVar = new c(d10, !c1135c.p(), null);
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f6121b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", d10));
                }
                set2.add(bVar);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (b bVar2 : (Set) it2.next()) {
                for (q qVar : bVar2.c().g()) {
                    if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f(), null))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        return hashSet;
    }
}
