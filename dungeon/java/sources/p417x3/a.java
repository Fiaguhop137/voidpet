package p417x3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f57357b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f57359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f57360e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f57361a = new b(null);

    private static class b implements Executor {
        private b() {
        }

        /* synthetic */ b(C0740a c0740a) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f57358c = iAvailableProcessors;
        f57359d = iAvailableProcessors + 1;
        f57360e = (iAvailableProcessors * 2) + 1;
    }

    private a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f57359d, f57360e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f57357b.f57361a;
    }
}
