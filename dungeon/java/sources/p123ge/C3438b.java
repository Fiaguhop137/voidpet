package p123ge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ge.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3438b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3438b f42364a = new C3438b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f42365b;

    /* JADX INFO: renamed from: ge.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f42366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f42367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f42368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f42369d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f42366a = method;
            this.f42367b = method2;
            this.f42368c = method3;
            this.f42369d = method4;
        }

        public final Method a() {
            return this.f42367b;
        }

        public final Method b() {
            return this.f42369d;
        }

        public final Method c() {
            return this.f42368c;
        }

        public final Method d() {
            return this.f42366a;
        }
    }

    private C3438b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f42365b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f42365b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
