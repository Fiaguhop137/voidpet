package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3951m extends AbstractC3946h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f48267d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f48268e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f48270b = f48268e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48271c;

    /* JADX INFO: renamed from: kotlin.collections.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void e(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f48270b.length;
        while (i10 < length && it.hasNext()) {
            this.f48270b[i10] = it.next();
            i10++;
        }
        int i11 = this.f48269a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f48270b[i12] = it.next();
        }
        this.f48271c = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f48270b;
        C3955q.l(objArr2, objArr, 0, this.f48269a, objArr2.length);
        Object[] objArr3 = this.f48270b;
        int length = objArr3.length;
        int i11 = this.f48269a;
        C3955q.l(objArr3, objArr, length - i11, 0, i11);
        this.f48269a = 0;
        this.f48270b = objArr;
    }

    private final int h(int i10) {
        return i10 == 0 ? C3956s.X(this.f48270b) : i10 - 1;
    }

    private final void i(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f48270b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f48268e) {
            this.f48270b = new Object[kotlin.ranges.e.e(i10, 10)];
        } else {
            g(AbstractC3942d.f48249a.e(objArr.length, i10));
        }
    }

    private final int k(int i10) {
        if (i10 == C3956s.X(this.f48270b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int p(int i10) {
        return i10 < 0 ? i10 + this.f48270b.length : i10;
    }

    private final void q(int i10, int i11) {
        if (i10 < i11) {
            C3955q.v(this.f48270b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f48270b;
        C3955q.v(objArr, null, i10, objArr.length);
        C3955q.v(this.f48270b, null, 0, i11);
    }

    private final int s(int i10) {
        Object[] objArr = this.f48270b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void t() {
        ((AbstractList) this).modCount++;
    }

    private final void w(int i10, int i11) {
        int iS = s(this.f48269a + (i10 - 1));
        int iS2 = s(this.f48269a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iS + 1;
            int iMin = Math.min(i10, Math.min(i12, iS2 + 1));
            Object[] objArr = this.f48270b;
            int i13 = iS2 - iMin;
            int i14 = iS - iMin;
            C3955q.l(objArr, objArr, i13 + 1, i14 + 1, i12);
            iS = p(i14);
            iS2 = p(i13);
            i10 -= iMin;
        }
    }

    private final void x(int i10, int i11) {
        int iS = s(this.f48269a + i11);
        int iS2 = s(this.f48269a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f48270b;
            i11 = Math.min(size, Math.min(objArr.length - iS, objArr.length - iS2));
            Object[] objArr2 = this.f48270b;
            int i12 = iS + i11;
            C3955q.l(objArr2, objArr2, iS2, iS, i12);
            iS = s(i12);
            iS2 = s(iS2 + i11);
        }
    }

    @Override // kotlin.collections.AbstractC3946h
    public int a() {
        return this.f48271c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC3942d.f48249a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        t();
        i(size() + 1);
        int iS = s(this.f48269a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iH = h(iS);
            int iH2 = h(this.f48269a);
            int i11 = this.f48269a;
            if (iH >= i11) {
                Object[] objArr = this.f48270b;
                objArr[iH2] = objArr[i11];
                C3955q.l(objArr, objArr, i11, i11 + 1, iH + 1);
            } else {
                Object[] objArr2 = this.f48270b;
                C3955q.l(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f48270b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C3955q.l(objArr3, objArr3, 0, 1, iH + 1);
            }
            this.f48270b[iH] = obj;
            this.f48269a = iH2;
        } else {
            int iS2 = s(this.f48269a + size());
            if (iS < iS2) {
                Object[] objArr4 = this.f48270b;
                C3955q.l(objArr4, objArr4, iS + 1, iS, iS2);
            } else {
                Object[] objArr5 = this.f48270b;
                C3955q.l(objArr5, objArr5, 1, 0, iS2);
                Object[] objArr6 = this.f48270b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C3955q.l(objArr6, objArr6, iS + 1, iS, objArr6.length - 1);
            }
            this.f48270b[iS] = obj;
        }
        this.f48271c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC3942d.f48249a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        t();
        i(size() + elements.size());
        int iS = s(this.f48269a + size());
        int iS2 = s(this.f48269a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f48269a;
            int length = i11 - size;
            if (iS2 < i11) {
                Object[] objArr = this.f48270b;
                C3955q.l(objArr, objArr, length, i11, objArr.length);
                if (size >= iS2) {
                    Object[] objArr2 = this.f48270b;
                    C3955q.l(objArr2, objArr2, objArr2.length - size, 0, iS2);
                } else {
                    Object[] objArr3 = this.f48270b;
                    C3955q.l(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f48270b;
                    C3955q.l(objArr4, objArr4, 0, size, iS2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f48270b;
                C3955q.l(objArr5, objArr5, length, i11, iS2);
            } else {
                Object[] objArr6 = this.f48270b;
                length += objArr6.length;
                int i12 = iS2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    C3955q.l(objArr6, objArr6, length, i11, iS2);
                } else {
                    C3955q.l(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f48270b;
                    C3955q.l(objArr7, objArr7, 0, this.f48269a + length2, iS2);
                }
            }
            this.f48269a = length;
            e(p(iS2 - size), elements);
        } else {
            int i13 = iS2 + size;
            if (iS2 < iS) {
                int i14 = size + iS;
                Object[] objArr8 = this.f48270b;
                if (i14 <= objArr8.length) {
                    C3955q.l(objArr8, objArr8, i13, iS2, iS);
                } else if (i13 >= objArr8.length) {
                    C3955q.l(objArr8, objArr8, i13 - objArr8.length, iS2, iS);
                } else {
                    int length3 = iS - (i14 - objArr8.length);
                    C3955q.l(objArr8, objArr8, 0, length3, iS);
                    Object[] objArr9 = this.f48270b;
                    C3955q.l(objArr9, objArr9, i13, iS2, length3);
                }
            } else {
                Object[] objArr10 = this.f48270b;
                C3955q.l(objArr10, objArr10, size, 0, iS);
                Object[] objArr11 = this.f48270b;
                if (i13 >= objArr11.length) {
                    C3955q.l(objArr11, objArr11, i13 - objArr11.length, iS2, objArr11.length);
                } else {
                    C3955q.l(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f48270b;
                    C3955q.l(objArr12, objArr12, i13, iS2, objArr12.length - size);
                }
            }
            e(iS2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        t();
        i(size() + elements.size());
        e(s(this.f48269a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        t();
        i(size() + 1);
        int iH = h(this.f48269a);
        this.f48269a = iH;
        this.f48270b[iH] = obj;
        this.f48271c = size() + 1;
    }

    public final void addLast(Object obj) {
        t();
        i(size() + 1);
        this.f48270b[s(this.f48269a + size())] = obj;
        this.f48271c = size() + 1;
    }

    @Override // kotlin.collections.AbstractC3946h
    public Object c(int i10) {
        AbstractC3942d.f48249a.b(i10, size());
        if (i10 == C3959v.n(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        t();
        int iS = s(this.f48269a + i10);
        Object obj = this.f48270b[iS];
        if (i10 < (size() >> 1)) {
            int i11 = this.f48269a;
            if (iS >= i11) {
                Object[] objArr = this.f48270b;
                C3955q.l(objArr, objArr, i11 + 1, i11, iS);
            } else {
                Object[] objArr2 = this.f48270b;
                C3955q.l(objArr2, objArr2, 1, 0, iS);
                Object[] objArr3 = this.f48270b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f48269a;
                C3955q.l(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f48270b;
            int i13 = this.f48269a;
            objArr4[i13] = null;
            this.f48269a = k(i13);
        } else {
            int iS2 = s(this.f48269a + C3959v.n(this));
            if (iS <= iS2) {
                Object[] objArr5 = this.f48270b;
                C3955q.l(objArr5, objArr5, iS, iS + 1, iS2 + 1);
            } else {
                Object[] objArr6 = this.f48270b;
                C3955q.l(objArr6, objArr6, iS, iS + 1, objArr6.length);
                Object[] objArr7 = this.f48270b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C3955q.l(objArr7, objArr7, 0, 1, iS2 + 1);
            }
            this.f48270b[iS2] = null;
        }
        this.f48271c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            t();
            q(this.f48269a, s(this.f48269a + size()));
        }
        this.f48269a = 0;
        this.f48271c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3942d.f48249a.b(i10, size());
        return this.f48270b[s(this.f48269a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iS = s(this.f48269a + size());
        int length = this.f48269a;
        if (length < iS) {
            while (length < iS) {
                if (Intrinsics.b(obj, this.f48270b[length])) {
                    i10 = this.f48269a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iS) {
            return -1;
        }
        int length2 = this.f48270b.length;
        while (length < length2) {
            if (Intrinsics.b(obj, this.f48270b[length])) {
                i10 = this.f48269a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iS; i11++) {
            if (Intrinsics.b(obj, this.f48270b[i11])) {
                length = i11 + this.f48270b.length;
                i10 = this.f48269a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f48270b[s(this.f48269a + C3959v.n(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iX;
        int i10;
        int iS = s(this.f48269a + size());
        int i11 = this.f48269a;
        if (i11 < iS) {
            iX = iS - 1;
            if (i11 <= iX) {
                while (!Intrinsics.b(obj, this.f48270b[iX])) {
                    if (iX != i11) {
                        iX--;
                    }
                }
                i10 = this.f48269a;
                return iX - i10;
            }
            return -1;
        }
        if (i11 > iS) {
            for (int i12 = iS - 1; -1 < i12; i12--) {
                if (Intrinsics.b(obj, this.f48270b[i12])) {
                    iX = i12 + this.f48270b.length;
                    i10 = this.f48269a;
                    return iX - i10;
                }
            }
            iX = C3956s.X(this.f48270b);
            int i13 = this.f48269a;
            if (i13 <= iX) {
                while (!Intrinsics.b(obj, this.f48270b[iX])) {
                    if (iX != i13) {
                        iX--;
                    }
                }
                i10 = this.f48269a;
                return iX - i10;
            }
        }
        return -1;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return this.f48270b[s(this.f48269a + C3959v.n(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iS;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f48270b.length != 0) {
            int iS2 = s(this.f48269a + size());
            int i10 = this.f48269a;
            if (i10 < iS2) {
                iS = i10;
                while (i10 < iS2) {
                    Object obj = this.f48270b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f48270b[iS] = obj;
                        iS++;
                    }
                    i10++;
                }
                C3955q.v(this.f48270b, null, iS, iS2);
            } else {
                int length = this.f48270b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f48270b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f48270b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iS = s(i11);
                for (int i12 = 0; i12 < iS2; i12++) {
                    Object[] objArr2 = this.f48270b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f48270b[iS] = obj3;
                        iS = k(iS);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                t();
                this.f48271c = p(iS - this.f48269a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.f48270b;
        int i10 = this.f48269a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f48269a = k(i10);
        this.f48271c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int iS = s(this.f48269a + C3959v.n(this));
        Object[] objArr = this.f48270b;
        Object obj = objArr[iS];
        objArr[iS] = null;
        this.f48271c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC3942d.f48249a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i10);
            return;
        }
        t();
        if (i10 < size() - i11) {
            w(i10, i11);
            int iS = s(this.f48269a + i12);
            q(this.f48269a, iS);
            this.f48269a = iS;
        } else {
            x(i10, i11);
            int iS2 = s(this.f48269a + size());
            q(p(iS2 - i12), iS2);
        }
        this.f48271c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iS;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f48270b.length != 0) {
            int iS2 = s(this.f48269a + size());
            int i10 = this.f48269a;
            if (i10 < iS2) {
                iS = i10;
                while (i10 < iS2) {
                    Object obj = this.f48270b[i10];
                    if (elements.contains(obj)) {
                        this.f48270b[iS] = obj;
                        iS++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C3955q.v(this.f48270b, null, iS, iS2);
            } else {
                int length = this.f48270b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f48270b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f48270b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iS = s(i11);
                for (int i12 = 0; i12 < iS2; i12++) {
                    Object[] objArr2 = this.f48270b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f48270b[iS] = obj3;
                        iS = k(iS);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                t();
                this.f48271c = p(iS - this.f48269a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC3942d.f48249a.b(i10, size());
        int iS = s(this.f48269a + i10);
        Object[] objArr = this.f48270b;
        Object obj2 = objArr[iS];
        objArr[iS] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = C3953o.a(array, size());
        }
        Object[] objArr = array;
        int iS = s(this.f48269a + size());
        int i10 = this.f48269a;
        if (i10 < iS) {
            C3955q.q(this.f48270b, objArr, 0, i10, iS, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f48270b;
            C3955q.l(objArr2, objArr, 0, this.f48269a, objArr2.length);
            Object[] objArr3 = this.f48270b;
            C3955q.l(objArr3, objArr, objArr3.length - this.f48269a, 0, iS);
        }
        return C3958u.f(size(), objArr);
    }

    public final Object v() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }
}
