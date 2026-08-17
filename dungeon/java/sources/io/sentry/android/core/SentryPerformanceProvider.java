package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C3715h2;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3693d0;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3728k0;
import io.sentry.Z2;
import io.sentry.f4;
import io.sentry.g4;
import io.sentry.util.C3799a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryPerformanceProvider extends A0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f44758f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f44759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f44760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3636g0 f44761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3799a f44762e = new C3799a();

    public SentryPerformanceProvider() {
        C3680z c3680z = new C3680z();
        this.f44760c = c3680z;
        this.f44761d = new C3636g0(c3680z);
    }

    public static /* synthetic */ InterfaceC3693d0 a(Z2 z10) {
        return z10;
    }

    public static /* synthetic */ InterfaceC3693d0 c(Z2 z10) {
        return z10;
    }

    private void d(Context context, C3715h2 c3715h2, io.sentry.android.core.performance.f fVar) {
        if (!c3715h2.f()) {
            this.f44760c.c(EnumC3721i3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C3672v c3672v = new C3672v(this.f44761d, new io.sentry.android.core.internal.util.H(context.getApplicationContext(), this.f44760c, this.f44761d), this.f44760c, c3715h2.c(), c3715h2.d(), new e1(new Z2()));
        fVar.x(null);
        fVar.w(c3672v);
        this.f44760c.c(EnumC3721i3.DEBUG, "App start continuous profiling started.", new Object[0]);
        C3833z3 c3833z3Empty = C3833z3.empty();
        c3833z3Empty.setProfileSessionSampleRate(Double.valueOf(c3715h2.f() ? 1.0d : 0.0d));
        c3672v.k(c3715h2.a(), new f4(c3833z3Empty));
    }

    private void e(Context context, C3715h2 c3715h2, io.sentry.android.core.performance.f fVar) {
        g4 g4Var = new g4(Boolean.valueOf(c3715h2.l()), c3715h2.e(), Boolean.valueOf(c3715h2.i()), c3715h2.b());
        fVar.y(g4Var);
        if (!g4Var.b().booleanValue() || !g4Var.e().booleanValue()) {
            this.f44760c.c(EnumC3721i3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        S s10 = new S(context, this.f44761d, new io.sentry.android.core.internal.util.H(context, this.f44760c, this.f44761d), this.f44760c, c3715h2.c(), c3715h2.j(), c3715h2.d(), new d1(new Z2()));
        fVar.w(null);
        fVar.x(s10);
        this.f44760c.c(EnumC3721i3.DEBUG, "App start profiling started.", new Object[0]);
        s10.start();
    }

    private void f(io.sentry.android.core.performance.f fVar) {
        Context context = getContext();
        if (context == null) {
            this.f44760c.c(EnumC3721i3.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File((File) new io.sentry.android.core.internal.util.j().a(new c1(context)), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    C3715h2 c3715h2 = (C3715h2) new io.sentry.C0(C3833z3.empty()).c(bufferedReader, C3715h2.class);
                    if (c3715h2 == null) {
                        this.f44760c.c(EnumC3721i3.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (c3715h2.g() && c3715h2.k()) {
                        d(context, c3715h2, fVar);
                    } else if (!c3715h2.j()) {
                        this.f44760c.c(EnumC3721i3.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (c3715h2.h()) {
                        e(context, c3715h2, fVar);
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                this.f44760c.b(EnumC3721i3.ERROR, "App start profiling config file not found. ", e10);
            } catch (Throwable th3) {
                this.f44760c.b(EnumC3721i3.ERROR, "Error reading app start profiling config file. ", th3);
            }
        }
    }

    private void g(Context context, io.sentry.android.core.performance.f fVar) {
        fVar.r().A(f44758f);
        if (this.f44761d.d() >= 24) {
            fVar.l().A(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f44759b = (Application) context;
        }
        Application application = this.f44759b;
        if (application == null) {
            return;
        }
        fVar.v(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.f fVarQ = io.sentry.android.core.performance.f.q();
        g(getContext(), fVarQ);
        f(fVarQ);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        InterfaceC3698e0 interfaceC3698e0A = io.sentry.android.core.performance.f.f45123r.a();
        try {
            InterfaceC3728k0 interfaceC3728k0J = io.sentry.android.core.performance.f.q().j();
            if (interfaceC3728k0J != null) {
                interfaceC3728k0J.close();
            }
            io.sentry.N nI = io.sentry.android.core.performance.f.q().i();
            if (nI != null) {
                nI.j(true);
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
