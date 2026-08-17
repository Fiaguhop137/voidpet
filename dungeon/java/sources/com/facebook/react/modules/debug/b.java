package com.facebook.react.modules.debug;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements p456z6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevSettingsModule f29901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29902b;

    public /* synthetic */ b(DevSettingsModule devSettingsModule, String str) {
        this.f29901a = devSettingsModule;
        this.f29902b = str;
    }

    @Override // p456z6.d
    public final void a() {
        DevSettingsModule.addMenuItem$lambda$2(this.f29901a, this.f29902b);
    }
}
