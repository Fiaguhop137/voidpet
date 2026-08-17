package p380v2;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;

/* JADX INFO: renamed from: v2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4243f {
    public static void a(long j10, F f10, O[] oArr) {
        while (true) {
            if (f10.a() <= 1) {
                return;
            }
            int iC = c(f10);
            int iC2 = c(f10);
            int iG = f10.g() + iC2;
            if (iC2 == -1 || iC2 > f10.a()) {
                AbstractC1477t.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = f10.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iL = f10.L();
                int iT = f10.T();
                int iU = iT == 49 ? f10.u() : 0;
                int iL2 = f10.L();
                if (iT == 47) {
                    f10.b0(1);
                }
                boolean z10 = iL == 181 && (iT == 49 || iT == 47) && iL2 == 3;
                if (iT == 49) {
                    z10 &= iU == 1195456820;
                }
                if (z10) {
                    b(j10, f10, oArr);
                }
            }
            f10.a0(iG);
        }
    }

    public static void b(long j10, F f10, O[] oArr) {
        int iL = f10.L();
        if ((iL & 64) != 0) {
            f10.b0(1);
            int i10 = (iL & 31) * 3;
            int iG = f10.g();
            for (O o10 : oArr) {
                f10.a0(iG);
                o10.f(f10, i10);
                AbstractC1459a.g(j10 != -9223372036854775807L);
                o10.c(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(F f10) {
        int i10 = 0;
        while (f10.a() != 0) {
            int iL = f10.L();
            i10 += iL;
            if (iL != 255) {
                return i10;
            }
        }
        return -1;
    }
}
