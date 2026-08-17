package p155ia;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f43839a = c();

    class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f43840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f43841c;

        a(Method method, Object obj) {
            this.f43840b = method;
            this.f43841c = obj;
        }

        @Override // p155ia.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f43840b.invoke(this.f43841c, cls);
        }
    }

    class b extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f43842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f43843c;

        b(Method method, int i10) {
            this.f43842b = method;
            this.f43843c = i10;
        }

        @Override // p155ia.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f43842b.invoke(null, cls, Integer.valueOf(this.f43843c));
        }
    }

    class c extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f43844b;

        c(Method method) {
            this.f43844b = method;
        }

        @Override // p155ia.n
        public Object d(Class cls) {
            n.b(cls);
            return this.f43844b.invoke(null, cls, Object.class);
        }
    }

    class d extends n {
        d() {
        }

        @Override // p155ia.n
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strA = p155ia.c.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    private static n c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract Object d(Class cls);
}
