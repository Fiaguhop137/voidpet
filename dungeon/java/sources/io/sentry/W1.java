package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public interface W1 {
    static /* synthetic */ void b(ILogger iLogger, String str, AbstractC3787t abstractC3787t, File file) {
        EnumC3721i3 enumC3721i3 = EnumC3721i3.DEBUG;
        iLogger.c(enumC3721i3, "Started processing cached files from %s", str);
        abstractC3787t.d(file);
        iLogger.c(enumC3721i3, "Finished processing cached files from %s", str);
    }

    default T1 a(AbstractC3787t abstractC3787t, String str, ILogger iLogger) {
        return new V1(iLogger, str, abstractC3787t, new File(str));
    }

    T1 c(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3);

    default boolean d(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(EnumC3721i3.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
