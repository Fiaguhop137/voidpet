package io.sentry;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3787t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3619a0 f46484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f46485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f46487d;

    /* JADX INFO: renamed from: io.sentry.t$a */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f46488a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f46489b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f46490c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f46491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f46492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f46493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Queue f46494g;

        public a(long j10, ILogger iLogger, String str, Queue queue) {
            this.f46491d = j10;
            this.f46493f = str;
            this.f46494g = queue;
            this.f46492e = iLogger;
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f46488a;
        }

        @Override // io.sentry.hints.g
        public void b() {
            this.f46494g.add(this.f46493f);
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f46489b = z10;
            this.f46490c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f46488a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f46489b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f46490c.await(this.f46491d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f46492e.b(EnumC3721i3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    AbstractC3787t(InterfaceC3619a0 interfaceC3619a0, ILogger iLogger, long j10, int i10) {
        this.f46484a = interfaceC3619a0;
        this.f46485b = iLogger;
        this.f46486c = j10;
        this.f46487d = c4.e(new C3702f(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f46485b;
            EnumC3721i3 enumC3721i3 = EnumC3721i3.DEBUG;
            iLogger.c(enumC3721i3, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new C3782s(this));
            if (fileArrListFiles == null) {
                this.f46485b.c(EnumC3721i3.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.f46485b.c(enumC3721i3, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f46487d.contains(absolutePath)) {
                        this.f46485b.c(EnumC3721i3.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.z zVarW = this.f46484a.w();
                        if (zVarW != null && zVarW.i(EnumC3727k.All)) {
                            this.f46485b.c(EnumC3721i3.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f46485b.c(EnumC3721i3.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.l.c(new a(this.f46486c, this.f46485b, absolutePath, this.f46487d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f46485b.c(EnumC3721i3.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.f46485b.a(EnumC3721i3.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(File file, H h10);
}
