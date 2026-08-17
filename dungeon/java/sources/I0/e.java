package I0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection, Nd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4901c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f4902d = new e(CollectionsKt.l());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4904b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return g.a().a();
        }

        public final e b() {
            return e.f4902d;
        }
    }

    public e(List list) {
        this.f4903a = list;
        this.f4904b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(d dVar) {
        return this.f4903a.contains(dVar);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return c((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f4903a.containsAll(collection);
    }

    public final d e(int i10) {
        return (d) this.f4903a.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.b(this.f4903a, ((e) obj).f4903a);
    }

    public final List g() {
        return this.f4903a;
    }

    public int h() {
        return this.f4904b;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f4903a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f4903a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f4903a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3970g.a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC3970g.b(this, objArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f4903a + ')';
    }
}
