package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2391m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f32425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2400p1 f32426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC2400p1 f32427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32428d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC2400p1 abstractC2400p1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f32425a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC2400p1 = (AbstractC2400p1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f32426b = abstractC2400p1;
        f32427c = new C2408s1();
    }

    public static AbstractC2400p1 a() {
        return f32426b;
    }

    public static AbstractC2400p1 b() {
        return f32427c;
    }

    static void c(AbstractC2400p1 abstractC2400p1, Object obj, Object obj2) {
        abstractC2400p1.d(obj, abstractC2400p1.b(abstractC2400p1.a(obj), abstractC2400p1.a(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!C0.class.isAssignableFrom(cls) && (cls2 = f32425a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
