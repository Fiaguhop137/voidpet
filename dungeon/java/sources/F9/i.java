package F9;

import B9.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static byte a(long j10) {
        n.g((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
