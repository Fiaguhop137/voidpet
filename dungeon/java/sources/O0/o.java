package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final long a(int i10, int i11) {
        return n.d((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10, long j11) {
        return p019b0.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - n.g(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - n.h(j11))) & 4294967295L));
    }

    public static final long c(long j10, long j11) {
        return p019b0.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + n.g(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + n.h(j11))) & 4294967295L));
    }

    public static final long d(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return n.d((((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }
}
