package io.sentry.transport;

import io.sentry.AbstractC3732l;
import io.sentry.B1;
import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC3755p2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f46505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.cache.g f46506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3833z3 f46507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f46508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f46509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f46510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Runnable f46511g;

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46512a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f46512a;
            this.f46512a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3771q2 f46513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H f46514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.cache.g f46515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B f46516d = B.a();

        c(C3771q2 c3771q2, H h10, io.sentry.cache.g gVar) {
            this.f46513a = (C3771q2) io.sentry.util.w.c(c3771q2, "Envelope is required.");
            this.f46514b = h10;
            this.f46515c = (io.sentry.cache.g) io.sentry.util.w.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, B b10, io.sentry.hints.q qVar) {
            e.this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(b10.d()));
            qVar.c(b10.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.c(cVar.f46513a.b().a())) {
                e.this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.e();
                e.this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z10, C3771q2 c3771q2, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f46507c.getLogger());
                e.this.f46507c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, c3771q2);
            }
        }

        public static /* synthetic */ void f(c cVar, boolean z10, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f46507c.getLogger());
                e.this.f46507c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f46513a);
            }
        }

        private B i() {
            B b10 = this.f46516d;
            this.f46513a.b().d(null);
            boolean zT2 = this.f46515c.T2(this.f46513a, this.f46514b);
            io.sentry.util.l.h(this.f46514b, io.sentry.hints.f.class, new g(this));
            if (!e.this.f46509e.a()) {
                io.sentry.util.l.i(this.f46514b, io.sentry.hints.l.class, new j(), new k(this, zT2));
                return b10;
            }
            C3771q2 c3771q2E = e.this.f46507c.getClientReportRecorder().e(this.f46513a);
            try {
                c3771q2E.b().d(AbstractC3732l.k(e.this.f46507c.getDateProvider().now().p()));
                B bH = e.this.f46510f.h(c3771q2E);
                if (bH.d()) {
                    this.f46515c.b0(this.f46513a);
                    return bH;
                }
                String str = "The transport failed to send the envelope with response code " + bH.c();
                e.this.f46507c.getLogger().c(EnumC3721i3.ERROR, str, new Object[0]);
                if (bH.c() >= 400) {
                    this.f46515c.b0(this.f46513a);
                    if (bH.c() != 429) {
                        e.this.f46507c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, c3771q2E);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                io.sentry.util.l.i(this.f46514b, io.sentry.hints.l.class, new h(), new i(this, zT2, c3771q2E));
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f46511g = this;
            B bI = this.f46516d;
            try {
                bI = i();
                e.this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.l.h(this.f46514b, io.sentry.hints.q.class, new f(this, bI));
                e.this.f46511g = null;
            } catch (Throwable th) {
                try {
                    e.this.f46507c.getLogger().a(EnumC3721i3.ERROR, th, "Envelope submission failed", new Object[0]);
                    throw th;
                } catch (Throwable th2) {
                    io.sentry.util.l.h(this.f46514b, io.sentry.hints.q.class, new f(this, bI));
                    e.this.f46511g = null;
                    throw th2;
                }
            }
        }
    }

    public e(v vVar, C3833z3 c3833z3, z zVar, q qVar, n nVar) {
        this.f46511g = null;
        this.f46505a = (v) io.sentry.util.w.c(vVar, "executor is required");
        this.f46506b = (io.sentry.cache.g) io.sentry.util.w.c(c3833z3.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f46507c = (C3833z3) io.sentry.util.w.c(c3833z3, "options is required");
        this.f46508d = (z) io.sentry.util.w.c(zVar, "rateLimiter is required");
        this.f46509e = (q) io.sentry.util.w.c(qVar, "transportGate is required");
        this.f46510f = (n) io.sentry.util.w.c(nVar, "httpConnection is required");
    }

    public e(C3833z3 c3833z3, z zVar, q qVar, B1 b10) {
        this(i(c3833z3.getMaxQueueSize(), c3833z3.getEnvelopeDiskCache(), c3833z3.getLogger(), c3833z3.getDateProvider()), c3833z3, zVar, qVar, new n(c3833z3, b10, zVar));
    }

    public static /* synthetic */ void b(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.b();
        eVar.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void d(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.l.f(cVar.f46514b, io.sentry.hints.e.class)) {
                gVar.T2(cVar.f46513a, cVar.f46514b);
            }
            k(cVar.f46514b, true);
            iLogger.c(EnumC3721i3.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static v i(int i10, io.sentry.cache.g gVar, ILogger iLogger, InterfaceC3755p2 interfaceC3755p2) {
        return new v(1, i10, new b(null), new RejectedExecutionHandlerC3792a(gVar, iLogger), iLogger, interfaceC3755p2);
    }

    private static void k(H h10, boolean z10) {
        io.sentry.util.l.h(h10, io.sentry.hints.q.class, new io.sentry.transport.c());
        io.sentry.util.l.h(h10, io.sentry.hints.l.class, new d(z10));
    }

    @Override // io.sentry.transport.p
    public void F0(C3771q2 c3771q2, H h10) {
        io.sentry.cache.g gVarA = this.f46506b;
        boolean z10 = false;
        if (io.sentry.util.l.f(h10, io.sentry.hints.e.class)) {
            gVarA = r.a();
            this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        C3771q2 c3771q2G = this.f46508d.g(c3771q2, h10);
        if (c3771q2G == null) {
            if (z10) {
                this.f46506b.b0(c3771q2);
                return;
            }
            return;
        }
        if (io.sentry.util.l.f(h10, UncaughtExceptionHandlerIntegration.a.class)) {
            c3771q2G = this.f46507c.getClientReportRecorder().e(c3771q2G);
        }
        Future futureSubmit = this.f46505a.submit(new c(c3771q2G, h10, gVarA));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.l.h(h10, io.sentry.hints.g.class, new C3793b(this));
        } else {
            this.f46507c.getClientReportRecorder().b(io.sentry.clientreport.f.QUEUE_OVERFLOW, c3771q2G);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(false);
    }

    @Override // io.sentry.transport.p
    public void j(boolean z10) {
        this.f46508d.close();
        this.f46505a.shutdown();
        this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f46507c.getFlushTimeoutMillis();
            if (this.f46505a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f46507c.getLogger().c(EnumC3721i3.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f46505a.shutdownNow();
            if (this.f46511g != null) {
                this.f46505a.getRejectedExecutionHandler().rejectedExecution(this.f46511g, this.f46505a);
            }
        } catch (InterruptedException unused) {
            this.f46507c.getLogger().c(EnumC3721i3.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.p
    public void l(long j10) {
        this.f46505a.c(j10);
    }

    @Override // io.sentry.transport.p
    public boolean q() {
        return (this.f46508d.k() || this.f46505a.a()) ? false : true;
    }

    @Override // io.sentry.transport.p
    public z w() {
        return this.f46508d;
    }
}
