package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import p241n7.a;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
public class ThreadScopeSupport {
    static {
        a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
