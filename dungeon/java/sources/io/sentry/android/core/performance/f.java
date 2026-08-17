package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3728k0;
import io.sentry.N;
import io.sentry.N0;
import io.sentry.android.core.AbstractC3662p0;
import io.sentry.android.core.C3636g0;
import io.sentry.android.core.C3664q0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.u;
import io.sentry.g4;
import io.sentry.util.C3799a;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p184k4.AbstractC3899e;

/* JADX INFO: loaded from: classes3.dex */
public class f extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile f f45122q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static long f45121p = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3799a f45123r = new C3799a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f45124a = d.UNKNOWN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f45125b = new p(new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f45126c = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3728k0 f45132i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private N f45133j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g4 f45134k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45135l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45136m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f45137n = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f45138o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f45127d = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f45128e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f45129f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f45130g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f45131h = new ArrayList();

    class a implements p.a {
        a() {
        }

        @Override // io.sentry.util.p.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(AbstractC3662p0.s());
        }
    }

    class b implements MessageQueue.IdleHandler {
        b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            f.this.f45126c = SystemClock.uptimeMillis();
            f.this.f();
            return false;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f45141a;

        c(Handler handler) {
            this.f45141a = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f45126c = SystemClock.uptimeMillis();
            this.f45141a.post(new g(this));
        }
    }

    public enum d {
        UNKNOWN,
        COLD,
        WARM
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f45137n.get() == 0) {
            this.f45125b.c(Boolean.FALSE);
            InterfaceC3728k0 interfaceC3728k0 = this.f45132i;
            if (interfaceC3728k0 != null && interfaceC3728k0.isRunning()) {
                this.f45132i.close();
                this.f45132i = null;
            }
            N n10 = this.f45133j;
            if (n10 == null || !n10.isRunning()) {
                return;
            }
            this.f45133j.j(true);
            this.f45133j = null;
        }
    }

    public static f q() {
        if (f45122q == null) {
            InterfaceC3698e0 interfaceC3698e0A = f45123r.a();
            try {
                if (f45122q == null) {
                    f45122q = new f();
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
        return f45122q;
    }

    public void e(io.sentry.android.core.performance.c cVar) {
        this.f45131h.add(cVar);
    }

    public h g() {
        h hVar = new h();
        hVar.B("Process Initialization", this.f45127d.s(), this.f45127d.u(), f45121p);
        return hVar;
    }

    public List h() {
        ArrayList arrayList = new ArrayList(this.f45131h);
        Collections.sort(arrayList);
        return arrayList;
    }

    public N i() {
        return this.f45133j;
    }

    public InterfaceC3728k0 j() {
        return this.f45132i;
    }

    public g4 k() {
        return this.f45134k;
    }

    public h l() {
        return this.f45127d;
    }

    public h m(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f45124a != d.UNKNOWN && ((Boolean) this.f45125b.a()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                h hVarL = l();
                if (hVarL.x() && hVarL.h() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return hVarL;
                }
            }
            h hVarR = r();
            if (hVarR.x() && hVarR.h() <= TimeUnit.MINUTES.toMillis(1L)) {
                return hVarR;
            }
        }
        return new h();
    }

    public d n() {
        return this.f45124a;
    }

    public h o() {
        return this.f45129f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C3664q0.c().d(activity);
        if (this.f45137n.incrementAndGet() == 1 && !this.f45138o.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f45127d.u();
            if (!((Boolean) this.f45125b.a()).booleanValue() || jUptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f45124a = d.WARM;
                this.f45136m = true;
                this.f45127d.z();
                this.f45127d.A(jUptimeMillis);
                f45121p = jUptimeMillis;
                this.f45130g.clear();
                this.f45129f.z();
            } else if (this.f45124a == d.UNKNOWN) {
                if (bundle != null) {
                    this.f45124a = d.WARM;
                } else if (this.f45126c == -1 || jUptimeMillis <= this.f45126c) {
                    this.f45124a = d.COLD;
                } else {
                    this.f45124a = d.WARM;
                }
            }
        }
        this.f45125b.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C3664q0.c().a(activity);
        if (this.f45137n.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f45124a = d.WARM;
        this.f45125b.c(Boolean.TRUE);
        this.f45136m = true;
        this.f45138o.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C3664q0.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C3664q0.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C3664q0.c().d(activity);
        if (this.f45138o.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            u.d(activity, new io.sentry.android.core.performance.d(this), new C3636g0(N0.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new e(this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C3664q0.c().a(activity);
    }

    public List p() {
        ArrayList arrayList = new ArrayList(this.f45130g.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public h r() {
        return this.f45128e;
    }

    public boolean s() {
        return ((Boolean) this.f45125b.a()).booleanValue();
    }

    public void t() {
        this.f45136m = false;
        this.f45130g.clear();
        this.f45131h.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void u() {
        if (!this.f45138o.getAndSet(true)) {
            f fVarQ = q();
            fVarQ.r().C();
            fVarQ.l().C();
        }
    }

    public void v(Application application) {
        if (this.f45135l) {
            return;
        }
        this.f45135l = true;
        this.f45125b.b();
        application.registerActivityLifecycleCallbacks(f45122q);
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null && Build.VERSION.SDK_INT >= 35) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfoA = AbstractC3899e.a(historicalProcessStartReasons.get(0));
                if (applicationStartInfoA.getStartupState() == 0) {
                    if (applicationStartInfoA.getStartType() == 1) {
                        this.f45124a = d.COLD;
                    } else {
                        this.f45124a = d.WARM;
                    }
                }
            }
        }
        d dVar = this.f45124a;
        d dVar2 = d.UNKNOWN;
        if (dVar == dVar2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new b());
        } else if (dVar == dVar2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new c(handler));
        }
    }

    public void w(N n10) {
        this.f45133j = n10;
    }

    public void x(InterfaceC3728k0 interfaceC3728k0) {
        this.f45132i = interfaceC3728k0;
    }

    public void y(g4 g4Var) {
        this.f45134k = g4Var;
    }

    public boolean z() {
        return this.f45136m && ((Boolean) this.f45125b.a()).booleanValue();
    }
}
