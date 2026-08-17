package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class d0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f23417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f23418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile f f23420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f23421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f23422f;

    class a extends d0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.u((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        public void s() {
            if (!r()) {
                if (m() > 0) {
                    android.support.v4.media.session.b.a(k(0).getKey());
                    throw null;
                }
                Iterator it = p().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.s();
        }
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f23424b;

        private b() {
            this.f23423a = d0.this.f23417a.size();
        }

        /* synthetic */ b(d0 d0Var, a aVar) {
            this();
        }

        private Iterator a() {
            if (this.f23424b == null) {
                this.f23424b = d0.this.f23421e.entrySet().iterator();
            }
            return this.f23424b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = d0.this.f23417a;
            int i10 = this.f23423a - 1;
            this.f23423a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f23423a;
            return (i10 > 0 && i10 <= d0.this.f23417a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends f {
        private c() {
            super(d0.this, null);
        }

        /* synthetic */ c(d0 d0Var, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.d0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(d0.this, null);
        }
    }

    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f23427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f23428b;

        d(Comparable comparable, Object obj) {
            this.f23427a = comparable;
            this.f23428b = obj;
        }

        d(d0 d0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f23427a, entry.getKey()) && g(this.f23428b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f23428b;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f23427a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f23427a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f23428b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            d0.this.g();
            Object obj2 = this.f23428b;
            this.f23428b = obj;
            return obj2;
        }

        public String toString() {
            return this.f23427a + "=" + this.f23428b;
        }
    }

    private class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f23432c;

        private e() {
            this.f23430a = -1;
        }

        /* synthetic */ e(d0 d0Var, a aVar) {
            this();
        }

        private Iterator a() {
            if (this.f23432c == null) {
                this.f23432c = d0.this.f23418b.entrySet().iterator();
            }
            return this.f23432c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f23431b = true;
            int i10 = this.f23430a + 1;
            this.f23430a = i10;
            return i10 < d0.this.f23417a.size() ? (Map.Entry) d0.this.f23417a.get(this.f23430a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23430a + 1 < d0.this.f23417a.size() || (!d0.this.f23418b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f23431b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f23431b = false;
            d0.this.g();
            if (this.f23430a >= d0.this.f23417a.size()) {
                a().remove();
                return;
            }
            d0 d0Var = d0.this;
            int i10 = this.f23430a;
            this.f23430a = i10 - 1;
            d0Var.v(i10);
        }
    }

    private class f extends AbstractSet {
        private f() {
        }

        /* synthetic */ f(d0 d0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            d0.this.u((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(d0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    private d0() {
        this.f23417a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f23418b = map;
        this.f23421e = map;
    }

    /* synthetic */ d0(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int f(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f23417a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((d) this.f23417a.get(i12)).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d) this.f23417a.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((d) this.f23417a.get(i12)).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f23419c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f23417a.isEmpty() || (this.f23417a instanceof ArrayList)) {
            return;
        }
        this.f23417a = new ArrayList(16);
    }

    private SortedMap q() {
        g();
        if (this.f23418b.isEmpty() && !(this.f23418b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23418b = treeMap;
            this.f23421e = treeMap.descendingMap();
        }
        return (SortedMap) this.f23418b;
    }

    static d0 t() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object v(int i10) {
        g();
        Object value = ((d) this.f23417a.remove(i10)).getValue();
        if (!this.f23418b.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f23417a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f23417a.isEmpty()) {
            this.f23417a.clear();
        }
        if (this.f23418b.isEmpty()) {
            return;
        }
        this.f23418b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f23418b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f23420d == null) {
            this.f23420d = new f(this, null);
        }
        return this.f23420d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size != d0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != d0Var.m()) {
            return entrySet().equals(d0Var.entrySet());
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (!k(i10).equals(d0Var.k(i10))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f23418b.equals(d0Var.f23418b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((d) this.f23417a.get(iF)).getValue() : this.f23418b.get(comparable);
    }

    Set h() {
        if (this.f23422f == null) {
            this.f23422f = new c(this, null);
        }
        return this.f23422f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += ((d) this.f23417a.get(i10)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f23418b.hashCode() : iHashCode;
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f23417a.get(i10);
    }

    public int m() {
        return this.f23417a.size();
    }

    public int n() {
        return this.f23418b.size();
    }

    public Iterable p() {
        return this.f23418b.isEmpty() ? Collections.EMPTY_SET : this.f23418b.entrySet();
    }

    public boolean r() {
        return this.f23419c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return v(iF);
        }
        if (this.f23418b.isEmpty()) {
            return null;
        }
        return this.f23418b.remove(comparable);
    }

    public void s() {
        if (this.f23419c) {
            return;
        }
        this.f23418b = this.f23418b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f23418b);
        this.f23421e = this.f23421e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f23421e);
        this.f23419c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23417a.size() + this.f23418b.size();
    }

    public Object u(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((d) this.f23417a.get(iF)).setValue(obj);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return q().put(comparable, obj);
        }
        if (this.f23417a.size() == 16) {
            d dVar = (d) this.f23417a.remove(15);
            q().put(dVar.getKey(), dVar.getValue());
        }
        this.f23417a.add(i10, new d(comparable, obj));
        return null;
    }
}
