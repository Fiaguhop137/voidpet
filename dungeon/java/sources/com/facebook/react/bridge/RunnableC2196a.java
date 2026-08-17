package com.facebook.react.bridge;

/* JADX INFO: renamed from: com.facebook.react.bridge.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2196a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29489a;

    public /* synthetic */ RunnableC2196a(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29489a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29489a.lambda$destroy$2();
    }
}
