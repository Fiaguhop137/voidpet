package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class G0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    J0 f34439a;

    G0(J0 j10) {
        this.f34439a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0 e10;
        J0 j10 = this.f34439a;
        if (j10 == null || (e10 = j10.f34453h) == null) {
            return;
        }
        this.f34439a = null;
        if (e10.isDone()) {
            j10.s(e10);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = j10.f34454i;
            j10.f34454i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    j10.r(new H0(str, null));
                    throw th;
                }
            }
            j10.r(new H0(str + ": " + e10.toString(), null));
            e10.cancel(true);
        } catch (Throwable th2) {
            e10.cancel(true);
            throw th2;
        }
    }
}
