package io.sentry.hints;

import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f45888a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f45890c;

    public d(long j10, ILogger iLogger) {
        this.f45889b = j10;
        this.f45890c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void e() {
        this.f45888a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean g() {
        try {
            return this.f45888a.await(this.f45889b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f45890c.b(EnumC3721i3.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
