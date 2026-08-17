package io.sentry.android.core.internal.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements io.sentry.util.runtime.a {
    public static /* synthetic */ Object c(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // io.sentry.util.runtime.a
    public Object a(io.sentry.util.runtime.a.InterfaceC0545a interfaceC0545a) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return interfaceC0545a.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.a
    public void b(Runnable runnable) {
        a(new i(runnable));
    }
}
