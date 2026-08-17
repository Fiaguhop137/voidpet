package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U3 {
    public static InterfaceC3718i0 a(io.sentry.util.s sVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (clsG = sVar.g("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC3718i0)) {
                    return (InterfaceC3718i0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C3752p();
    }
}
