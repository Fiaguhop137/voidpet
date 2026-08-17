package If;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1104f extends b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f5499i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f5500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f5501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f5502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f5503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C1104f f5504n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1104f f5506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5507h;

    /* JADX INFO: renamed from: If.f$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C1104f c1104f, long j10, boolean z10) {
            if (C1104f.f5504n == null) {
                C1104f.f5504n = new C1104f();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                c1104f.f5507h = Math.min(j10, c1104f.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                c1104f.f5507h = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c1104f.f5507h = c1104f.c();
            }
            long jY = c1104f.y(jNanoTime);
            C1104f c1104f2 = C1104f.f5504n;
            Intrinsics.c(c1104f2);
            while (c1104f2.f5506g != null) {
                C1104f c1104f3 = c1104f2.f5506g;
                Intrinsics.c(c1104f3);
                if (jY < c1104f3.y(jNanoTime)) {
                    break;
                }
                c1104f2 = c1104f2.f5506g;
                Intrinsics.c(c1104f2);
            }
            c1104f.f5506g = c1104f2.f5506g;
            c1104f2.f5506g = c1104f;
            if (c1104f2 == C1104f.f5504n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1104f c1104f) {
            for (C1104f c1104f2 = C1104f.f5504n; c1104f2 != null; c1104f2 = c1104f2.f5506g) {
                if (c1104f2.f5506g == c1104f) {
                    c1104f2.f5506g = c1104f.f5506g;
                    c1104f.f5506g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C1104f c() throws InterruptedException {
            C1104f c1104f = C1104f.f5504n;
            Intrinsics.c(c1104f);
            C1104f c1104f2 = c1104f.f5506g;
            if (c1104f2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C1104f.f5502l, TimeUnit.MILLISECONDS);
                C1104f c1104f3 = C1104f.f5504n;
                Intrinsics.c(c1104f3);
                if (c1104f3.f5506g != null || System.nanoTime() - jNanoTime < C1104f.f5503m) {
                    return null;
                }
                return C1104f.f5504n;
            }
            long jY = c1104f2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C1104f c1104f4 = C1104f.f5504n;
            Intrinsics.c(c1104f4);
            c1104f4.f5506g = c1104f2.f5506g;
            c1104f2.f5506g = null;
            c1104f2.f5505f = 2;
            return c1104f2;
        }

        public final Condition d() {
            return C1104f.f5501k;
        }

        public final ReentrantLock e() {
            return C1104f.f5500j;
        }
    }

    /* JADX INFO: renamed from: If.f$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = C1104f.f5499i.e();
                    reentrantLockE.lock();
                    try {
                        C1104f c1104fC = C1104f.f5499i.c();
                        if (c1104fC == C1104f.f5504n) {
                            a unused = C1104f.f5499i;
                            C1104f.f5504n = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f48228a;
                            reentrantLockE.unlock();
                            if (c1104fC != null) {
                                c1104fC.B();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockE.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: If.f$c */
    public static final class c implements Y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y f5509b;

        c(Y y10) {
            this.f5509b = y10;
        }

        @Override // If.Y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1104f C() {
            return C1104f.this;
        }

        @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1104f c1104f = C1104f.this;
            Y y10 = this.f5509b;
            c1104f.v();
            try {
                try {
                    y10.close();
                    Unit unit = Unit.f48228a;
                    if (c1104f.w()) {
                        throw c1104f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1104f.w()) {
                        throw e10;
                    }
                    throw c1104f.p(e10);
                }
            } catch (Throwable th) {
                c1104f.w();
                throw th;
            }
        }

        @Override // If.Y, java.io.Flushable
        public void flush() throws IOException {
            C1104f c1104f = C1104f.this;
            Y y10 = this.f5509b;
            c1104f.v();
            try {
                try {
                    y10.flush();
                    Unit unit = Unit.f48228a;
                    if (c1104f.w()) {
                        throw c1104f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1104f.w()) {
                        throw e10;
                    }
                    throw c1104f.p(e10);
                }
            } catch (Throwable th) {
                c1104f.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f5509b + ')';
        }

        @Override // If.Y
        public void w1(C1106h source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            AbstractC1103e.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                V v10 = source.f5512a;
                Intrinsics.c(v10);
                while (j11 < 65536) {
                    j11 += (long) (v10.f5467c - v10.f5466b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        v10 = v10.f5470f;
                        Intrinsics.c(v10);
                    }
                }
                C1104f c1104f = C1104f.this;
                Y y10 = this.f5509b;
                c1104f.v();
                try {
                    try {
                        y10.w1(source, j11);
                        Unit unit = Unit.f48228a;
                        if (c1104f.w()) {
                            throw c1104f.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!c1104f.w()) {
                            throw e10;
                        }
                        throw c1104f.p(e10);
                    }
                } catch (Throwable th) {
                    c1104f.w();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: If.f$d */
    public static final class d implements a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f5511b;

        d(a0 a0Var) {
            this.f5511b = a0Var;
        }

        @Override // If.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1104f C() {
            return C1104f.this;
        }

        @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1104f c1104f = C1104f.this;
            a0 a0Var = this.f5511b;
            c1104f.v();
            try {
                try {
                    a0Var.close();
                    Unit unit = Unit.f48228a;
                    if (c1104f.w()) {
                        throw c1104f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1104f.w()) {
                        throw e10;
                    }
                    throw c1104f.p(e10);
                }
            } catch (Throwable th) {
                c1104f.w();
                throw th;
            }
        }

        @Override // If.a0
        public long o0(C1106h sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C1104f c1104f = C1104f.this;
            a0 a0Var = this.f5511b;
            c1104f.v();
            try {
                try {
                    long jO0 = a0Var.o0(sink, j10);
                    if (c1104f.w()) {
                        throw c1104f.p(null);
                    }
                    return jO0;
                } catch (IOException e10) {
                    if (c1104f.w()) {
                        throw c1104f.p(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th) {
                c1104f.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f5511b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f5500j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f5501k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5502l = millis;
        f5503m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f5507h - j10;
    }

    public final a0 A(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    protected void B() {
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f5500j;
            reentrantLock.lock();
            try {
                if (this.f5505f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f5505f = 1;
                f5499i.f(this, jH, zE);
                Unit unit = Unit.f48228a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f5500j;
        reentrantLock.lock();
        try {
            int i10 = this.f5505f;
            this.f5505f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f5499i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Y z(Y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }
}
