package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f45079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f45080b;

    public /* synthetic */ z(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        this.f45079a = atomicBoolean;
        this.f45080b = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i10) {
        B.b(this.f45079a, this.f45080b, i10);
    }
}
