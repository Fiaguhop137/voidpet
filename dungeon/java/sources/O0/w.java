package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final long a(float f10, long j10) {
        return e(j10, f10);
    }

    public static final long b(double d10) {
        return e(4294967296L, (float) d10);
    }

    public static final long c(float f10) {
        return e(4294967296L, f10);
    }

    public static final long d(int i10) {
        return e(4294967296L, i10);
    }

    public static final long e(long j10, float f10) {
        return v.c(j10 | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }
}
