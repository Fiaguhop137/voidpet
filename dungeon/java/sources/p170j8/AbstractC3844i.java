package p170j8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.C2333b;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: j8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3844i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f46982a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f46983b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static u0 f46984c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f46985d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f46986e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f46987f = false;

    public static AbstractC3844i b(Context context) {
        synchronized (f46982a) {
            try {
                if (f46984c == null) {
                    f46984c = new u0(context.getApplicationContext(), f46987f ? c().getLooper() : context.getMainLooper(), f46986e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f46984c;
    }

    public static HandlerThread c() {
        synchronized (f46982a) {
            try {
                HandlerThread handlerThread = f46985d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f46983b);
                f46985d = handlerThread2;
                handlerThread2.start();
                return f46985d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return e(new r0(componentName, 4225), serviceConnection, str, executor).f4();
    }

    public void d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        g(new r0(componentName, 4225), serviceConnection, str);
    }

    protected abstract C2333b e(r0 r0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        g(new r0(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract void g(r0 r0Var, ServiceConnection serviceConnection, String str);
}
