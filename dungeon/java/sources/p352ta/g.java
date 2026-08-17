package p352ta;

import N8.HandlerC1206a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f54595b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f54596c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f54597a;

    private g(Looper looper) {
        this.f54597a = new HandlerC1206a(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f54595b) {
            try {
                if (f54596c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f54596c = new g(handlerThread.getLooper());
                }
                gVar = f54596c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static Executor d() {
        return r.f54617a;
    }

    public Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new q(callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
