package io.sentry;

import io.sentry.util.C3799a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Z2 implements InterfaceC3693d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f44540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3799a f44541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f44542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3833z3 f44543d;

    private static final class b implements Future {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
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

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44544a;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f44544a;
            this.f44544a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public Z2() {
        this(new ScheduledThreadPoolExecutor(1, new c(null)), null);
    }

    public Z2(C3833z3 c3833z3) {
        this(new ScheduledThreadPoolExecutor(1, new c(null)), c3833z3);
    }

    Z2(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C3833z3 c3833z3) {
        this.f44541b = new C3799a();
        this.f44542c = new X2();
        this.f44540a = scheduledThreadPoolExecutor;
        this.f44543d = c3833z3;
    }

    public static /* synthetic */ void d(Z2 z10) {
        z10.getClass();
        for (int i10 = 0; i10 < 40; i10++) {
            try {
                z10.f44540a.schedule(z10.f44542c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        z10.f44540a.purge();
    }

    public static /* synthetic */ void e() {
    }

    private boolean f() {
        if (this.f44540a.getQueue().size() >= 271) {
            this.f44540a.purge();
        }
        return this.f44540a.getQueue().size() < 271;
    }

    @Override // io.sentry.InterfaceC3693d0
    public void a(long j10) {
        InterfaceC3698e0 interfaceC3698e0A = this.f44541b.a();
        try {
            if (!this.f44540a.isShutdown()) {
                this.f44540a.shutdown();
                try {
                    if (!this.f44540a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f44540a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f44540a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC3693d0
    public void b() {
        try {
            this.f44540a.submit(new Y2(this));
        } catch (RejectedExecutionException e10) {
            C3833z3 c3833z3 = this.f44543d;
            if (c3833z3 != null) {
                c3833z3.getLogger().b(EnumC3721i3.WARNING, "Prewarm task rejected from " + this.f44540a, e10);
            }
        }
    }

    @Override // io.sentry.InterfaceC3693d0
    public Future c(Runnable runnable, long j10) {
        return this.f44540a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC3693d0
    public boolean isClosed() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44541b.a();
        try {
            boolean zIsShutdown = this.f44540a.isShutdown();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zIsShutdown;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC3693d0
    public Future submit(Runnable runnable) {
        if (f()) {
            return this.f44540a.submit(runnable);
        }
        C3833z3 c3833z3 = this.f44543d;
        if (c3833z3 != null) {
            c3833z3.getLogger().c(EnumC3721i3.WARNING, "Task " + runnable + " rejected from " + this.f44540a, new Object[0]);
        }
        return new b(null);
    }
}
