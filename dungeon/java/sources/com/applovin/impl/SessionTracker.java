package com.applovin.impl;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27925b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27926c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f27927d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f27928e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f27929f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f27930g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Date f27931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Date f27932i;

    public SessionTracker(p pVar) {
        this.f27924a = pVar;
        Application application = (Application) p.f28247J;
        application.registerActivityLifecycleCallbacks(new i2(this));
        application.registerComponentCallbacks(new j2(this));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new k2(this), intentFilter);
    }

    public static void a(SessionTracker sessionTracker) {
        if (sessionTracker.f27926c.compareAndSet(true, false)) {
            sessionTracker.f27924a.g();
            if (p1.f28289b) {
                sessionTracker.f27924a.g().a("SessionTracker", "Application Resumed");
            }
            sessionTracker.f27929f.set(System.currentTimeMillis());
            sessionTracker.f27930g.addAndGet(sessionTracker.f27929f.get() - sessionTracker.f27928e.get());
            p pVar = sessionTracker.f27924a;
            boolean zBooleanValue = ((Boolean) pVar.l().a(m2.f28168X0)).booleanValue();
            p pVar2 = sessionTracker.f27924a;
            long jLongValue = ((Long) pVar2.l().a(m2.f28170Y0)).longValue();
            n.a(new Intent("com.applovin.application_resumed"));
            long millis = TimeUnit.MINUTES.toMillis(jLongValue);
            if (sessionTracker.f27932i == null || System.currentTimeMillis() - sessionTracker.f27932i.getTime() >= millis) {
                sessionTracker.f27924a.getEventService().trackEvent("resumed");
                if (zBooleanValue) {
                    sessionTracker.f27932i = new Date();
                }
            }
            if (zBooleanValue) {
                return;
            }
            sessionTracker.f27932i = new Date();
        }
    }

    public static void b(SessionTracker sessionTracker) {
        if (sessionTracker.f27926c.compareAndSet(false, true)) {
            sessionTracker.f27924a.g();
            if (p1.f28289b) {
                sessionTracker.f27924a.g().a("SessionTracker", "Application Paused");
            }
            sessionTracker.f27928e.set(System.currentTimeMillis());
            n.a(new Intent("com.applovin.application_paused"));
            p pVar = sessionTracker.f27924a;
            boolean zBooleanValue = ((Boolean) pVar.l().a(m2.f28168X0)).booleanValue();
            p pVar2 = sessionTracker.f27924a;
            long millis = TimeUnit.MINUTES.toMillis(((Long) pVar2.l().a(m2.f28172Z0)).longValue());
            if (sessionTracker.f27931h == null || System.currentTimeMillis() - sessionTracker.f27931h.getTime() >= millis) {
                sessionTracker.f27924a.getEventService().trackEvent("paused");
                if (zBooleanValue) {
                    sessionTracker.f27931h = new Date();
                }
            }
            if (zBooleanValue) {
                return;
            }
            sessionTracker.f27931h = new Date();
        }
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f27928e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f27929f.get();
    }

    public l2 getCurrentApplicationState() {
        if (this.f27926c.get()) {
            return l2.PAUSED;
        }
        return this.f27928e.get() != 0 ? l2.RESUMED : l2.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOrdinal = getCurrentApplicationState().ordinal();
        if (iOrdinal == 0) {
            j10 = p.f28248K;
        } else if (iOrdinal == 1) {
            j10 = this.f27928e.get();
        } else {
            if (iOrdinal != 2) {
                return -1L;
            }
            j10 = this.f27929f.get();
        }
        return jCurrentTimeMillis - j10;
    }

    public int getLastTrimMemoryLevel() {
        return this.f27927d.get();
    }

    public String getSessionId() {
        return this.f27925b;
    }

    public long getTotalBackgroundDurationMillis() {
        if (getCurrentApplicationState() != l2.PAUSED) {
            return this.f27930g.get();
        }
        return getCurrentApplicationStateDurationMillis() + this.f27930g.get();
    }

    public boolean isApplicationPaused() {
        return this.f27926c.get();
    }
}
