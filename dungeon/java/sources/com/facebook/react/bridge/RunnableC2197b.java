package com.facebook.react.bridge;

/* JADX INFO: renamed from: com.facebook.react.bridge.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2197b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29490a;

    public /* synthetic */ RunnableC2197b(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29490a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29490a.lambda$destroy$1();
    }
}
