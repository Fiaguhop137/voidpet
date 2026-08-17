package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class U extends AbstractC3946h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f48240a;

    public static final class a implements ListIterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f48241a;

        a(int i10) {
            this.f48241a = U.this.f48240a.listIterator(B.V(U.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f48241a.add(obj);
            this.f48241a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f48241a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f48241a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f48241a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return B.U(U.this, this.f48241a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f48241a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return B.U(U.this, this.f48241a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f48241a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f48241a.set(obj);
        }
    }

    public U(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48240a = delegate;
    }

    @Override // kotlin.collections.AbstractC3946h
    public int a() {
        return this.f48240a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f48240a.add(B.V(this, i10), obj);
    }

    @Override // kotlin.collections.AbstractC3946h
    public Object c(int i10) {
        return this.f48240a.remove(B.T(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f48240a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f48240a.get(B.T(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f48240a.set(B.T(this, i10), obj);
    }
}
