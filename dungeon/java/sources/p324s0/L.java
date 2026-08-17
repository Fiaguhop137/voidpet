package p324s0;

import V.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    /* JADX INFO: Access modifiers changed from: private */
    public static final k.c b(InterfaceC4144j interfaceC4144j) {
        int iA = AbstractC4137f0.a(4);
        int iA2 = AbstractC4137f0.a(2);
        k.c cVarU1 = interfaceC4144j.k0().u1();
        if (cVarU1 == null || (cVarU1.t1() & iA) == 0) {
            return null;
        }
        while (cVarU1 != null && (cVarU1.y1() & iA2) == 0) {
            if ((cVarU1.y1() & iA) != 0) {
                return cVarU1;
            }
            cVarU1 = cVarU1.u1();
        }
        return null;
    }
}
