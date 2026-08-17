package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29493a;

    public /* synthetic */ e(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29493a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29493a.lambda$incrementPendingJSCalls$4();
    }
}
