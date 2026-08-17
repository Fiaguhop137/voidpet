package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class q0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f38001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f38002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f38004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f38005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f38006g;

    class a extends q0 {
        a(int i10) {
            super(i10, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.u((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.q0
        public void s() {
            if (!r()) {
                for (int i10 = 0; i10 < m(); i10++) {
                    Map.Entry entryK = k(i10);
                    if (((C3155v.b) entryK.getKey()).f()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry entry : p()) {
                    if (((C3155v.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.s();
        }
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f38008b;

        private b() {
            this.f38007a = q0.this.f38001b.size();
        }

        /* synthetic */ b(q0 q0Var, a aVar) {
            this();
        }

        private Iterator a() {
            if (this.f38008b == null) {
                this.f38008b = q0.this.f38005f.entrySet().iterator();
            }
            return this.f38008b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = q0.this.f38001b;
            int i10 = this.f38007a - 1;
            this.f38007a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f38007a;
            return (i10 > 0 && i10 <= q0.this.f38001b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends g {
        private c() {
            super(q0.this, null);
        }

        /* synthetic */ c(q0 q0Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.q0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(q0.this, null);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f38011a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f38012b = new b();

        class a implements Iterator {
            a() {
            }

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
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f38011a;
            }
        }

        static Iterable b() {
            return f38012b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f38013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f38014b;

        e(Comparable comparable, Object obj) {
            this.f38013a = comparable;
            this.f38014b = obj;
        }

        e(q0 q0Var, Map.Entry entry) {
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
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return g(this.f38013a, entry.getKey()) && g(this.f38014b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38014b;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f38013a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f38013a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f38014b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            q0.this.g();
            Object obj2 = this.f38014b;
            this.f38014b = obj;
            return obj2;
        }

        public String toString() {
            return this.f38013a + "=" + this.f38014b;
        }
    }

    private class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f38017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f38018c;

        private f() {
            this.f38016a = -1;
        }

        /* synthetic */ f(q0 q0Var, a aVar) {
            this();
        }

        private Iterator a() {
            if (this.f38018c == null) {
                this.f38018c = q0.this.f38002c.entrySet().iterator();
            }
            return this.f38018c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f38017b = true;
            int i10 = this.f38016a + 1;
            this.f38016a = i10;
            return i10 < q0.this.f38001b.size() ? (Map.Entry) q0.this.f38001b.get(this.f38016a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38016a + 1 < q0.this.f38001b.size() || (!q0.this.f38002c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f38017b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f38017b = false;
            q0.this.g();
            if (this.f38016a >= q0.this.f38001b.size()) {
                a().remove();
                return;
            }
            q0 q0Var = q0.this;
            int i10 = this.f38016a;
            this.f38016a = i10 - 1;
            q0Var.v(i10);
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        /* synthetic */ g(q0 q0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            q0.this.u((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(q0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q0.this.size();
        }
    }

    private q0(int i10) {
        this.f38000a = i10;
        this.f38001b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f38002c = map;
        this.f38005f = map;
    }

    /* synthetic */ q0(int i10, a aVar) {
        this(i10);
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
        int size = this.f38001b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((e) this.f38001b.get(i12)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((e) this.f38001b.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((e) this.f38001b.get(i12)).getKey());
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
        if (this.f38003d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f38001b.isEmpty() || (this.f38001b instanceof ArrayList)) {
            return;
        }
        this.f38001b = new ArrayList(this.f38000a);
    }

    private SortedMap q() {
        g();
        if (this.f38002c.isEmpty() && !(this.f38002c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f38002c = treeMap;
            this.f38005f = treeMap.descendingMap();
        }
        return (SortedMap) this.f38002c;
    }

    static q0 t(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object v(int i10) {
        g();
        Object value = ((e) this.f38001b.remove(i10)).getValue();
        if (!this.f38002c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f38001b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f38001b.isEmpty()) {
            this.f38001b.clear();
        }
        if (this.f38002c.isEmpty()) {
            return;
        }
        this.f38002c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f38002c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f38004e == null) {
            this.f38004e = new g(this, null);
        }
        return this.f38004e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        int size = size();
        if (size != q0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != q0Var.m()) {
            return entrySet().equals(q0Var.entrySet());
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (!k(i10).equals(q0Var.k(i10))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f38002c.equals(q0Var.f38002c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((e) this.f38001b.get(iF)).getValue() : this.f38002c.get(comparable);
    }

    Set h() {
        if (this.f38006g == null) {
            this.f38006g = new c(this, null);
        }
        return this.f38006g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM; i10++) {
            iHashCode += ((e) this.f38001b.get(i10)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f38002c.hashCode() : iHashCode;
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f38001b.get(i10);
    }

    public int m() {
        return this.f38001b.size();
    }

    public int n() {
        return this.f38002c.size();
    }

    public Iterable p() {
        return this.f38002c.isEmpty() ? d.b() : this.f38002c.entrySet();
    }

    public boolean r() {
        return this.f38003d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return v(iF);
        }
        if (this.f38002c.isEmpty()) {
            return null;
        }
        return this.f38002c.remove(comparable);
    }

    public void s() {
        if (this.f38003d) {
            return;
        }
        this.f38002c = this.f38002c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f38002c);
        this.f38005f = this.f38005f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f38005f);
        this.f38003d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f38001b.size() + this.f38002c.size();
    }

    public Object u(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((e) this.f38001b.get(iF)).setValue(obj);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= this.f38000a) {
            return q().put(comparable, obj);
        }
        int size = this.f38001b.size();
        int i11 = this.f38000a;
        if (size == i11) {
            e eVar = (e) this.f38001b.remove(i11 - 1);
            q().put(eVar.getKey(), eVar.getValue());
        }
        this.f38001b.add(i10, new e(comparable, obj));
        return null;
    }
}
