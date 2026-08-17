package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C f34799a;

    static {
        C c2866q;
        try {
            SystemClock.elapsedRealtimeNanos();
            c2866q = new C2861p();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c2866q = new C2866q();
        }
        f34799a = c2866q;
    }

    public static C a() {
        return f34799a;
    }
}
