package io.sentry.android.core;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenshotEventProcessor f44800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f44801b;

    public /* synthetic */ U0(ScreenshotEventProcessor screenshotEventProcessor, Bitmap bitmap) {
        this.f44800a = screenshotEventProcessor;
        this.f44801b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return io.sentry.android.core.internal.util.B.d(this.f44801b, this.f44800a.f44745a.getLogger());
    }
}
