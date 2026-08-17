package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.NativeModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements TurboModuleManager.ModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TurboModuleManager f29804a;

    public /* synthetic */ c(TurboModuleManager turboModuleManager) {
        this.f29804a = turboModuleManager;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
    public final NativeModule getModule(String str) {
        return TurboModuleManager._init_$lambda$3(this.f29804a, str);
    }
}
