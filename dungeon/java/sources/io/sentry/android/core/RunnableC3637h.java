package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: renamed from: io.sentry.android.core.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3637h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3639i f44912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f44913b;

    public /* synthetic */ RunnableC3637h(C3639i c3639i, Activity activity) {
        this.f44912a = c3639i;
        this.f44913b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((FrameMetricsAggregator) this.f44912a.f44915a.a()).c(this.f44913b);
    }
}
