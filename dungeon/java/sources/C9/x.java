package C9;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    class a extends AbstractC0859b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f1634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ B9.o f1635d;

        a(Iterator it, B9.o oVar) {
            this.f1634c = it;
            this.f1635d = oVar;
        }

        @Override // C9.AbstractC0859b
        protected Object a() {
            while (this.f1634c.hasNext()) {
                Object next = this.f1634c.next();
                if (this.f1635d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    private enum b implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC0865h.c(false);
        }
    }

    private static final class c extends V {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1639b;

        c(Object obj) {
            this.f1638a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f1639b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1639b) {
                throw new NoSuchElementException();
            }
            this.f1639b = true;
            return this.f1638a;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        B9.n.j(collection);
        B9.n.j(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, B9.o oVar) {
        return m(it, oVar) != -1;
    }

    static void c(Iterator it) {
        B9.n.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !B9.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static Iterator f() {
        return b.INSTANCE;
    }

    public static V g(Iterator it, B9.o oVar) {
        B9.n.j(it);
        B9.n.j(oVar);
        return new a(it, oVar);
    }

    public static Object h(Iterator it, B9.o oVar) {
        B9.n.j(it);
        B9.n.j(oVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object i(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object j(Iterator it, Object obj) {
        return it.hasNext() ? i(it) : obj;
    }

    public static Object k(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object l(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int m(Iterator it, B9.o oVar) {
        B9.n.k(oVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static Object n(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean o(Iterator it, Collection collection) {
        B9.n.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean p(Iterator it, B9.o oVar) {
        B9.n.j(oVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static V q(Object obj) {
        return new c(obj);
    }
}
