package com.swmansion.rnscreens;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f39059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39060b;

    public /* synthetic */ d0(Window window, int i10) {
        this.f39059a = window;
        this.f39060b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.p(this.f39059a, this.f39060b);
    }
}
