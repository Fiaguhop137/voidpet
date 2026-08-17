package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C3697e;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3753p0;
import io.sentry.android.core.internal.util.C3648h;
import io.sentry.protocol.C3761e;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC3753p0, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.H f44615e = new io.sentry.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3619a0 f44617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f44618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.q f44619d = new io.sentry.android.core.internal.util.q(C3648h.b(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f44616a = (Context) io.sentry.util.w.c(AbstractC3662p0.g(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10, Configuration configuration) {
        if (this.f44617b != null) {
            C3761e.b bVarA = io.sentry.android.core.internal.util.r.a(this.f44616a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            C3697e c3697e = new C3697e(j10);
            c3697e.K("navigation");
            c3697e.F("device.orientation");
            c3697e.G("position", lowerCase);
            c3697e.H(EnumC3721i3.INFO);
            io.sentry.H h10 = new io.sentry.H();
            h10.l("android:configuration", configuration);
            this.f44617b.e(c3697e, h10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j10, int i10) {
        if (this.f44617b != null) {
            C3697e c3697e = new C3697e(j10);
            c3697e.K("system");
            c3697e.F("device.event");
            c3697e.I("Low memory");
            c3697e.G("action", "LOW_MEMORY");
            c3697e.G("level", Integer.valueOf(i10));
            c3697e.H(EnumC3721i3.WARNING);
            this.f44617b.e(c3697e, f44615e);
        }
    }

    private void f(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f44618c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.f44618c.getLogger().a(EnumC3721i3.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC3753p0
    public void c(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3) {
        this.f44617b = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c3833z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c3833z3 : null, "SentryAndroidOptions is required");
        this.f44618c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC3721i3 enumC3721i3 = EnumC3721i3.DEBUG;
        logger.c(enumC3721i3, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f44618c.isEnableAppComponentBreadcrumbs()));
        if (this.f44618c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f44616a.registerComponentCallbacks(this);
                c3833z3.getLogger().c(enumC3721i3, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.n.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.f44618c.setEnableAppComponentBreadcrumbs(false);
                c3833z3.getLogger().a(EnumC3721i3.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f44616a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f44618c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(EnumC3721i3.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f44618c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(EnumC3721i3.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        f(new Y(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 >= 40 && !this.f44619d.a()) {
            f(new Z(this, System.currentTimeMillis(), i10));
        }
    }
}
