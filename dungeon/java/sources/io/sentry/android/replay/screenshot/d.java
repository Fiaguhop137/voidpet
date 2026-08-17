package io.sentry.android.replay.screenshot;

import android.view.PixelCopy;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f45507a;

    public /* synthetic */ d(e eVar) {
        this.f45507a = eVar;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i10) {
        e.k(this.f45507a, i10);
    }
}
