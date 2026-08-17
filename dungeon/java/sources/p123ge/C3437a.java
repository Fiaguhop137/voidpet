package p123ge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ge.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3437a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3437a f42360a = new C3437a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0488a f42361b;

    /* JADX INFO: renamed from: ge.a$a, reason: collision with other inner class name */
    public static final class C0488a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f42362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f42363b;

        public C0488a(Method method, Method method2) {
            this.f42362a = method;
            this.f42363b = method2;
        }

        public final Method a() {
            return this.f42363b;
        }

        public final Method b() {
            return this.f42362a;
        }
    }

    private C3437a() {
    }

    private final C0488a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0488a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0488a(null, null);
        }
    }

    private final C0488a b(Object obj) {
        C0488a c0488a = f42361b;
        if (c0488a != null) {
            return c0488a;
        }
        C0488a c0488aA = a(obj);
        f42361b = c0488aA;
        return c0488aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
