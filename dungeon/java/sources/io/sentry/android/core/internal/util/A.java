package io.sentry.android.core.internal.util;

import android.graphics.Canvas;
import android.view.View;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f44998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Canvas f44999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ILogger f45000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f45001d;

    public /* synthetic */ A(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        this.f44998a = view;
        this.f44999b = canvas;
        this.f45000c = iLogger;
        this.f45001d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.a(this.f44998a, this.f44999b, this.f45000c, this.f45001d);
    }
}
