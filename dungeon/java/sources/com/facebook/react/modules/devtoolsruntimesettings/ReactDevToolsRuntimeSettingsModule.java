package com.facebook.react.modules.devtoolsruntimesettings;

import com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "ReactDevToolsRuntimeSettingsModule")
@DoNotStripAny
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/devtoolsruntimesettings/ReactDevToolsRuntimeSettingsModule;", "Lcom/facebook/fbreact/specs/NativeReactDevToolsRuntimeSettingsModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "", "setReloadAndProfileConfig", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/WritableMap;", "getReloadAndProfileConfig", "()Lcom/facebook/react/bridge/WritableMap;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDevToolsRuntimeSettingsModule extends NativeReactDevToolsRuntimeSettingsModuleSpec {

    @NotNull
    public static final String NAME = "ReactDevToolsRuntimeSettingsModule";

    @NotNull
    private static final a settings = new a();

    public ReactDevToolsRuntimeSettingsModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec
    @NotNull
    public WritableMap getReloadAndProfileConfig() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        a aVar = settings;
        writableMapCreateMap.putBoolean("shouldReloadAndProfile", aVar.b());
        writableMapCreateMap.putBoolean("recordChangeDescriptions", aVar.a());
        return writableMapCreateMap;
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsRuntimeSettingsModuleSpec
    public void setReloadAndProfileConfig(@NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.hasKey("shouldReloadAndProfile")) {
            settings.d(map.getBoolean("shouldReloadAndProfile"));
        }
        if (map.hasKey("recordChangeDescriptions")) {
            settings.c(map.getBoolean("recordChangeDescriptions"));
        }
    }
}
