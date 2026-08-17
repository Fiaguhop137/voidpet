package io.sentry.util;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(EnumC3721i3.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
