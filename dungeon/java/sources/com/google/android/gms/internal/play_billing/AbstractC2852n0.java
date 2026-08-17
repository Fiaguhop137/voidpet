package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2852n0 extends K0 implements E0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f34785d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final D0 f34786e = new D0(AbstractC2822h0.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f34787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC2827i0 f34788g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f34789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile C2812f0 f34790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile C2847m0 f34791c;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        AbstractC2827i0 c2837k0;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f34787f = z10;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                c2837k0 = new C2842l0(null);
            } catch (Error | Exception e10) {
                try {
                    c2837k0 = new C2832j0(null);
                    th = null;
                    th2 = e10;
                } catch (Error | Exception e11) {
                    th = e11;
                    th2 = e10;
                    c2837k0 = new C2837k0(null);
                }
            }
        } else {
            try {
                c2837k0 = new C2832j0(null);
            } catch (NoClassDefFoundError unused2) {
                c2837k0 = new C2837k0(null);
            }
        }
        th = null;
        th2 = null;
        f34788g = c2837k0;
        if (th != null) {
            D0 d10 = f34786e;
            Logger loggerA = d10.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            d10.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    AbstractC2852n0() {
    }

    private final void b(C2847m0 c2847m0) {
        c2847m0.f34762a = null;
        while (true) {
            C2847m0 c2847m1 = this.f34791c;
            if (c2847m1 != C2847m0.f34761c) {
                C2847m0 c2847m2 = null;
                while (c2847m1 != null) {
                    C2847m0 c2847m3 = c2847m1.f34763b;
                    if (c2847m1.f34762a != null) {
                        c2847m2 = c2847m1;
                    } else if (c2847m2 != null) {
                        c2847m2.f34763b = c2847m3;
                        if (c2847m2.f34762a == null) {
                        }
                    } else if (!f34788g.g(this, c2847m1, c2847m3)) {
                    }
                    c2847m1 = c2847m3;
                }
                return;
            }
            return;
        }
    }

    static boolean i(AbstractC2852n0 abstractC2852n0, Object obj, Object obj2) {
        return f34788g.f(abstractC2852n0, obj, obj2);
    }

    final C2812f0 c(C2812f0 c2812f0) {
        return f34788g.a(this, c2812f0);
    }

    final Object d() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f34789a;
        if ((obj2 != null) && AbstractC2822h0.q(obj2)) {
            return AbstractC2822h0.k(obj2);
        }
        C2847m0 c2847m0 = this.f34791c;
        if (c2847m0 != C2847m0.f34761c) {
            C2847m0 c2847m1 = new C2847m0();
            do {
                AbstractC2827i0 abstractC2827i0 = f34788g;
                abstractC2827i0.c(c2847m1, c2847m0);
                if (abstractC2827i0.g(this, c2847m0, c2847m1)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(c2847m1);
                            throw new InterruptedException();
                        }
                        obj = this.f34789a;
                    } while (!((obj != null) & AbstractC2822h0.q(obj)));
                    return AbstractC2822h0.k(obj);
                }
                c2847m0 = this.f34791c;
            } while (c2847m0 != C2847m0.f34761c);
        }
        Object obj3 = this.f34789a;
        Objects.requireNonNull(obj3);
        return AbstractC2822h0.k(obj3);
    }

    final Object e(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34789a;
        boolean z10 = true;
        if ((obj != null) && AbstractC2822h0.q(obj)) {
            return AbstractC2822h0.k(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2847m0 c2847m0 = this.f34791c;
            if (c2847m0 != C2847m0.f34761c) {
                C2847m0 c2847m1 = new C2847m0();
                while (true) {
                    AbstractC2827i0 abstractC2827i0 = f34788g;
                    abstractC2827i0.c(c2847m1, c2847m0);
                    if (abstractC2827i0.g(this, c2847m0, c2847m1)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(c2847m1);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34789a;
                            if ((obj2 != null) && AbstractC2822h0.q(obj2)) {
                                return AbstractC2822h0.k(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(c2847m1);
                        break;
                    }
                    c2847m0 = this.f34791c;
                    if (c2847m0 == C2847m0.f34761c) {
                    }
                }
            }
            Object obj3 = this.f34789a;
            Objects.requireNonNull(obj3);
            return AbstractC2822h0.k(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f34789a;
            if ((obj4 != null) && AbstractC2822h0.q(obj4)) {
                return AbstractC2822h0.k(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    final void g() {
        for (C2847m0 c2847m0B = f34788g.b(this, C2847m0.f34761c); c2847m0B != null; c2847m0B = c2847m0B.f34763b) {
            Thread thread = c2847m0B.f34762a;
            if (thread != null) {
                c2847m0B.f34762a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean h(C2812f0 c2812f0, C2812f0 c2812f1) {
        return f34788g.e(this, c2812f0, c2812f1);
    }
}
