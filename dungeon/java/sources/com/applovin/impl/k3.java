package com.applovin.impl;

import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f28095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Timer f28096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f28097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28098d = new Object();

    public k3(p1 p1Var, Runnable runnable) {
        this.f28095a = p1Var;
        this.f28097c = runnable;
    }

    public static k3 a(long j10, p1 p1Var, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        k3 k3Var = new k3(p1Var, runnable);
        System.currentTimeMillis();
        try {
            k3Var.f28096b = new Timer();
            k3Var.f28096b.schedule(new j3(k3Var), j10);
            return k3Var;
        } catch (OutOfMemoryError e10) {
            if (p1.f28289b) {
                p1Var.a("Timer", "Failed to create timer due to OOM error", e10);
            }
            return k3Var;
        }
    }

    public final void a() {
        boolean z10;
        synchronized (this.f28098d) {
            Timer timer = this.f28096b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f28096b = null;
                } catch (Throwable th) {
                    try {
                        p1 p1Var = this.f28095a;
                        if (p1Var != null && (z10 = p1.f28289b) && z10) {
                            p1Var.a("Timer", "Encountered error while cancelling timer", th);
                        }
                        this.f28096b = null;
                    } catch (Throwable th2) {
                        this.f28096b = null;
                        throw th2;
                    }
                }
            }
        }
    }
}
