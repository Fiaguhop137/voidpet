package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.NativeModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements TurboModuleManager.ModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TurboModuleManager f29803a;

    public /* synthetic */ b(TurboModuleManager turboModuleManager) {
        this.f29803a = turboModuleManager;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
    public final NativeModule getModule(String str) {
        return TurboModuleManager._init_$lambda$1(this.f29803a, str);
    }
}
