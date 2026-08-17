package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2341j;
import io.invertase.firebase.app.a;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, "Utils");
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        C2341j c2341jO = C2341j.o();
        int iG = c2341jO.g(getContext());
        writableMapCreateMap.putInt("status", iG);
        if (iG == 0) {
            writableMapCreateMap.putBoolean("isAvailable", true);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putBoolean("isAvailable", false);
        writableMapCreateMap.putString("error", c2341jO.e(iG));
        writableMapCreateMap.putBoolean("isUserResolvableError", c2341jO.j(iG));
        writableMapCreateMap.putBoolean("hasResolution", new C2333b(iG).e4());
        return writableMapCreateMap;
    }

    private int isGooglePlayServicesAvailable() {
        return C2341j.o().g(getContext());
    }

    private static Boolean isRunningInTestLab() {
        return Boolean.valueOf("true".equals(Settings.System.getString(a.a().getContentResolver(), "firebase.test.lab")));
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() == 0 || (activity = getActivity()) == null) {
            return;
        }
        C2341j.o().p(activity);
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C2341j c2341jO = C2341j.o();
        if (iIsGooglePlayServicesAvailable == 0 || !c2341jO.j(iIsGooglePlayServicesAvailable) || (activity = getActivity()) == null) {
            return;
        }
        c2341jO.l(activity, iIsGooglePlayServicesAvailable, iIsGooglePlayServicesAvailable).show();
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C2333b c2333b = new C2333b(iIsGooglePlayServicesAvailable);
        if (c2333b.f4() || !c2333b.e4() || (activity = getActivity()) == null) {
            return;
        }
        try {
            c2333b.g4(activity, iIsGooglePlayServicesAvailable);
        } catch (IntentSender.SendIntentException e10) {
            Log.d("Utils", "resolutionForPlayServices", e10);
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isRunningInTestLab", isRunningInTestLab());
        map.put("androidPlayServices", getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        map.put("MAIN_BUNDLE", "");
        map.put("LIBRARY_DIRECTORY", reactApplicationContext.getFilesDir().getAbsolutePath());
        map.put("TEMP_DIRECTORY", reactApplicationContext.getCacheDir().getAbsolutePath());
        map.put("CACHES_DIRECTORY", reactApplicationContext.getCacheDir().getAbsolutePath());
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            map.put("DOCUMENT_DIRECTORY", externalFilesDir.getAbsolutePath());
        } else {
            map.put("DOCUMENT_DIRECTORY", reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        if (!map.containsKey("DOCUMENT_DIRECTORY")) {
            map.put("DOCUMENT_DIRECTORY", reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        map.put("PICTURES_DIRECTORY", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put("MOVIES_DIRECTORY", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            map.put("EXTERNAL_STORAGE_DIRECTORY", externalStorageDirectory.getAbsolutePath());
        }
        if (externalFilesDir != null) {
            map.put("EXTERNAL_DIRECTORY", externalFilesDir.getAbsolutePath());
        }
        return map;
    }
}
