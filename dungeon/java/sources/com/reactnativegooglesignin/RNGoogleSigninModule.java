package com.reactnativegooglesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2341j;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class RNGoogleSigninModule extends NativeGoogleSigninSpec {
    public static final String PLAY_SERVICES_NOT_AVAILABLE = "PLAY_SERVICES_NOT_AVAILABLE";
    public static final int RC_SIGN_IN = 9001;
    public static final int REQUEST_CODE_ADD_SCOPES = 53295;
    public static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    private static final String SHOULD_RECOVER = "SHOULD_RECOVER";
    private com.google.android.gms.auth.api.signin.b _apiClient;
    private com.reactnativegooglesignin.b pendingAuthRecovery;
    private final com.reactnativegooglesignin.c signInOrAddScopesPromiseWrapper;
    private final com.reactnativegooglesignin.c silentSignInPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenClearingPromiseWrapper;
    private final com.reactnativegooglesignin.c tokenRetrievalPromiseWrapper;

    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f38642a;

        a(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f38642a = new WeakReference(rNGoogleSigninModule);
        }

        private void a(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap) {
            Activity currentActivity = rNGoogleSigninModule.getCurrentActivity();
            if (currentActivity != null) {
                rNGoogleSigninModule.pendingAuthRecovery = new com.reactnativegooglesignin.b(writableMap);
                currentActivity.startActivityForResult(((UserRecoverableAuthException) exc).a(), 53294);
                return;
            }
            rNGoogleSigninModule.pendingAuthRecovery = null;
            rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().c("Cannot attempt recovery auth because app is not in foreground. " + exc.getLocalizedMessage());
        }

        private void c(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap, WritableMap writableMap2) {
            if (!(exc instanceof UserRecoverableAuthException)) {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            } else if (writableMap2 != null && writableMap2.hasKey("SHOULD_RECOVER") && writableMap2.getBoolean("SHOULD_RECOVER")) {
                a(rNGoogleSigninModule, exc, writableMap);
            } else {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            }
        }

        private void d(RNGoogleSigninModule rNGoogleSigninModule, WritableMap writableMap) {
            writableMap.putString("accessToken", p009a8.b.b(rNGoogleSigninModule.getReactApplicationContext(), new Account(writableMap.getMap("user").getString("email"), "com.google"), o.e(writableMap.getArray("scopes"))));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(WritableMap... writableMapArr) {
            WritableMap writableMap = writableMapArr[0];
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f38642a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                d(rNGoogleSigninModule, writableMap);
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().g(writableMap);
            } catch (Exception e10) {
                c(rNGoogleSigninModule, e10, writableMap, writableMapArr.length >= 2 ? writableMapArr[1] : null);
            }
            return null;
        }
    }

    private class b extends BaseActivityEventListener {
        private b() {
        }

        /* synthetic */ b(RNGoogleSigninModule rNGoogleSigninModule, k kVar) {
            this();
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) throws Throwable {
            if (i10 == 9001) {
                Task taskC = com.google.android.gms.auth.api.signin.a.c(intent);
                RNGoogleSigninModule rNGoogleSigninModule = RNGoogleSigninModule.this;
                rNGoogleSigninModule.handleSignInTaskResult(taskC, rNGoogleSigninModule.signInOrAddScopesPromiseWrapper);
            } else {
                if (i10 == 53294) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.rerunFailedAuthTokenTask();
                        return;
                    } else {
                        RNGoogleSigninModule.this.tokenRetrievalPromiseWrapper.c("Failed authentication recovery attempt, probably user-rejected.");
                        return;
                    }
                }
                if (i10 == 53295) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.g(Boolean.TRUE);
                    } else {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.c("Failed to add scopes.");
                    }
                }
            }
        }
    }

    private static class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f38644a;

        c(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f38644a = new WeakReference(rNGoogleSigninModule);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f38644a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            com.reactnativegooglesignin.c tokenClearingPromiseWrapper = rNGoogleSigninModule.getTokenClearingPromiseWrapper();
            try {
                p009a8.b.a(rNGoogleSigninModule.getReactApplicationContext(), strArr[0]);
                tokenClearingPromiseWrapper.g(null);
            } catch (Exception e10) {
                tokenClearingPromiseWrapper.b(e10);
            }
            return null;
        }
    }

    public RNGoogleSigninModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.signInOrAddScopesPromiseWrapper = new com.reactnativegooglesignin.c("RNGoogleSignin");
        this.silentSignInPromiseWrapper = new com.reactnativegooglesignin.c("RNGoogleSignin");
        this.tokenRetrievalPromiseWrapper = new com.reactnativegooglesignin.c("RNGoogleSignin");
        this.tokenClearingPromiseWrapper = new com.reactnativegooglesignin.c("RNGoogleSignin");
        reactApplicationContext.addActivityEventListener(new b(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSignInTaskResult(Task<GoogleSignInAccount> task, com.reactnativegooglesignin.c cVar) throws Throwable {
        try {
            GoogleSignInAccount result = task.getResult(p135h8.b.class);
            if (result == null) {
                cVar.c("GoogleSignInAccount instance was null");
            } else {
                cVar.g(o.d(result));
            }
        } catch (p135h8.b e10) {
            if (e10.b() == 10) {
                cVar.d(String.valueOf(10), "DEVELOPER_ERROR: Follow troubleshooting instructions at https://react-native-google-signin.github.io/docs/troubleshooting");
            } else {
                cVar.b(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSignOutOrRevokeAccessTask, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signOut$3(@NonNull Task<Void> task, Promise promise) {
        if (task.isSuccessful()) {
            promise.resolve(null);
            return;
        }
        int iB = o.b(task);
        promise.reject(String.valueOf(iB), p063d8.c.a(iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$2(Activity activity) {
        activity.startActivityForResult(this._apiClient.w(), 9001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$0(Task task) throws Throwable {
        handleSignInTaskResult(task, this.silentSignInPromiseWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$1() throws Throwable {
        Task taskZ = this._apiClient.z();
        if (taskZ.isSuccessful()) {
            handleSignInTaskResult(taskZ, this.silentSignInPromiseWrapper);
        } else {
            taskZ.addOnCompleteListener(new f(this));
        }
    }

    static void rejectWithNullActivity(Promise promise) {
        promise.reject("RNGoogleSignin", "activity is null");
    }

    private void rejectWithNullClientError(Promise promise) {
        promise.reject("RNGoogleSignin", "apiClient is null - call configure() first");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rerunFailedAuthTokenTask() {
        WritableMap writableMapA = this.pendingAuthRecovery.a();
        if (writableMapA != null) {
            new a(this).execute(writableMapA, null);
        } else {
            this.tokenRetrievalPromiseWrapper.c("rerunFailedAuthTokenTask: recovery failed");
        }
    }

    private void startTokenRetrievalTaskWithRecovery(GoogleSignInAccount googleSignInAccount) {
        WritableMap writableMapD = o.d(googleSignInAccount);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("SHOULD_RECOVER", true);
        new a(this).execute(writableMapD, writableMapCreateMap);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void addScopes(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "addScopes");
            com.google.android.gms.auth.api.signin.a.d(currentActivity, 53295, googleSignInAccountB, o.a(readableMap.getArray("scopes")));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void clearCachedAccessToken(String str, Promise promise) {
        this.tokenClearingPromiseWrapper.h(promise, "clearCachedAccessToken");
        new c(this).execute(str);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        ReadableArray array = readableMap.hasKey("scopes") ? readableMap.getArray("scopes") : Arguments.createArray();
        String string = readableMap.hasKey("webClientId") ? readableMap.getString("webClientId") : null;
        boolean z10 = true;
        if (!readableMap.hasKey("offlineAccess") || !readableMap.getBoolean("offlineAccess")) {
            z10 = false;
        }
        this._apiClient = com.google.android.gms.auth.api.signin.a.a(getReactApplicationContext(), o.c(o.a(array), string, z10, readableMap.hasKey("forceCodeForRefreshToken") && readableMap.getBoolean("forceCodeForRefreshToken"), readableMap.hasKey("accountName") ? readableMap.getString("accountName") : null, readableMap.hasKey("hostedDomain") ? readableMap.getString("hostedDomain") : null));
        promise.resolve(null);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCurrentUser() {
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            return null;
        }
        return o.d(googleSignInAccountB);
    }

    public com.reactnativegooglesignin.c getTokenClearingPromiseWrapper() {
        return this.tokenClearingPromiseWrapper;
    }

    public com.reactnativegooglesignin.c getTokenRetrievalPromiseWrapper() {
        return this.tokenRetrievalPromiseWrapper;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void getTokens(Promise promise) {
        GoogleSignInAccount googleSignInAccountB = com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext());
        if (googleSignInAccountB == null) {
            promise.reject("getTokens", "getTokens requires a user to be signed in");
        } else {
            this.tokenRetrievalPromiseWrapper.h(promise, "getTokens");
            startTokenRetrievalTaskWithRecovery(googleSignInAccountB);
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap map = new HashMap();
        map.put("BUTTON_SIZE_ICON", 2);
        map.put("BUTTON_SIZE_STANDARD", 0);
        map.put("BUTTON_SIZE_WIDE", 1);
        map.put("SIGN_IN_CANCELLED", String.valueOf(12501));
        map.put("SIGN_IN_REQUIRED", String.valueOf(4));
        map.put("SCOPES_ALREADY_GRANTED", "NEVER_HAPPENS_ON_ANDROID");
        map.put("ONE_TAP_START_FAILED", "ONE_TAP_START_FAILED");
        map.put("NO_SAVED_CREDENTIAL_FOUND", "NO_SAVED_CREDENTIAL_FOUND");
        map.put("IN_PROGRESS", "ASYNC_OP_IN_PROGRESS");
        map.put("PLAY_SERVICES_NOT_AVAILABLE", "PLAY_SERVICES_NOT_AVAILABLE");
        return map;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasPreviousSignIn() {
        return com.google.android.gms.auth.api.signin.a.b(getReactApplicationContext()) != null;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void playServicesAvailable(boolean z10, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w("RNGoogleSignin", "could not determine playServicesAvailable, activity is null");
            rejectWithNullActivity(promise);
            return;
        }
        C2341j c2341jO = C2341j.o();
        int iG = c2341jO.g(currentActivity);
        if (iG == 0) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        if (z10 && c2341jO.j(iG)) {
            c2341jO.l(currentActivity, iG, 2404).show();
        }
        promise.reject("PLAY_SERVICES_NOT_AVAILABLE", "Play services not available");
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void revokeAccess(Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.x().addOnCompleteListener(new i(this, promise));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signIn(ReadableMap readableMap, Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "signIn");
            UiThreadUtil.runOnUiThread(new h(this, currentActivity));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signInSilently(Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
        } else {
            this.silentSignInPromiseWrapper.h(promise, "signInSilently");
            UiThreadUtil.runOnUiThread(new j(this));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signOut(Promise promise) {
        com.google.android.gms.auth.api.signin.b bVar = this._apiClient;
        if (bVar == null) {
            rejectWithNullClientError(promise);
        } else {
            bVar.y().addOnCompleteListener(new g(this, promise));
        }
    }
}
