package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private p173jb.b mModuleRegistry;

    public ModuleRegistryReadyNotifier(p173jb.b bVar) {
        this.mModuleRegistry = bVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mModuleRegistry.a();
    }
}
