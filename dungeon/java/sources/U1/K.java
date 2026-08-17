package U1;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f12870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f12873d = new ThreadLocal();

    public K(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return S.a1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return S.a1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f12870a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) AbstractC1459a.e((Long) this.f12873d.get())).longValue();
                }
                this.f12871b = jLongValue - j10;
                notifyAll();
            }
            this.f12872c = j10;
            return j10 + this.f12871b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f12872c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f12872c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = jK / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 += (j12 + 1) * 8589934592L;
                if (j13 >= jK) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f12870a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f12872c;
        } catch (Throwable th) {
            throw th;
        }
        return j10 != -9223372036854775807L ? j10 + this.f12871b : d();
    }

    public synchronized long f() {
        return this.f12871b;
    }

    public synchronized boolean g() {
        return this.f12871b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f12870a = j10;
        this.f12871b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f12872c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) {
        try {
            AbstractC1459a.g(this.f12870a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f12873d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        AbstractC1459a.g(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
