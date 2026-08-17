package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final v module;

    ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, "Analytics");
        this.module = new v(reactApplicationContext, "Analytics");
    }

    public static /* synthetic */ void a(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void b(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void c(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void d(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void e(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void f(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void g(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        } else {
            Long l10 = (Long) task.getResult();
            promise.resolve(l10 != null ? Double.valueOf(l10.doubleValue()) : null);
        }
    }

    public static /* synthetic */ void h(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void i(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void j(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void k(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (Object obj : arrayList) {
            if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(Promise promise) {
        this.module.l().addOnCompleteListener(new a(promise));
    }

    @ReactMethod
    public void getSessionId(Promise promise) {
        this.module.m().addOnCompleteListener(new f(promise));
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Promise promise) {
        this.module.w(str, toBundle(readableMap)).addOnCompleteListener(new e(promise));
    }

    @ReactMethod
    public void resetAnalyticsData(Promise promise) {
        this.module.x().addOnCompleteListener(new g(promise));
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, Promise promise) {
        this.module.y(bool).addOnCompleteListener(new d(promise));
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, Promise promise) {
        this.module.z(Arguments.toBundle(readableMap)).addOnCompleteListener(new c(promise));
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, Promise promise) {
        this.module.A(toBundle(readableMap)).addOnCompleteListener(new h(promise));
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d10, Promise promise) {
        this.module.B((long) d10).addOnCompleteListener(new j(promise));
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        this.module.C(str).addOnCompleteListener(new k(promise));
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, Promise promise) {
        this.module.D(Arguments.toBundle(readableMap)).addOnCompleteListener(new i(promise));
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, Promise promise) {
        this.module.E(str, str2).addOnCompleteListener(new b(promise));
    }
}
