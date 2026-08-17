package C9;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class M extends AbstractC0877u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final AbstractC0877u f1491h = new M(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f1492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f1493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f1494g;

    static class a extends AbstractC0878v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient AbstractC0877u f1495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f1496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f1497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f1498f;

        /* JADX INFO: renamed from: C9.M$a$a, reason: collision with other inner class name */
        class C0034a extends AbstractC0876t {
            C0034a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                B9.n.h(i10, a.this.f1498f);
                int i11 = i10 * 2;
                Object obj = a.this.f1496d[a.this.f1497e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f1496d[i11 + (a.this.f1497e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // C9.r
            public boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f1498f;
            }
        }

        a(AbstractC0877u abstractC0877u, Object[] objArr, int i10, int i11) {
            this.f1495c = abstractC0877u;
            this.f1496d = objArr;
            this.f1497e = i10;
            this.f1498f = i11;
        }

        @Override // C9.r
        int c(Object[] objArr, int i10) {
            return a().c(objArr, i10);
        }

        @Override // C9.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f1495c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // C9.r
        boolean i() {
            return true;
        }

        @Override // C9.AbstractC0878v
        AbstractC0876t q() {
            return new C0034a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1498f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public V iterator() {
            return a().iterator();
        }
    }

    static final class b extends AbstractC0878v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient AbstractC0877u f1500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient AbstractC0876t f1501d;

        b(AbstractC0877u abstractC0877u, AbstractC0876t abstractC0876t) {
            this.f1500c = abstractC0877u;
            this.f1501d = abstractC0876t;
        }

        @Override // C9.AbstractC0878v, C9.r
        public AbstractC0876t a() {
            return this.f1501d;
        }

        @Override // C9.r
        int c(Object[] objArr, int i10) {
            return a().c(objArr, i10);
        }

        @Override // C9.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f1500c.get(obj) != null;
        }

        @Override // C9.r
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f1500c.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public V iterator() {
            return a().iterator();
        }
    }

    static final class c extends AbstractC0876t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f1502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f1503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f1504e;

        c(Object[] objArr, int i10, int i11) {
            this.f1502c = objArr;
            this.f1503d = i10;
            this.f1504e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            B9.n.h(i10, this.f1504e);
            Object obj = this.f1502c[(i10 * 2) + this.f1503d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // C9.r
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f1504e;
        }
    }

    private M(Object obj, Object[] objArr, int i10) {
        this.f1492e = obj;
        this.f1493f = objArr;
        this.f1494g = i10;
    }

    static M r(int i10, Object[] objArr) {
        return s(i10, objArr, null);
    }

    static M s(int i10, Object[] objArr, AbstractC0877u.a aVar) {
        if (i10 == 0) {
            return (M) f1491h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC0865h.a(obj, obj2);
            return new M(null, objArr, 1);
        }
        B9.n.l(i10, objArr.length >> 1);
        Object objT = t(objArr, i10, AbstractC0878v.l(i10), 0);
        if (objT instanceof Object[]) {
            Object[] objArr2 = (Object[]) objT;
            AbstractC0877u.a.C0037a c0037a = (AbstractC0877u.a.C0037a) objArr2[2];
            if (aVar == null) {
                throw c0037a.a();
            }
            aVar.f1627e = c0037a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objT = obj3;
            i10 = iIntValue;
        }
        return new M(objT, objArr, i10);
    }

    private static Object t(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        AbstractC0877u.a.C0037a c0037a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC0865h.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC0865h.a(obj3, obj4);
                int iB = AbstractC0874q.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                        break;
                    }
                    if (obj3.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj5 = objArr[i22];
                        Objects.requireNonNull(obj5);
                        c0037a = new AbstractC0877u.a.C0037a(obj3, obj4, obj5);
                        objArr[i22] = obj4;
                        break;
                    }
                    iB = i20 + 1;
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0037a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC0865h.a(obj6, obj7);
                int iB2 = AbstractC0874q.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                        break;
                    }
                    if (obj6.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj8 = objArr[i29];
                        Objects.requireNonNull(obj8);
                        c0037a = new AbstractC0877u.a.C0037a(obj6, obj7, obj8);
                        objArr[i29] = obj7;
                        break;
                    }
                    iB2 = i27 + 1;
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0037a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            AbstractC0865h.a(obj9, obj10);
            int iB3 = AbstractC0874q.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                    break;
                }
                i13 = i14;
                if (obj9.equals(objArr[i35])) {
                    int i36 = i35 ^ 1;
                    Object obj11 = objArr[i36];
                    Objects.requireNonNull(obj11);
                    c0037a = new AbstractC0877u.a.C0037a(obj9, obj10, obj11);
                    objArr[i36] = obj10;
                    break;
                }
                iB3 = i34 + 1;
                i14 = i13;
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0037a;
        return objArr2;
    }

    static Object u(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC0874q.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC0874q.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC0874q.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // C9.AbstractC0877u
    AbstractC0878v d() {
        return new a(this, this.f1493f, 0, this.f1494g);
    }

    @Override // C9.AbstractC0877u
    AbstractC0878v e() {
        return new b(this, new c(this.f1493f, 0, this.f1494g));
    }

    @Override // C9.AbstractC0877u
    r f() {
        return new c(this.f1493f, 1, this.f1494g);
    }

    @Override // C9.AbstractC0877u, java.util.Map
    public Object get(Object obj) {
        Object objU = u(this.f1492e, this.f1493f, this.f1494g, 0, obj);
        if (objU == null) {
            return null;
        }
        return objU;
    }

    @Override // C9.AbstractC0877u
    boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f1494g;
    }
}
