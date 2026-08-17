package N3;

import If.C1109k;
import If.InterfaceC1108j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final long a(InterfaceC1108j interfaceC1108j, C1109k c1109k, long j10, long j11) {
        if (c1109k.M() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte bR = c1109k.r(0);
        long jM = j11 - ((long) c1109k.M());
        long j12 = j10;
        while (j12 < jM) {
            InterfaceC1108j interfaceC1108j2 = interfaceC1108j;
            long jH0 = interfaceC1108j2.H0(bR, j12, jM);
            if (jH0 == -1 || interfaceC1108j2.h1(jH0, c1109k)) {
                return jH0;
            }
            j12 = jH0 + 1;
            interfaceC1108j = interfaceC1108j2;
        }
        return -1L;
    }
}
