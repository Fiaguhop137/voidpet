package T4;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class f12254h = b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f12257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue f12258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f12259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f12260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f12261g;

    private class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(b bVar, c cVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f12258d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    W4.a.y(b.f12254h, "%s: Worker has nothing to run", b.this.f12255a);
                }
            } finally {
                int iDecrementAndGet = b.this.f12260f.decrementAndGet();
                if (b.this.f12258d.isEmpty()) {
                    W4.a.z(b.f12254h, "%s: worker finished; %d workers left", b.this.f12255a, Integer.valueOf(iDecrementAndGet));
                } else {
                    b.this.f();
                }
            }
        }
    }

    public b(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f12255a = str;
        this.f12256b = executor;
        this.f12257c = i10;
        this.f12258d = blockingQueue;
        this.f12259e = new a(this, null);
        this.f12260f = new AtomicInteger(0);
        this.f12261g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int i10 = this.f12260f.get();
        while (i10 < this.f12257c) {
            int i11 = i10 + 1;
            if (this.f12260f.compareAndSet(i10, i11)) {
                W4.a.A(f12254h, "%s: starting worker %d of %d", this.f12255a, Integer.valueOf(i11), Integer.valueOf(this.f12257c));
                this.f12256b.execute(this.f12259e);
                return;
            } else {
                W4.a.y(f12254h, "%s: race in startWorkerIfNeeded; retrying", this.f12255a);
                i10 = this.f12260f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p002a1.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f12258d.offer(runnable)) {
            throw new RejectedExecutionException(this.f12255a + " queue is full, size=" + this.f12258d.size());
        }
        int size = this.f12258d.size();
        int i10 = this.f12261g.get();
        if (size > i10 && this.f12261g.compareAndSet(i10, size)) {
            W4.a.z(f12254h, "%s: max pending work in queue = %d", this.f12255a, Integer.valueOf(size));
        }
        f();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
