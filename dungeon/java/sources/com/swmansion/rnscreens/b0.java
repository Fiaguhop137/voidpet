package com.swmansion.rnscreens;

import androidx.core.view.c1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f39045b;

    public /* synthetic */ b0(boolean z10, c1 c1Var) {
        this.f39044a = z10;
        this.f39045b = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0.n(this.f39044a, this.f39045b);
    }
}
