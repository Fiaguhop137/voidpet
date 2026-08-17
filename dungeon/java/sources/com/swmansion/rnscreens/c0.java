package com.swmansion.rnscreens;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f39051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39052b;

    public /* synthetic */ c0(Activity activity, String str) {
        this.f39051a = activity;
        this.f39052b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.u(this.f39051a, this.f39052b);
    }
}
