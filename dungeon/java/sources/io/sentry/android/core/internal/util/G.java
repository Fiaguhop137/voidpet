package io.sentry.android.core.internal.util;

import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.C3636g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f45009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3636g0 f45010b;

    public /* synthetic */ G(H h10, C3636g0 c3636g0) {
        this.f45009a = h10;
        this.f45010b = c3636g0;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        H.e(this.f45009a, this.f45010b, window, frameMetrics, i10);
    }
}
