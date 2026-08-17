package com.learnium.RNDeviceInfo;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f38599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38600b;

    public /* synthetic */ g(i iVar, Context context) {
        this.f38599a = iVar;
        this.f38600b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38599a.h(this.f38600b);
    }
}
