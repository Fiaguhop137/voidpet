package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2832j0 extends AbstractC2827i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34736a = AtomicReferenceFieldUpdater.newUpdater(C2847m0.class, Thread.class, "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34737b = AtomicReferenceFieldUpdater.newUpdater(C2847m0.class, C2847m0.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34738c = AtomicReferenceFieldUpdater.newUpdater(AbstractC2852n0.class, C2847m0.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34739d = AtomicReferenceFieldUpdater.newUpdater(AbstractC2852n0.class, C2812f0.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34740e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2852n0.class, Object.class, "a");

    /* synthetic */ C2832j0(AbstractC2876s0 abstractC2876s0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2812f0 a(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0) {
        return (C2812f0) f34739d.getAndSet(abstractC2852n0, c2812f0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2847m0 b(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0) {
        return (C2847m0) f34738c.getAndSet(abstractC2852n0, c2847m0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final void c(C2847m0 c2847m0, C2847m0 c2847m1) {
        f34737b.lazySet(c2847m0, c2847m1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    public final void d(C2847m0 c2847m0, Thread thread) {
        f34736a.lazySet(c2847m0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean e(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0, C2812f0 c2812f1) {
        return AbstractC2857o0.a(f34739d, abstractC2852n0, c2812f0, c2812f1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean f(AbstractC2852n0 abstractC2852n0, Object obj, Object obj2) {
        return AbstractC2857o0.a(f34740e, abstractC2852n0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean g(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0, C2847m0 c2847m1) {
        return AbstractC2857o0.a(f34738c, abstractC2852n0, c2847m0, c2847m1);
    }
}
