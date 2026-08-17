package io.sentry.android.replay.screenshot;

import android.view.PixelCopy;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f45523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45524b;

    public /* synthetic */ f(j jVar, View view) {
        this.f45523a = jVar;
        this.f45524b = view;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i10) {
        j.n(this.f45523a, this.f45524b, i10);
    }
}
