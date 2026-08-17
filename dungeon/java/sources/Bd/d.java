package Bd;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3942d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Map, Serializable, Nd.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f674n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final d f675o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Bd.f f685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bd.e f687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f688m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(kotlin.ranges.e.e(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f675o;
        }
    }

    public static final class b extends C0016d implements Iterator, Nd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= d().f681f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            c cVar = new c(d(), c());
            f();
            return cVar;
        }

        public final void k(StringBuilder sb2) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (b() >= d().f681f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f676a[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = d().f677b;
            Intrinsics.c(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            f();
        }

        public final int m() {
            if (b() >= d().f681f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f676a[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = d().f677b;
            Intrinsics.c(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    public static final class c implements Map.Entry, Nd.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f691c;

        public c(d map, int i10) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f689a = map;
            this.f690b = i10;
            this.f691c = map.f683h;
        }

        private final void a() {
            if (this.f689a.f683h != this.f691c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.b(entry.getKey(), getKey()) && Intrinsics.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f689a.f676a[this.f690b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f689a.f677b;
            Intrinsics.c(objArr);
            return objArr[this.f690b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f689a.n();
            Object[] objArrK = this.f689a.k();
            int i10 = this.f690b;
            Object obj2 = objArrK[i10];
            objArrK[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: Bd.d$d, reason: collision with other inner class name */
    public static class C0016d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f695d;

        public C0016d(d map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f692a = map;
            this.f694c = -1;
            this.f695d = map.f683h;
            f();
        }

        public final void a() {
            if (this.f692a.f683h != this.f695d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f693b;
        }

        public final int c() {
            return this.f694c;
        }

        public final d d() {
            return this.f692a;
        }

        public final void f() {
            while (this.f693b < this.f692a.f681f) {
                int[] iArr = this.f692a.f678c;
                int i10 = this.f693b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f693b = i10 + 1;
                }
            }
        }

        public final void g(int i10) {
            this.f693b = i10;
        }

        public final void h(int i10) {
            this.f694c = i10;
        }

        public final boolean hasNext() {
            return this.f693b < this.f692a.f681f;
        }

        public final void remove() {
            a();
            if (this.f694c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f692a.n();
            this.f692a.N(this.f694c);
            this.f694c = -1;
            this.f695d = this.f692a.f683h;
        }
    }

    public static final class e extends C0016d implements Iterator, Nd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f681f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object obj = d().f676a[c()];
            f();
            return obj;
        }
    }

    public static final class f extends C0016d implements Iterator, Nd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f681f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            g(iB + 1);
            h(iB);
            Object[] objArr = d().f677b;
            Intrinsics.c(objArr);
            Object obj = objArr[c()];
            f();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f688m = true;
        f675o = dVar;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(Bd.c.d(i10), null, new int[i10], new int[f674n.c(i10)], 2, 0);
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f676a = objArr;
        this.f677b = objArr2;
        this.f678c = iArr;
        this.f679d = iArr2;
        this.f680e = i10;
        this.f681f = i11;
        this.f682g = f674n.d(B());
    }

    private final int B() {
        return this.f679d.length;
    }

    private final int F(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f682g;
    }

    private final boolean H(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        v(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (I((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean I(Map.Entry entry) {
        int i10 = i(entry.getKey());
        Object[] objArrK = k();
        if (i10 >= 0) {
            objArrK[i10] = entry.getValue();
            return true;
        }
        int i11 = (-i10) - 1;
        if (Intrinsics.b(entry.getValue(), objArrK[i11])) {
            return false;
        }
        objArrK[i11] = entry.getValue();
        return true;
    }

    private final boolean J(int i10) {
        int iF = F(this.f676a[i10]);
        int i11 = this.f680e;
        while (true) {
            int[] iArr = this.f679d;
            if (iArr[iF] == 0) {
                iArr[iF] = i10 + 1;
                this.f678c[i10] = iF;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iF = iF == 0 ? B() - 1 : iF - 1;
        }
    }

    private final void K() {
        this.f683h++;
    }

    private final void L(int i10) {
        K();
        int i11 = 0;
        if (this.f681f > size()) {
            p(false);
        }
        this.f679d = new int[i10];
        this.f682g = f674n.d(i10);
        while (i11 < this.f681f) {
            int i12 = i11 + 1;
            if (!J(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i10) {
        Bd.c.f(this.f676a, i10);
        Object[] objArr = this.f677b;
        if (objArr != null) {
            Bd.c.f(objArr, i10);
        }
        O(this.f678c[i10]);
        this.f678c[i10] = -1;
        this.f684i = size() - 1;
        K();
    }

    private final void O(int i10) {
        int i11 = kotlin.ranges.e.i(this.f680e * 2, B() / 2);
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? B() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f680e) {
                this.f679d[i13] = 0;
                return;
            }
            int[] iArr = this.f679d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((F(this.f676a[i15]) - i10) & (B() - 1)) >= i12) {
                    this.f679d[i13] = i14;
                    this.f678c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f679d[i13] = -1;
    }

    private final boolean R(int i10) {
        int iZ = z();
        int i11 = this.f681f;
        int i12 = iZ - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= z() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f677b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = Bd.c.d(z());
        this.f677b = objArrD;
        return objArrD;
    }

    private final void p(boolean z10) {
        int i10;
        Object[] objArr = this.f677b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f681f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f678c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f676a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f679d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        Bd.c.g(this.f676a, i12, i10);
        if (objArr != null) {
            Bd.c.g(objArr, i12, this.f681f);
        }
        this.f681f = i12;
    }

    private final boolean s(Map map) {
        return size() == map.size() && q(map.entrySet());
    }

    private final void t(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > z()) {
            int iE = AbstractC3942d.f48249a.e(z(), i10);
            this.f676a = Bd.c.e(this.f676a, iE);
            Object[] objArr = this.f677b;
            this.f677b = objArr != null ? Bd.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f678c, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f678c = iArrCopyOf;
            int iC = f674n.c(iE);
            if (iC > B()) {
                L(iC);
            }
        }
    }

    private final void v(int i10) {
        if (R(i10)) {
            p(true);
        } else {
            t(this.f681f + i10);
        }
    }

    private final int x(Object obj) {
        int iF = F(obj);
        int i10 = this.f680e;
        while (true) {
            int i11 = this.f679d[iF];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.b(this.f676a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iF = iF == 0 ? B() - 1 : iF - 1;
        }
    }

    private final int y(Object obj) {
        int i10 = this.f681f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f678c[i10] >= 0) {
                Object[] objArr = this.f677b;
                Intrinsics.c(objArr);
                if (Intrinsics.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public Set A() {
        Bd.e eVar = this.f687l;
        if (eVar != null) {
            return eVar;
        }
        Bd.e eVar2 = new Bd.e(this);
        this.f687l = eVar2;
        return eVar2;
    }

    public Set C() {
        Bd.f fVar = this.f685j;
        if (fVar != null) {
            return fVar;
        }
        Bd.f fVar2 = new Bd.f(this);
        this.f685j = fVar2;
        return fVar2;
    }

    public int D() {
        return this.f684i;
    }

    public Collection E() {
        g gVar = this.f686k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f686k = gVar2;
        return gVar2;
    }

    public final e G() {
        return new e(this);
    }

    public final boolean M(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        n();
        int iX = x(entry.getKey());
        if (iX < 0) {
            return false;
        }
        Object[] objArr = this.f677b;
        Intrinsics.c(objArr);
        if (!Intrinsics.b(objArr[iX], entry.getValue())) {
            return false;
        }
        N(iX);
        return true;
    }

    public final boolean P(Object obj) {
        n();
        int iX = x(obj);
        if (iX < 0) {
            return false;
        }
        N(iX);
        return true;
    }

    public final boolean Q(Object obj) {
        n();
        int iY = y(obj);
        if (iY < 0) {
            return false;
        }
        N(iY);
        return true;
    }

    public final f T() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i10 = this.f681f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f678c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f679d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        Bd.c.g(this.f676a, 0, this.f681f);
        Object[] objArr = this.f677b;
        if (objArr != null) {
            Bd.c.g(objArr, 0, this.f681f);
        }
        this.f684i = 0;
        this.f681f = 0;
        K();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return x(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return y(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return A();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && s((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iX = x(obj);
        if (iX < 0) {
            return null;
        }
        Object[] objArr = this.f677b;
        Intrinsics.c(objArr);
        return objArr[iX];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarW = w();
        int iM = 0;
        while (bVarW.hasNext()) {
            iM += bVarW.m();
        }
        return iM;
    }

    public final int i(Object obj) {
        n();
        while (true) {
            int iF = F(obj);
            int i10 = kotlin.ranges.e.i(this.f680e * 2, B() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.f679d[iF];
                if (i12 <= 0) {
                    if (this.f681f >= z()) {
                        v(1);
                        break;
                    }
                    int i13 = this.f681f;
                    int i14 = i13 + 1;
                    this.f681f = i14;
                    this.f676a[i13] = obj;
                    this.f678c[i13] = iF;
                    this.f679d[iF] = i14;
                    this.f684i = size() + 1;
                    K();
                    if (i11 > this.f680e) {
                        this.f680e = i11;
                    }
                    return i13;
                }
                if (Intrinsics.b(this.f676a[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    L(B() * 2);
                    break;
                }
                iF = iF == 0 ? B() - 1 : iF - 1;
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C();
    }

    public final Map m() {
        n();
        this.f688m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f675o;
        Intrinsics.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (this.f688m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int i10 = i(obj);
        Object[] objArrK = k();
        if (i10 >= 0) {
            objArrK[i10] = obj2;
            return null;
        }
        int i11 = (-i10) - 1;
        Object obj3 = objArrK[i11];
        objArrK[i11] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        n();
        H(from.entrySet());
    }

    public final boolean q(Collection m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iX = x(entry.getKey());
        if (iX < 0) {
            return false;
        }
        Object[] objArr = this.f677b;
        Intrinsics.c(objArr);
        return Intrinsics.b(objArr[iX], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int iX = x(obj);
        if (iX < 0) {
            return null;
        }
        Object[] objArr = this.f677b;
        Intrinsics.c(objArr);
        Object obj2 = objArr[iX];
        N(iX);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return D();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarW = w();
        int i10 = 0;
        while (bVarW.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarW.k(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return E();
    }

    public final b w() {
        return new b(this);
    }

    public final int z() {
        return this.f676a.length;
    }
}
