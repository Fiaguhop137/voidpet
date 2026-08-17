package com.facebook.react.modules.debug;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevSettingsModule f29903a;

    public /* synthetic */ c(DevSettingsModule devSettingsModule) {
        this.f29903a = devSettingsModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DevSettingsModule.reload$lambda$0(this.f29903a);
    }
}
