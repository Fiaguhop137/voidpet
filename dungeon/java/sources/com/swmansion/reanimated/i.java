package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReanimatedModule f38926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactApplicationContext f38927b;

    public /* synthetic */ i(ReanimatedModule reanimatedModule, ReactApplicationContext reactApplicationContext) {
        this.f38926a = reanimatedModule;
        this.f38927b = reactApplicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38926a.lambda$initialize$4(this.f38927b);
    }
}
