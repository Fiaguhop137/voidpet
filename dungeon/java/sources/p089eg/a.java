package p089eg;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: eg.a$a, reason: collision with other inner class name */
    static class C0456a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40878a;

        C0456a(String str) {
            this.f40878a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return ClassLoader.getSystemClassLoader().loadClass(this.f40878a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C0456a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
