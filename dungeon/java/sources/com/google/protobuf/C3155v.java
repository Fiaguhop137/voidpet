package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3155v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C3155v f38033d = new C3155v(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f38034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38036c;

    /* JADX INFO: renamed from: com.google.protobuf.v$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38038b;

        static {
            int[] iArr = new int[C0.b.values().length];
            f38038b = iArr;
            try {
                iArr[C0.b.f37693c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38038b[C0.b.f37694d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38038b[C0.b.f37695e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38038b[C0.b.f37696f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38038b[C0.b.f37697g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38038b[C0.b.f37698h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38038b[C0.b.f37699i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38038b[C0.b.f37700j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38038b[C0.b.f37702l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38038b[C0.b.f37703m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38038b[C0.b.f37701k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38038b[C0.b.f37704n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38038b[C0.b.f37705o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38038b[C0.b.f37707q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38038b[C0.b.f37708r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38038b[C0.b.f37709s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38038b[C0.b.f37710t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f38038b[C0.b.f37706p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C0.c.values().length];
            f38037a = iArr2;
            try {
                iArr2[C0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f38037a[C0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f38037a[C0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f38037a[C0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f38037a[C0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f38037a[C0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f38037a[C0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f38037a[C0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f38037a[C0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.v$b */
    public interface b extends Comparable {
        boolean f();

        int getNumber();

        C0.b j();

        boolean k();

        C0.c l();

        T.a m(T.a aVar, T t10);
    }

    private C3155v() {
        this.f38034a = q0.t(16);
    }

    private C3155v(q0 q0Var) {
        this.f38034a = q0Var;
        x();
    }

    private C3155v(boolean z10) {
        this(q0.t(0));
        x();
    }

    public static C3155v A() {
        return new C3155v();
    }

    public static Object B(AbstractC3143i abstractC3143i, C0.b bVar, boolean z10) {
        return z10 ? C0.d(abstractC3143i, bVar, C0.d.f37726b) : C0.d(abstractC3143i, bVar, C0.d.f37725a);
    }

    private void D(b bVar, Object obj) {
        if (!v(bVar.j(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.j().e(), obj.getClass().getName()));
        }
    }

    static void E(AbstractC3145k abstractC3145k, C0.b bVar, int i10, Object obj) {
        if (bVar == C0.b.f37702l) {
            abstractC3145k.x0(i10, (T) obj);
        } else {
            abstractC3145k.T0(i10, o(bVar, false));
            F(abstractC3145k, bVar, obj);
        }
    }

    static void F(AbstractC3145k abstractC3145k, C0.b bVar, Object obj) {
        switch (a.f38038b[bVar.ordinal()]) {
            case 1:
                abstractC3145k.o0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC3145k.w0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC3145k.E0(((Long) obj).longValue());
                break;
            case 4:
                abstractC3145k.X0(((Long) obj).longValue());
                break;
            case 5:
                abstractC3145k.C0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC3145k.u0(((Long) obj).longValue());
                break;
            case 7:
                abstractC3145k.s0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC3145k.i0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC3145k.z0((T) obj);
                break;
            case 10:
                abstractC3145k.G0((T) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC3142h)) {
                    abstractC3145k.S0((String) obj);
                } else {
                    abstractC3145k.m0((AbstractC3142h) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC3142h)) {
                    abstractC3145k.j0((byte[]) obj);
                } else {
                    abstractC3145k.m0((AbstractC3142h) obj);
                }
                break;
            case 13:
                abstractC3145k.V0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC3145k.K0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC3145k.M0(((Long) obj).longValue());
                break;
            case 16:
                abstractC3145k.O0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC3145k.Q0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof A.c)) {
                    abstractC3145k.q0(((Integer) obj).intValue());
                } else {
                    abstractC3145k.q0(((A.c) obj).getNumber());
                }
                break;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(C0.b bVar, int i10, Object obj) {
        int iS = AbstractC3145k.S(i10);
        if (bVar == C0.b.f37702l) {
            iS *= 2;
        }
        return iS + e(bVar, obj);
    }

    static int e(C0.b bVar, Object obj) {
        switch (a.f38038b[bVar.ordinal()]) {
            case 1:
                return AbstractC3145k.k(((Double) obj).doubleValue());
            case 2:
                return AbstractC3145k.s(((Float) obj).floatValue());
            case 3:
                return AbstractC3145k.z(((Long) obj).longValue());
            case 4:
                return AbstractC3145k.W(((Long) obj).longValue());
            case 5:
                return AbstractC3145k.x(((Integer) obj).intValue());
            case 6:
                return AbstractC3145k.q(((Long) obj).longValue());
            case 7:
                return AbstractC3145k.o(((Integer) obj).intValue());
            case 8:
                return AbstractC3145k.f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC3145k.u((T) obj);
            case 10:
                return AbstractC3145k.E((T) obj);
            case 11:
                return obj instanceof AbstractC3142h ? AbstractC3145k.i((AbstractC3142h) obj) : AbstractC3145k.R((String) obj);
            case 12:
                return obj instanceof AbstractC3142h ? AbstractC3145k.i((AbstractC3142h) obj) : AbstractC3145k.g((byte[]) obj);
            case 13:
                return AbstractC3145k.U(((Integer) obj).intValue());
            case 14:
                return AbstractC3145k.J(((Integer) obj).intValue());
            case 15:
                return AbstractC3145k.L(((Long) obj).longValue());
            case 16:
                return AbstractC3145k.N(((Integer) obj).intValue());
            case 17:
                return AbstractC3145k.P(((Long) obj).longValue());
            case 18:
                return obj instanceof A.c ? AbstractC3145k.m(((A.c) obj).getNumber()) : AbstractC3145k.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        C0.b bVarJ = bVar.j();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(bVarJ, number, obj);
        }
        List list = (List) obj;
        int iD = 0;
        if (!bVar.k()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += d(bVarJ, number, it.next());
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += e(bVarJ, it2.next());
        }
        return AbstractC3145k.S(number) + iD + AbstractC3145k.U(iD);
    }

    public static C3155v h() {
        return f38033d;
    }

    private int k(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        return (bVar.l() != C0.c.MESSAGE || bVar.f() || bVar.k()) ? f(bVar, value) : AbstractC3145k.B(((b) entry.getKey()).getNumber(), (T) value);
    }

    static int o(C0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    private static boolean t(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.l() != C0.c.MESSAGE) {
            return true;
        }
        if (!bVar.f()) {
            return u(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!u(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean u(Object obj) {
        if (obj instanceof U) {
            return ((U) obj).isInitialized();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean v(C0.b bVar, Object obj) {
        A.a(obj);
        switch (a.f38037a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC3142h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof A.c);
            case 9:
                return obj instanceof T;
            default:
                return false;
        }
    }

    private void z(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.f()) {
            Object objI = i(bVar);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f38034a.u(bVar, objI);
            return;
        }
        if (bVar.l() != C0.c.MESSAGE) {
            this.f38034a.u(bVar, c(value));
            return;
        }
        Object objI2 = i(bVar);
        if (objI2 == null) {
            this.f38034a.u(bVar, c(value));
        } else {
            this.f38034a.u(bVar, bVar.m(((T) objI2).toBuilder(), (T) value).build());
        }
    }

    public void C(b bVar, Object obj) {
        if (!bVar.f()) {
            D(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f38034a.u(bVar, obj);
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        D(bVar, obj);
        Object objI = i(bVar);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f38034a.u(bVar, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3155v clone() {
        C3155v c3155vA = A();
        for (int i10 = 0; i10 < this.f38034a.m(); i10++) {
            Map.Entry entryK = this.f38034a.k(i10);
            c3155vA.C((b) entryK.getKey(), entryK.getValue());
        }
        for (Map.Entry entry : this.f38034a.p()) {
            c3155vA.C((b) entry.getKey(), entry.getValue());
        }
        c3155vA.f38036c = this.f38036c;
        return c3155vA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3155v) {
            return this.f38034a.equals(((C3155v) obj).f38034a);
        }
        return false;
    }

    Iterator g() {
        return this.f38036c ? new E.b(this.f38034a.h().iterator()) : this.f38034a.h().iterator();
    }

    public int hashCode() {
        return this.f38034a.hashCode();
    }

    public Object i(b bVar) {
        return this.f38034a.get(bVar);
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f38034a.m(); i10++) {
            iK += k(this.f38034a.k(i10));
        }
        Iterator it = this.f38034a.p().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public Object l(b bVar, int i10) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI != null) {
            return ((List) objI).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int m(b bVar) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI == null) {
            return 0;
        }
        return ((List) objI).size();
    }

    public int n() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f38034a.m(); i10++) {
            Map.Entry entryK = this.f38034a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        for (Map.Entry entry : this.f38034a.p()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean p(b bVar) {
        if (bVar.f()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f38034a.get(bVar) != null;
    }

    boolean q() {
        return this.f38034a.isEmpty();
    }

    public boolean r() {
        return this.f38035b;
    }

    public boolean s() {
        for (int i10 = 0; i10 < this.f38034a.m(); i10++) {
            if (!t(this.f38034a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f38034a.p().iterator();
        while (it.hasNext()) {
            if (!t((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator w() {
        return this.f38036c ? new E.b(this.f38034a.entrySet().iterator()) : this.f38034a.entrySet().iterator();
    }

    public void x() {
        if (this.f38035b) {
            return;
        }
        for (int i10 = 0; i10 < this.f38034a.m(); i10++) {
            Map.Entry entryK = this.f38034a.k(i10);
            if (entryK.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryK.getValue()).makeImmutable();
            }
        }
        this.f38034a.s();
        this.f38035b = true;
    }

    public void y(C3155v c3155v) {
        for (int i10 = 0; i10 < c3155v.f38034a.m(); i10++) {
            z(c3155v.f38034a.k(i10));
        }
        Iterator it = c3155v.f38034a.p().iterator();
        while (it.hasNext()) {
            z((Map.Entry) it.next());
        }
    }
}
