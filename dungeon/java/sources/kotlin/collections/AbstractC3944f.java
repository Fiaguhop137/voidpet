package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3944f implements Map, Nd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f48257c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f48258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Collection f48259b;

    /* JADX INFO: renamed from: kotlin.collections.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.f$b */
    public static final class b extends AbstractC3949k {

        /* JADX INFO: renamed from: kotlin.collections.f$b$a */
        public static final class a implements Iterator, Nd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f48261a;

            a(Iterator it) {
                this.f48261a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f48261a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return ((Map.Entry) this.f48261a.next()).getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        b() {
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return AbstractC3944f.this.size();
        }

        @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return AbstractC3944f.this.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractC3949k, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(AbstractC3944f.this.entrySet().iterator());
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.f$c */
    public static final class c extends AbstractC3940b {

        /* JADX INFO: renamed from: kotlin.collections.f$c$a */
        public static final class a implements Iterator, Nd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f48263a;

            a(Iterator it) {
                this.f48263a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f48263a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return ((Map.Entry) this.f48263a.next()).getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        c() {
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return AbstractC3944f.this.size();
        }

        @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return AbstractC3944f.this.containsValue(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(AbstractC3944f.this.entrySet().iterator());
        }
    }

    protected AbstractC3944f() {
    }

    private final Map.Entry h(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.b(((Map.Entry) next).getKey(), obj)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    private final String i(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    private final String k(Map.Entry entry) {
        return i(entry.getKey()) + '=' + i(entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(AbstractC3944f abstractC3944f, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC3944f.k(it);
    }

    public final boolean c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.d(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!Intrinsics.b(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        Intrinsics.d(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public Set e() {
        if (this.f48258a == null) {
            this.f48258a = new b();
        }
        Set set = this.f48258a;
        Intrinsics.c(set);
        return set;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!c((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return entrySet().size();
    }

    public Collection g() {
        if (this.f48259b == null) {
            this.f48259b = new c();
        }
        Collection collection = this.f48259b;
        Intrinsics.c(collection);
        return collection;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry entryH = h(obj);
        if (entryH != null) {
            return entryH.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.s0(entrySet(), ", ", "{", "}", 0, null, new C3943e(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
