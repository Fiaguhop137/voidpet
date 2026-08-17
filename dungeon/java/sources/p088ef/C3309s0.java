package p088ef;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: ef.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309s0 extends AbstractC3307r0 implements Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f40867d;

    public C3309s0(Executor executor) {
        this.f40867d = executor;
        if (r0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) r0()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void s0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        E0.d(coroutineContext, AbstractC3304p0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture t0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            s0(coroutineContext, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorR0 = r0();
        ExecutorService executorService = executorR0 instanceof ExecutorService ? (ExecutorService) executorR0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorR0 = r0();
            AbstractC3277c.a();
            executorR0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC3277c.a();
            s0(coroutineContext, e10);
            C3282e0.b().e0(coroutineContext, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3309s0) && ((C3309s0) obj).r0() == r0();
    }

    public int hashCode() {
        return System.identityHashCode(r0());
    }

    @Override // p088ef.AbstractC3307r0
    public Executor r0() {
        return this.f40867d;
    }

    @Override // p088ef.Y
    public InterfaceC3286g0 t(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        long j11;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executorR0 = r0();
        ScheduledFuture scheduledFutureT0 = null;
        ScheduledExecutorService scheduledExecutorService = executorR0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorR0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFutureT0 = t0(scheduledExecutorService, runnable2, coroutineContext2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFutureT0 != null ? new C3284f0(scheduledFutureT0) : U.f40801i.t(j11, runnable2, coroutineContext2);
    }

    @Override // p088ef.K
    public String toString() {
        return r0().toString();
    }

    @Override // p088ef.Y
    public void z(long j10, InterfaceC3299n interfaceC3299n) {
        long j11;
        Executor executorR0 = r0();
        ScheduledFuture scheduledFutureT0 = null;
        ScheduledExecutorService scheduledExecutorService = executorR0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorR0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureT0 = t0(scheduledExecutorService, new T0(this, interfaceC3299n), interfaceC3299n.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureT0 != null) {
            r.c(interfaceC3299n, new C3295l(scheduledFutureT0));
        } else {
            U.f40801i.z(j11, interfaceC3299n);
        }
    }
}
