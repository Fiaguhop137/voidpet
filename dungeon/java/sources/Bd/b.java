package Bd;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3942d;
import kotlin.collections.AbstractC3946h;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC3946h implements List, RandomAccess, Serializable, Nd.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C0015b f656d = new C0015b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f657e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f660c;

    public static final class a extends AbstractC3946h implements List, RandomAccess, Serializable, Nd.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f665e;

        /* JADX INFO: renamed from: Bd.b$a$a, reason: collision with other inner class name */
        private static final class C0014a implements ListIterator, Nd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f667b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f668c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f669d;

            public C0014a(a list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f666a = list;
                this.f667b = i10;
                this.f668c = -1;
                this.f669d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f666a.f665e).modCount != this.f669d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f666a;
                int i10 = this.f667b;
                this.f667b = i10 + 1;
                aVar.add(i10, obj);
                this.f668c = -1;
                this.f669d = ((AbstractList) this.f666a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f667b < this.f666a.f663c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f667b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f667b >= this.f666a.f663c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f667b;
                this.f667b = i10 + 1;
                this.f668c = i10;
                return this.f666a.f661a[this.f666a.f662b + this.f668c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f667b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f667b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f667b = i11;
                this.f668c = i11;
                return this.f666a.f661a[this.f666a.f662b + this.f668c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f667b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f668c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f666a.c(i10);
                this.f667b = this.f668c;
                this.f668c = -1;
                this.f669d = ((AbstractList) this.f666a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f668c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f666a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.f661a = backing;
            this.f662b = i10;
            this.f663c = i11;
            this.f664d = aVar;
            this.f665e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final int A(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f664d;
            int iA = aVar != null ? aVar.A(i10, i11, collection, z10) : this.f665e.G(i10, i11, collection, z10);
            if (iA > 0) {
                w();
            }
            this.f663c -= iA;
            return iA;
        }

        private final void n(int i10, Collection collection, int i11) {
            w();
            a aVar = this.f664d;
            if (aVar != null) {
                aVar.n(i10, collection, i11);
            } else {
                this.f665e.t(i10, collection, i11);
            }
            this.f661a = this.f665e.f658a;
            this.f663c += i11;
        }

        private final void p(int i10, Object obj) {
            w();
            a aVar = this.f664d;
            if (aVar != null) {
                aVar.p(i10, obj);
            } else {
                this.f665e.v(i10, obj);
            }
            this.f661a = this.f665e.f658a;
            this.f663c++;
        }

        private final void q() {
            if (((AbstractList) this.f665e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void s() {
            if (v()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean t(List list) {
            return Bd.c.h(this.f661a, this.f662b, this.f663c, list);
        }

        private final boolean v() {
            return this.f665e.f660c;
        }

        private final void w() {
            ((AbstractList) this).modCount++;
        }

        private final Object x(int i10) {
            w();
            a aVar = this.f664d;
            Object objX = aVar != null ? aVar.x(i10) : this.f665e.E(i10);
            this.f663c--;
            return objX;
        }

        private final void y(int i10, int i11) {
            if (i11 > 0) {
                w();
            }
            a aVar = this.f664d;
            if (aVar != null) {
                aVar.y(i10, i11);
            } else {
                this.f665e.F(i10, i11);
            }
            this.f663c -= i11;
        }

        @Override // kotlin.collections.AbstractC3946h
        public int a() {
            q();
            return this.f663c;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            s();
            q();
            AbstractC3942d.f48249a.c(i10, this.f663c);
            p(this.f662b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            s();
            q();
            p(this.f662b + this.f663c, obj);
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            s();
            q();
            AbstractC3942d.f48249a.c(i10, this.f663c);
            int size = elements.size();
            n(this.f662b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            s();
            q();
            int size = elements.size();
            n(this.f662b + this.f663c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC3946h
        public Object c(int i10) {
            s();
            q();
            AbstractC3942d.f48249a.b(i10, this.f663c);
            return x(this.f662b + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            s();
            q();
            y(this.f662b, this.f663c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            q();
            if (obj != this) {
                return (obj instanceof List) && t((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            q();
            AbstractC3942d.f48249a.b(i10, this.f663c);
            return this.f661a[this.f662b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            q();
            return Bd.c.i(this.f661a, this.f662b, this.f663c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            q();
            for (int i10 = 0; i10 < this.f663c; i10++) {
                if (Intrinsics.b(this.f661a[this.f662b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            q();
            return this.f663c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            q();
            for (int i10 = this.f663c - 1; i10 >= 0; i10--) {
                if (Intrinsics.b(this.f661a[this.f662b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            q();
            AbstractC3942d.f48249a.c(i10, this.f663c);
            return new C0014a(this, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            s();
            q();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            s();
            q();
            return A(this.f662b, this.f663c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            s();
            q();
            return A(this.f662b, this.f663c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            s();
            q();
            AbstractC3942d.f48249a.b(i10, this.f663c);
            Object[] objArr = this.f661a;
            int i11 = this.f662b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC3942d.f48249a.d(i10, i11, this.f663c);
            return new a(this.f661a, this.f662b + i10, i11 - i10, this, this.f665e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            q();
            Object[] objArr = this.f661a;
            int i10 = this.f662b;
            return AbstractC3952n.s(objArr, i10, this.f663c + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            q();
            int length = array.length;
            int i10 = this.f663c;
            if (length >= i10) {
                Object[] objArr = this.f661a;
                int i11 = this.f662b;
                AbstractC3952n.l(objArr, array, 0, i11, i10 + i11);
                return CollectionsKt.f(this.f663c, array);
            }
            Object[] objArr2 = this.f661a;
            int i12 = this.f662b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            q();
            return Bd.c.j(this.f661a, this.f662b, this.f663c, this);
        }
    }

    /* JADX INFO: renamed from: Bd.b$b, reason: collision with other inner class name */
    private static final class C0015b {
        private C0015b() {
        }

        public /* synthetic */ C0015b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class c implements ListIterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f673d;

        public c(b list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f670a = list;
            this.f671b = i10;
            this.f672c = -1;
            this.f673d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f670a).modCount != this.f673d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f670a;
            int i10 = this.f671b;
            this.f671b = i10 + 1;
            bVar.add(i10, obj);
            this.f672c = -1;
            this.f673d = ((AbstractList) this.f670a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f671b < this.f670a.f659b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f671b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f671b >= this.f670a.f659b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f671b;
            this.f671b = i10 + 1;
            this.f672c = i10;
            return this.f670a.f658a[this.f672c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f671b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f671b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f671b = i11;
            this.f672c = i11;
            return this.f670a.f658a[this.f672c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f671b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f672c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f670a.c(i10);
            this.f671b = this.f672c;
            this.f672c = -1;
            this.f673d = ((AbstractList) this.f670a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f672c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f670a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f660c = true;
        f657e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        this.f658a = Bd.c.d(i10);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    private final void A(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f658a;
        if (i10 > objArr.length) {
            this.f658a = Bd.c.e(this.f658a, AbstractC3942d.f48249a.e(objArr.length, i10));
        }
    }

    private final void B(int i10) {
        A(this.f659b + i10);
    }

    private final void C(int i10, int i11) {
        B(i11);
        Object[] objArr = this.f658a;
        AbstractC3952n.l(objArr, objArr, i10 + i11, i10, this.f659b);
        this.f659b += i11;
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(int i10) {
        D();
        Object[] objArr = this.f658a;
        Object obj = objArr[i10];
        AbstractC3952n.l(objArr, objArr, i10, i10 + 1, this.f659b);
        Bd.c.f(this.f658a, this.f659b - 1);
        this.f659b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i10, int i11) {
        if (i11 > 0) {
            D();
        }
        Object[] objArr = this.f658a;
        AbstractC3952n.l(objArr, objArr, i10, i10 + i11, this.f659b);
        Object[] objArr2 = this.f658a;
        int i12 = this.f659b;
        Bd.c.g(objArr2, i12 - i11, i12);
        this.f659b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f658a[i14]) == z10) {
                Object[] objArr = this.f658a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f658a;
        AbstractC3952n.l(objArr2, objArr2, i10 + i13, i11 + i10, this.f659b);
        Object[] objArr3 = this.f658a;
        int i16 = this.f659b;
        Bd.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            D();
        }
        this.f659b -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i10, Collection collection, int i11) {
        D();
        C(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f658a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10, Object obj) {
        D();
        C(i10, 1);
        this.f658a[i10] = obj;
    }

    private final void x() {
        if (this.f660c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean y(List list) {
        return Bd.c.h(this.f658a, 0, this.f659b, list);
    }

    @Override // kotlin.collections.AbstractC3946h
    public int a() {
        return this.f659b;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        x();
        AbstractC3942d.f48249a.c(i10, this.f659b);
        v(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        x();
        v(this.f659b, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        x();
        AbstractC3942d.f48249a.c(i10, this.f659b);
        int size = elements.size();
        t(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        x();
        int size = elements.size();
        t(this.f659b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC3946h
    public Object c(int i10) {
        x();
        AbstractC3942d.f48249a.b(i10, this.f659b);
        return E(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        x();
        F(0, this.f659b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && y((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3942d.f48249a.b(i10, this.f659b);
        return this.f658a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return Bd.c.i(this.f658a, 0, this.f659b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f659b; i10++) {
            if (Intrinsics.b(this.f658a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f659b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f659b - 1; i10 >= 0; i10--) {
            if (Intrinsics.b(this.f658a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC3942d.f48249a.c(i10, this.f659b);
        return new c(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        x();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        x();
        return G(0, this.f659b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        x();
        return G(0, this.f659b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        x();
        AbstractC3942d.f48249a.b(i10, this.f659b);
        Object[] objArr = this.f658a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC3942d.f48249a.d(i10, i11, this.f659b);
        return new a(this.f658a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC3952n.s(this.f658a, 0, this.f659b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f659b;
        if (length >= i10) {
            AbstractC3952n.l(this.f658a, array, 0, 0, i10);
            return CollectionsKt.f(this.f659b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f658a, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return Bd.c.j(this.f658a, 0, this.f659b, this);
    }

    public final List w() {
        x();
        this.f660c = true;
        return this.f659b > 0 ? this : f657e;
    }
}
