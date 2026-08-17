package C9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: C9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0867j extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f1579j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f1581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f1582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f1583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f1584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f1585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f1586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f1587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection f1588i;

    /* JADX INFO: renamed from: C9.j$a */
    class a extends e {
        a() {
            super(C0867j.this, null);
        }

        @Override // C9.C0867j.e
        Object b(int i10) {
            return C0867j.this.J(i10);
        }
    }

    /* JADX INFO: renamed from: C9.j$b */
    class b extends e {
        b() {
            super(C0867j.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // C9.C0867j.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return C0867j.this.new g(i10);
        }
    }

    /* JADX INFO: renamed from: C9.j$c */
    class c extends e {
        c() {
            super(C0867j.this, null);
        }

        @Override // C9.C0867j.e
        Object b(int i10) {
            return C0867j.this.Z(i10);
        }
    }

    /* JADX INFO: renamed from: C9.j$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0867j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapZ = C0867j.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iG = C0867j.this.G(entry.getKey());
                if (iG != -1 && B9.j.a(C0867j.this.Z(iG), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0867j.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iE;
            int iF;
            Map mapZ = C0867j.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C0867j.this.M() || (iF = AbstractC0868k.f(entry.getKey(), entry.getValue(), (iE = C0867j.this.E()), C0867j.this.Q(), C0867j.this.O(), C0867j.this.P(), C0867j.this.R())) == -1) {
                return false;
            }
            C0867j.this.L(iF, iE);
            C0867j.e(C0867j.this);
            C0867j.this.F();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0867j.this.size();
        }
    }

    /* JADX INFO: renamed from: C9.j$e */
    private abstract class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1595c;

        private e() {
            this.f1593a = C0867j.this.f1584e;
            this.f1594b = C0867j.this.C();
            this.f1595c = -1;
        }

        /* synthetic */ e(C0867j c0867j, a aVar) {
            this();
        }

        private void a() {
            if (C0867j.this.f1584e != this.f1593a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i10);

        void c() {
            this.f1593a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1594b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f1594b;
            this.f1595c = i10;
            Object objB = b(i10);
            this.f1594b = C0867j.this.D(this.f1594b);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC0865h.c(this.f1595c >= 0);
            c();
            C0867j c0867j = C0867j.this;
            c0867j.remove(c0867j.J(this.f1595c));
            this.f1594b = C0867j.this.r(this.f1594b, this.f1595c);
            this.f1595c = -1;
        }
    }

    /* JADX INFO: renamed from: C9.j$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0867j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0867j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0867j.this.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapZ = C0867j.this.z();
            if (mapZ != null) {
                return mapZ.keySet().remove(obj);
            }
            return C0867j.this.N(obj) != C0867j.f1579j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0867j.this.size();
        }
    }

    /* JADX INFO: renamed from: C9.j$g */
    final class g extends AbstractC0862e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1599b;

        g(int i10) {
            this.f1598a = C0867j.this.J(i10);
            this.f1599b = i10;
        }

        private void a() {
            int i10 = this.f1599b;
            if (i10 == -1 || i10 >= C0867j.this.size() || !B9.j.a(this.f1598a, C0867j.this.J(this.f1599b))) {
                this.f1599b = C0867j.this.G(this.f1598a);
            }
        }

        @Override // C9.AbstractC0862e, java.util.Map.Entry
        public Object getKey() {
            return this.f1598a;
        }

        @Override // C9.AbstractC0862e, java.util.Map.Entry
        public Object getValue() {
            Map mapZ = C0867j.this.z();
            if (mapZ != null) {
                return H.a(mapZ.get(this.f1598a));
            }
            a();
            int i10 = this.f1599b;
            return i10 == -1 ? H.b() : C0867j.this.Z(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapZ = C0867j.this.z();
            if (mapZ != null) {
                return H.a(mapZ.put(this.f1598a, obj));
            }
            a();
            int i10 = this.f1599b;
            if (i10 == -1) {
                C0867j.this.put(this.f1598a, obj);
                return H.b();
            }
            Object objZ = C0867j.this.Z(i10);
            C0867j.this.Y(this.f1599b, obj);
            return objZ;
        }
    }

    /* JADX INFO: renamed from: C9.j$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C0867j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C0867j.this.a0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C0867j.this.size();
        }
    }

    C0867j(int i10) {
        H(i10);
    }

    private int A(int i10) {
        return O()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        return (1 << (this.f1584e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(Object obj) {
        if (M()) {
            return -1;
        }
        int iC = AbstractC0874q.c(obj);
        int iE = E();
        int iH = AbstractC0868k.h(Q(), iC & iE);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC0868k.b(iC, iE);
        do {
            int i10 = iH - 1;
            int iA = A(i10);
            if (AbstractC0868k.b(iA, iE) == iB && B9.j.a(obj, J(i10))) {
                return i10;
            }
            iH = AbstractC0868k.c(iA, iE);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object J(int i10) {
        return P()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object N(Object obj) {
        int iE;
        int iF;
        if (!M() && (iF = AbstractC0868k.f(obj, null, (iE = E()), Q(), O(), P(), null)) != -1) {
            Object objZ = Z(iF);
            L(iF, iE);
            this.f1585f--;
            F();
            return objZ;
        }
        return f1579j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] O() {
        int[] iArr = this.f1581b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f1582c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object Q() {
        Object obj = this.f1580a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f1583d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void T(int i10) {
        int iMin;
        int length = O().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(iMin);
    }

    private int U(int i10, int i11, int i12, int i13) {
        Object objA = AbstractC0868k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC0868k.i(objA, i12 & i14, i13 + 1);
        }
        Object objQ = Q();
        int[] iArrO = O();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = AbstractC0868k.h(objQ, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrO[i16];
                int iB = AbstractC0868k.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = AbstractC0868k.h(objA, i18);
                AbstractC0868k.i(objA, i18, iH);
                iArrO[i16] = AbstractC0868k.d(iB, iH2, i14);
                iH = AbstractC0868k.c(i17, i10);
            }
        }
        this.f1580a = objA;
        W(i14);
        return i14;
    }

    private void V(int i10, int i11) {
        O()[i10] = i11;
    }

    private void W(int i10) {
        this.f1584e = AbstractC0868k.d(this.f1584e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void X(int i10, Object obj) {
        P()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i10, Object obj) {
        R()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object Z(int i10) {
        return R()[i10];
    }

    static /* synthetic */ int e(C0867j c0867j) {
        int i10 = c0867j.f1585f;
        c0867j.f1585f = i10 - 1;
        return i10;
    }

    public static C0867j y(int i10) {
        return new C0867j(i10);
    }

    Iterator B() {
        Map mapZ = z();
        return mapZ != null ? mapZ.entrySet().iterator() : new b();
    }

    int C() {
        return isEmpty() ? -1 : 0;
    }

    int D(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f1585f) {
            return i11;
        }
        return -1;
    }

    void F() {
        this.f1584e += 32;
    }

    void H(int i10) {
        B9.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f1584e = F9.f.g(i10, 1, 1073741823);
    }

    void I(int i10, Object obj, Object obj2, int i11, int i12) {
        V(i10, AbstractC0868k.d(i11, 0, i12));
        X(i10, obj);
        Y(i10, obj2);
    }

    Iterator K() {
        Map mapZ = z();
        return mapZ != null ? mapZ.keySet().iterator() : new a();
    }

    void L(int i10, int i11) {
        Object objQ = Q();
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrP[i10] = null;
            objArrR[i10] = null;
            iArrO[i10] = 0;
            return;
        }
        Object obj = objArrP[i12];
        objArrP[i10] = obj;
        objArrR[i10] = objArrR[i12];
        objArrP[i12] = null;
        objArrR[i12] = null;
        iArrO[i10] = iArrO[i12];
        iArrO[i12] = 0;
        int iC = AbstractC0874q.c(obj) & i11;
        int iH = AbstractC0868k.h(objQ, iC);
        if (iH == size) {
            AbstractC0868k.i(objQ, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrO[i13];
            int iC2 = AbstractC0868k.c(i14, i11);
            if (iC2 == size) {
                iArrO[i13] = AbstractC0868k.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean M() {
        return this.f1580a == null;
    }

    void S(int i10) {
        this.f1581b = Arrays.copyOf(O(), i10);
        this.f1582c = Arrays.copyOf(P(), i10);
        this.f1583d = Arrays.copyOf(R(), i10);
    }

    Iterator a0() {
        Map mapZ = z();
        return mapZ != null ? mapZ.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        F();
        Map mapZ = z();
        if (mapZ != null) {
            this.f1584e = F9.f.g(size(), 3, 1073741823);
            mapZ.clear();
            this.f1580a = null;
            this.f1585f = 0;
            return;
        }
        Arrays.fill(P(), 0, this.f1585f, (Object) null);
        Arrays.fill(R(), 0, this.f1585f, (Object) null);
        AbstractC0868k.g(Q());
        Arrays.fill(O(), 0, this.f1585f, 0);
        this.f1585f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsKey(obj);
        }
        return G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f1585f; i10++) {
            if (B9.j.a(obj, Z(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f1587h;
        if (set != null) {
            return set;
        }
        Set setU = u();
        this.f1587h = setU;
        return setU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.get(obj);
        }
        int iG = G(obj);
        if (iG == -1) {
            return null;
        }
        q(iG);
        return Z(iG);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f1586g;
        if (set != null) {
            return set;
        }
        Set setW = w();
        this.f1586g = setW;
        return setW;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (M()) {
            s();
        }
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.put(obj, obj2);
        }
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int i10 = this.f1585f;
        int i11 = i10 + 1;
        int iC = AbstractC0874q.c(obj);
        int iE = E();
        int i12 = iC & iE;
        int iH = AbstractC0868k.h(Q(), i12);
        if (iH != 0) {
            int iB = AbstractC0868k.b(iC, iE);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrO[i14];
                if (AbstractC0868k.b(i15, iE) == iB && B9.j.a(obj, objArrP[i14])) {
                    Object obj3 = objArrR[i14];
                    objArrR[i14] = obj2;
                    q(i14);
                    return obj3;
                }
                int iC2 = AbstractC0868k.c(i15, iE);
                i13++;
                if (iC2 == 0) {
                    if (i13 < 9) {
                        if (i11 <= iE) {
                            iArrO[i14] = AbstractC0868k.d(i15, i11, iE);
                            break;
                        }
                        iE = U(iE, AbstractC0868k.e(iE), iC, i10);
                        break;
                    }
                    return t().put(obj, obj2);
                }
                obj = obj;
                obj2 = obj2;
                iH = iC2;
            }
        } else if (i11 > iE) {
            iE = U(iE, AbstractC0868k.e(iE), iC, i10);
        } else {
            AbstractC0868k.i(Q(), i12, i11);
        }
        int i16 = iE;
        T(i11);
        I(i10, obj, obj2, iC, i16);
        this.f1585f = i11;
        F();
        return null;
    }

    void q(int i10) {
    }

    int r(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.remove(obj);
        }
        Object objN = N(obj);
        if (objN == f1579j) {
            return null;
        }
        return objN;
    }

    int s() {
        B9.n.p(M(), "Arrays already allocated");
        int i10 = this.f1584e;
        int iJ = AbstractC0868k.j(i10);
        this.f1580a = AbstractC0868k.a(iJ);
        W(iJ - 1);
        this.f1581b = new int[i10];
        this.f1582c = new Object[i10];
        this.f1583d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapZ = z();
        return mapZ != null ? mapZ.size() : this.f1585f;
    }

    Map t() {
        Map mapV = v(E() + 1);
        int iC = C();
        while (iC >= 0) {
            mapV.put(J(iC), Z(iC));
            iC = D(iC);
        }
        this.f1580a = mapV;
        this.f1581b = null;
        this.f1582c = null;
        this.f1583d = null;
        F();
        return mapV;
    }

    Set u() {
        return new d();
    }

    Map v(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f1588i;
        if (collection != null) {
            return collection;
        }
        Collection collectionX = x();
        this.f1588i = collectionX;
        return collectionX;
    }

    Set w() {
        return new f();
    }

    Collection x() {
        return new h();
    }

    Map z() {
        Object obj = this.f1580a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
