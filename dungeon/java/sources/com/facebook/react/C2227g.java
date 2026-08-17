package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2227g extends AbstractC2194a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f29796a = Ad.j.a(Ad.m.NONE, new C2199d());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        return kotlin.collections.N.i();
    }

    private final Map g() {
        return (Map) this.f29796a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h() {
        return kotlin.collections.N.f(Ad.v.a("DebuggingOverlay", ModuleSpec.INSTANCE.viewManagerSpec(new C2226f())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule i() {
        return new DebuggingOverlayManager();
    }

    @Override // com.facebook.react.a0
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) g().getOrDefault(viewManagerName, null);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a, com.facebook.react.P
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return null;
    }

    @Override // com.facebook.react.AbstractC2194a
    public H6.a getReactModuleInfoProvider() {
        return new C2225e();
    }

    @Override // com.facebook.react.a0
    public Collection getViewManagerNames(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return g().keySet();
    }

    @Override // com.facebook.react.AbstractC2194a
    public List getViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.U0(g().values());
    }
}
