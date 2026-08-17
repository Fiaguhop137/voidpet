package p394vg;

import Ug.f;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[][] f56363a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f56364b = new byte[256];

    static {
        long j10;
        int i10 = 1;
        long j11 = 72340172838076673L;
        while (true) {
            j10 = 506097522914230528L;
            if (i10 > 255) {
                break;
            }
            for (int i11 = 0; i11 < 256; i11 += 8) {
                f.i(f(j11, j10), f56363a[i10], i11);
                j10 += 578721382704613384L;
            }
            j11 += 72340172838076673L;
            i10++;
        }
        for (int i12 = 0; i12 < 256; i12 += 8) {
            f.i(e(j10), f56364b, i12);
            j10 += 578721382704613384L;
        }
    }

    public static short a(short s10, short s11) {
        return (short) (s10 ^ s11);
    }

    private static long b(long j10) {
        long j11 = 3689348814741910323L & j10;
        long j12 = j10 & (-3689348814741910324L);
        long j13 = (j11 << 2) ^ j12;
        long j14 = j12 >>> 2;
        return j14 ^ h(j13 ^ j14);
    }

    private static long c(long j10, long j11) {
        long jI = i(j10, j11);
        long j12 = 3689348814741910323L & jI;
        return (i(((j10 ^ (j10 << 2)) & (-3689348814741910324L)) ^ ((jI & (-3689348814741910324L)) >>> 2), ((j11 ^ (j11 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j12 << 2)) ^ j12;
    }

    private static long d(long j10) {
        long j11 = j(j10);
        return j11 ^ (h((-3689348814741910324L) & j11) >>> 2);
    }

    private static long e(long j10) {
        long jG = g(j10);
        long jG2 = g(jG);
        long jF = f(f(jG2, jG), g(jG2));
        return f(jG, g(f(g(g(g(jF))), jF)));
    }

    private static long f(long j10, long j11) {
        long jC = c(j10, j11);
        long j12 = 1085102592571150095L & jC;
        return (c(((j10 ^ (j10 << 4)) & (-1085102592571150096L)) ^ ((jC & (-1085102592571150096L)) >>> 4), ((j11 ^ (j11 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j12 << 4)) ^ j12;
    }

    private static long g(long j10) {
        long jD = d(j10);
        return jD ^ (b((-1085102592571150096L) & jD) >>> 4);
    }

    private static long h(long j10) {
        long j11 = 6148914691236517205L & j10;
        long j12 = j10 & (-6148914691236517206L);
        return (j12 >>> 1) ^ ((j11 << 1) ^ j12);
    }

    private static long i(long j10, long j11) {
        long j12 = (((j10 << 1) & j11) ^ ((j11 << 1) & j10)) & (-6148914691236517206L);
        long j13 = j10 & j11;
        return ((j13 & (-6148914691236517206L)) >>> 1) ^ (j13 ^ j12);
    }

    private static long j(long j10) {
        return j10 ^ (((-6148914691236517206L) & j10) >>> 1);
    }

    public static short k(short s10, short s11) {
        return (short) (f56363a[s10][s11] & 255);
    }
}
