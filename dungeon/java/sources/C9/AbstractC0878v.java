package C9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: C9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0878v extends r implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC0876t f1631b;

    /* JADX INFO: renamed from: C9.v$a */
    public static class a extends r.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f1632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1633e;

        public a() {
            super(4);
        }

        private void k(Object obj) {
            Objects.requireNonNull(this.f1632d);
            int length = this.f1632d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = AbstractC0874q.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f1632d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f1633e += iHashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        @Override // C9.r.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            B9.n.j(obj);
            if (this.f1632d != null && AbstractC0878v.l(this.f1610b) <= this.f1632d.length) {
                k(obj);
                return this;
            }
            this.f1632d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f1632d == null) {
                super.e(objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public a j(Iterable iterable) {
            B9.n.j(iterable);
            if (this.f1632d == null) {
                super.b(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public AbstractC0878v l() {
            AbstractC0878v abstractC0878vN;
            int i10 = this.f1610b;
            if (i10 == 0) {
                return AbstractC0878v.v();
            }
            if (i10 == 1) {
                Object obj = this.f1609a[0];
                Objects.requireNonNull(obj);
                return AbstractC0878v.w(obj);
            }
            if (this.f1632d == null || AbstractC0878v.l(i10) != this.f1632d.length) {
                abstractC0878vN = AbstractC0878v.n(this.f1610b, this.f1609a);
                this.f1610b = abstractC0878vN.size();
            } else {
                Object[] objArrCopyOf = AbstractC0878v.C(this.f1610b, this.f1609a.length) ? Arrays.copyOf(this.f1609a, this.f1610b) : this.f1609a;
                int i11 = this.f1633e;
                Object[] objArr = this.f1632d;
                abstractC0878vN = new N(objArrCopyOf, i11, objArr, objArr.length - 1, this.f1610b);
            }
            this.f1611c = true;
            this.f1632d = null;
            return abstractC0878vN;
        }
    }

    AbstractC0878v() {
    }

    public static AbstractC0878v A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return n(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC0878v B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        B9.n.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return n(length, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int l(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            B9.n.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC0878v n(int i10, Object... objArr) {
        if (i10 == 0) {
            return v();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return w(obj);
        }
        int iL = l(i10);
        Object[] objArr2 = new Object[iL];
        int i11 = iL - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = I.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = AbstractC0874q.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new S(obj3);
        }
        if (l(i13) < iL / 2) {
            return n(i13, objArr);
        }
        if (C(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new N(objArr, i12, objArr2, i11, i13);
    }

    public static AbstractC0878v o(Collection collection) {
        if ((collection instanceof AbstractC0878v) && !(collection instanceof SortedSet)) {
            AbstractC0878v abstractC0878v = (AbstractC0878v) collection;
            if (!abstractC0878v.i()) {
                return abstractC0878v;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static AbstractC0878v p(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? n(objArr.length, (Object[]) objArr.clone()) : w(objArr[0]);
        }
        return v();
    }

    public static AbstractC0878v v() {
        return N.f1506i;
    }

    public static AbstractC0878v w(Object obj) {
        return new S(obj);
    }

    public static AbstractC0878v x(Object obj, Object obj2) {
        return n(2, obj, obj2);
    }

    public static AbstractC0878v y(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    @Override // C9.r
    public AbstractC0876t a() {
        AbstractC0876t abstractC0876t = this.f1631b;
        if (abstractC0876t != null) {
            return abstractC0876t;
        }
        AbstractC0876t abstractC0876tQ = q();
        this.f1631b = abstractC0876tQ;
        return abstractC0876tQ;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0878v) && s() && ((AbstractC0878v) obj).s() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Q.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Q.d(this);
    }

    AbstractC0876t q() {
        return AbstractC0876t.j(toArray());
    }

    boolean s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public abstract V iterator();
}
