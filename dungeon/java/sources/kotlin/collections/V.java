package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class V extends AbstractC3942d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48243b;

    public static final class a implements ListIterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f48244a;

        a(int i10) {
            this.f48244a = V.this.f48243b.listIterator(B.V(V.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f48244a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f48244a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f48244a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return B.U(V.this, this.f48244a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f48244a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return B.U(V.this, this.f48244a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public V(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48243b = delegate;
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f48243b.size();
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public Object get(int i10) {
        return this.f48243b.get(B.T(this, i10));
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
