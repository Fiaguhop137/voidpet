package U5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f13150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f13151b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13152c = 0;

    public m(D d10) {
        this.f13150a = d10;
    }

    private int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f13150a.a(obj);
    }

    public synchronized boolean a(Object obj) {
        return this.f13151b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f13151b.get(obj);
    }

    public synchronized int c() {
        return this.f13151b.size();
    }

    public synchronized Object d() {
        return this.f13151b.isEmpty() ? null : this.f13151b.keySet().iterator().next();
    }

    public synchronized ArrayList e(V4.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f13151b.entrySet().size());
            for (Map.Entry entry : this.f13151b.entrySet()) {
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f13152c;
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.f13151b.remove(obj);
        this.f13152c -= g(objRemove);
        this.f13151b.put(obj, obj2);
        this.f13152c += g(obj2);
        return objRemove;
    }

    public synchronized Object i(Object obj) {
        Object objRemove;
        objRemove = this.f13151b.remove(obj);
        this.f13152c -= g(objRemove);
        return objRemove;
    }

    public synchronized ArrayList j(V4.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f13151b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    this.f13152c -= g(entry.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f13151b.isEmpty()) {
            this.f13152c = 0;
        }
    }
}
