package C9;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: C9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0863f implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection f1569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f1570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f1571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map f1572d;

    /* JADX INFO: renamed from: C9.f$a */
    class a extends E.b {
        a() {
        }

        @Override // C9.E.b
        C a() {
            return AbstractC0863f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC0863f.this.h();
        }
    }

    /* JADX INFO: renamed from: C9.f$b */
    class b extends AbstractCollection {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC0863f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0863f.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC0863f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC0863f.this.size();
        }
    }

    AbstractC0863f() {
    }

    @Override // C9.C
    public Collection a() {
        Collection collection = this.f1569a;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f1569a = collectionE;
        return collectionE;
    }

    @Override // C9.C
    public Map asMap() {
        Map map = this.f1572d;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f1572d = mapD;
        return mapD;
    }

    @Override // C9.C
    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator it = asMap().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map d();

    abstract Collection e();

    public boolean equals(Object obj) {
        return E.a(this, obj);
    }

    abstract Set f();

    abstract Collection g();

    abstract Iterator h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set i() {
        Set set = this.f1570b;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f1570b = setF;
        return setF;
    }

    abstract Iterator j();

    @Override // C9.C
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // C9.C
    public Collection values() {
        Collection collection = this.f1571c;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.f1571c = collectionG;
        return collectionG;
    }
}
