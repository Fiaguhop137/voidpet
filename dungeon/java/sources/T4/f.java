package T4;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class f implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f12264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask f12265b;

    public f(Handler handler, Runnable runnable, Object obj) {
        this.f12264a = handler;
        this.f12265b = new FutureTask(runnable, obj);
    }

    public f(Handler handler, Callable callable) {
        this.f12264a = handler;
        this.f12265b = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f12265b.cancel(z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f12265b.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f12265b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f12265b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f12265b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f12265b.run();
    }
}
