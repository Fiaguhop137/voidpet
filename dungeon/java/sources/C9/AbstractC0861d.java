package C9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: C9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0861d extends AbstractC0863f implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map f1534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f1535f;

    /* JADX INFO: renamed from: C9.d$a */
    class a extends AbstractC0036d {
        a() {
            super();
        }

        @Override // C9.AbstractC0861d.AbstractC0036d
        Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* JADX INFO: renamed from: C9.d$b */
    class b extends AbstractC0036d {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.AbstractC0861d.AbstractC0036d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return B.d(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: C9.d$c */
    private class c extends B.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient Map f1538c;

        /* JADX INFO: renamed from: C9.d$c$a */
        class a extends B.c {
            a() {
            }

            @Override // C9.B.c
            Map a() {
                return c.this;
            }

            @Override // C9.B.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC0866i.c(c.this.f1538c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC0861d.this.w(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: C9.d$c$b */
        class b implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator f1541a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Collection f1542b;

            b() {
                this.f1541a = c.this.f1538c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f1541a.next();
                this.f1542b = (Collection) entry.getValue();
                return c.this.e(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1541a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                B9.n.p(this.f1542b != null, "no calls to next() since the last call to remove()");
                this.f1541a.remove();
                AbstractC0861d.p(AbstractC0861d.this, this.f1542b.size());
                this.f1542b.clear();
                this.f1542b = null;
            }
        }

        c(Map map) {
            this.f1538c = map;
        }

        @Override // C9.B.f
        protected Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) B.h(this.f1538c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC0861d.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f1538c == AbstractC0861d.this.f1534e) {
                AbstractC0861d.this.clear();
            } else {
                x.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return B.g(this.f1538c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f1538c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionR = AbstractC0861d.this.r();
            collectionR.addAll(collection);
            AbstractC0861d.p(AbstractC0861d.this, collection.size());
            collection.clear();
            return collectionR;
        }

        Map.Entry e(Map.Entry entry) {
            Object key = entry.getKey();
            return B.d(key, AbstractC0861d.this.y(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f1538c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f1538c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set g() {
            return AbstractC0861d.this.i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f1538c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f1538c.toString();
        }
    }

    /* JADX INFO: renamed from: C9.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0036d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f1544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1545b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection f1546c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator f1547d = x.f();

        AbstractC0036d() {
            this.f1544a = AbstractC0861d.this.f1534e.entrySet().iterator();
        }

        abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1544a.hasNext() || this.f1547d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f1547d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f1544a.next();
                this.f1545b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f1546c = collection;
                this.f1547d = collection.iterator();
            }
            return a(H.a(this.f1545b), this.f1547d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f1547d.remove();
            Collection collection = this.f1546c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f1544a.remove();
            }
            AbstractC0861d.n(AbstractC0861d.this);
        }
    }

    /* JADX INFO: renamed from: C9.d$e */
    private class e extends B.d {

        /* JADX INFO: renamed from: C9.d$e$a */
        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Map.Entry f1550a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f1551b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f1552c;

            a(e eVar, Iterator it) {
                this.f1551b = it;
                this.f1552c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f1551b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f1551b.next();
                this.f1550a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                B9.n.p(this.f1550a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f1550a.getValue();
                this.f1551b.remove();
                AbstractC0861d.p(AbstractC0861d.this, collection.size());
                collection.clear();
                this.f1550a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC0861d.p(AbstractC0861d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: C9.d$f */
    private final class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = h().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return e(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return h().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC0861d.this.new f(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = h().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return e(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = h().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return e(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return h().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return AbstractC0861d.this.new f(h().headMap(obj, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = h().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return e(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return h().higherKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.AbstractC0861d.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet f() {
            return AbstractC0861d.this.new g(h());
        }

        @Override // C9.AbstractC0861d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // C9.AbstractC0861d.i, C9.AbstractC0861d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = h().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return e(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = h().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return e(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return h().lowerKey(obj);
        }

        Map.Entry m(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionR = AbstractC0861d.this.r();
            collectionR.addAll((Collection) entry.getValue());
            it.remove();
            return B.d(entry.getKey(), AbstractC0861d.this.x(collectionR));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.AbstractC0861d.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap h() {
            return (NavigableMap) super.h();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return g();
        }

        @Override // C9.AbstractC0861d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // C9.AbstractC0861d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC0861d.this.new f(h().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return AbstractC0861d.this.new f(h().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: C9.d$g */
    private final class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return c().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC0861d.this.new g(c().descendingMap());
        }

        @Override // C9.AbstractC0861d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return c().floorKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.AbstractC0861d.j
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap c() {
            return (NavigableMap) super.c();
        }

        @Override // C9.AbstractC0861d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return AbstractC0861d.this.new g(c().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return c().higherKey(obj);
        }

        @Override // C9.AbstractC0861d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return c().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return x.n(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return x.n(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC0861d.this.new g(c().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return AbstractC0861d.this.new g(c().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: C9.d$h */
    private class h extends l implements RandomAccess {
        h(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* JADX INFO: renamed from: C9.d$i */
    private class i extends c implements SortedMap {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        SortedSet f1556e;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return h().comparator();
        }

        SortedSet f() {
            return AbstractC0861d.this.new j(h());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return h().firstKey();
        }

        @Override // C9.AbstractC0861d.c, java.util.AbstractMap, java.util.Map
        public SortedSet g() {
            SortedSet sortedSet = this.f1556e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetF = f();
            this.f1556e = sortedSetF;
            return sortedSetF;
        }

        SortedMap h() {
            return (SortedMap) this.f1538c;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC0861d.this.new i(h().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return h().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC0861d.this.new i(h().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC0861d.this.new i(h().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: C9.d$j */
    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap c() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return c().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC0861d.this.new j(c().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return c().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC0861d.this.new j(c().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC0861d.this.new j(c().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: C9.d$k */
    class k extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f1559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection f1560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final k f1561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f1562d;

        /* JADX INFO: renamed from: C9.d$k$a */
        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator f1564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection f1565b;

            a() {
                Collection collection = k.this.f1560b;
                this.f1565b = collection;
                this.f1564a = AbstractC0861d.v(collection);
            }

            a(Iterator it) {
                this.f1565b = k.this.f1560b;
                this.f1564a = it;
            }

            Iterator a() {
                b();
                return this.f1564a;
            }

            void b() {
                k.this.h();
                if (k.this.f1560b != this.f1565b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f1564a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f1564a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f1564a.remove();
                AbstractC0861d.n(AbstractC0861d.this);
                k.this.i();
            }
        }

        k(Object obj, Collection collection, k kVar) {
            this.f1559a = obj;
            this.f1560b = collection;
            this.f1561c = kVar;
            this.f1562d = kVar == null ? null : kVar.e();
        }

        void a() {
            k kVar = this.f1561c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractC0861d.this.f1534e.put(this.f1559a, this.f1560b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            h();
            boolean zIsEmpty = this.f1560b.isEmpty();
            boolean zAdd = this.f1560b.add(obj);
            if (zAdd) {
                AbstractC0861d.m(AbstractC0861d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f1560b.addAll(collection);
            if (zAddAll) {
                AbstractC0861d.o(AbstractC0861d.this, this.f1560b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        k c() {
            return this.f1561c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f1560b.clear();
            AbstractC0861d.p(AbstractC0861d.this, size);
            i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            h();
            return this.f1560b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            h();
            return this.f1560b.containsAll(collection);
        }

        Collection e() {
            return this.f1560b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f1560b.equals(obj);
        }

        Object g() {
            return this.f1559a;
        }

        void h() {
            Collection collection;
            k kVar = this.f1561c;
            if (kVar != null) {
                kVar.h();
                if (this.f1561c.e() != this.f1562d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f1560b.isEmpty() || (collection = (Collection) AbstractC0861d.this.f1534e.get(this.f1559a)) == null) {
                    return;
                }
                this.f1560b = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            h();
            return this.f1560b.hashCode();
        }

        void i() {
            k kVar = this.f1561c;
            if (kVar != null) {
                kVar.i();
            } else if (this.f1560b.isEmpty()) {
                AbstractC0861d.this.f1534e.remove(this.f1559a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            h();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            h();
            boolean zRemove = this.f1560b.remove(obj);
            if (zRemove) {
                AbstractC0861d.n(AbstractC0861d.this);
                i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f1560b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC0861d.o(AbstractC0861d.this, this.f1560b.size() - size);
                i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            B9.n.j(collection);
            int size = size();
            boolean zRetainAll = this.f1560b.retainAll(collection);
            if (zRetainAll) {
                AbstractC0861d.o(AbstractC0861d.this, this.f1560b.size() - size);
                i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            h();
            return this.f1560b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            h();
            return this.f1560b.toString();
        }
    }

    /* JADX INFO: renamed from: C9.d$l */
    class l extends k implements List {

        /* JADX INFO: renamed from: C9.d$l$a */
        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            public a(int i10) {
                super(l.this.j().listIterator(i10));
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(obj);
                AbstractC0861d.m(AbstractC0861d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            h();
            boolean zIsEmpty = e().isEmpty();
            j().add(i10, obj);
            AbstractC0861d.m(AbstractC0861d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = j().addAll(i10, collection);
            if (zAddAll) {
                AbstractC0861d.o(AbstractC0861d.this, e().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            h();
            return j().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            h();
            return j().indexOf(obj);
        }

        List j() {
            return (List) e();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            h();
            return j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            h();
            return new a();
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            h();
            return new a(i10);
        }

        @Override // java.util.List
        public Object remove(int i10) {
            h();
            Object objRemove = j().remove(i10);
            AbstractC0861d.n(AbstractC0861d.this);
            i();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            h();
            return j().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            h();
            return AbstractC0861d.this.z(g(), j().subList(i10, i11), c() == null ? this : c());
        }
    }

    protected AbstractC0861d(Map map) {
        B9.n.d(map.isEmpty());
        this.f1534e = map;
    }

    static /* synthetic */ int m(AbstractC0861d abstractC0861d) {
        int i10 = abstractC0861d.f1535f;
        abstractC0861d.f1535f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int n(AbstractC0861d abstractC0861d) {
        int i10 = abstractC0861d.f1535f;
        abstractC0861d.f1535f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int o(AbstractC0861d abstractC0861d, int i10) {
        int i11 = abstractC0861d.f1535f + i10;
        abstractC0861d.f1535f = i11;
        return i11;
    }

    static /* synthetic */ int p(AbstractC0861d abstractC0861d, int i10) {
        int i11 = abstractC0861d.f1535f - i10;
        abstractC0861d.f1535f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator v(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj) {
        Collection collection = (Collection) B.i(this.f1534e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f1535f -= size;
        }
    }

    @Override // C9.AbstractC0863f, C9.C
    public Collection a() {
        return super.a();
    }

    @Override // C9.C
    public void clear() {
        Iterator it = this.f1534e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f1534e.clear();
        this.f1535f = 0;
    }

    @Override // C9.AbstractC0863f
    Collection e() {
        return new AbstractC0863f.a();
    }

    @Override // C9.AbstractC0863f
    Collection g() {
        return new AbstractC0863f.b();
    }

    @Override // C9.C
    public Collection get(Object obj) {
        Collection collectionS = (Collection) this.f1534e.get(obj);
        if (collectionS == null) {
            collectionS = s(obj);
        }
        return y(obj, collectionS);
    }

    @Override // C9.AbstractC0863f
    Iterator h() {
        return new b();
    }

    @Override // C9.AbstractC0863f
    Iterator j() {
        return new a();
    }

    @Override // C9.C
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f1534e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f1535f++;
            return true;
        }
        Collection collectionS = s(obj);
        if (!collectionS.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f1535f++;
        this.f1534e.put(obj, collectionS);
        return true;
    }

    abstract Collection r();

    Collection s(Object obj) {
        return r();
    }

    @Override // C9.C
    public int size() {
        return this.f1535f;
    }

    final Map t() {
        Map map = this.f1534e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f1534e);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f1534e) : new c(this.f1534e);
    }

    final Set u() {
        Map map = this.f1534e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f1534e);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f1534e) : new e(this.f1534e);
    }

    @Override // C9.AbstractC0863f, C9.C
    public Collection values() {
        return super.values();
    }

    abstract Collection x(Collection collection);

    abstract Collection y(Object obj, Collection collection);

    final List z(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(obj, list, kVar) : new l(obj, list, kVar);
    }
}
