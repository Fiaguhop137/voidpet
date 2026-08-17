package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2802d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC2822h0 f34699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final E0 f34700b;

    RunnableC2802d0(AbstractC2822h0 abstractC2822h0, E0 e10) {
        this.f34699a = abstractC2822h0;
        this.f34700b = e10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34699a.f34789a != this) {
            return;
        }
        if (AbstractC2852n0.i(this.f34699a, this, AbstractC2822h0.t(this.f34700b))) {
            AbstractC2822h0.w(this.f34699a, false);
        }
    }
}
