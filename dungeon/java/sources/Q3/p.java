package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static long a(int i10, int i11) {
        return b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    private static long b(long j10) {
        return j10;
    }

    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int d(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
