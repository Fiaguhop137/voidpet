package p019b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final long a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        return e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final g b(long j10) {
        return h.a(e.f25805b.c(), j10);
    }
}
