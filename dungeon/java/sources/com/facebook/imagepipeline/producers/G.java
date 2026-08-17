package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f28999b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29002e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f29000c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f29001d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p025b6.k f29003f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f29004g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f29005h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f29006i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f29007j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29010a;

        static {
            int[] iArr = new int[f.values().length];
            f29010a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29010a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29010a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29010a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(p025b6.k kVar, int i10);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f29011a;

        static ScheduledExecutorService a() {
            if (f29011a == null) {
                f29011a = Executors.newSingleThreadScheduledExecutor();
            }
            return f29011a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f28998a = executor;
        this.f28999b = dVar;
        this.f29002e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        p025b6.k kVar;
        int i10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            kVar = this.f29003f;
            i10 = this.f29004g;
            this.f29003f = null;
            this.f29004g = 0;
            this.f29005h = f.RUNNING;
            this.f29007j = jUptimeMillis;
        }
        try {
            if (i(kVar, i10)) {
                this.f28999b.a(kVar, i10);
            }
        } finally {
            p025b6.k.c(kVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable runnableA = p043c6.a.a(this.f29001d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(runnableA, j10, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f29005h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f29007j + ((long) this.f29002e), jUptimeMillis);
                    this.f29006i = jUptimeMillis;
                    this.f29005h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f29005h = f.IDLE;
                    jMax = 0;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(p025b6.k kVar, int i10) {
        return AbstractC2171c.d(i10) || AbstractC2171c.m(i10, 4) || p025b6.k.F(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f28998a.execute(p043c6.a.a(this.f29000c, "JobScheduler_submitJob"));
    }

    public void c() {
        p025b6.k kVar;
        synchronized (this) {
            kVar = this.f29003f;
            this.f29003f = null;
            this.f29004g = 0;
        }
        p025b6.k.c(kVar);
    }

    public synchronized long f() {
        return this.f29007j - this.f29006i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z10 = false;
                if (!i(this.f29003f, this.f29004g)) {
                    return false;
                }
                int i10 = c.f29010a[this.f29005h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f29005h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f29007j + ((long) this.f29002e), jUptimeMillis);
                    this.f29006i = jUptimeMillis;
                    this.f29005h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(p025b6.k kVar, int i10) {
        p025b6.k kVar2;
        if (!i(kVar, i10)) {
            return false;
        }
        synchronized (this) {
            kVar2 = this.f29003f;
            this.f29003f = p025b6.k.b(kVar);
            this.f29004g = i10;
        }
        p025b6.k.c(kVar2);
        return true;
    }
}
