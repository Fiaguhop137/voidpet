package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2528l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f32969a;

    static {
        f32969a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
