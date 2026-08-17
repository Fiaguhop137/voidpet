package com.applovin.impl;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f28077a;

    public j3(k3 k3Var) {
        this.f28077a = k3Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            this.f28077a.f28097c.run();
            synchronized (this.f28077a.f28098d) {
                k3 k3Var = this.f28077a;
                k3Var.getClass();
                k3Var.f28096b = null;
            }
        } catch (Throwable th) {
            try {
                p1 p1Var = this.f28077a.f28095a;
                if (p1Var != null && (z10 = p1.f28289b) && z10) {
                    p1Var.a("Timer", "Encountered error while executing timed task", th);
                }
            } finally {
                synchronized (this.f28077a.f28098d) {
                    k3 k3Var2 = this.f28077a;
                    k3Var2.getClass();
                    k3Var2.f28096b = null;
                }
            }
        }
    }
}
