package G4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p274p4.j;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3938a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f3939b = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f3940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f3941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f3942c;

        public a(Class cls, Class cls2, j jVar) {
            this.f3940a = cls;
            this.f3941b = cls2;
            this.f3942c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f3940a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3941b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f3938a.contains(str)) {
                this.f3938a.add(str);
            }
            arrayList = (List) this.f3939b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3939b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f3938a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f3939b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f3942c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f3938a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f3939b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f3941b)) {
                        arrayList.add(aVar.f3941b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, j jVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, jVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f3938a);
            this.f3938a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f3938a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f3938a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
