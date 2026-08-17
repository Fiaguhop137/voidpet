package p155ia;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f43807i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f43808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f43810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e f43813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f43814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f43815h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f43811d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f43829f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f43811d;
        }
    }

    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f43820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f43821b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43822c;

        d() {
            this.f43820a = h.this.f43813f.f43827d;
            this.f43822c = h.this.f43812e;
        }

        final e a() {
            e eVar = this.f43820a;
            h hVar = h.this;
            if (eVar == hVar.f43813f) {
                throw new NoSuchElementException();
            }
            if (hVar.f43812e != this.f43822c) {
                throw new ConcurrentModificationException();
            }
            this.f43820a = eVar.f43827d;
            this.f43821b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f43820a != h.this.f43813f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f43821b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.f(eVar, true);
            this.f43821b = null;
            this.f43822c = h.this.f43812e;
        }
    }

    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f43824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f43825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f43826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f43827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f43828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f43829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f43830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f43831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f43832i;

        e(boolean z10) {
            this.f43829f = null;
            this.f43830g = z10;
            this.f43828e = this;
            this.f43827d = this;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f43824a = eVar;
            this.f43829f = obj;
            this.f43830g = z10;
            this.f43832i = 1;
            this.f43827d = eVar2;
            this.f43828e = eVar3;
            eVar3.f43827d = this;
            eVar2.f43828e = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f43825b; eVar2 != null; eVar2 = eVar2.f43825b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f43826c; eVar2 != null; eVar2 = eVar2.f43826c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f43829f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f43831h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f43829f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f43831h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f43829f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f43831h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f43830g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f43831h;
            this.f43831h = obj;
            return obj2;
        }

        public String toString() {
            return this.f43829f + "=" + this.f43831h;
        }
    }

    public h() {
        this(f43807i, true);
    }

    public h(Comparator comparator, boolean z10) {
        this.f43811d = 0;
        this.f43812e = 0;
        this.f43808a = comparator == null ? f43807i : comparator;
        this.f43809b = z10;
        this.f43813f = new e(z10);
    }

    public h(boolean z10) {
        this(f43807i, z10);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f43825b;
            e eVar3 = eVar.f43826c;
            int i10 = eVar2 != null ? eVar2.f43832i : 0;
            int i11 = eVar3 != null ? eVar3.f43832i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f43825b;
                e eVar5 = eVar3.f43826c;
                int i13 = (eVar4 != null ? eVar4.f43832i : 0) - (eVar5 != null ? eVar5.f43832i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    k(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f43825b;
                e eVar7 = eVar2.f43826c;
                int i14 = (eVar6 != null ? eVar6.f43832i : 0) - (eVar7 != null ? eVar7.f43832i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    k(eVar);
                } else {
                    i(eVar2);
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f43832i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f43832i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f43824a;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f43824a;
        eVar.f43824a = null;
        if (eVar2 != null) {
            eVar2.f43824a = eVar3;
        }
        if (eVar3 == null) {
            this.f43810c = eVar2;
        } else if (eVar3.f43825b == eVar) {
            eVar3.f43825b = eVar2;
        } else {
            eVar3.f43826c = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f43825b;
        e eVar3 = eVar.f43826c;
        e eVar4 = eVar3.f43825b;
        e eVar5 = eVar3.f43826c;
        eVar.f43826c = eVar4;
        if (eVar4 != null) {
            eVar4.f43824a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f43825b = eVar;
        eVar.f43824a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f43832i : 0, eVar4 != null ? eVar4.f43832i : 0) + 1;
        eVar.f43832i = iMax;
        eVar3.f43832i = Math.max(iMax, eVar5 != null ? eVar5.f43832i : 0) + 1;
    }

    private void k(e eVar) {
        e eVar2 = eVar.f43825b;
        e eVar3 = eVar.f43826c;
        e eVar4 = eVar2.f43825b;
        e eVar5 = eVar2.f43826c;
        eVar.f43825b = eVar5;
        if (eVar5 != null) {
            eVar5.f43824a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f43826c = eVar;
        eVar.f43824a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f43832i : 0, eVar5 != null ? eVar5.f43832i : 0) + 1;
        eVar.f43832i = iMax;
        eVar2.f43832i = Math.max(iMax, eVar4 != null ? eVar4.f43832i : 0) + 1;
    }

    e b(Object obj, boolean z10) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f43808a;
        e eVar2 = this.f43810c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f43807i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f43829f) : comparator.compare(obj, eVar2.f43829f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f43825b : eVar2.f43826c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e eVar5 = this.f43813f;
        if (eVar4 != null) {
            eVar = new e(this.f43809b, eVar4, obj, eVar5, eVar5.f43828e);
            if (iCompareTo < 0) {
                eVar4.f43825b = eVar;
            } else {
                eVar4.f43826c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f43807i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f43809b, eVar4, obj, eVar5, eVar5.f43828e);
            this.f43810c = eVar;
        }
        this.f43811d++;
        this.f43812e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f43831h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f43810c = null;
        this.f43811d = 0;
        this.f43812e++;
        e eVar = this.f43813f;
        eVar.f43828e = eVar;
        eVar.f43827d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f43814g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f43814g = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f43828e;
            eVar2.f43827d = eVar.f43827d;
            eVar.f43827d.f43828e = eVar2;
        }
        e eVar3 = eVar.f43825b;
        e eVar4 = eVar.f43826c;
        e eVar5 = eVar.f43824a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f43825b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f43826c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f43811d--;
            this.f43812e++;
            return;
        }
        e eVarB = eVar3.f43832i > eVar4.f43832i ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e eVar6 = eVar.f43825b;
        if (eVar6 != null) {
            i10 = eVar6.f43832i;
            eVarB.f43825b = eVar6;
            eVar6.f43824a = eVarB;
            eVar.f43825b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f43826c;
        if (eVar7 != null) {
            i11 = eVar7.f43832i;
            eVarB.f43826c = eVar7;
            eVar7.f43824a = eVarB;
            eVar.f43826c = null;
        }
        eVarB.f43832i = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f43831h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f43815h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f43815h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f43809b) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f43831h;
        eVarB.f43831h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f43831h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f43811d;
    }
}
