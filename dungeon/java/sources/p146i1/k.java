package p146i1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p199l1.g;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43552b;

        /* JADX INFO: renamed from: i1.k$a$a, reason: collision with other inner class name */
        private static class C0513a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f43553a;

            C0513a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f43553a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f43553a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f43551a = str;
            this.f43552b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0513a(runnable, this.f43551a, this.f43552b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f43554a;

        b(Handler handler) {
            this.f43554a = (Handler) g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f43554a.post((Runnable) g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f43554a + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f43555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p199l1.b f43556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f43557c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p199l1.b f43558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f43559b;

            a(p199l1.b bVar, Object obj) {
                this.f43558a = bVar;
                this.f43559b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f43558a.accept(this.f43559b);
            }
        }

        c(Handler handler, Callable callable, p199l1.b bVar) {
            this.f43555a = callable;
            this.f43556b = bVar;
            this.f43557c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f43555a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f43557c.post(new a(this.f43556b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, p199l1.b bVar) {
        executor.execute(new c(p146i1.b.a(), callable, bVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
