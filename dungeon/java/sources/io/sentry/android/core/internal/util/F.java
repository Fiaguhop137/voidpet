package io.sentry.android.core.internal.util;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f45007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILogger f45008b;

    public /* synthetic */ F(H h10, ILogger iLogger) {
        this.f45007a = h10;
        this.f45008b = iLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H.a(this.f45007a, this.f45008b);
    }
}
