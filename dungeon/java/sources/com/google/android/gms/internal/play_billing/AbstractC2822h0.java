package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2822h0 extends AbstractC2852n0 {
    protected AbstractC2822h0() {
    }

    static Object k(Object obj) throws ExecutionException {
        if (obj instanceof C2797c0) {
            Throwable th = ((C2797c0) obj).f34696b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C2807e0) {
            throw new ExecutionException(((C2807e0) obj).f34702a);
        }
        if (obj == AbstractC2852n0.f34785d) {
            return null;
        }
        return obj;
    }

    static boolean q(Object obj) {
        return !(obj instanceof RunnableC2802d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(E0 e10) {
        Throwable thA;
        if (e10 instanceof InterfaceC2817g0) {
            Object c2797c0 = ((AbstractC2822h0) e10).f34789a;
            if (c2797c0 instanceof C2797c0) {
                C2797c0 c2797c1 = (C2797c0) c2797c0;
                if (c2797c1.f34695a) {
                    Throwable th = c2797c1.f34696b;
                    c2797c0 = th != null ? new C2797c0(false, th) : C2797c0.f34694d;
                }
            }
            Objects.requireNonNull(c2797c0);
            return c2797c0;
        }
        if ((e10 instanceof K0) && (thA = ((K0) e10).a()) != null) {
            return new C2807e0(thA);
        }
        boolean zIsCancelled = e10.isCancelled();
        if ((!AbstractC2852n0.f34787f) && zIsCancelled) {
            C2797c0 c2797c2 = C2797c0.f34694d;
            Objects.requireNonNull(c2797c2);
            return c2797c2;
        }
        try {
            Object objU = u(e10);
            if (!zIsCancelled) {
                return objU == null ? AbstractC2852n0.f34785d : objU;
            }
            return new C2797c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(e10)));
        } catch (Error | Exception e11) {
            return new C2807e0(e11);
        } catch (CancellationException e12) {
            return !zIsCancelled ? new C2807e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(e10)), e12)) : new C2797c0(false, e12);
        } catch (ExecutionException e13) {
            return zIsCancelled ? new C2797c0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(e10)), e13)) : new C2807e0(e13.getCause());
        }
    }

    private static Object u(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void v(StringBuilder sb2) {
        try {
            Object objU = u(this);
            sb2.append("SUCCESS, result=[");
            if (objU == null) {
                sb2.append("null");
            } else if (objU == this) {
                sb2.append("this future");
            } else {
                sb2.append(objU.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objU)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(AbstractC2822h0 abstractC2822h0, boolean z10) {
        C2812f0 c2812f0 = null;
        while (true) {
            abstractC2822h0.g();
            abstractC2822h0.n();
            C2812f0 c2812f1 = c2812f0;
            C2812f0 c2812f0C = abstractC2822h0.c(C2812f0.f34707d);
            C2812f0 c2812f2 = c2812f1;
            while (c2812f0C != null) {
                C2812f0 c2812f3 = c2812f0C.f34710c;
                c2812f0C.f34710c = c2812f2;
                c2812f2 = c2812f0C;
                c2812f0C = c2812f3;
            }
            while (c2812f2 != null) {
                Runnable runnable = c2812f2.f34708a;
                C2812f0 c2812f4 = c2812f2.f34710c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC2802d0) {
                    RunnableC2802d0 runnableC2802d0 = (RunnableC2802d0) runnable2;
                    abstractC2822h0 = runnableC2802d0.f34699a;
                    if (abstractC2822h0.f34789a == runnableC2802d0 && AbstractC2852n0.i(abstractC2822h0, runnableC2802d0, t(runnableC2802d0.f34700b))) {
                        c2812f0 = c2812f4;
                    }
                } else {
                    Executor executor = c2812f2.f34709b;
                    Objects.requireNonNull(executor);
                    x(runnable2, executor);
                }
                c2812f2 = c2812f4;
            }
            return;
        }
    }

    private static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            AbstractC2852n0.f34786e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    protected final Throwable a() {
        if (!(this instanceof InterfaceC2817g0)) {
            return null;
        }
        Object obj = this.f34789a;
        if (obj instanceof C2807e0) {
            return ((C2807e0) obj).f34702a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C2797c0 c2797c0;
        Object obj = this.f34789a;
        if (!(obj instanceof RunnableC2802d0) && !(obj == null)) {
            return false;
        }
        if (AbstractC2852n0.f34787f) {
            c2797c0 = new C2797c0(z10, new CancellationException("Future.cancel() was called."));
        } else {
            c2797c0 = z10 ? C2797c0.f34693c : C2797c0.f34694d;
            Objects.requireNonNull(c2797c0);
        }
        AbstractC2822h0 abstractC2822h0 = this;
        boolean z11 = false;
        while (true) {
            if (AbstractC2852n0.i(abstractC2822h0, obj, c2797c0)) {
                w(abstractC2822h0, z10);
                if (obj instanceof RunnableC2802d0) {
                    E0 e10 = ((RunnableC2802d0) obj).f34700b;
                    if (e10 instanceof InterfaceC2817g0) {
                        abstractC2822h0 = (AbstractC2822h0) e10;
                        obj = abstractC2822h0.f34789a;
                        if (!(obj == null) && !(obj instanceof RunnableC2802d0)) {
                            return true;
                        }
                        z11 = true;
                    } else {
                        e10.cancel(z10);
                    }
                }
                return true;
            }
            obj = abstractC2822h0.f34789a;
            if (q(obj)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return e(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34789a instanceof C2797c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f34789a;
        return (obj != null) & q(obj);
    }

    protected abstract String l();

    protected abstract void n();

    @Override // com.google.android.gms.internal.play_billing.E0
    public final void p(Runnable runnable, Executor executor) {
        C2812f0 c2812f0;
        AbstractC2895x.c(executor, "Executor was null.");
        if (!isDone() && (c2812f0 = this.f34790b) != C2812f0.f34707d) {
            C2812f0 c2812f1 = new C2812f0(runnable, executor);
            do {
                c2812f1.f34710c = c2812f0;
                if (h(c2812f0, c2812f1)) {
                    return;
                } else {
                    c2812f0 = this.f34790b;
                }
            } while (c2812f0 != C2812f0.f34707d);
        }
        x(runnable, executor);
    }

    protected final boolean r(Throwable th) {
        if (!AbstractC2852n0.i(this, null, new C2807e0(th))) {
            return false;
        }
        w(this, false);
        return true;
    }

    protected final boolean s(E0 e10) {
        C2807e0 c2807e0;
        Object obj = this.f34789a;
        if (obj == null) {
            if (e10.isDone()) {
                if (!AbstractC2852n0.i(this, null, t(e10))) {
                    return false;
                }
                w(this, false);
                return true;
            }
            RunnableC2802d0 runnableC2802d0 = new RunnableC2802d0(this, e10);
            if (AbstractC2852n0.i(this, null, runnableC2802d0)) {
                try {
                    e10.p(runnableC2802d0, EnumC2880t0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c2807e0 = new C2807e0(th);
                    } catch (Error | Exception unused) {
                        c2807e0 = C2807e0.f34701b;
                    }
                    AbstractC2852n0.i(this, runnableC2802d0, c2807e0);
                }
                return true;
            }
            obj = this.f34789a;
        }
        if (obj instanceof C2797c0) {
            e10.cancel(((C2797c0) obj).f34695a);
        }
        return false;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f34789a instanceof C2797c0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            v(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f34789a;
            if (obj instanceof RunnableC2802d0) {
                sb2.append(", setFuture=[");
                E0 e10 = ((RunnableC2802d0) obj).f34700b;
                try {
                    if (e10 == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(e10);
                    }
                } catch (Throwable th) {
                    F0.a(th);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = A.a(l());
                } catch (Throwable th2) {
                    F0.a(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                v(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
