package Ub;

import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13454a = a.f13455a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f13455a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(Method method, Class cls, int i10) {
            return method.invoke(null, cls, Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object f(Method method, Object obj, Class cls) {
            return method.invoke(obj, cls);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object g(Class cls) {
            throw new IllegalArgumentException("Cannot allocate " + cls);
        }

        public final i d(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Object.class);
                    Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) objInvoke).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new f(declaredMethod2, clazz, iIntValue);
                } catch (Throwable unused) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new g(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), clazz);
                }
            } catch (Throwable unused2) {
                return new h(clazz);
            }
        }
    }

    Object b();
}
