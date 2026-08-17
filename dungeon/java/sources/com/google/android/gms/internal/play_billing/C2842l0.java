package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2842l0 extends AbstractC2827i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f34749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f34750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f34751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f34752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f34753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f34754f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C2871r0());
        }
        try {
            f34751c = unsafe.objectFieldOffset(AbstractC2852n0.class.getDeclaredField("c"));
            f34750b = unsafe.objectFieldOffset(AbstractC2852n0.class.getDeclaredField("b"));
            f34752d = unsafe.objectFieldOffset(AbstractC2852n0.class.getDeclaredField("a"));
            f34753e = unsafe.objectFieldOffset(C2847m0.class.getDeclaredField("a"));
            f34754f = unsafe.objectFieldOffset(C2847m0.class.getDeclaredField("b"));
            f34749a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* synthetic */ C2842l0(AbstractC2876s0 abstractC2876s0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2812f0 a(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0) {
        C2812f0 c2812f1;
        do {
            c2812f1 = abstractC2852n0.f34790b;
            if (c2812f0 == c2812f1) {
                break;
            }
        } while (!e(abstractC2852n0, c2812f1, c2812f0));
        return c2812f1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final C2847m0 b(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0) {
        C2847m0 c2847m1;
        do {
            c2847m1 = abstractC2852n0.f34791c;
            if (c2847m0 == c2847m1) {
                break;
            }
        } while (!g(abstractC2852n0, c2847m1, c2847m0));
        return c2847m1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final void c(C2847m0 c2847m0, C2847m0 c2847m1) {
        f34749a.putObject(c2847m0, f34754f, c2847m1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    public final void d(C2847m0 c2847m0, Thread thread) {
        f34749a.putObject(c2847m0, f34753e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean e(AbstractC2852n0 abstractC2852n0, C2812f0 c2812f0, C2812f0 c2812f1) {
        return AbstractC2867q0.a(f34749a, abstractC2852n0, f34750b, c2812f0, c2812f1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean f(AbstractC2852n0 abstractC2852n0, Object obj, Object obj2) {
        return AbstractC2867q0.a(f34749a, abstractC2852n0, f34752d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2827i0
    final boolean g(AbstractC2852n0 abstractC2852n0, C2847m0 c2847m0, C2847m0 c2847m1) {
        return AbstractC2867q0.a(f34749a, abstractC2852n0, f34751c, c2847m0, c2847m1);
    }
}
