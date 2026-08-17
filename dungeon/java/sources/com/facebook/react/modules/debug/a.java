package com.facebook.react.modules.debug;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevMenuModule f29900a;

    public /* synthetic */ a(DevMenuModule devMenuModule) {
        this.f29900a = devMenuModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DevMenuModule.reload$lambda$0(this.f29900a);
    }
}
