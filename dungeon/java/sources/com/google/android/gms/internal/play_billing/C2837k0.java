package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2837k0 extends AbstractC2827i0 {
    /* synthetic */ C2837k0(AbstractC2876s0 abstractC2876s0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2812f0 a(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0) {
        C2812f0 c2812f1;
        synchronized (abstractC2852n0) {
            try {
                c2812f1 = abstractC2852n0.f34790b;
                if (c2812f1 != c2812f0) {
                    abstractC2852n0.f34790b = c2812f0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2812f1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2847m0 b(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0) {
        C2847m0 c2847m1;
        synchronized (abstractC2852n0) {
            try {
                c2847m1 = abstractC2852n0.f34791c;
                if (c2847m1 != c2847m0) {
                    abstractC2852n0.f34791c = c2847m0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2847m1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final void c(C2847m0 c2847m0, C2847m0 c2847m1) {
        c2847m0.f34763b = c2847m1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    public final void d(C2847m0 c2847m0, Thread thread) {
        c2847m0.f34762a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean e(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0, C2812f0 c2812f1) {
        synchronized (abstractC2852n0) {
            try {
                if (abstractC2852n0.f34790b != c2812f0) {
                    return false;
                }
                abstractC2852n0.f34790b = c2812f1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean f(AbstractC2852n0 abstractC2852n0, Object obj, Object obj2) {
        synchronized (abstractC2852n0) {
            try {
                if (abstractC2852n0.f34789a != obj) {
                    return false;
                }
                abstractC2852n0.f34789a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean g(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0, C2847m0 c2847m1) {
        synchronized (abstractC2852n0) {
            try {
                if (abstractC2852n0.f34791c != c2847m0) {
                    return false;
                }
                abstractC2852n0.f34791c = c2847m1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
