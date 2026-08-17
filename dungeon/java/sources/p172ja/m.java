package p172ja;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p119ga.d;
import p119ga.e;
import p119ga.f;
import p119ga.h;
import p119ga.i;
import p155ia.g;
import p262oa.a;
import p262oa.b;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final p119ga.q f47117A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final p119ga.q f47118B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p119ga.r f47119C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p119ga.q f47120D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final p119ga.r f47121E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final p119ga.q f47122F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final p119ga.r f47123G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final p119ga.q f47124H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final p119ga.r f47125I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final p119ga.q f47126J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final p119ga.r f47127K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final p119ga.q f47128L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final p119ga.r f47129M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final p119ga.q f47130N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final p119ga.r f47131O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final p119ga.q f47132P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final p119ga.r f47133Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final p119ga.q f47134R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final p119ga.r f47135S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final p119ga.q f47136T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final p119ga.r f47137U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final p119ga.q f47138V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final p119ga.r f47139W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final p119ga.r f47140X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p119ga.q f47141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p119ga.r f47142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p119ga.q f47143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p119ga.r f47144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p119ga.q f47145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p119ga.q f47146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p119ga.r f47147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p119ga.q f47148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p119ga.r f47149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p119ga.q f47150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p119ga.r f47151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p119ga.q f47152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p119ga.r f47153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p119ga.q f47154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p119ga.r f47155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p119ga.q f47156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p119ga.r f47157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p119ga.q f47158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p119ga.r f47159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p119ga.q f47160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p119ga.q f47161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p119ga.q f47162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p119ga.q f47163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p119ga.r f47164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p119ga.q f47165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p119ga.q f47166z;

    static /* synthetic */ class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47167a;

        static {
            int[] iArr = new int[b.values().length];
            f47167a = iArr;
            try {
                iArr[b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47167a[b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47167a[b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47167a[b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47167a[b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47167a[b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class B extends p119ga.q {
        B() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(a aVar) throws IOException {
            b bVarS = aVar.s();
            if (bVarS != b.NULL) {
                return bVarS == b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.j2())) : Boolean.valueOf(aVar.k());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Boolean bool) throws IOException {
            cVar.P(bool);
        }
    }

    class C extends p119ga.q {
        C() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return Boolean.valueOf(aVar.j2());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Boolean bool) throws IOException {
            cVar.U(bool == null ? "null" : bool.toString());
        }
    }

    class D extends p119ga.q {
        D() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new p119ga.l("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.f());
            } catch (NumberFormatException e10) {
                throw new p119ga.l(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
            } else {
                cVar.O(number.byteValue());
            }
        }
    }

    class E extends p119ga.q {
        E() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new p119ga.l("Lossy conversion from " + iNextInt + " to short; at path " + aVar.f());
            } catch (NumberFormatException e10) {
                throw new p119ga.l(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
            } else {
                cVar.O(number.shortValue());
            }
        }
    }

    class F extends p119ga.q {
        F() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new p119ga.l(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
            } else {
                cVar.O(number.intValue());
            }
        }
    }

    class G extends p119ga.q {
        G() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new p119ga.l(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.O(atomicInteger.get());
        }
    }

    class H extends p119ga.q {
        H() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(a aVar) {
            return new AtomicBoolean(aVar.k());
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.V(atomicBoolean.get());
        }
    }

    private static final class I extends p119ga.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f47168a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f47169b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f47170c = new HashMap();

        class a implements PrivilegedAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f47171a;

            a(Class cls) {
                this.f47171a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f47171a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public I(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r10 = (Enum) field.get(null);
                    String strName = r10.name();
                    String string = r10.toString();
                    p137ha.c cVar = (p137ha.c) field.getAnnotation(p137ha.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f47168a.put(str, r10);
                        }
                    }
                    this.f47168a.put(strName, r10);
                    this.f47169b.put(string, r10);
                    this.f47170c.put(r10, strName);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(p262oa.a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            Enum r10 = (Enum) this.f47168a.get(strJ2);
            return r10 == null ? (Enum) this.f47169b.get(strJ2) : r10;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Enum r10) throws IOException {
            cVar.U(r10 == null ? null : (String) this.f47170c.get(r10));
        }
    }

    /* JADX INFO: renamed from: ja.m$a, reason: case insensitive filesystem */
    class C3861a extends p119ga.q {
        C3861a() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.N();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new p119ga.l(e10);
                }
            }
            aVar.J();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.c();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.O(atomicIntegerArray.get(i10));
            }
            cVar.f();
        }
    }

    /* JADX INFO: renamed from: ja.m$b, reason: case insensitive filesystem */
    class C3862b extends p119ga.q {
        C3862b() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e10) {
                throw new p119ga.l(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
            } else {
                cVar.O(number.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: ja.m$c, reason: case insensitive filesystem */
    class C3863c extends p119ga.q {
        C3863c() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.S(number);
        }
    }

    /* JADX INFO: renamed from: ja.m$d, reason: case insensitive filesystem */
    class C3864d extends p119ga.q {
        C3864d() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.r();
            } else {
                cVar.L(number.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: ja.m$e, reason: case insensitive filesystem */
    class C3865e extends p119ga.q {
        C3865e() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            if (strJ2.length() == 1) {
                return Character.valueOf(strJ2.charAt(0));
            }
            throw new p119ga.l("Expecting character, got: " + strJ2 + "; at " + aVar.f());
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Character ch) throws IOException {
            cVar.U(ch == null ? null : String.valueOf(ch));
        }
    }

    /* JADX INFO: renamed from: ja.m$f, reason: case insensitive filesystem */
    class C3866f extends p119ga.q {
        C3866f() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(a aVar) throws IOException {
            b bVarS = aVar.s();
            if (bVarS != b.NULL) {
                return bVarS == b.BOOLEAN ? Boolean.toString(aVar.k()) : aVar.j2();
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, String str) throws IOException {
            cVar.U(str);
        }
    }

    /* JADX INFO: renamed from: ja.m$g, reason: case insensitive filesystem */
    class C3867g extends p119ga.q {
        C3867g() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            try {
                return new BigDecimal(strJ2);
            } catch (NumberFormatException e10) {
                throw new p119ga.l("Failed parsing '" + strJ2 + "' as BigDecimal; at path " + aVar.f(), e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.S(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: ja.m$h, reason: case insensitive filesystem */
    class C3868h extends p119ga.q {
        C3868h() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            try {
                return new BigInteger(strJ2);
            } catch (NumberFormatException e10) {
                throw new p119ga.l("Failed parsing '" + strJ2 + "' as BigInteger; at path " + aVar.f(), e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, BigInteger bigInteger) throws IOException {
            cVar.S(bigInteger);
        }
    }

    /* JADX INFO: renamed from: ja.m$i, reason: case insensitive filesystem */
    class C3869i extends p119ga.q {
        C3869i() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return new g(aVar.j2());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, g gVar) throws IOException {
            cVar.S(gVar);
        }
    }

    class j extends p119ga.q {
        j() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return new StringBuilder(aVar.j2());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, StringBuilder sb2) throws IOException {
            cVar.U(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends p119ga.q {
        k() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends p119ga.q {
        l() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return new StringBuffer(aVar.j2());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.U(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: ja.m$m, reason: collision with other inner class name */
    class C0553m extends p119ga.q {
        C0553m() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            if ("null".equals(strJ2)) {
                return null;
            }
            return new URL(strJ2);
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, URL url) throws IOException {
            cVar.U(url == null ? null : url.toExternalForm());
        }
    }

    class n extends p119ga.q {
        n() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            try {
                String strJ2 = aVar.j2();
                if ("null".equals(strJ2)) {
                    return null;
                }
                return new URI(strJ2);
            } catch (URISyntaxException e10) {
                throw new p119ga.g(e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, URI uri) throws IOException {
            cVar.U(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends p119ga.q {
        o() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(a aVar) throws IOException {
            if (aVar.s() != b.NULL) {
                return InetAddress.getByName(aVar.j2());
            }
            aVar.o();
            return null;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, InetAddress inetAddress) throws IOException {
            cVar.U(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends p119ga.q {
        p() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            String strJ2 = aVar.j2();
            try {
                return UUID.fromString(strJ2);
            } catch (IllegalArgumentException e10) {
                throw new p119ga.l("Failed parsing '" + strJ2 + "' as UUID; at path " + aVar.f(), e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, UUID uuid) throws IOException {
            cVar.U(uuid == null ? null : uuid.toString());
        }
    }

    class q extends p119ga.q {
        q() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(a aVar) throws IOException {
            String strJ2 = aVar.j2();
            try {
                return Currency.getInstance(strJ2);
            } catch (IllegalArgumentException e10) {
                throw new p119ga.l("Failed parsing '" + strJ2 + "' as Currency; at path " + aVar.f(), e10);
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Currency currency) throws IOException {
            cVar.U(currency.getCurrencyCode());
        }
    }

    class r extends p119ga.q {
        r() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            aVar.I();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.s() != b.END_OBJECT) {
                String strX0 = aVar.X0();
                int iNextInt = aVar.nextInt();
                if ("year".equals(strX0)) {
                    i10 = iNextInt;
                } else if ("month".equals(strX0)) {
                    i11 = iNextInt;
                } else if ("dayOfMonth".equals(strX0)) {
                    i12 = iNextInt;
                } else if ("hourOfDay".equals(strX0)) {
                    i13 = iNextInt;
                } else if ("minute".equals(strX0)) {
                    i14 = iNextInt;
                } else if ("second".equals(strX0)) {
                    i15 = iNextInt;
                }
            }
            aVar.T();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.r();
                return;
            }
            cVar.d();
            cVar.o("year");
            cVar.O(calendar.get(1));
            cVar.o("month");
            cVar.O(calendar.get(2));
            cVar.o("dayOfMonth");
            cVar.O(calendar.get(5));
            cVar.o("hourOfDay");
            cVar.O(calendar.get(11));
            cVar.o("minute");
            cVar.O(calendar.get(12));
            cVar.o("second");
            cVar.O(calendar.get(13));
            cVar.g();
        }
    }

    class s extends p119ga.q {
        s() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(a aVar) throws IOException {
            if (aVar.s() == b.NULL) {
                aVar.o();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.j2(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Locale locale) throws IOException {
            cVar.U(locale == null ? null : locale.toString());
        }
    }

    class t extends p119ga.q {
        t() {
        }

        private f f(a aVar, b bVar) throws IOException {
            int i10 = A.f47167a[bVar.ordinal()];
            if (i10 == 1) {
                return new p119ga.k(new g(aVar.j2()));
            }
            if (i10 == 2) {
                return new p119ga.k(aVar.j2());
            }
            if (i10 == 3) {
                return new p119ga.k(Boolean.valueOf(aVar.k()));
            }
            if (i10 == 6) {
                aVar.o();
                return h.f42281a;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private f g(a aVar, b bVar) throws IOException {
            int i10 = A.f47167a[bVar.ordinal()];
            if (i10 == 4) {
                aVar.N();
                return new e();
            }
            if (i10 != 5) {
                return null;
            }
            aVar.I();
            return new i();
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public f b(a aVar) throws IOException {
            b bVarS = aVar.s();
            f fVarG = g(aVar, bVarS);
            if (fVarG == null) {
                return f(aVar, bVarS);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.hasNext()) {
                    String strX0 = fVarG instanceof i ? aVar.X0() : null;
                    b bVarS2 = aVar.s();
                    f fVarG2 = g(aVar, bVarS2);
                    boolean z10 = fVarG2 != null;
                    if (fVarG2 == null) {
                        fVarG2 = f(aVar, bVarS2);
                    }
                    if (fVarG instanceof e) {
                        ((e) fVarG).k(fVarG2);
                    } else {
                        ((i) fVarG).k(strX0, fVarG2);
                    }
                    if (z10) {
                        arrayDeque.addLast(fVarG);
                        fVarG = fVarG2;
                    }
                } else {
                    if (fVarG instanceof e) {
                        aVar.J();
                    } else {
                        aVar.T();
                    }
                    if (arrayDeque.isEmpty()) {
                        return fVarG;
                    }
                    fVarG = (f) arrayDeque.removeLast();
                }
            }
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, f fVar) throws IOException {
            if (fVar == null || fVar.h()) {
                cVar.r();
                return;
            }
            if (fVar.j()) {
                p119ga.k kVarE = fVar.e();
                if (kVarE.q()) {
                    cVar.S(kVarE.l());
                    return;
                } else if (kVarE.o()) {
                    cVar.V(kVarE.k());
                    return;
                } else {
                    cVar.U(kVarE.n());
                    return;
                }
            }
            if (fVar.g()) {
                cVar.c();
                Iterator it = fVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, (f) it.next());
                }
                cVar.f();
                return;
            }
            if (!fVar.i()) {
                throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
            }
            cVar.d();
            for (Map.Entry entry : fVar.c().l()) {
                cVar.o((String) entry.getKey());
                d(cVar, (f) entry.getValue());
            }
            cVar.g();
        }
    }

    class u implements p119ga.r {
        u() {
        }

        @Override // p119ga.r
        public p119ga.q b(d dVar, p244na.a aVar) {
            Class clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new I(clsC);
        }
    }

    class v extends p119ga.q {
        v() {
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.N();
            b bVarS = aVar.s();
            int i10 = 0;
            while (bVarS != b.END_ARRAY) {
                int i11 = A.f47167a[bVarS.ordinal()];
                boolean zK = true;
                if (i11 == 1 || i11 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zK = false;
                    } else if (iNextInt != 1) {
                        throw new p119ga.l("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.f());
                    }
                } else {
                    if (i11 != 3) {
                        throw new p119ga.l("Invalid bitset value type: " + bVarS + "; at path " + aVar.H());
                    }
                    zK = aVar.k();
                }
                if (zK) {
                    bitSet.set(i10);
                }
                i10++;
                bVarS = aVar.s();
            }
            aVar.J();
            return bitSet;
        }

        @Override // p119ga.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, BitSet bitSet) throws IOException {
            cVar.c();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.O(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.f();
        }
    }

    class w implements p119ga.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f47173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p119ga.q f47174b;

        w(Class cls, p119ga.q qVar) {
            this.f47173a = cls;
            this.f47174b = qVar;
        }

        @Override // p119ga.r
        public p119ga.q b(d dVar, p244na.a aVar) {
            if (aVar.c() == this.f47173a) {
                return this.f47174b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f47173a.getName() + ",adapter=" + this.f47174b + "]";
        }
    }

    class x implements p119ga.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f47175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f47176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p119ga.q f47177c;

        x(Class cls, Class cls2, p119ga.q qVar) {
            this.f47175a = cls;
            this.f47176b = cls2;
            this.f47177c = qVar;
        }

        @Override // p119ga.r
        public p119ga.q b(d dVar, p244na.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f47175a || clsC == this.f47176b) {
                return this.f47177c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f47176b.getName() + "+" + this.f47175a.getName() + ",adapter=" + this.f47177c + "]";
        }
    }

    class y implements p119ga.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f47178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f47179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p119ga.q f47180c;

        y(Class cls, Class cls2, p119ga.q qVar) {
            this.f47178a = cls;
            this.f47179b = cls2;
            this.f47180c = qVar;
        }

        @Override // p119ga.r
        public p119ga.q b(d dVar, p244na.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f47178a || clsC == this.f47179b) {
                return this.f47180c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f47178a.getName() + "+" + this.f47179b.getName() + ",adapter=" + this.f47180c + "]";
        }
    }

    class z implements p119ga.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f47181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p119ga.q f47182b;

        class a extends p119ga.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f47183a;

            a(Class cls) {
                this.f47183a = cls;
            }

            @Override // p119ga.q
            public Object b(p262oa.a aVar) {
                Object objB = z.this.f47182b.b(aVar);
                if (objB == null || this.f47183a.isInstance(objB)) {
                    return objB;
                }
                throw new p119ga.l("Expected a " + this.f47183a.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.f());
            }

            @Override // p119ga.q
            public void d(c cVar, Object obj) {
                z.this.f47182b.d(cVar, obj);
            }
        }

        z(Class cls, p119ga.q qVar) {
            this.f47181a = cls;
            this.f47182b = qVar;
        }

        @Override // p119ga.r
        public p119ga.q b(d dVar, p244na.a aVar) {
            Class<?> clsC = aVar.c();
            if (this.f47181a.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f47181a.getName() + ",adapter=" + this.f47182b + "]";
        }
    }

    static {
        p119ga.q qVarA = new k().a();
        f47141a = qVarA;
        f47142b = a(Class.class, qVarA);
        p119ga.q qVarA2 = new v().a();
        f47143c = qVarA2;
        f47144d = a(BitSet.class, qVarA2);
        B b10 = new B();
        f47145e = b10;
        f47146f = new C();
        f47147g = b(Boolean.TYPE, Boolean.class, b10);
        D d10 = new D();
        f47148h = d10;
        f47149i = b(Byte.TYPE, Byte.class, d10);
        E e10 = new E();
        f47150j = e10;
        f47151k = b(Short.TYPE, Short.class, e10);
        F f10 = new F();
        f47152l = f10;
        f47153m = b(Integer.TYPE, Integer.class, f10);
        p119ga.q qVarA3 = new G().a();
        f47154n = qVarA3;
        f47155o = a(AtomicInteger.class, qVarA3);
        p119ga.q qVarA4 = new H().a();
        f47156p = qVarA4;
        f47157q = a(AtomicBoolean.class, qVarA4);
        p119ga.q qVarA5 = new C3861a().a();
        f47158r = qVarA5;
        f47159s = a(AtomicIntegerArray.class, qVarA5);
        f47160t = new C3862b();
        f47161u = new C3863c();
        f47162v = new C3864d();
        C3865e c3865e = new C3865e();
        f47163w = c3865e;
        f47164x = b(Character.TYPE, Character.class, c3865e);
        C3866f c3866f = new C3866f();
        f47165y = c3866f;
        f47166z = new C3867g();
        f47117A = new C3868h();
        f47118B = new C3869i();
        f47119C = a(String.class, c3866f);
        j jVar = new j();
        f47120D = jVar;
        f47121E = a(StringBuilder.class, jVar);
        l lVar = new l();
        f47122F = lVar;
        f47123G = a(StringBuffer.class, lVar);
        C0553m c0553m = new C0553m();
        f47124H = c0553m;
        f47125I = a(URL.class, c0553m);
        n nVar = new n();
        f47126J = nVar;
        f47127K = a(URI.class, nVar);
        o oVar = new o();
        f47128L = oVar;
        f47129M = d(InetAddress.class, oVar);
        p pVar = new p();
        f47130N = pVar;
        f47131O = a(UUID.class, pVar);
        p119ga.q qVarA6 = new q().a();
        f47132P = qVarA6;
        f47133Q = a(Currency.class, qVarA6);
        r rVar = new r();
        f47134R = rVar;
        f47135S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f47136T = sVar;
        f47137U = a(Locale.class, sVar);
        t tVar = new t();
        f47138V = tVar;
        f47139W = d(f.class, tVar);
        f47140X = new u();
    }

    public static p119ga.r a(Class cls, p119ga.q qVar) {
        return new w(cls, qVar);
    }

    public static p119ga.r b(Class cls, Class cls2, p119ga.q qVar) {
        return new x(cls, cls2, qVar);
    }

    public static p119ga.r c(Class cls, Class cls2, p119ga.q qVar) {
        return new y(cls, cls2, qVar);
    }

    public static p119ga.r d(Class cls, p119ga.q qVar) {
        return new z(cls, qVar);
    }
}
