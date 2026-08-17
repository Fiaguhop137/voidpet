package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: renamed from: io.sentry.android.core.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3631e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3639i f44872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f44873b;

    public /* synthetic */ RunnableC3631e(C3639i c3639i, Activity activity) {
        this.f44872a = c3639i;
        this.f44873b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((FrameMetricsAggregator) this.f44872a.f44915a.a()).a(this.f44873b);
    }
}
