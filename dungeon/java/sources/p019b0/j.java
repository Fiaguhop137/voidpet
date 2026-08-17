package p019b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final i a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jB = a.b((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
        return new i(f10, f11, f12, f13, jB, jB, jB, jB, null);
    }

    public static final i b(g gVar, long j10, long j11, long j12, long j13) {
        return new i(gVar.e(), gVar.h(), gVar.f(), gVar.c(), j10, j11, j12, j13, null);
    }

    public static final i c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final g d(i iVar) {
        return new g(iVar.e(), iVar.g(), iVar.f(), iVar.a());
    }

    public static final boolean e(i iVar) {
        long jH = iVar.h();
        return (jH >>> 32) == (jH & 4294967295L) && iVar.h() == iVar.i() && iVar.h() == iVar.c() && iVar.h() == iVar.b();
    }
}
