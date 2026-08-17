package io.sentry.transport;

import io.sentry.AbstractC3732l;
import io.sentry.AbstractC3750o2;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3755p2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class v extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f46538f = AbstractC3732l.i(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC3750o2 f46540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f46541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3755p2 f46542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f46543e;

    static final class a implements Future {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }
    }

    public v(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, InterfaceC3755p2 interfaceC3755p2) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f46540b = null;
        this.f46543e = new A();
        this.f46539a = i11;
        this.f46541c = iLogger;
        this.f46542d = interfaceC3755p2;
    }

    public boolean a() {
        AbstractC3750o2 abstractC3750o2 = this.f46540b;
        return abstractC3750o2 != null && this.f46542d.now().g(abstractC3750o2) < f46538f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.f46543e.a();
        }
    }

    public boolean b() {
        return this.f46543e.b() < this.f46539a;
    }

    void c(long j10) {
        try {
            this.f46543e.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f46541c.b(EnumC3721i3.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p002a1.f.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (!b()) {
            this.f46540b = this.f46542d.now();
            this.f46541c.c(EnumC3721i3.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f46543e.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.f46543e.a();
            this.f46540b = this.f46542d.now();
            this.f46541c.b(EnumC3721i3.WARNING, "Submit rejected by thread pool executor", e10);
            return new a();
        }
    }
}
