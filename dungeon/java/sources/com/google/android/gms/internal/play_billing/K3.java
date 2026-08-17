package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class K3 implements E0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f34457d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f34458e = Logger.getLogger(K3.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final B0 f34459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f34460g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f34461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile C2789a2 f34462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile I3 f34463c;

    static {
        B0 h10;
        try {
            h10 = new L2(AtomicReferenceFieldUpdater.newUpdater(I3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(I3.class, I3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(K3.class, I3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(K3.class, C2789a2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(K3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            h10 = new H3();
        }
        Throwable th2 = th;
        f34459f = h10;
        if (th2 != null) {
            f34458e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f34460g = new Object();
    }

    protected K3() {
    }

    static void b(K3 k10) {
        I3 i10;
        B0 b10;
        C2789a2 c2789a2;
        C2789a2 c2789a3;
        C2789a2 c2789a4;
        do {
            i10 = k10.f34463c;
            b10 = f34459f;
        } while (!b10.e(k10, i10, I3.f34447c));
        while (true) {
            c2789a2 = null;
            if (i10 == null) {
                break;
            }
            Thread thread = i10.f34448a;
            if (thread != null) {
                i10.f34448a = null;
                LockSupport.unpark(thread);
            }
            i10 = i10.f34449b;
        }
        do {
            c2789a3 = k10.f34462b;
        } while (!b10.c(k10, c2789a3, C2789a2.f34684d));
        while (true) {
            c2789a4 = c2789a2;
            c2789a2 = c2789a3;
            if (c2789a2 == null) {
                break;
            }
            c2789a3 = c2789a2.f34687c;
            c2789a2.f34687c = c2789a4;
        }
        while (c2789a4 != null) {
            Runnable runnable = c2789a4.f34685a;
            C2789a2 c2789a5 = c2789a4.f34687c;
            e(runnable, c2789a4.f34686b);
            c2789a4 = c2789a5;
        }
    }

    private final void d(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f34458e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void f(I3 i10) {
        i10.f34448a = null;
        while (true) {
            I3 i11 = this.f34463c;
            if (i11 != I3.f34447c) {
                I3 i12 = null;
                while (i11 != null) {
                    I3 i13 = i11.f34449b;
                    if (i11.f34448a != null) {
                        i12 = i11;
                    } else if (i12 != null) {
                        i12.f34449b = i13;
                        if (i12.f34448a == null) {
                        }
                    } else if (!f34459f.e(this, i11, i13)) {
                    }
                    i11 = i13;
                }
                return;
            }
            return;
        }
    }

    private static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof R0) {
            Throwable th = ((R0) obj).f34648a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof L1) {
            throw new ExecutionException(((L1) obj).f34467a);
        }
        if (obj == f34460g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(Object obj) {
        if (obj == null) {
            obj = f34460g;
        }
        if (!f34459f.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        R0 r10;
        Object obj = this.f34461a;
        if (obj == null) {
            if (f34457d) {
                r10 = new R0(z10, new CancellationException("Future.cancel() was called."));
            } else {
                r10 = z10 ? R0.f34646b : R0.f34647c;
            }
            if (f34459f.d(this, obj, r10)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f34461a;
        if (obj2 != null) {
            return g(obj2);
        }
        I3 i10 = this.f34463c;
        I3 i11 = I3.f34447c;
        if (i10 != i11) {
            I3 i12 = new I3();
            do {
                B0 b10 = f34459f;
                b10.a(i12, i10);
                if (b10.e(this, i10, i12)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(i12);
                            throw new InterruptedException();
                        }
                        obj = this.f34461a;
                    } while (!(obj != null));
                    return g(obj);
                }
                i10 = this.f34463c;
            } while (i10 != i11);
        }
        return g(this.f34461a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34461a;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            I3 i10 = this.f34463c;
            I3 i11 = I3.f34447c;
            if (i10 != i11) {
                I3 i12 = new I3();
                while (true) {
                    B0 b10 = f34459f;
                    b10.a(i12, i10);
                    if (b10.e(this, i10, i12)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(i12);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34461a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(i12);
                        break;
                    }
                    i10 = this.f34463c;
                    if (i10 == i11) {
                    }
                }
            }
            return g(this.f34461a);
        }
        while (nanos > 0) {
            Object obj3 = this.f34461a;
            if (obj3 != null) {
                return g(obj3);
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
            boolean z10 = jConvert == 0 || nanos2 > 1000;
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34461a instanceof R0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34461a != null;
    }

    @Override // com.google.android.gms.internal.play_billing.E0
    public final void p(Runnable runnable, Executor executor) {
        executor.getClass();
        C2789a2 c2789a2 = this.f34462b;
        C2789a2 c2789a3 = C2789a2.f34684d;
        if (c2789a2 != c2789a3) {
            C2789a2 c2789a4 = new C2789a2(runnable, executor);
            do {
                c2789a4.f34687c = c2789a2;
                if (f34459f.c(this, c2789a2, c2789a4)) {
                    return;
                } else {
                    c2789a2 = this.f34462b;
                }
            } while (c2789a2 != c2789a3);
        }
        e(runnable, executor);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f34461a instanceof R0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                d(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
