package C9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: C9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0876t extends r implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W f1614b = new b(L.f1488e, 0);

    /* JADX INFO: renamed from: C9.t$a */
    public static final class a extends r.a {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // C9.r.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC0876t k() {
            this.f1611c = true;
            return AbstractC0876t.k(this.f1609a, this.f1610b);
        }
    }

    /* JADX INFO: renamed from: C9.t$b */
    static class b extends AbstractC0858a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC0876t f1615c;

        b(AbstractC0876t abstractC0876t, int i10) {
            super(abstractC0876t.size(), i10);
            this.f1615c = abstractC0876t;
        }

        @Override // C9.AbstractC0858a
        protected Object a(int i10) {
            return this.f1615c.get(i10);
        }
    }

    /* JADX INFO: renamed from: C9.t$c */
    class c extends AbstractC0876t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f1616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f1617d;

        c(int i10, int i11) {
            this.f1616c = i10;
            this.f1617d = i11;
        }

        @Override // C9.AbstractC0876t, java.util.List
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AbstractC0876t subList(int i10, int i11) {
            B9.n.n(i10, i11, this.f1617d);
            AbstractC0876t abstractC0876t = AbstractC0876t.this;
            int i12 = this.f1616c;
            return abstractC0876t.subList(i10 + i12, i11 + i12);
        }

        @Override // C9.r
        Object[] e() {
            return AbstractC0876t.this.e();
        }

        @Override // C9.r
        int g() {
            return AbstractC0876t.this.h() + this.f1616c + this.f1617d;
        }

        @Override // java.util.List
        public Object get(int i10) {
            B9.n.h(i10, this.f1617d);
            return AbstractC0876t.this.get(i10 + this.f1616c);
        }

        @Override // C9.r
        int h() {
            return AbstractC0876t.this.h() + this.f1616c;
        }

        @Override // C9.r
        boolean i() {
            return true;
        }

        @Override // C9.AbstractC0876t, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // C9.AbstractC0876t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // C9.AbstractC0876t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f1617d;
        }
    }

    AbstractC0876t() {
    }

    public static AbstractC0876t A(Object obj, Object obj2, Object obj3) {
        return o(obj, obj2, obj3);
    }

    public static AbstractC0876t B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return o(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC0876t C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return o(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC0876t D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        B9.n.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return o(objArr2);
    }

    public static AbstractC0876t E(Comparator comparator, Iterable iterable) {
        B9.n.j(comparator);
        Object[] objArrK = AbstractC0879w.k(iterable);
        I.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return j(objArrK);
    }

    static AbstractC0876t j(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    static AbstractC0876t k(Object[] objArr, int i10) {
        return i10 == 0 ? w() : new L(objArr, i10);
    }

    public static a l() {
        return new a();
    }

    public static a n(int i10) {
        AbstractC0865h.b(i10, "expectedSize");
        return new a(i10);
    }

    private static AbstractC0876t o(Object... objArr) {
        return j(I.b(objArr));
    }

    public static AbstractC0876t p(Collection collection) {
        if (!(collection instanceof r)) {
            return o(collection.toArray());
        }
        AbstractC0876t abstractC0876tA = ((r) collection).a();
        return abstractC0876tA.i() ? j(abstractC0876tA.toArray()) : abstractC0876tA;
    }

    public static AbstractC0876t q(Object[] objArr) {
        return objArr.length == 0 ? w() : o((Object[]) objArr.clone());
    }

    public static AbstractC0876t w() {
        return L.f1488e;
    }

    public static AbstractC0876t x(Object obj) {
        return o(obj);
    }

    public static AbstractC0876t y(Object obj, Object obj2) {
        return o(obj, obj2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: F */
    public AbstractC0876t subList(int i10, int i11) {
        B9.n.n(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? w() : G(i10, i11);
    }

    AbstractC0876t G(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // C9.r
    public final AbstractC0876t a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // C9.r
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // C9.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return z.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.f(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public V iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public W listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public W listIterator(int i10) {
        B9.n.l(i10, size());
        return isEmpty() ? f1614b : new b(this, i10);
    }
}
