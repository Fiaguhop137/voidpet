package C9;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {

    class a extends T {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.T
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements B9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1474a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f1475b = new C0033b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f1476c = e();

        final enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // B9.f
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: C9.B$b$b, reason: collision with other inner class name */
        final enum C0033b extends b {
            C0033b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // B9.f
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        /* synthetic */ b(String str, int i10, A a10) {
            this(str, i10);
        }

        private static /* synthetic */ b[] e() {
            return new b[]{f1474a, f1475b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1476c.clone();
        }
    }

    static abstract class c extends Q.e {
        c() {
        }

        abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // C9.Q.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) B9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                return Q.j(this, collection.iterator());
            }
        }

        @Override // C9.Q.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) B9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = Q.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class d extends Q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f1477a;

        d(Map map) {
            this.f1477a = (Map) B9.n.j(map);
        }

        Map a() {
            return this.f1477a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    static class e extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f1478a;

        e(Map map) {
            this.f1478a = (Map) B9.n.j(map);
        }

        final Map a() {
            return this.f1478a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return B.l(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (B9.j.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) B9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Q.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) B9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = Q.f();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static abstract class f extends AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set f1479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection f1480b;

        f() {
        }

        abstract Set a();

        Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f1479a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f1479a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f1480b;
            if (collection != null) {
                return collection;
            }
            Collection collectionB = b();
            this.f1480b = collectionB;
            return collectionB;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            AbstractC0865h.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map map, Object obj) {
        return x.d(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C0875s(obj, obj2);
    }

    public static HashMap e(int i10) {
        return new HashMap(a(i10));
    }

    public static IdentityHashMap f() {
        return new IdentityHashMap();
    }

    static boolean g(Map map, Object obj) {
        B9.n.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object h(Map map, Object obj) {
        B9.n.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object i(Map map, Object obj) {
        B9.n.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map map) {
        StringBuilder sbB = AbstractC0866i.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    static B9.f k() {
        return b.f1475b;
    }

    static Iterator l(Iterator it) {
        return new a(it);
    }
}
