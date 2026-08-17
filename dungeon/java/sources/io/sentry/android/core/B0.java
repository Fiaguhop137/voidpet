package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class B0 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.Q f44625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f44626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f44627d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f44628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f44629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f44630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f44631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f44632e;

        public a(long j10, ILogger iLogger) {
            reset();
            this.f44631d = j10;
            this.f44632e = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f44628a;
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f44629b = z10;
            this.f44630c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f44628a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f44629b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f44630c.await(this.f44631d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f44632e.b(EnumC3721i3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.k
        public void reset() {
            this.f44630c = new CountDownLatch(1);
            this.f44628a = false;
            this.f44629b = false;
        }
    }

    B0(String str, io.sentry.Q q10, ILogger iLogger, long j10) {
        super(str);
        this.f44624a = str;
        this.f44625b = (io.sentry.Q) io.sentry.util.w.c(q10, "Envelope sender is required.");
        this.f44626c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
        this.f44627d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f44626c.c(EnumC3721i3.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f44624a, str);
        io.sentry.H hC = io.sentry.util.l.c(new a(this.f44627d, this.f44626c));
        this.f44625b.a(this.f44624a + File.separator + str, hC);
    }
}
