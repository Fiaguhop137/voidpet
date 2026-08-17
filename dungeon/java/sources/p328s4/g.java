package p328s4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f53261a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f53262b = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f53263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f53264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f53265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f53266d;

        a() {
            this(null);
        }

        a(Object obj) {
            this.f53266d = this;
            this.f53265c = this;
            this.f53263a = obj;
        }

        public void a(Object obj) {
            if (this.f53264b == null) {
                this.f53264b = new ArrayList();
            }
            this.f53264b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f53264b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f53264b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f53261a;
        aVar.f53266d = aVar2;
        aVar.f53265c = aVar2.f53265c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f53261a;
        aVar.f53266d = aVar2.f53266d;
        aVar.f53265c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f53266d;
        aVar2.f53265c = aVar.f53265c;
        aVar.f53265c.f53266d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f53265c.f53266d = aVar;
        aVar.f53266d.f53265c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f53262b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f53262b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f53262b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f53262b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f53261a.f53266d; !aVar.equals(this.f53261a); aVar = aVar.f53266d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f53262b.remove(aVar.f53263a);
            ((l) aVar.f53263a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f53261a.f53265c;
        boolean z10 = false;
        while (!aVar.equals(this.f53261a)) {
            sb2.append('{');
            sb2.append(aVar.f53263a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f53265c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
