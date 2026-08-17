package io.sentry.android.core;

import io.sentry.C3697e;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3698e0;
import io.sentry.O3;
import io.sentry.util.C3799a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class M0 implements C3628c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f44660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimerTask f44662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.p f44663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3799a f44664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3619a0 f44665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f44666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f44667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.o f44668i;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (M0.this.f44666g) {
                M0.this.f44665f.k();
            }
            M0.this.f44665f.g().getReplayController().stop();
            M0.this.f44665f.g().getContinuousProfiler().j(false);
        }
    }

    M0(InterfaceC3619a0 interfaceC3619a0, long j10, boolean z10, boolean z11) {
        this(interfaceC3619a0, j10, z10, z11, io.sentry.transport.m.b());
    }

    M0(InterfaceC3619a0 interfaceC3619a0, long j10, boolean z10, boolean z11, io.sentry.transport.o oVar) {
        this.f44660a = new AtomicLong(0L);
        this.f44663d = new io.sentry.util.p(new K0());
        this.f44664e = new C3799a();
        this.f44661b = j10;
        this.f44666g = z10;
        this.f44667h = z11;
        this.f44665f = interfaceC3619a0;
        this.f44668i = oVar;
    }

    public static /* synthetic */ void c(M0 m10, io.sentry.Y y10) {
        O3 o3F;
        if (m10.f44660a.get() != 0 || (o3F = y10.F()) == null || o3F.k() == null) {
            return;
        }
        m10.f44660a.set(o3F.k().getTime());
    }

    public static /* synthetic */ Timer d() {
        return new Timer(true);
    }

    private void g(String str) {
        if (this.f44667h) {
            C3697e c3697e = new C3697e();
            c3697e.K("navigation");
            c3697e.G("state", str);
            c3697e.F("app.lifecycle");
            c3697e.H(EnumC3721i3.INFO);
            this.f44665f.a(c3697e);
        }
    }

    private void h() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44664e.a();
        try {
            TimerTask timerTask = this.f44662c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f44662c = null;
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

    private void i() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44664e.a();
        try {
            h();
            this.f44662c = new a();
            ((Timer) this.f44663d.a()).schedule(this.f44662c, this.f44661b);
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

    private void j() {
        h();
        long jA = this.f44668i.a();
        this.f44665f.z(new L0(this));
        long j10 = this.f44660a.get();
        if (j10 == 0 || j10 + this.f44661b <= jA) {
            if (this.f44666g) {
                this.f44665f.n();
            }
            this.f44665f.g().getReplayController().start();
        }
        this.f44665f.g().getReplayController().v();
        this.f44660a.set(jA);
    }

    @Override // io.sentry.android.core.C3628c0.a
    public void a() {
        j();
        g("foreground");
    }

    @Override // io.sentry.android.core.C3628c0.a
    public void b() {
        this.f44660a.set(this.f44668i.a());
        this.f44665f.g().getReplayController().pause();
        i();
        g("background");
    }
}
