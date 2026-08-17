package Hd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: Hd.a$a, reason: collision with other inner class name */
    private static final class C0096a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0096a f4286a = new C0096a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f4287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f4288c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.c(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (Intrinsics.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.b(AbstractC3952n.w0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f4287b = method2;
            for (Method method3 : methods) {
                if (Intrinsics.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f4288c = method;
        }

        private C0096a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0096a.f4287b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public kotlin.random.c b() {
        return new kotlin.random.b();
    }

    public List c(Throwable exception) {
        Object objInvoke;
        List listE;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0096a.f4288c;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listE = AbstractC3952n.e((Throwable[]) objInvoke)) == null) ? CollectionsKt.l() : listE;
    }
}
