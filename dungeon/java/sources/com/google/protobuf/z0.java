package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f38126a = H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f38127b = AbstractC3137d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f38128c = q(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f38129d = q(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f38130e = F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f38131f = X();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f38132g = W();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f38133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f38134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f38135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f38136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f38137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f38138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f38139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f38140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f38141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f38142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f38143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f38144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f38145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f38146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f38147v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f38148w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
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

        @Override // com.google.protobuf.z0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j10) {
            return z0.f38148w ? z0.u(obj, j10) : z0.v(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j10) {
            return z0.f38148w ? z0.y(obj, j10) : z0.z(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j10, boolean z10) {
            if (z0.f38148w) {
                z0.M(obj, j10, z10);
            } else {
                z0.N(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j10, byte b10) {
            if (z0.f38148w) {
                z0.P(obj, j10, b10);
            } else {
                z0.Q(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j10) {
            return z0.f38148w ? z0.u(obj, j10) : z0.v(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j10) {
            return z0.f38148w ? z0.y(obj, j10) : z0.z(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j10, boolean z10) {
            if (z0.f38148w) {
                z0.M(obj, j10, z10);
            } else {
                z0.N(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j10, byte b10) {
            if (z0.f38148w) {
                z0.P(obj, j10, b10);
            } else {
                z0.Q(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z0.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f38149a.copyMemory((Object) null, j10, bArr, z0.f38133h + j11, j12);
        }

        @Override // com.google.protobuf.z0.e
        public boolean d(Object obj, long j10) {
            return this.f38149a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public byte e(long j10) {
            return this.f38149a.getByte(j10);
        }

        @Override // com.google.protobuf.z0.e
        public byte f(Object obj, long j10) {
            return this.f38149a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public double g(Object obj, long j10) {
            return this.f38149a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public float h(Object obj, long j10) {
            return this.f38149a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.z0.e
        public long j(long j10) {
            return this.f38149a.getLong(j10);
        }

        @Override // com.google.protobuf.z0.e
        public void n(Object obj, long j10, boolean z10) {
            this.f38149a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.z0.e
        public void o(Object obj, long j10, byte b10) {
            this.f38149a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.z0.e
        public void p(Object obj, long j10, double d10) {
            this.f38149a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.z0.e
        public void q(Object obj, long j10, float f10) {
            this.f38149a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.z0.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.f38149a.getClass();
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
                z0.K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.z0.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f38149a.getClass();
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
                z0.K(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f38149a;

        e(Unsafe unsafe) {
            this.f38149a = unsafe;
        }

        public final int a(Class cls) {
            return this.f38149a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f38149a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f38149a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f38149a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f38149a.getObject(obj, j10);
        }

        public final long m(java.lang.reflect.Field field) {
            return this.f38149a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j10, boolean z10);

        public abstract void o(Object obj, long j10, byte b10);

        public abstract void p(Object obj, long j10, double d10);

        public abstract void q(Object obj, long j10, float f10);

        public final void r(Object obj, long j10, int i10) {
            this.f38149a.putInt(obj, j10, i10);
        }

        public final void s(Object obj, long j10, long j11) {
            this.f38149a.putLong(obj, j10, j11);
        }

        public final void t(Object obj, long j10, Object obj2) {
            this.f38149a.putObject(obj, j10, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f38149a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
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
                z0.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f38149a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z0.o() != null;
            } catch (Throwable th) {
                z0.K(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f38133h = jM;
        f38134i = m(boolean[].class);
        f38135j = n(boolean[].class);
        f38136k = m(int[].class);
        f38137l = n(int[].class);
        f38138m = m(long[].class);
        f38139n = n(long[].class);
        f38140o = m(float[].class);
        f38141p = n(float[].class);
        f38142q = m(double[].class);
        f38143r = n(double[].class);
        f38144s = m(Object[].class);
        f38145t = n(Object[].class);
        f38146u = s(o());
        f38147v = (int) (jM & 7);
        f38148w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double A(Object obj, long j10) {
        return f38130e.g(obj, j10);
    }

    static float B(Object obj, long j10) {
        return f38130e.h(obj, j10);
    }

    static int C(Object obj, long j10) {
        return f38130e.i(obj, j10);
    }

    static long D(long j10) {
        return f38130e.j(j10);
    }

    static long E(Object obj, long j10) {
        return f38130e.k(obj, j10);
    }

    private static e F() {
        Unsafe unsafe = f38126a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC3137d.c()) {
            return new d(unsafe);
        }
        if (f38128c) {
            return new c(unsafe);
        }
        if (f38129d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j10) {
        return f38130e.l(obj, j10);
    }

    static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean I() {
        return f38132g;
    }

    static boolean J() {
        return f38131f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Throwable th) {
        Logger.getLogger(z0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void L(Object obj, long j10, boolean z10) {
        f38130e.n(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, boolean z10) {
        P(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j10, boolean z10) {
        Q(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void O(byte[] bArr, long j10, byte b10) {
        f38130e.o(bArr, f38133h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = C(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (C(obj, j11) & (~(255 << i10))));
    }

    static void R(Object obj, long j10, double d10) {
        f38130e.p(obj, j10, d10);
    }

    static void S(Object obj, long j10, float f10) {
        f38130e.q(obj, j10, f10);
    }

    static void T(Object obj, long j10, int i10) {
        f38130e.r(obj, j10, i10);
    }

    static void U(Object obj, long j10, long j11) {
        f38130e.s(obj, j10, j11);
    }

    static void V(Object obj, long j10, Object obj2) {
        f38130e.t(obj, j10, obj2);
    }

    private static boolean W() {
        e eVar = f38130e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    private static boolean X() {
        e eVar = f38130e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    static long k(ByteBuffer byteBuffer) {
        return f38130e.k(byteBuffer, f38146u);
    }

    static Object l(Class cls) {
        try {
            return f38126a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class cls) {
        if (f38132g) {
            return f38130e.a(cls);
        }
        return -1;
    }

    private static int n(Class cls) {
        if (f38132g) {
            return f38130e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field o() {
        java.lang.reflect.Field fieldR;
        if (AbstractC3137d.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        java.lang.reflect.Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    static void p(long j10, byte[] bArr, long j11, long j12) {
        f38130e.c(j10, bArr, j11, j12);
    }

    static boolean q(Class cls) {
        if (!AbstractC3137d.c()) {
            return false;
        }
        try {
            Class cls2 = f38127b;
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

    private static java.lang.reflect.Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f38130e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    static boolean t(Object obj, long j10) {
        return f38130e.d(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j10) {
        return y(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    static byte w(long j10) {
        return f38130e.e(j10);
    }

    static byte x(byte[] bArr, long j10) {
        return f38130e.f(bArr, f38133h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }
}
