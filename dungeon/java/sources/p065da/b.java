package p065da;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p065da.a f39879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile p065da.a f39880b;

    /* JADX INFO: renamed from: da.b$b, reason: collision with other inner class name */
    private static class C0441b implements p065da.a {
        private C0441b() {
        }

        /* synthetic */ C0441b(a aVar) {
            this();
        }

        @Override // p065da.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0441b c0441b = new C0441b(null);
        f39879a = c0441b;
        f39880b = c0441b;
    }

    public static p065da.a a() {
        return f39880b;
    }
}
