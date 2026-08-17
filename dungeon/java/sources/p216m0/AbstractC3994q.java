package p216m0;

import p019b0.e;

/* JADX INFO: renamed from: m0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3994q {
    public static final boolean a(z zVar) {
        return (zVar.o() || zVar.l() || !zVar.i()) ? false : true;
    }

    public static final boolean b(z zVar) {
        return !zVar.l() && zVar.i();
    }

    public static final boolean c(z zVar) {
        return (zVar.o() || !zVar.l() || zVar.i()) ? false : true;
    }

    public static final boolean d(z zVar) {
        return zVar.l() && !zVar.i();
    }

    public static final boolean e(z zVar, long j10) {
        long jH = zVar.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return (fIntBitsToFloat > ((float) i10)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i11));
    }

    public static final boolean f(z zVar, long j10, long j11) {
        boolean zG = N.g(zVar.m(), N.f48810a.d());
        long jH = zVar.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zG ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(z zVar) {
        return i(zVar, false);
    }

    public static final long h(z zVar) {
        return i(zVar, true);
    }

    private static final long i(z zVar, boolean z10) {
        return (z10 || !zVar.o()) ? e.p(zVar.h(), zVar.k()) : e.f25805b.c();
    }

    public static final boolean j(z zVar) {
        return !e.j(i(zVar, true), e.f25805b.c());
    }
}
