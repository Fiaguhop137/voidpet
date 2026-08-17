package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC2581r0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3077x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f35979d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3 f35980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f35981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f35982c;

    AbstractC3077x(C3 c10) {
        p170j8.r.l(c10);
        this.f35980a = c10;
        this.f35981b = new RunnableC3070w(this, c10);
    }

    private final Handler f() {
        Handler handler;
        if (f35979d != null) {
            return f35979d;
        }
        synchronized (AbstractC3077x.class) {
            try {
                if (f35979d == null) {
                    f35979d = new HandlerC2581r0(this.f35980a.d().getMainLooper());
                }
                handler = f35979d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            C3 c10 = this.f35980a;
            this.f35982c = c10.e().a();
            if (f().postDelayed(this.f35981b, j10)) {
                return;
            }
            c10.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f35982c != 0;
    }

    final void d() {
        this.f35982c = 0L;
        f().removeCallbacks(this.f35981b);
    }

    final /* synthetic */ void e(long j10) {
        this.f35982c = 0L;
    }
}
