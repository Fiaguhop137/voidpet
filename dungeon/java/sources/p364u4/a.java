package p364u4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p002a1.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f54983b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f54984c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f54985a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f54986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f54987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f54989d = new c(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f54990e = e.f55004d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f54991f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f54992g;

        b(boolean z10) {
            this.f54986a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f54991f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f54991f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f54987b, this.f54988c, this.f54992g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f54989d, this.f54991f, this.f54990e, this.f54986a));
            if (this.f54992g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f54991f = str;
            return this;
        }

        public b c(int i10) {
            this.f54987b = i10;
            this.f54988c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: u4.a$c$a, reason: collision with other inner class name */
        class C0686a extends Thread {
            C0686a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        /* synthetic */ c(C0685a c0685a) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0686a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f54994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f54995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f54996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f54997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f54998e = new AtomicInteger();

        /* JADX INFO: renamed from: u4.a$d$a, reason: collision with other inner class name */
        class RunnableC0687a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f54999a;

            RunnableC0687a(Runnable runnable) {
                this.f54999a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f54997d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f54999a.run();
                } catch (Throwable th) {
                    d.this.f54996c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f54994a = threadFactory;
            this.f54995b = str;
            this.f54996c = eVar;
            this.f54997d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f54994a.newThread(new RunnableC0687a(runnable));
            threadNewThread.setName("glide-" + this.f54995b + "-thread-" + this.f54998e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f55001a = new C0688a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f55002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f55003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f55004d;

        /* JADX INFO: renamed from: u4.a$e$a, reason: collision with other inner class name */
        class C0688a implements e {
            C0688a() {
            }

            @Override // u4.a.e
            public void a(Throwable th) {
            }
        }

        class b implements e {
            b() {
            }

            @Override // u4.a.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        class c implements e {
            c() {
            }

            @Override // u4.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f55002b = bVar;
            f55003c = new c();
            f55004d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f54985a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f54984c == 0) {
            f54984c = Math.min(4, p364u4.b.a());
        }
        return f54984c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b h() {
        return new b(false).c(b()).b("source");
    }

    public static a i() {
        return h().a();
    }

    public static a k() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f54983b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(null), "source-unlimited", e.f55004d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f54985a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f54985a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f54985a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f54985a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f54985a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f54985a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f54985a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f54985a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f54985a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f54985a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f54985a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f54985a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f54985a.submit(callable);
    }

    public String toString() {
        return this.f54985a.toString();
    }
}
