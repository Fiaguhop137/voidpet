package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC3710g2;
import io.sentry.C3734l1;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3753p0;
import io.sentry.O3;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C3799a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f44825a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final C3799a f44826b = new C3799a();

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.Y y10) {
        O3 o3F = y10.F();
        if (o3F == null || o3F.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, AbstractC3710g2.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.s sVar = new io.sentry.util.s();
        boolean zD = sVar.d("timber.log.Timber", sentryAndroidOptions);
        boolean z10 = true;
        if (!sVar.d("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) || !sVar.d("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z10 = false;
        }
        boolean z11 = zD && sVar.d("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zD2 = sVar.d("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean zD3 = sVar.d("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        C3636g0 c3636g0 = new C3636g0(iLogger);
        io.sentry.util.s sVar2 = new io.sentry.util.s();
        C3639i c3639i = new C3639i(sVar2, sentryAndroidOptions);
        L.k(sentryAndroidOptions, context, iLogger, c3636g0);
        L.j(context, sentryAndroidOptions, c3636g0, sVar2, c3639i, z10, z11, zD2, zD3);
        boolean z12 = z11;
        boolean z13 = z10;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.android.core.performance.f fVarQ = io.sentry.android.core.performance.f.q();
        if (sentryAndroidOptions.isEnablePerformanceV2() && c3636g0.d() >= 24) {
            io.sentry.android.core.performance.h hVarL = fVarQ.l();
            if (hVarL.v()) {
                hVarL.A(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            fVarQ.v((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.h hVarR = fVarQ.r();
        if (hVarR.v()) {
            hVarR.A(f44825a);
        }
        L.i(sentryAndroidOptions, context, c3636g0, sVar2, c3639i, zD2);
        d(sentryAndroidOptions, z13, z12);
    }

    private static void d(C3833z3 c3833z3, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC3753p0 interfaceC3753p0 : c3833z3.getIntegrations()) {
            if (z10 && (interfaceC3753p0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC3753p0);
            }
            if (z11 && (interfaceC3753p0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC3753p0);
            }
            if (interfaceC3753p0 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(interfaceC3753p0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                c3833z3.getIntegrations().remove((InterfaceC3753p0) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                c3833z3.getIntegrations().remove((InterfaceC3753p0) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                c3833z3.getIntegrations().remove((InterfaceC3753p0) arrayList3.get(i12));
            }
        }
    }

    public static void e(Context context, ILogger iLogger) {
        f(context, iLogger, new W0());
    }

    public static void f(Context context, ILogger iLogger, AbstractC3710g2.a aVar) {
        try {
            InterfaceC3698e0 interfaceC3698e0A = f44826b.a();
            try {
                AbstractC3710g2.w(C3734l1.a(SentryAndroidOptions.class), new X0(iLogger, context, aVar), true);
                InterfaceC3619a0 interfaceC3619a0R = AbstractC3710g2.r();
                if (AbstractC3662p0.s()) {
                    if (interfaceC3619a0R.g().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        interfaceC3619a0R.z(new Y0(atomicBoolean));
                        if (!atomicBoolean.get()) {
                            interfaceC3619a0R.n();
                        }
                    }
                    interfaceC3619a0R.g().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.b(EnumC3721i3.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.b(EnumC3721i3.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.b(EnumC3721i3.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.b(EnumC3721i3.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static void g(Context context, AbstractC3710g2.a aVar) {
        f(context, new C3680z(), aVar);
    }
}
