package If;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1111m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f5534d = e0.b();

    /* JADX INFO: renamed from: If.m$a */
    private static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1111m f5535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f5536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f5537c;

        public a(AbstractC1111m fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f5535a = fileHandle;
            this.f5536b = j10;
        }

        @Override // If.a0
        public b0 C() {
            return b0.f5484e;
        }

        @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5537c) {
                return;
            }
            this.f5537c = true;
            ReentrantLock reentrantLockE = this.f5535a.e();
            reentrantLockE.lock();
            try {
                this.f5535a.f5533c--;
                if (this.f5535a.f5533c == 0 && this.f5535a.f5532b) {
                    Unit unit = Unit.f48228a;
                    reentrantLockE.unlock();
                    this.f5535a.f();
                    return;
                }
                reentrantLockE.unlock();
            } catch (Throwable th) {
                reentrantLockE.unlock();
                throw th;
            }
        }

        @Override // If.a0
        public long o0(C1106h sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f5537c) {
                throw new IllegalStateException("closed");
            }
            long jI = this.f5535a.i(this.f5536b, sink, j10);
            if (jI != -1) {
                this.f5536b += jI;
            }
            return jI;
        }
    }

    public AbstractC1111m(boolean z10) {
        this.f5531a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i(long j10, C1106h c1106h, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            V vS = c1106h.S(1);
            byte[] bArr = vS.f5465a;
            int i10 = vS.f5467c;
            int iG = g(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iG == -1) {
                if (vS.f5466b == vS.f5467c) {
                    c1106h.f5512a = vS.b();
                    W.b(vS);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            vS.f5467c += iG;
            long j14 = iG;
            j13 += j14;
            c1106h.K(c1106h.size() + j14);
        }
        return j13 - j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f5534d;
        reentrantLock.lock();
        try {
            if (this.f5532b) {
                reentrantLock.unlock();
                return;
            }
            this.f5532b = true;
            if (this.f5533c != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.f48228a;
            reentrantLock.unlock();
            f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock e() {
        return this.f5534d;
    }

    protected abstract void f();

    protected abstract int g(long j10, byte[] bArr, int i10, int i11);

    protected abstract long h();

    public final a0 k(long j10) {
        ReentrantLock reentrantLock = this.f5534d;
        reentrantLock.lock();
        try {
            if (this.f5532b) {
                throw new IllegalStateException("closed");
            }
            this.f5533c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f5534d;
        reentrantLock.lock();
        try {
            if (this.f5532b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f48228a;
            reentrantLock.unlock();
            return h();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
