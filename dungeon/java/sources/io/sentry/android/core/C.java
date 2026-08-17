package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C3754p1;

/* JADX INFO: loaded from: classes3.dex */
public class C implements io.sentry.W {
    @Override // io.sentry.W
    public void c() {
    }

    @Override // io.sentry.W
    public void d(C3754p1 c3754p1) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c3754p1.f(Long.valueOf(jFreeMemory));
        c3754p1.g(Long.valueOf(nativeHeapSize));
    }
}
