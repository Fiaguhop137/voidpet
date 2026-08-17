package F9;

import B9.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static int a(long j10) {
        n.g((j10 >> 32) == 0, "out of range: %s", j10);
        return (int) j10;
    }
}
