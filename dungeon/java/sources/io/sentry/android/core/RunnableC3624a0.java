package io.sentry.android.core;

import io.sentry.ILogger;

/* JADX INFO: renamed from: io.sentry.android.core.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC3624a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3628c0 f44827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILogger f44828b;

    public /* synthetic */ RunnableC3624a0(C3628c0 c3628c0, ILogger iLogger) {
        this.f44827a = c3628c0;
        this.f44828b = iLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44827a.e(this.f44828b);
    }
}
