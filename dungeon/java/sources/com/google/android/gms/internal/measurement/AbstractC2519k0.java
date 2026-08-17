package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2519k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f32961a = new C2510j0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC2474f0 abstractC2474f0) {
        Z.a();
        SharedPreferencesC2501i0 sharedPreferencesC2501i0 = str.equals("") ? new SharedPreferencesC2501i0() : null;
        if (sharedPreferencesC2501i0 != null) {
            return sharedPreferencesC2501i0;
        }
        ThreadLocal threadLocal = f32961a;
        B9.n.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f32961a.set(Boolean.TRUE);
        }
    }
}
