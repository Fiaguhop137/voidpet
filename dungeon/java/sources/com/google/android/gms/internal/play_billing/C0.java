package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class C0 implements E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D0 f34428b = new D0(C0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34429a;

    C0(Object obj) {
        this.f34429a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f34429a;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f34429a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final void p(Runnable runnable, Executor executor) {
        AbstractC2895x.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f34428b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public final String toString() {
        Object obj = this.f34429a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }
}
