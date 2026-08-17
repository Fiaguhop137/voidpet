package p382v4;

import L4.k;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p199l1.e;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f56246e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f56247f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f56249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f56250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f56251d;

    private static class a implements n {
        a() {
        }

        @Override // p382v4.n
        public n.a a(Object obj, int i10, int i11, h hVar) {
            return null;
        }

        @Override // p382v4.n
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f56252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f56253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o f56254c;

        public b(Class cls, Class cls2, o oVar) {
            this.f56252a = cls;
            this.f56253b = cls2;
            this.f56254c = oVar;
        }

        public boolean a(Class cls) {
            return this.f56252a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f56253b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public q a(List list, e eVar) {
            return new q(list, eVar);
        }
    }

    public r(e eVar) {
        this(eVar, f56246e);
    }

    r(e eVar, c cVar) {
        this.f56248a = new ArrayList();
        this.f56250c = new HashSet();
        this.f56251d = eVar;
        this.f56249b = cVar;
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f56248a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n e(b bVar) {
        return (n) k.d(bVar.f56254c.d(this));
    }

    private static n f() {
        return f56247f;
    }

    private o h(b bVar) {
        return bVar.f56254c;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    synchronized List c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f56248a) {
                if (!this.f56250c.contains(bVar) && bVar.a(cls)) {
                    this.f56250c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f56250c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f56250c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f56248a) {
                if (this.f56250c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f56250c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f56250c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f56249b.a(arrayList, this.f56251d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new i.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f56250c.clear();
            throw th;
        }
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f56248a) {
            if (!arrayList.contains(bVar.f56253b) && bVar.a(cls)) {
                arrayList.add(bVar.f56253b);
            }
        }
        return arrayList;
    }

    synchronized void i(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, false);
    }

    synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f56248a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    synchronized List k(Class cls, Class cls2, o oVar) {
        List listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, oVar);
        return listJ;
    }
}
