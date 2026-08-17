package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CatalystInstanceImpl f29492a;

    public /* synthetic */ d(CatalystInstanceImpl catalystInstanceImpl) {
        this.f29492a = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29492a.lambda$destroy$0();
    }
}
