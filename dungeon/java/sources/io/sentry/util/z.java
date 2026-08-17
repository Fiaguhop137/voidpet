package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicLong f46590c = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f46591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46592b;

    public z() {
        this(a(), a());
    }

    public z(long j10, long j11) {
        d(j10, j11);
    }

    private static long a() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f46590c;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    public void b(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long j10 = (this.f46591a * 6364136223846793005L) + this.f46592b;
            this.f46591a = j10;
            bArr[i10] = (byte) ((((j10 >>> 22) ^ j10) >>> ((int) ((j10 >>> 61) + 22))) >>> 24);
        }
    }

    public double c() {
        long j10 = this.f46591a * 6364136223846793005L;
        long j11 = this.f46592b;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        long j14 = (j12 * 6364136223846793005L) + j11;
        this.f46591a = j14;
        return (((j13 >>> 6) << 27) + (((((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.f46592b = j12;
        this.f46591a = j12 + j10;
    }
}
