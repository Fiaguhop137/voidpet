package com.applovin.impl;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f27961a;

    public b3(d3 d3Var) {
        this.f27961a = d3Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AxonSdk:shared_thread_pool");
        thread.setDaemon(true);
        p pVar = this.f27961a.f27975a;
        thread.setPriority(((Integer) pVar.l().a(m2.f28207t)).intValue());
        thread.setUncaughtExceptionHandler(new a3(this));
        return thread;
    }
}
