package androidx.fragment.app;

import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f0 f24080a = new f0();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return i.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        f0 f0Var = f24080a;
        f0 f0Var2 = (f0) f0Var.get(classLoader);
        if (f0Var2 == null) {
            f0Var2 = new f0();
            f0Var.put(classLoader, f0Var2);
        }
        Class cls = (Class) f0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f0Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new i.C0296i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new i.C0296i("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public abstract i a(ClassLoader classLoader, String str);
}
