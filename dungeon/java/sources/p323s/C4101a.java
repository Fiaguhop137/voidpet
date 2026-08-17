package p323s;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p341t.a;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4101a extends f0 implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0638a f52665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f52666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    e f52667f;

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    final class C0638a extends AbstractSet {
        C0638a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C4101a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4101a.this.size();
        }
    }

    /* JADX INFO: renamed from: s.a$b */
    final class b extends AbstractC4109i {
        b() {
            super(C4101a.this.size());
        }

        @Override // p323s.AbstractC4109i
        protected Object a(int i10) {
            return C4101a.this.f(i10);
        }

        @Override // p323s.AbstractC4109i
        protected void b(int i10) {
            C4101a.this.h(i10);
        }
    }

    /* JADX INFO: renamed from: s.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C4101a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C4101a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C4101a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C4101a.n(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C4101a.this.size() - 1; size >= 0; size--) {
                Object objF = C4101a.this.f(size);
                iHashCode += objF == null ? 0 : objF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C4101a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C4101a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iD = C4101a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            C4101a.this.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C4101a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C4101a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C4101a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C4101a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4101a.this.f(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4101a.this.f(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: s.a$d */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f52672b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f52673c;

        d() {
            this.f52671a = C4101a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f52672b++;
            this.f52673c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f52673c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a.c(entry.getKey(), C4101a.this.f(this.f52672b)) && a.c(entry.getValue(), C4101a.this.k(this.f52672b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f52673c) {
                return C4101a.this.f(this.f52672b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f52673c) {
                return C4101a.this.k(this.f52672b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52672b < this.f52671a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f52673c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objF = C4101a.this.f(this.f52672b);
            Object objK = C4101a.this.k(this.f52672b);
            return (objF == null ? 0 : objF.hashCode()) ^ (objK != null ? objK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f52673c) {
                throw new IllegalStateException();
            }
            C4101a.this.h(this.f52672b);
            this.f52672b--;
            this.f52671a--;
            this.f52673c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f52673c) {
                return C4101a.this.i(this.f52672b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: s.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C4101a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C4101a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C4101a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C4101a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C4101a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C4101a.this.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C4101a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C4101a.this.k(i10))) {
                    C4101a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C4101a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C4101a.this.k(i10))) {
                    C4101a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C4101a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C4101a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4101a.this.k(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C4101a.this.k(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: s.a$f */
    final class f extends AbstractC4109i {
        f() {
            super(C4101a.this.size());
        }

        @Override // p323s.AbstractC4109i
        protected Object a(int i10) {
            return C4101a.this.k(i10);
        }

        @Override // p323s.AbstractC4109i
        protected void b(int i10) {
            C4101a.this.h(i10);
        }
    }

    public C4101a() {
    }

    public C4101a(int i10) {
        super(i10);
    }

    public C4101a(f0 f0Var) {
        super(f0Var);
    }

    static boolean n(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p323s.f0, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // p323s.f0, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0638a c0638a = this.f52665d;
        if (c0638a != null) {
            return c0638a;
        }
        C0638a c0638a2 = new C0638a();
        this.f52665d = c0638a2;
        return c0638a2;
    }

    @Override // p323s.f0, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f52666e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f52666e = cVar2;
        return cVar2;
    }

    public boolean m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean p(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // p323s.f0, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f52667f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f52667f = eVar2;
        return eVar2;
    }
}
