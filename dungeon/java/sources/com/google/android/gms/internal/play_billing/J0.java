package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class J0 extends AbstractC2884u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private E0 f34453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture f34454i;

    private J0(E0 e10) {
        this.f34453h = e10;
    }

    static E0 z(E0 e10, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        J0 j11 = new J0(e10);
        G0 g10 = new G0(j11);
        j11.f34454i = scheduledExecutorService.schedule(g10, 28500L, timeUnit);
        e10.p(g10, EnumC2880t0.INSTANCE);
        return j11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2822h0
    protected final String l() {
        E0 e10 = this.f34453h;
        ScheduledFuture scheduledFuture = this.f34454i;
        if (e10 == null) {
            return null;
        }
        String str = "inputFuture=[" + e10.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2822h0
    protected final void n() {
        E0 e10 = this.f34453h;
        if ((this.f34789a instanceof C2797c0) & (e10 != null)) {
            Object obj = this.f34789a;
            e10.cancel((obj instanceof C2797c0) && ((C2797c0) obj).f34695a);
        }
        ScheduledFuture scheduledFuture = this.f34454i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f34453h = null;
        this.f34454i = null;
    }
}
