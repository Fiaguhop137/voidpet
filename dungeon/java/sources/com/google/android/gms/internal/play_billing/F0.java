package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
abstract class F0 {
    static void a(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }
}
