package io.sentry.android.core;

import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: renamed from: io.sentry.android.core.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3633f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3639i f44882a;

    public /* synthetic */ RunnableC3633f(C3639i c3639i) {
        this.f44882a = c3639i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((FrameMetricsAggregator) this.f44882a.f44915a.a()).e();
    }
}
