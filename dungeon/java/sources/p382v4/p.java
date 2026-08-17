package p382v4;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p199l1.e;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f56233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f56234b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f56235a = new HashMap();

        /* JADX INFO: renamed from: v4.p$a$a, reason: collision with other inner class name */
        private static class C0717a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f56236a;

            public C0717a(List list) {
                this.f56236a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f56235a.clear();
        }

        public List b(Class cls) {
            C0717a c0717a = (C0717a) this.f56235a.get(cls);
            if (c0717a == null) {
                return null;
            }
            return c0717a.f56236a;
        }

        public void c(Class cls, List list) {
            if (((C0717a) this.f56235a.put(cls, new C0717a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(e eVar) {
        this(new r(eVar));
    }

    private p(r rVar) {
        this.f56234b = new a();
        this.f56233a = rVar;
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f56234b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f56233a.c(cls));
            this.f56234b.c(cls, listB);
        }
        return listB;
    }

    private void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).e();
        }
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f56233a.b(cls, cls2, oVar);
        this.f56234b.a();
    }

    public synchronized List c(Class cls) {
        return this.f56233a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new i.c(obj);
        }
        int size = listE.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.b(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new i.c(obj, listE);
        }
        return arrayList;
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        this.f56233a.i(cls, cls2, oVar);
        this.f56234b.a();
    }

    public synchronized void g(Class cls, Class cls2, o oVar) {
        h(this.f56233a.k(cls, cls2, oVar));
        this.f56234b.a();
    }
}
