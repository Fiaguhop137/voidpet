package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class P3 implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f34644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K3 f34645b = new O3(this);

    P3(L3 l10) {
        this.f34644a = new WeakReference(l10);
    }

    final boolean a(Object obj) {
        return this.f34645b.c(obj);
    }

    final boolean b(Throwable th) {
        L1 l10 = new L1(th);
        B0 b10 = K3.f34459f;
        K3 k10 = this.f34645b;
        if (!b10.d(k10, null, l10)) {
            return false;
        }
        K3.b(k10);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        L3 l10 = (L3) this.f34644a.get();
        boolean zCancel = this.f34645b.cancel(z10);
        if (!zCancel || l10 == null) {
            return zCancel;
        }
        l10.a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f34645b.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f34645b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34645b.f34461a instanceof R0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34645b.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final void p(Runnable runnable, Executor executor) {
        this.f34645b.p(runnable, executor);
    }

    public final String toString() {
        return this.f34645b.toString();
    }
}
