package io.sentry.logger;

import io.sentry.C3731k3;
import io.sentry.C3741m3;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3688c0;
import io.sentry.InterfaceC3693d0;
import io.sentry.InterfaceC3698e0;
import io.sentry.Z2;
import io.sentry.transport.A;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C3833z3 f45970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3688c0 f45971b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3693d0 f45973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future f45974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3799a f45975f = new C3799a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f45976g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f45977h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f45978i = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f45972c = new ConcurrentLinkedQueue();

    private class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.e();
        }
    }

    public g(C3833z3 c3833z3, InterfaceC3688c0 interfaceC3688c0) {
        this.f45970a = c3833z3;
        this.f45971b = interfaceC3688c0;
        this.f45973d = new Z2(c3833z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        g();
        InterfaceC3698e0 interfaceC3698e0A = this.f45975f.a();
        try {
            if (this.f45972c.isEmpty()) {
                this.f45976g = false;
            } else {
                h(true, false);
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

    private void f() {
        ArrayList arrayList = new ArrayList(100);
        do {
            C3731k3 c3731k3 = (C3731k3) this.f45972c.poll();
            if (c3731k3 != null) {
                arrayList.add(c3731k3);
            }
            if (this.f45972c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f45971b.d(new C3741m3(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f45978i.a();
        }
    }

    private void g() {
        do {
            f();
        } while (this.f45972c.size() >= 100);
    }

    private void h(boolean z10, boolean z11) {
        if (!this.f45976g || z10) {
            InterfaceC3698e0 interfaceC3698e0A = this.f45975f.a();
            try {
                Future future = this.f45974e;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.f45976g = true;
                    try {
                        this.f45974e = this.f45973d.c(new b(this, null), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e10) {
                        this.f45976g = false;
                        this.f45970a.getLogger().b(EnumC3721i3.WARNING, "Logs batch processor flush task rejected", e10);
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
    }

    @Override // io.sentry.logger.c
    public void j(boolean z10) {
        this.f45977h = true;
        if (z10) {
            h(true, true);
            this.f45973d.submit(new f(this));
        } else {
            this.f45973d.a(this.f45970a.getShutdownTimeoutMillis());
            while (!this.f45972c.isEmpty()) {
                f();
            }
        }
    }

    @Override // io.sentry.logger.c
    public void l(long j10) {
        h(true, true);
        try {
            this.f45978i.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f45970a.getLogger().b(EnumC3721i3.ERROR, "Failed to flush log events", e10);
            Thread.currentThread().interrupt();
        }
    }
}
