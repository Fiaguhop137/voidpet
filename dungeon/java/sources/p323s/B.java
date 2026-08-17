package p323s;

import Nd.a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
class B implements Map, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f52598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4107g f52599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f52600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i0 f52601d;

    public B(Z parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f52598a = parent;
    }

    public Set a() {
        C4107g c4107g = this.f52599b;
        if (c4107g != null) {
            return c4107g;
        }
        C4107g c4107g2 = new C4107g(this.f52598a);
        this.f52599b = c4107g2;
        return c4107g2;
    }

    public Set b() {
        r rVar = this.f52600c;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.f52598a);
        this.f52600c = rVar2;
        return rVar2;
    }

    public int c() {
        return this.f52598a.f52664e;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f52598a.c(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f52598a.d(obj);
    }

    public Collection d() {
        i0 i0Var = this.f52601d;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this.f52598a);
        this.f52601d = i0Var2;
        return i0Var2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.b(this.f52598a, ((B) obj).f52598a);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f52598a.e(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f52598a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f52598a.h();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public String toString() {
        return this.f52598a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
