package com.appsflyer.internal;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1nSDK f28448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SensorEvent f28449b;

    public /* synthetic */ A(AFj1nSDK aFj1nSDK, SensorEvent sensorEvent) {
        this.f28448a = aFj1nSDK;
        this.f28449b = sensorEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28448a.G_(this.f28449b);
    }
}
