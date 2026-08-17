package io.sentry.react.utils;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.android.core.C3664q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Activity a(ReactApplicationContext reactApplicationContext, ILogger iLogger) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        iLogger.c(EnumC3721i3.DEBUG, "[RNSentryActivityUtils] Given ReactApplicationContext has no activity attached, using CurrentActivityHolder as a fallback.", new Object[0]);
        return C3664q0.c().b();
    }
}
