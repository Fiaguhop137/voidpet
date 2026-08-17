package p323s;

/* JADX INFO: renamed from: s.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4108h {
    public static long a(float f10, float f11) {
        return b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static long b(long j10) {
        return j10;
    }
}
