package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p276p6.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @a
    @ReactMethod
    public void onFastRefresh() {
    }

    @a
    @ReactMethod
    public void openDebugger() {
    }

    @a
    @ReactMethod
    public abstract void reload();

    @a
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);

    @a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void toggleElementInspector();
}
