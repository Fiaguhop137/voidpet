package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2906z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f34829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f34830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f34831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC2902y2 f34832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f34833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f34834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f34835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final boolean f34836h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z10;
        boolean z11;
        AbstractC2902y2 abstractC2902y2;
        Unsafe unsafeL = l();
        f34829a = unsafeL;
        int i10 = AbstractC2788a1.f34683a;
        f34830b = Memory.class;
        Class cls = Long.TYPE;
        boolean zA = A(cls);
        f34831c = zA;
        Class cls2 = Integer.TYPE;
        boolean zA2 = A(cls2);
        AbstractC2902y2 c2894w2 = null;
        if (unsafeL != null) {
            if (zA) {
                c2894w2 = new C2898x2(unsafeL);
            } else if (zA2) {
                c2894w2 = new C2894w2(unsafeL);
            }
        }
        f34832d = c2894w2;
        if (c2894w2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = c2894w2.f34824a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                m(th);
            }
        }
        f34833e = z10;
        AbstractC2902y2 abstractC2902y3 = f34832d;
        if (abstractC2902y3 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = abstractC2902y3.f34824a.getClass();
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
                m(th2);
                z11 = false;
            }
        }
        f34834f = z11;
        f34835g = E(byte[].class);
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
        if (fieldB != null && (abstractC2902y2 = f34832d) != null) {
            abstractC2902y2.f34824a.objectFieldOffset(fieldB);
        }
        f34836h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static boolean A(Class cls) {
        int i10 = AbstractC2788a1.f34683a;
        try {
            Class cls2 = f34830b;
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

    static boolean B(Object obj, long j10) {
        return f34832d.g(obj, j10);
    }

    static boolean C() {
        return f34834f;
    }

    static boolean D() {
        return f34833e;
    }

    private static int E(Class cls) {
        if (f34834f) {
            return f34832d.f34824a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f34834f) {
            return f34832d.f34824a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = AbstractC2788a1.f34683a;
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
        Unsafe unsafe = f34832d.f34824a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        Unsafe unsafe = f34832d.f34824a;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f34832d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f34832d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f34832d.f34824a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f34832d.f34824a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f34829a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f34832d.f34824a.getObject(obj, j10);
    }

    static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C2890v2());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(AbstractC2906z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(AbstractC2906z2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f34832d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f34832d.d(bArr, f34835g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f34832d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f34832d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f34832d.f34824a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f34832d.f34824a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f34832d.f34824a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f34832d.f34824a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f34832d.f34824a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
