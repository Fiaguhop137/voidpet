package com.reactnativegooglesignin;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NativeGoogleSigninSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNGoogleSignin";

    public NativeGoogleSigninSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @p276p6.a
    @ReactMethod
    public abstract void addScopes(ReadableMap readableMap, Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void clearCachedAccessToken(String str, Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void configure(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @p276p6.a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (p384v6.a.f56277b || p384v6.a.f56278c) {
            HashSet hashSet = new HashSet(Arrays.asList("BUTTON_SIZE_ICON", "BUTTON_SIZE_STANDARD", "BUTTON_SIZE_WIDE", "IN_PROGRESS", "PLAY_SERVICES_NOT_AVAILABLE", "SIGN_IN_CANCELLED", "SIGN_IN_REQUIRED", "SCOPES_ALREADY_GRANTED", "NO_SAVED_CREDENTIAL_FOUND", "ONE_TAP_START_FAILED"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @p276p6.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCurrentUser();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGoogleSignin";
    }

    @p276p6.a
    @ReactMethod
    public abstract void getTokens(Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @p276p6.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean hasPreviousSignIn();

    @p276p6.a
    @ReactMethod
    public abstract void playServicesAvailable(boolean z10, Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void revokeAccess(Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void signIn(ReadableMap readableMap, Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void signInSilently(Promise promise);

    @p276p6.a
    @ReactMethod
    public abstract void signOut(Promise promise);
}
