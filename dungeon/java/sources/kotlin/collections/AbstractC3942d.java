package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3942d extends AbstractC3940b implements List, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f48249a = new a(null);

    /* JADX INFO: renamed from: kotlin.collections.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i12;
        }

        public final boolean f(Collection c10, Collection other) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$b */
    private class b implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48250a;

        public b() {
        }

        protected final int a() {
            return this.f48250a;
        }

        protected final void b(int i10) {
            this.f48250a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f48250a < AbstractC3942d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC3942d abstractC3942d = AbstractC3942d.this;
            int i10 = this.f48250a;
            this.f48250a = i10 + 1;
            return abstractC3942d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$c */
    private class c extends b implements ListIterator, Nd.a {
        public c(int i10) {
            super();
            AbstractC3942d.f48249a.c(i10, AbstractC3942d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC3942d abstractC3942d = AbstractC3942d.this;
            b(a() - 1);
            return abstractC3942d.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    private static final class C0566d extends AbstractC3942d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC3942d f48253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48255d;

        public C0566d(AbstractC3942d list, int i10, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f48253b = list;
            this.f48254c = i10;
            AbstractC3942d.f48249a.d(i10, i11, list.size());
            this.f48255d = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return this.f48255d;
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List
        public Object get(int i10) {
            AbstractC3942d.f48249a.b(i10, this.f48255d);
            return this.f48253b.get(this.f48254c + i10);
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List, L.c
        public List subList(int i10, int i11) {
            AbstractC3942d.f48249a.d(i10, i11, this.f48255d);
            AbstractC3942d abstractC3942d = this.f48253b;
            int i12 = this.f48254c;
            return new C0566d(abstractC3942d, i10 + i12, i12 + i11);
        }
    }

    protected AbstractC3942d() {
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f48249a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f48249a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Intrinsics.b(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    public ListIterator listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new C0566d(this, i10, i11);
    }
}
