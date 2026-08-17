package Be;

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

/* JADX INFO: loaded from: classes3.dex */
abstract class u extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile e f794e;

    static class a extends u {
        a(int i10) {
            super(i10, null);
        }

        @Override // Be.u
        public void p() {
            if (!n()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((h.b) entryH.getKey()).f()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((h.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((h.b) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f795a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f796b = new C0019b();

        static class a implements Iterator {
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

        /* JADX INFO: renamed from: Be.u$b$b, reason: collision with other inner class name */
        static class C0019b implements Iterable {
            C0019b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f795a;
            }
        }

        static Iterable b() {
            return f796b;
        }
    }

    private class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f798b;

        c(Comparable comparable, Object obj) {
            this.f797a = comparable;
            this.f798b = obj;
        }

        c(u uVar, Map.Entry entry) {
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
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
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
            return g(this.f797a, entry.getKey()) && g(this.f798b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f798b;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f797a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f797a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f798b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.f();
            Object obj2 = this.f798b;
            this.f798b = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f797a);
            String strValueOf2 = String.valueOf(this.f798b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }
    }

    private class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f802c;

        private d() {
            this.f800a = -1;
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }

        private Iterator a() {
            if (this.f802c == null) {
                this.f802c = u.this.f792c.entrySet().iterator();
            }
            return this.f802c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f801b = true;
            int i10 = this.f800a + 1;
            this.f800a = i10;
            return i10 < u.this.f791b.size() ? (Map.Entry) u.this.f791b.get(this.f800a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f800a + 1 < u.this.f791b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f801b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f801b = false;
            u.this.f();
            if (this.f800a >= u.this.f791b.size()) {
                a().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f800a;
            this.f800a = i10 - 1;
            uVar.s(i10);
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }
    }

    private u(int i10) {
        this.f790a = i10;
        this.f791b = Collections.EMPTY_LIST;
        this.f792c = Collections.EMPTY_MAP;
    }

    /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int e(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f791b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((c) this.f791b.get(i12)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((c) this.f791b.get(i13)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((c) this.f791b.get(i12)).getKey());
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
    public void f() {
        if (this.f793d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f791b.isEmpty() || (this.f791b instanceof ArrayList)) {
            return;
        }
        this.f791b = new ArrayList(this.f790a);
    }

    private SortedMap m() {
        f();
        if (this.f792c.isEmpty() && !(this.f792c instanceof TreeMap)) {
            this.f792c = new TreeMap();
        }
        return (SortedMap) this.f792c;
    }

    static u q(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object s(int i10) {
        f();
        Object value = ((c) this.f791b.remove(i10)).getValue();
        if (!this.f792c.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            this.f791b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f791b.isEmpty()) {
            this.f791b.clear();
        }
        if (this.f792c.isEmpty()) {
            return;
        }
        this.f792c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f792c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f794e == null) {
            this.f794e = new e(this, null);
        }
        return this.f794e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f791b.get(iE)).getValue() : this.f792c.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f791b.get(i10);
    }

    public int i() {
        return this.f791b.size();
    }

    public Iterable k() {
        return this.f792c.isEmpty() ? b.b() : this.f792c.entrySet();
    }

    public boolean n() {
        return this.f793d;
    }

    public void p() {
        if (this.f793d) {
            return;
        }
        this.f792c = this.f792c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f792c);
        this.f793d = true;
    }

    public Object r(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f791b.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f790a) {
            return m().put(comparable, obj);
        }
        int size = this.f791b.size();
        int i11 = this.f790a;
        if (size == i11) {
            c cVar = (c) this.f791b.remove(i11 - 1);
            m().put(cVar.getKey(), cVar.getValue());
        }
        this.f791b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return s(iE);
        }
        if (this.f792c.isEmpty()) {
            return null;
        }
        return this.f792c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f791b.size() + this.f792c.size();
    }
}
