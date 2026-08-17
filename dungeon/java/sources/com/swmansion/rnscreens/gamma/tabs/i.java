package com.swmansion.rnscreens.gamma.tabs;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f39108a;

    public /* synthetic */ i(m mVar) {
        this.f39108a = mVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        m.v(this.f39108a, j10);
    }
}
