package K;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5866d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f5868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5869c;

    private static final class a implements List, Nd.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f5870a;

        public a(c cVar) {
            this.f5870a = cVar;
        }

        public int a() {
            return this.f5870a.l();
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f5870a.a(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f5870a.b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f5870a.d(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f5870a.g(collection);
        }

        public Object c(int i10) {
            d.a(this, i10);
            return this.f5870a.r(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f5870a.i();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f5870a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f5870a.k(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.a(this, i10);
            return this.f5870a.f5867a[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f5870a.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f5870a.l() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0114c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f5870a.o(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0114c(this, 0);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new C0114c(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return c(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f5870a.p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f5870a.q(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f5870a.u(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.a(this, i10);
            return this.f5870a.v(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            d.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3970g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC3970g.b(this, objArr);
        }
    }

    private static final class b implements List, Nd.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f5871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5873c;

        public b(List list, int i10, int i11) {
            this.f5871a = list;
            this.f5872b = i10;
            this.f5873c = i11;
        }

        public int a() {
            return this.f5873c - this.f5872b;
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f5871a.add(i10 + this.f5872b, obj);
            this.f5873c++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f5871a;
            int i10 = this.f5873c;
            this.f5873c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f5871a.addAll(i10 + this.f5872b, collection);
            int size = collection.size();
            this.f5873c += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f5871a.addAll(this.f5873c, collection);
            int size = collection.size();
            this.f5873c += size;
            return size > 0;
        }

        public Object c(int i10) {
            d.a(this, i10);
            Object objRemove = this.f5871a.remove(i10 + this.f5872b);
            this.f5873c--;
            return objRemove;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f5873c - 1;
            int i11 = this.f5872b;
            if (i11 <= i10) {
                while (true) {
                    this.f5871a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f5873c = this.f5872b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f5873c;
            for (int i11 = this.f5872b; i11 < i10; i11++) {
                if (Intrinsics.b(this.f5871a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.a(this, i10);
            return this.f5871a.get(i10 + this.f5872b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f5873c;
            for (int i11 = this.f5872b; i11 < i10; i11++) {
                if (Intrinsics.b(this.f5871a.get(i11), obj)) {
                    return i11 - this.f5872b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f5873c == this.f5872b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0114c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f5873c - 1;
            int i11 = this.f5872b;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.b(this.f5871a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f5872b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0114c(this, 0);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new C0114c(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return c(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f5873c;
            for (int i11 = this.f5872b; i11 < i10; i11++) {
                if (Intrinsics.b(this.f5871a.get(i11), obj)) {
                    this.f5871a.remove(i11);
                    this.f5873c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f5873c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f5873c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f5873c;
            int i11 = i10 - 1;
            int i12 = this.f5872b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f5871a.get(i11))) {
                        this.f5871a.remove(i11);
                        this.f5873c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f5873c;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.a(this, i10);
            return this.f5871a.set(i10 + this.f5872b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            d.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3970g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC3970g.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: K.c$c, reason: collision with other inner class name */
    private static final class C0114c implements ListIterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f5874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5875b;

        public C0114c(List list, int i10) {
            this.f5874a = list;
            this.f5875b = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f5874a.add(this.f5875b, obj);
            this.f5875b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f5875b < this.f5874a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f5875b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f5874a;
            int i10 = this.f5875b;
            this.f5875b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f5875b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f5875b - 1;
            this.f5875b = i10;
            return this.f5874a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f5875b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f5875b - 1;
            this.f5875b = i10;
            this.f5874a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f5874a.set(this.f5875b, obj);
        }
    }

    public c(Object[] objArr, int i10) {
        this.f5867a = objArr;
        this.f5869c = i10;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f5869c + 1;
        if (this.f5867a.length < i11) {
            t(i11);
        }
        Object[] objArr = this.f5867a;
        int i12 = this.f5869c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f5869c++;
    }

    public final boolean b(Object obj) {
        int i10 = this.f5869c + 1;
        if (this.f5867a.length < i10) {
            t(i10);
        }
        Object[] objArr = this.f5867a;
        int i11 = this.f5869c;
        objArr[i11] = obj;
        this.f5869c = i11 + 1;
        return true;
    }

    public final boolean c(int i10, c cVar) {
        int i11 = cVar.f5869c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f5869c + i11;
        if (this.f5867a.length < i12) {
            t(i12);
        }
        Object[] objArr = this.f5867a;
        int i13 = this.f5869c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(cVar.f5867a, 0, objArr, i10, i11);
        this.f5869c += i11;
        return true;
    }

    public final boolean d(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f5869c + size;
        if (this.f5867a.length < i12) {
            t(i12);
        }
        Object[] objArr = this.f5867a;
        int i13 = this.f5869c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.v();
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f5869c += size;
        return true;
    }

    public final boolean e(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.f5869c + size;
        if (this.f5867a.length < i11) {
            t(i11);
        }
        Object[] objArr = this.f5867a;
        int i12 = this.f5869c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f5869c += size;
        return true;
    }

    public final boolean g(Collection collection) {
        return d(this.f5869c, collection);
    }

    public final List h() {
        List list = this.f5868b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f5868b = aVar;
        return aVar;
    }

    public final void i() {
        Object[] objArr = this.f5867a;
        int i10 = this.f5869c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f5869c = 0;
    }

    public final boolean j(Object obj) {
        int iL = l() - 1;
        if (iL >= 0) {
            for (int i10 = 0; !Intrinsics.b(this.f5867a[i10], obj); i10++) {
                if (i10 != iL) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!j(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int l() {
        return this.f5869c;
    }

    public final int n(Object obj) {
        Object[] objArr = this.f5867a;
        int i10 = this.f5869c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (Intrinsics.b(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int o(Object obj) {
        Object[] objArr = this.f5867a;
        for (int i10 = this.f5869c - 1; i10 >= 0; i10--) {
            if (Intrinsics.b(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean p(Object obj) {
        int iN = n(obj);
        if (iN < 0) {
            return false;
        }
        r(iN);
        return true;
    }

    public final boolean q(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f5869c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        return i10 != this.f5869c;
    }

    public final Object r(int i10) {
        Object[] objArr = this.f5867a;
        Object obj = objArr[i10];
        if (i10 != l() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(objArr, i11, objArr, i10, this.f5869c - i11);
        }
        int i12 = this.f5869c - 1;
        this.f5869c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void s(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f5869c;
            if (i11 < i12) {
                Object[] objArr = this.f5867a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f5869c - (i11 - i10);
            int iL = l() - 1;
            if (i13 <= iL) {
                int i14 = i13;
                while (true) {
                    this.f5867a[i14] = null;
                    if (i14 == iL) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f5869c = i13;
        }
    }

    public final void t(int i10) {
        Object[] objArr = this.f5867a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5867a = objArr2;
    }

    public final boolean u(Collection collection) {
        int i10 = this.f5869c;
        for (int iL = l() - 1; -1 < iL; iL--) {
            if (!collection.contains(this.f5867a[iL])) {
                r(iL);
            }
        }
        return i10 != this.f5869c;
    }

    public final Object v(int i10, Object obj) {
        Object[] objArr = this.f5867a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void w(int i10) {
        this.f5869c = i10;
    }

    public final void x(Comparator comparator) {
        AbstractC3952n.G(this.f5867a, comparator, 0, this.f5869c);
    }
}
