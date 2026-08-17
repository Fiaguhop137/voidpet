package p269p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f50712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f50713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f50714c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50715d = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        c b(c cVar) {
            return cVar.f50719d;
        }

        @Override // p.b.e
        c c(c cVar) {
            return cVar.f50718c;
        }
    }

    /* JADX INFO: renamed from: p.b$b, reason: collision with other inner class name */
    private static class C0603b extends e {
        C0603b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.b.e
        c b(c cVar) {
            return cVar.f50718c;
        }

        @Override // p.b.e
        c c(c cVar) {
            return cVar.f50719d;
        }
    }

    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f50716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f50717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f50718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f50719d;

        c(Object obj, Object obj2) {
            this.f50716a = obj;
            this.f50717b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f50716a.equals(cVar.f50716a) && this.f50717b.equals(cVar.f50717b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f50716a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f50717b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f50716a.hashCode() ^ this.f50717b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f50716a + "=" + this.f50717b;
        }
    }

    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f50720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50721b = true;

        d() {
        }

        @Override // p.b.f
        void a(c cVar) {
            c cVar2 = this.f50720a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f50719d;
                this.f50720a = cVar3;
                this.f50721b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f50721b) {
                this.f50721b = false;
                this.f50720a = b.this.f50712a;
            } else {
                c cVar = this.f50720a;
                this.f50720a = cVar != null ? cVar.f50718c : null;
            }
            return this.f50720a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f50721b) {
                return b.this.f50712a != null;
            }
            c cVar = this.f50720a;
            return (cVar == null || cVar.f50718c == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f50723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f50724b;

        e(c cVar, c cVar2) {
            this.f50723a = cVar2;
            this.f50724b = cVar;
        }

        private c f() {
            c cVar = this.f50724b;
            c cVar2 = this.f50723a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // p.b.f
        public void a(c cVar) {
            if (this.f50723a == cVar && cVar == this.f50724b) {
                this.f50724b = null;
                this.f50723a = null;
            }
            c cVar2 = this.f50723a;
            if (cVar2 == cVar) {
                this.f50723a = b(cVar2);
            }
            if (this.f50724b == cVar) {
                this.f50724b = f();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f50724b;
            this.f50724b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50724b != null;
        }
    }

    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f50712a;
    }

    protected c c(Object obj) {
        c cVar = this.f50712a;
        while (cVar != null && !cVar.f50716a.equals(obj)) {
            cVar = cVar.f50718c;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        C0603b c0603b = new C0603b(this.f50713b, this.f50712a);
        this.f50714c.put(c0603b, Boolean.FALSE);
        return c0603b;
    }

    public d e() {
        d dVar = new d();
        this.f50714c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry g() {
        return this.f50713b;
    }

    c h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f50715d++;
        c cVar2 = this.f50713b;
        if (cVar2 == null) {
            this.f50712a = cVar;
            this.f50713b = cVar;
            return cVar;
        }
        cVar2.f50718c = cVar;
        cVar.f50719d = cVar2;
        this.f50713b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Object i(Object obj, Object obj2) {
        c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f50717b;
        }
        h(obj, obj2);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f50712a, this.f50713b);
        this.f50714c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f50715d--;
        if (!this.f50714c.isEmpty()) {
            Iterator it = this.f50714c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f50719d;
        if (cVar != null) {
            cVar.f50718c = cVarC.f50718c;
        } else {
            this.f50712a = cVarC.f50718c;
        }
        c cVar2 = cVarC.f50718c;
        if (cVar2 != null) {
            cVar2.f50719d = cVar;
        } else {
            this.f50713b = cVar;
        }
        cVarC.f50718c = null;
        cVarC.f50719d = null;
        return cVarC.f50717b;
    }

    public int size() {
        return this.f50715d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
