package C9;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: renamed from: C9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0877u implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f1619d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC0878v f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC0878v f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient r f1622c;

    /* JADX INFO: renamed from: C9.u$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f1623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f1624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0037a f1627e;

        /* JADX INFO: renamed from: C9.u$a$a, reason: collision with other inner class name */
        static final class C0037a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f1628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f1629b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f1630c;

            C0037a(Object obj, Object obj2, Object obj3) {
                this.f1628a = obj;
                this.f1629b = obj2;
                this.f1630c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f1628a + "=" + this.f1629b + " and " + this.f1628a + "=" + this.f1630c);
            }
        }

        public a() {
            this(4);
        }

        a(int i10) {
            this.f1624b = new Object[i10 * 2];
            this.f1625c = 0;
            this.f1626d = false;
        }

        private AbstractC0877u b(boolean z10) {
            Object[] objArrE;
            C0037a c0037a;
            C0037a c0037a2;
            if (z10 && (c0037a2 = this.f1627e) != null) {
                throw c0037a2.a();
            }
            int length = this.f1625c;
            if (this.f1623a == null) {
                objArrE = this.f1624b;
            } else {
                if (this.f1626d) {
                    this.f1624b = Arrays.copyOf(this.f1624b, length * 2);
                }
                objArrE = this.f1624b;
                if (!z10) {
                    objArrE = e(objArrE, this.f1625c);
                    if (objArrE.length < this.f1624b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f1623a);
            }
            this.f1626d = true;
            M mS = M.s(length, objArrE, this);
            if (!z10 || (c0037a = this.f1627e) == null) {
                return mS;
            }
            throw c0037a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f1624b;
            if (i11 > objArr.length) {
                this.f1624b = Arrays.copyOf(objArr, r.b.c(objArr.length, i11));
                this.f1626d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, J.b(comparator).d(B.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public AbstractC0877u a() {
            return c();
        }

        public AbstractC0877u c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f1625c + 1);
            AbstractC0865h.a(obj, obj2);
            Object[] objArr = this.f1624b;
            int i10 = this.f1625c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f1625c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f1625c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }
    }

    AbstractC0877u() {
    }

    public static a a() {
        return new a();
    }

    public static AbstractC0877u b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC0877u c(Map map) {
        if ((map instanceof AbstractC0877u) && !(map instanceof SortedMap)) {
            AbstractC0877u abstractC0877u = (AbstractC0877u) map;
            if (!abstractC0877u.h()) {
                return abstractC0877u;
            }
        }
        return b(map.entrySet());
    }

    public static AbstractC0877u k() {
        return M.f1491h;
    }

    public static AbstractC0877u m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC0865h.a(obj, obj2);
        AbstractC0865h.a(obj3, obj4);
        AbstractC0865h.a(obj5, obj6);
        AbstractC0865h.a(obj7, obj8);
        return M.r(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static AbstractC0877u n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC0865h.a(obj, obj2);
        AbstractC0865h.a(obj3, obj4);
        AbstractC0865h.a(obj5, obj6);
        AbstractC0865h.a(obj7, obj8);
        AbstractC0865h.a(obj9, obj10);
        return M.r(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static AbstractC0877u p(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC0878v d();

    abstract AbstractC0878v e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return B.c(this, obj);
    }

    abstract r f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC0878v entrySet() {
        AbstractC0878v abstractC0878v = this.f1620a;
        if (abstractC0878v != null) {
            return abstractC0878v;
        }
        AbstractC0878v abstractC0878vD = d();
        this.f1620a = abstractC0878vD;
        return abstractC0878vD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return Q.d(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC0878v keySet() {
        AbstractC0878v abstractC0878v = this.f1621b;
        if (abstractC0878v != null) {
            return abstractC0878v;
        }
        AbstractC0878v abstractC0878vE = e();
        this.f1621b = abstractC0878vE;
        return abstractC0878vE;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r values() {
        r rVar = this.f1622c;
        if (rVar != null) {
            return rVar;
        }
        r rVarF = f();
        this.f1622c = rVarF;
        return rVarF;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return B.j(this);
    }
}
