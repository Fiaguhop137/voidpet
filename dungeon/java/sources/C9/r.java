package C9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f1608a = new Object[0];

    static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f1609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1611c;

        a(int i10) {
            AbstractC0865h.b(i10, "initialCapacity");
            this.f1609a = new Object[i10];
            this.f1610b = 0;
        }

        private void g(int i10) {
            Object[] objArr = this.f1609a;
            int iC = b.c(objArr.length, this.f1610b + i10);
            if (iC > objArr.length || this.f1611c) {
                this.f1609a = Arrays.copyOf(this.f1609a, iC);
                this.f1611c = false;
            }
        }

        @Override // C9.r.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof r) {
                    this.f1610b = ((r) collection).c(this.f1609a, this.f1610b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            B9.n.j(obj);
            g(1);
            Object[] objArr = this.f1609a;
            int i10 = this.f1610b;
            this.f1610b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        final void f(Object[] objArr, int i10) {
            I.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f1609a, this.f1610b, i10);
            this.f1610b += i10;
        }
    }

    public static abstract class b {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    r() {
    }

    public abstract AbstractC0876t a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int c(Object[] objArr, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] e() {
        return null;
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    abstract boolean i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f1608a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        B9.n.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return K.a(objArrE, h(), g(), objArr);
            }
            objArr = I.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(objArr, 0);
        return objArr;
    }
}
