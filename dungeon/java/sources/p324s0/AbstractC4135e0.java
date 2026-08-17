package p324s0;

import V.k;
import java.util.Map;
import p288q0.AbstractC4054a;
import p323s.K;

/* JADX INFO: renamed from: s0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4135e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(K k10, Map map) {
        if (k10 == null || k10.f() != map.size()) {
            return false;
        }
        Object[] objArr = k10.f52640b;
        int[] iArr = k10.f52641c;
        long[] jArr = k10.f52639a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        int i14 = iArr[i13];
                        Integer num = (Integer) map.get((AbstractC4054a) obj);
                        if (num == null || num.intValue() != i14) {
                            break loop0;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k.c d(InterfaceC4144j interfaceC4144j, int i10, int i11) {
        k.c cVarU1 = interfaceC4144j.k0().u1();
        if (cVarU1 == null || (cVarU1.t1() & i10) == 0) {
            return null;
        }
        while (cVarU1 != null) {
            int iY1 = cVarU1.y1();
            if ((iY1 & i11) != 0) {
                return null;
            }
            if ((iY1 & i10) != 0) {
                return cVarU1;
            }
            cVarU1 = cVarU1.u1();
        }
        return null;
    }
}
