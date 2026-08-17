package p088ef;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC3296l0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U f40801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f40802j;

    static {
        Long l10;
        U u10 = new U();
        f40801i = u10;
        AbstractC3294k0.z0(u10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f40802j = timeUnit.toNanos(l10.longValue());
    }

    private U() {
    }

    private final synchronized void E1() {
        if (J1()) {
            debugStatus = 3;
            s1();
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread G1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f40801i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean H1() {
        return debugStatus == 4;
    }

    private final boolean J1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean K1() {
        if (J1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void N1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p088ef.AbstractC3298m0
    protected Thread T0() {
        Thread thread = _thread;
        return thread == null ? G1() : thread;
    }

    @Override // p088ef.AbstractC3298m0
    protected void V0(long j10, AbstractC3296l0.c cVar) {
        N1();
    }

    @Override // p088ef.AbstractC3296l0
    public void d1(Runnable runnable) {
        if (H1()) {
            N1();
        }
        super.d1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zQ1;
        Y0.f40805a.d(this);
        AbstractC3277c.a();
        try {
            if (!K1()) {
                if (zQ1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jJ0 = J0();
                if (jJ0 == Long.MAX_VALUE) {
                    AbstractC3277c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f40802j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zQ1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jJ0 = e.j(jJ0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jJ0 > 0) {
                    if (J1()) {
                        if (zQ1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        AbstractC3277c.a();
                        LockSupport.parkNanos(this, jJ0);
                    }
                }
            }
        } finally {
            _thread = null;
            E1();
            AbstractC3277c.a();
            if (!q1()) {
                T0();
            }
        }
    }

    @Override // p088ef.AbstractC3296l0, p088ef.AbstractC3294k0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p088ef.AbstractC3296l0, p088ef.Y
    public InterfaceC3286g0 t(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return y1(j10, runnable);
    }

    @Override // p088ef.K
    public String toString() {
        return "DefaultExecutor";
    }
}
