package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29496a;

    public /* synthetic */ h(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29496a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29496a.mNativeModuleRegistry.onBatchComplete();
    }
}
