package L2;

import U1.F;
import U1.K;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6305b;

    private g(long j10, long j11) {
        this.f6304a = j10;
        this.f6305b = j11;
    }

    static g d(F f10, long j10, K k10) {
        long jE = e(f10, j10);
        return new g(jE, k10.b(jE));
    }

    static long e(F f10, long j10) {
        long jL = f10.L();
        if ((128 & jL) != 0) {
            return 8589934591L & ((((jL & 1) << 32) | f10.N()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f6304a + ", playbackPositionUs= " + this.f6305b + " }";
    }
}
