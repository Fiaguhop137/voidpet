package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class L2 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f34468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f34469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f34470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f34471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f34472e;

    L2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f34468a = atomicReferenceFieldUpdater;
        this.f34469b = atomicReferenceFieldUpdater2;
        this.f34470c = atomicReferenceFieldUpdater3;
        this.f34471d = atomicReferenceFieldUpdater4;
        this.f34472e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final void a(I3 i10, I3 i11) {
        this.f34469b.lazySet(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final void b(I3 i10, Thread thread) {
        this.f34468a.lazySet(i10, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean c(K3 k10, C2789a2 c2789a2, C2789a2 c2789a3) {
        return AbstractC2869q2.a(this.f34471d, k10, c2789a2, c2789a3);
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean d(K3 k10, Object obj, Object obj2) {
        return AbstractC2869q2.a(this.f34472e, k10, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean e(K3 k10, I3 i10, I3 i11) {
        return AbstractC2869q2.a(this.f34470c, k10, i10, i11);
    }
}
