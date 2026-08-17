package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29495a;

    public /* synthetic */ g(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29495a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29495a.lambda$decrementPendingJSCalls$5();
    }
}
