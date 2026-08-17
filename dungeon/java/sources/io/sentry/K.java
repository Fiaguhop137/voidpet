package io.sentry;

import io.sentry.util.C3799a;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class K {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile K f44363i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f44365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f44366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f44367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f44368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable f44369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f44370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f44361g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f44362h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C3799a f44364j = new C3799a();

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44371a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i10 = this.f44371a;
            this.f44371a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private K() {
        this(f44361g);
    }

    K(long j10) {
        this(j10, new I());
    }

    K(long j10, Callable callable) {
        this.f44368d = new AtomicBoolean(false);
        this.f44370f = Executors.newSingleThreadExecutor(new b(null));
        this.f44365a = j10;
        this.f44369e = (Callable) io.sentry.util.w.c(callable, "getLocalhost is required");
        g();
    }

    public static /* synthetic */ Void b(K k10) {
        k10.getClass();
        try {
            k10.f44366b = ((InetAddress) k10.f44369e.call()).getCanonicalHostName();
            k10.f44367c = System.currentTimeMillis() + k10.f44365a;
            return null;
        } finally {
            k10.f44368d.set(false);
        }
    }

    public static K e() {
        if (f44363i == null) {
            InterfaceC3698e0 interfaceC3698e0A = f44364j.a();
            try {
                if (f44363i == null) {
                    f44363i = new K();
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
        return f44363i;
    }

    private void f() {
        this.f44367c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void g() {
        try {
            this.f44370f.submit(new J(this)).get(f44362h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f44370f.shutdown();
    }

    public String d() {
        if (this.f44367c < System.currentTimeMillis() && this.f44368d.compareAndSet(false, true)) {
            g();
        }
        return this.f44366b;
    }
}
