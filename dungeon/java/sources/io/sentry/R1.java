package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class R1 {
    public static InterfaceC3683b0 a(io.sentry.util.s sVar, ILogger iLogger) {
        InterfaceC3683b0 interfaceC3683b0B = b(sVar, iLogger);
        interfaceC3683b0B.a();
        return interfaceC3683b0B;
    }

    private static InterfaceC3683b0 b(io.sentry.util.s sVar, ILogger iLogger) {
        Class clsG;
        if (io.sentry.util.y.c() && sVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (clsG = sVar.g("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC3683b0)) {
                    return (InterfaceC3683b0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C3747o();
    }
}
