package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f27934a;

    public a3(b3 b3Var) {
        this.f27934a = b3Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        p1 p1Var = this.f27934a.f27961a.f27976b;
        if (p1.f28289b) {
            p1Var.a("TaskManager", "Caught unhandled exception", th);
        }
    }
}
