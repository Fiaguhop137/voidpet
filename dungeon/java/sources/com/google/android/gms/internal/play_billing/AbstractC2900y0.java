package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2900y0 extends A0 {
    public static E0 a(Object obj) {
        return new C0(obj);
    }

    public static E0 b(E0 e10, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return e10.isDone() ? e10 : J0.z(e10, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(E0 e10, InterfaceC2892w0 interfaceC2892w0, Executor executor) {
        e10.p(new RunnableC2896x0(e10, interfaceC2892w0), executor);
    }
}
