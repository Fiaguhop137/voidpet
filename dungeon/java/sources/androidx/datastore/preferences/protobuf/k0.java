package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f23493a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f23494b = AbstractC1948d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f23495c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f23496d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f23497e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f23498f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f23499g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f23500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f23501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f23502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f23503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f23504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f23505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f23506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f23507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f23508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f23509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f23510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f23511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f23512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f23513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f23514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f23515w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return k0.f23515w ? k0.q(obj, j10) : k0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            if (k0.f23515w) {
                k0.F(obj, j10, z10);
            } else {
                k0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            if (k0.f23515w) {
                k0.I(obj, j10, b10);
            } else {
                k0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return k0.f23515w ? k0.q(obj, j10) : k0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            if (k0.f23515w) {
                k0.F(obj, j10, z10);
            } else {
                k0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            if (k0.f23515w) {
                k0.I(obj, j10, b10);
            } else {
                k0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean c(Object obj, long j10) {
            return this.f23516a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public double d(Object obj, long j10) {
            return this.f23516a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public float e(Object obj, long j10) {
            return this.f23516a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void j(Object obj, long j10, boolean z10) {
            this.f23516a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void k(Object obj, long j10, byte b10) {
            this.f23516a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void l(Object obj, long j10, double d10) {
            this.f23516a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public void m(Object obj, long j10, float f10) {
            this.f23516a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f23516a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                k0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f23516a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                k0.D(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f23516a;

        e(Unsafe unsafe) {
            this.f23516a = unsafe;
        }

        public final int a(Class cls) {
            return this.f23516a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f23516a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f23516a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f23516a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f23516a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f23516a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f23516a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f23516a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f23516a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f23516a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                k0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f23516a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return k0.l() != null;
            } catch (Throwable th) {
                k0.D(th);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f23500h = j10;
        f23501i = j(boolean[].class);
        f23502j = k(boolean[].class);
        f23503k = j(int[].class);
        f23504l = k(int[].class);
        f23505m = j(long[].class);
        f23506n = k(long[].class);
        f23507o = j(float[].class);
        f23508p = k(float[].class);
        f23509q = j(double[].class);
        f23510r = k(double[].class);
        f23511s = j(Object[].class);
        f23512t = k(Object[].class);
        f23513u = o(l());
        f23514v = (int) (j10 & 7);
        f23515w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f23499g;
    }

    static boolean C() {
        return f23498f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(k0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j10, boolean z10) {
        f23497e.j(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f23497e.k(bArr, f23500h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f23497e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f23497e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f23497e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f23497e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f23497e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f23497e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f23497e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static Object i(Class cls) {
        try {
            return f23493a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f23499g) {
            return f23497e.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f23499g) {
            return f23497e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (AbstractC1948d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class cls) {
        if (!AbstractC1948d.c()) {
            return false;
        }
        try {
            Class cls2 = f23494b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f23497e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f23497e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f23497e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f23497e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f23497e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f23497e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f23493a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC1948d.c()) {
            return new d(unsafe);
        }
        if (f23495c) {
            return new c(unsafe);
        }
        if (f23496d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f23497e.h(obj, j10);
    }
}
