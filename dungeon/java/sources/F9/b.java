package F9;

import B9.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static char a(long j10) {
        char c10 = (char) j10;
        n.g(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
