package p019b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final long a(float f10, float f11) {
        return e.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
