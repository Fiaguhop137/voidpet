package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f28069a = new Handler(Looper.getMainLooper());

    public static void a(boolean z10, Runnable runnable) {
        if (z10 || Looper.myLooper() != Looper.getMainLooper()) {
            f28069a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
