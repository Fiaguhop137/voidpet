package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2947f {
    C2947f(Context context) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
