package com.facebook.react.modules.reactdevtoolssettings;

import G6.a;
import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@a(name = "ReactDevToolsSettingsManager")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/modules/reactdevtoolssettings/ReactDevToolsSettingsManagerModule;", "Lcom/facebook/fbreact/specs/NativeReactDevToolsSettingsManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "settings", "", "setGlobalHookSettings", "(Ljava/lang/String;)V", "getGlobalHookSettings", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDevToolsSettingsManagerModule extends NativeReactDevToolsSettingsManagerSpec {

    @NotNull
    private static final String KEY_HOOK_SETTINGS = "HookSettings";

    @NotNull
    public static final String NAME = "ReactDevToolsSettingsManager";

    @NotNull
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";

    @NotNull
    private final SharedPreferences sharedPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDevToolsSettingsManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        SharedPreferences sharedPreferences = reactContext.getSharedPreferences("ReactNative__DevToolsSettings", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    @Nullable
    public String getGlobalHookSettings() {
        return this.sharedPreferences.getString("HookSettings", null);
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    public void setGlobalHookSettings(@NotNull String settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.sharedPreferences.edit().putString("HookSettings", settings).apply();
    }
}
