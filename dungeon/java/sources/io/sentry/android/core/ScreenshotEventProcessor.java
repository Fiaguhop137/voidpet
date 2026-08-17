package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.C3682b;
import io.sentry.EnumC3721i3;
import io.sentry.V2;
import io.sentry.android.core.internal.util.C3648h;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f44745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636g0 f44746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.q f44747c = new io.sentry.android.core.internal.util.q(C3648h.b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C3636g0 c3636g0) {
        this.f44745a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f44746b = (C3636g0) io.sentry.util.w.c(c3636g0, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.n.a("Screenshot");
        }
    }

    @Override // io.sentry.C
    public V2 b(V2 v10, io.sentry.H h10) {
        Bitmap bitmapC;
        if (v10.z0()) {
            if (!this.f44745a.isAttachScreenshot()) {
                this.f44745a.getLogger().c(EnumC3721i3.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return v10;
            }
            Activity activityB = C3664q0.c().b();
            if (activityB != null && !io.sentry.util.l.g(h10)) {
                boolean zA = this.f44747c.a();
                this.f44745a.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapC = io.sentry.android.core.internal.util.B.c(activityB, this.f44745a.getThreadChecker(), this.f44745a.getLogger(), this.f44746b)) != null) {
                    h10.n(C3682b.a(new U0(this, bitmapC), "screenshot.png", "image/png", false));
                    h10.l("android:activity", activityB);
                }
            }
        }
        return v10;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E c(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}
