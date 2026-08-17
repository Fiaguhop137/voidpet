package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2498h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f32931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f32932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f32933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC2489g6 f32934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f32935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f32936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f32937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f32938h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        AbstractC2489g6 abstractC2489g6;
        Unsafe unsafeV = v();
        f32931a = unsafeV;
        int i10 = AbstractC2630w4.f33166a;
        f32932b = Memory.class;
        Class cls = Long.TYPE;
        boolean zW = w(cls);
        f32933c = zW;
        Class cls2 = Integer.TYPE;
        boolean zW2 = w(cls2);
        AbstractC2489g6 c2471e6 = null;
        if (unsafeV != null) {
            if (zW) {
                c2471e6 = new C2480f6(unsafeV);
            } else if (zW2) {
                c2471e6 = new C2471e6(unsafeV);
            }
        }
        f32934d = c2471e6;
        if (c2471e6 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = c2471e6.f32919a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                D(th);
            }
        }
        f32935e = z10;
        AbstractC2489g6 abstractC2489g7 = f32934d;
        if (abstractC2489g7 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = abstractC2489g7.f32919a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th2) {
                D(th2);
                z11 = false;
            }
        }
        f32936f = z11;
        f32937g = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (abstractC2489g6 = f32934d) != null) {
            abstractC2489g6.f32919a.objectFieldOffset(fieldB);
        }
        f32938h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static /* synthetic */ boolean A(Object obj, long j10) {
        return ((byte) ((f32934d.f32919a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void D(Throwable th) {
        Logger.getLogger(AbstractC2498h6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int E(Class cls) {
        if (f32936f) {
            return f32934d.f32919a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f32936f) {
            return f32934d.f32919a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC2630w4.f33166a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        Unsafe unsafe = f32934d.f32919a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f32934d.f32919a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean f() {
        return f32936f;
    }

    static boolean g() {
        return f32935e;
    }

    static Object h(Class cls) {
        try {
            return f32931a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int i(Object obj, long j10) {
        return f32934d.f32919a.getInt(obj, j10);
    }

    static void j(Object obj, long j10, int i10) {
        f32934d.f32919a.putInt(obj, j10, i10);
    }

    static long k(Object obj, long j10) {
        return f32934d.f32919a.getLong(obj, j10);
    }

    static void l(Object obj, long j10, long j11) {
        f32934d.f32919a.putLong(obj, j10, j11);
    }

    static boolean m(Object obj, long j10) {
        return f32934d.b(obj, j10);
    }

    static void n(Object obj, long j10, boolean z10) {
        f32934d.c(obj, j10, z10);
    }

    static float o(Object obj, long j10) {
        return f32934d.d(obj, j10);
    }

    static void p(Object obj, long j10, float f10) {
        f32934d.e(obj, j10, f10);
    }

    static double q(Object obj, long j10) {
        return f32934d.f(obj, j10);
    }

    static void r(Object obj, long j10, double d10) {
        f32934d.g(obj, j10, d10);
    }

    static Object s(Object obj, long j10) {
        return f32934d.f32919a.getObject(obj, j10);
    }

    static void t(Object obj, long j10, Object obj2) {
        f32934d.f32919a.putObject(obj, j10, obj2);
    }

    static void u(byte[] bArr, long j10, byte b10) {
        f32934d.a(bArr, f32937g + j10, b10);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2462d6());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i10 = AbstractC2630w4.f33166a;
        try {
            Class cls2 = f32932b;
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

    static /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f32934d.f32919a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }
}
