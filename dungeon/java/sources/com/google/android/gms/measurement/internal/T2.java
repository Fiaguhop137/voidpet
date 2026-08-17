package com.google.android.gms.measurement.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class T2 extends B3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicLong f35210k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private S2 f35211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S2 f35212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f35213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f35214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f35215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f35216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f35217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Semaphore f35218j;

    T2(X2 x10) {
        super(x10);
        this.f35217i = new Object();
        this.f35218j = new Semaphore(2);
        this.f35213e = new PriorityBlockingQueue();
        this.f35214f = new LinkedBlockingQueue();
        this.f35215g = new Q2(this, "Thread death: Uncaught exception on worker thread");
        this.f35216h = new Q2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void F(R2 r10) {
        synchronized (this.f35217i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f35213e;
                priorityBlockingQueue.add(r10);
                S2 s10 = this.f35211c;
                if (s10 == null) {
                    S2 s11 = new S2(this, "Measurement Worker", priorityBlockingQueue);
                    this.f35211c = s11;
                    s11.setUncaughtExceptionHandler(this.f35215g);
                    this.f35211c.start();
                } else {
                    s10.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void A(S2 s10) {
        this.f35212d = null;
    }

    final /* synthetic */ Object B() {
        return this.f35217i;
    }

    final /* synthetic */ Semaphore C() {
        return this.f35218j;
    }

    final /* synthetic */ boolean D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void g() {
        if (Thread.currentThread() != this.f35212d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void h() {
        if (Thread.currentThread() != this.f35211c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f35211c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f35211c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f35212d;
    }

    public final Future r(Callable callable) {
        l();
        p170j8.r.l(callable);
        R2 r10 = new R2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f35211c) {
            F(r10);
            return r10;
        }
        if (!this.f35213e.isEmpty()) {
            this.f34853a.a().r().a("Callable skipped the worker queue.");
        }
        r10.run();
        return r10;
    }

    public final Future s(Callable callable) {
        l();
        p170j8.r.l(callable);
        R2 r10 = new R2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f35211c) {
            r10.run();
            return r10;
        }
        F(r10);
        return r10;
    }

    public final void t(Runnable runnable) {
        l();
        p170j8.r.l(runnable);
        F(new R2(this, runnable, false, "Task exception on worker thread"));
    }

    final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f34853a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C3018o2 c3018o2R = this.f34853a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c3018o2R.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f34853a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        p170j8.r.l(runnable);
        F(new R2(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        p170j8.r.l(runnable);
        R2 r10 = new R2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f35217i) {
            try {
                BlockingQueue blockingQueue = this.f35214f;
                blockingQueue.add(r10);
                S2 s10 = this.f35212d;
                if (s10 == null) {
                    S2 s11 = new S2(this, "Measurement Network", blockingQueue);
                    this.f35212d = s11;
                    s11.setUncaughtExceptionHandler(this.f35216h);
                    this.f35212d.start();
                } else {
                    s10.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ S2 x() {
        return this.f35211c;
    }

    final /* synthetic */ void y(S2 s10) {
        this.f35211c = null;
    }

    final /* synthetic */ S2 z() {
        return this.f35212d;
    }
}
