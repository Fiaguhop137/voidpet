package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.AbstractC3732l;
import io.sentry.C3811v1;
import io.sentry.C3816w1;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3723j0;
import io.sentry.InterfaceC3728k0;
import io.sentry.Q1;
import io.sentry.util.C3799a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class S implements InterfaceC3728k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f44729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f44731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.p.a f44733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3636g0 f44734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f44736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.H f44737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile C3816w1 f44738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile N f44739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f44740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f44741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Date f44742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C3799a f44743p;

    public S(Context context, SentryAndroidOptions sentryAndroidOptions, C3636g0 c3636g0, io.sentry.android.core.internal.util.H h10) {
        this(context, c3636g0, h10, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new Q(sentryAndroidOptions));
    }

    public S(Context context, C3636g0 c3636g0, io.sentry.android.core.internal.util.H h10, ILogger iLogger, String str, boolean z10, int i10, io.sentry.util.p.a aVar) {
        this.f44735h = false;
        this.f44736i = new AtomicBoolean(false);
        this.f44739l = null;
        this.f44743p = new C3799a();
        this.f44728a = (Context) io.sentry.util.w.c(AbstractC3662p0.g(context), "The application context is required");
        this.f44729b = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required");
        this.f44737j = (io.sentry.android.core.internal.util.H) io.sentry.util.w.c(h10, "SentryFrameMetricsCollector is required");
        this.f44734g = (C3636g0) io.sentry.util.w.c(c3636g0, "The BuildInfoProvider is required.");
        this.f44730c = str;
        this.f44731d = z10;
        this.f44732e = i10;
        this.f44733f = (io.sentry.util.p.a) io.sentry.util.w.c(aVar, "A supplier for ISentryExecutorService is required.");
        this.f44742o = AbstractC3732l.d();
    }

    private void e() {
        if (this.f44735h) {
            return;
        }
        this.f44735h = true;
        if (!this.f44731d) {
            this.f44729b.c(EnumC3721i3.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f44730c;
        if (str == null) {
            this.f44729b.c(EnumC3721i3.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f44732e;
        if (i10 <= 0) {
            this.f44729b.c(EnumC3721i3.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f44739l = new N(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f44732e, this.f44737j, this.f44733f, this.f44729b);
        }
    }

    private boolean f() {
        N.c cVarJ;
        if (this.f44739l == null || (cVarJ = this.f44739l.j()) == null) {
            return false;
        }
        this.f44740m = cVarJ.f44692a;
        this.f44741n = cVarJ.f44693b;
        this.f44742o = cVarJ.f44694c;
        return true;
    }

    private C3811v1 g(String str, String str2, String str3, boolean z10, List list, C3833z3 c3833z3) {
        if (this.f44734g.d() < 22 || this.f44739l == null) {
            return null;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f44743p.a();
        try {
            C3816w1 c3816w1 = this.f44738k;
            if (c3816w1 == null || !c3816w1.h().equals(str2)) {
                this.f44729b.c(EnumC3721i3.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                return null;
            }
            this.f44738k = null;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            this.f44729b.c(EnumC3721i3.DEBUG, "Transaction %s (%s) finished.", str, str3);
            N.b bVarG = this.f44739l.g(false, list);
            this.f44736i.set(false);
            if (bVarG == null) {
                return null;
            }
            long j10 = bVarG.f44687a - this.f44740m;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c3816w1);
            c3816w1.k(Long.valueOf(bVarG.f44687a), Long.valueOf(this.f44740m), Long.valueOf(bVarG.f44688b), Long.valueOf(this.f44741n));
            Long lS = c3833z3 instanceof SentryAndroidOptions ? C3681z0.k(this.f44728a, (SentryAndroidOptions) c3833z3).s() : null;
            String string = lS != null ? Long.toString(lS.longValue()) : "0";
            String[] strArr = Build.SUPPORTED_ABIS;
            return new C3811v1(bVarG.f44689c, this.f44742o, arrayList, str, str2, str3, Long.toString(j10), this.f44734g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new P(), this.f44734g.b(), this.f44734g.c(), this.f44734g.e(), this.f44734g.f(), string, c3833z3.getProguardUuid(), c3833z3.getRelease(), c3833z3.getEnvironment(), (bVarG.f44691e || z10) ? "timeout" : "normal", bVarG.f44690d);
        } catch (Throwable th) {
            if (interfaceC3698e0A == null) {
                throw th;
            }
            try {
                interfaceC3698e0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC3728k0
    public void a(InterfaceC3723j0 interfaceC3723j0) {
        if (this.f44736i.get() && this.f44738k == null) {
            InterfaceC3698e0 interfaceC3698e0A = this.f44743p.a();
            try {
                if (this.f44736i.get() && this.f44738k == null) {
                    this.f44738k = new C3816w1(interfaceC3723j0, Long.valueOf(this.f44740m), Long.valueOf(this.f44741n));
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

    @Override // io.sentry.InterfaceC3728k0
    public C3811v1 b(InterfaceC3723j0 interfaceC3723j0, List list, C3833z3 c3833z3) {
        return g(interfaceC3723j0.getName(), interfaceC3723j0.F().toString(), interfaceC3723j0.n().p().toString(), false, list, c3833z3);
    }

    @Override // io.sentry.InterfaceC3728k0
    public void close() {
        S s10;
        C3816w1 c3816w1 = this.f44738k;
        if (c3816w1 != null) {
            s10 = this;
            s10.g(c3816w1.i(), c3816w1.h(), c3816w1.j(), true, null, Q1.b().g());
        } else {
            s10 = this;
        }
        s10.f44736i.set(false);
        if (s10.f44739l != null) {
            s10.f44739l.f();
        }
    }

    @Override // io.sentry.InterfaceC3728k0
    public boolean isRunning() {
        return this.f44736i.get();
    }

    @Override // io.sentry.InterfaceC3728k0
    public void start() {
        if (this.f44734g.d() >= 22 && !this.f44736i.getAndSet(true)) {
            e();
            if (f()) {
                this.f44729b.c(EnumC3721i3.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.f44739l != null && this.f44739l.h()) {
                this.f44729b.c(EnumC3721i3.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            InterfaceC3698e0 interfaceC3698e0A = this.f44743p.a();
            try {
                this.f44738k = null;
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                }
                this.f44736i.set(false);
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
}
