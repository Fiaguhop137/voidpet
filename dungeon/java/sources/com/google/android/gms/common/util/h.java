package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f31937a = new h();

    private h() {
    }

    public static e d() {
        return f31937a;
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.e
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
