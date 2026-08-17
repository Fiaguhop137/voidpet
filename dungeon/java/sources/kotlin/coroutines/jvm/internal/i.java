package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f48285a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f48286b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f48287c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f48288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f48289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f48290c;

        public a(Method method, Method method2, Method method3) {
            this.f48288a = method;
            this.f48289b = method2;
            this.f48290c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f48287c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f48286b;
            f48287c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVarA = f48287c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f48286b && (method = aVarA.f48288a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f48289b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f48290c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
