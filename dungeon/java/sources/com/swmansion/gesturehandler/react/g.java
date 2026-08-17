package com.swmansion.gesturehandler.react;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RNGestureHandlerModule f38883a;

    public /* synthetic */ g(RNGestureHandlerModule rNGestureHandlerModule) {
        this.f38883a = rNGestureHandlerModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RNGestureHandlerModule.install$lambda$1(this.f38883a);
    }
}
