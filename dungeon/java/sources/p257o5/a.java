package p257o5;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f50416a;

    /* JADX INFO: renamed from: o5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0597a {
        void release();
    }

    public static synchronized a b() {
        try {
            if (f50416a == null) {
                f50416a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f50416a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0597a interfaceC0597a);

    public abstract void d(InterfaceC0597a interfaceC0597a);
}
