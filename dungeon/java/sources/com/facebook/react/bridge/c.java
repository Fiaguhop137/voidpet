package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29491a;

    public /* synthetic */ c(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29491a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29491a.lambda$onNativeException$6();
    }
}
