package Q1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f9253e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f9255b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f9256c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f9257d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask f9254a = new b(new a());

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            c.this.f9257d.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = c.this.b();
                Binder.flushPendingCommands();
                c.this.i(objB);
                return objB;
            } catch (Throwable th) {
                try {
                    c.this.f9256c.set(true);
                    throw th;
                } catch (Throwable th2) {
                    c.this.i(objB);
                    throw th2;
                }
            }
        }
    }

    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: Q1.c$c, reason: collision with other inner class name */
    class RunnableC0153c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f9260a;

        RunnableC0153c(Object obj) {
            this.f9260a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f9260a);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9262a;

        static {
            int[] iArr = new int[e.values().length];
            f9262a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9262a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f9253e == null) {
                    f9253e = new Handler(Looper.getMainLooper());
                }
                handler = f9253e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f9256c.set(true);
        return this.f9254a.cancel(z10);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f9255b == e.PENDING) {
            this.f9255b = e.RUNNING;
            executor.execute(this.f9254a);
            return;
        }
        int i10 = d.f9262a[this.f9255b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f9255b = e.FINISHED;
    }

    public final boolean f() {
        return this.f9256c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new RunnableC0153c(obj));
    }

    void j(Object obj) {
        if (this.f9257d.get()) {
            return;
        }
        i(obj);
    }
}
