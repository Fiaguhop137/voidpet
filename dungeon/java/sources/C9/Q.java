package C9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f1514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f1515b;

        /* JADX INFO: renamed from: C9.Q$a$a, reason: collision with other inner class name */
        class C0035a extends AbstractC0859b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator f1516c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator f1517d;

            C0035a() {
                this.f1516c = a.this.f1514a.iterator();
                this.f1517d = a.this.f1515b.iterator();
            }

            @Override // C9.AbstractC0859b
            protected Object a() {
                if (this.f1516c.hasNext()) {
                    return this.f1516c.next();
                }
                while (this.f1517d.hasNext()) {
                    Object next = this.f1517d.next();
                    if (!a.this.f1514a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f1514a = set;
            this.f1515b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V iterator() {
            return new C0035a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f1514a.contains(obj) || this.f1515b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f1514a.isEmpty() && this.f1515b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f1514a.size();
            Iterator it = this.f1515b.iterator();
            while (it.hasNext()) {
                if (!this.f1514a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f1519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f1520b;

        class a extends AbstractC0859b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator f1521c;

            a() {
                this.f1521c = b.this.f1519a.iterator();
            }

            @Override // C9.AbstractC0859b
            protected Object a() {
                while (this.f1521c.hasNext()) {
                    Object next = this.f1521c.next();
                    if (b.this.f1520b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f1519a = set;
            this.f1520b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public V iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f1519a.contains(obj) && this.f1520b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f1519a.containsAll(collection) && this.f1520b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f1520b, this.f1519a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f1519a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f1520b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    private static class c extends AbstractC0866i.a implements Set {
        c(Set set, B9.o oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Q.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Q.d(this);
        }
    }

    private static class d extends c implements SortedSet {
        d(SortedSet sortedSet, B9.o oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f1577a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return x.h(this.f1577a.iterator(), this.f1578b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new d(((SortedSet) this.f1577a).headSet(obj), this.f1578b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f1577a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f1578b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new d(((SortedSet) this.f1577a).subSet(obj, obj2), this.f1578b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new d(((SortedSet) this.f1577a).tailSet(obj), this.f1578b);
        }
    }

    static abstract class e extends AbstractSet {
        e() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Q.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) B9.n.j(collection));
        }
    }

    public static abstract class f extends AbstractSet {
        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract V iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    static boolean a(Set set, Object obj) {
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

    public static Set b(Set set, B9.o oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) B9.n.j(set), (B9.o) B9.n.j(oVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f1577a, B9.p.b(cVar.f1578b, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, B9.o oVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) B9.n.j(sortedSet), (B9.o) B9.n.j(oVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f1577a, B9.p.b(cVar.f1578b, oVar));
    }

    static int d(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static f e(Set set, Set set2) {
        B9.n.k(set, "set1");
        B9.n.k(set2, "set2");
        return new b(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i10) {
        return new HashSet(B.a(i10));
    }

    public static Set h() {
        return Collections.newSetFromMap(B.f());
    }

    static boolean i(Set set, Collection collection) {
        B9.n.j(collection);
        if (collection instanceof F) {
            collection = ((F) collection).r2();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : x.o(set.iterator(), collection);
    }

    static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static f k(Set set, Set set2) {
        B9.n.k(set, "set1");
        B9.n.k(set2, "set2");
        return new a(set, set2);
    }
}
