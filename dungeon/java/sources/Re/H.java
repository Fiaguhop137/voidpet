package Re;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    public static final Ve.i a(H0 h10, Ve.i inlineClassType) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return b(h10, inlineClassType, new HashSet());
    }

    private static final Ve.i b(H0 h10, Ve.i iVar, HashSet hashSet) {
        Ve.i iVarB;
        Ve.p pVarY0 = h10.y0(iVar);
        if (!hashSet.add(pVarY0)) {
            return null;
        }
        Ve.q qVarG = h10.G(pVarY0);
        if (qVarG != null) {
            Ve.i iVarH = h10.H(qVarG);
            Ve.i iVarB2 = b(h10, iVarH, hashSet);
            if (iVarB2 == null) {
                return null;
            }
            boolean z10 = h10.d0(h10.y0(iVarH)) || ((iVarH instanceof Ve.k) && h10.C((Ve.k) iVarH));
            if ((iVarB2 instanceof Ve.k) && h10.C((Ve.k) iVarB2) && h10.x(iVar) && z10) {
                return h10.u0(iVarH);
            }
            return (h10.x(iVarB2) || !h10.w0(iVar)) ? iVarB2 : h10.u0(iVarB2);
        }
        if (h10.d0(pVarY0)) {
            Ve.i iVarE0 = h10.E0(iVar);
            if (iVarE0 == null || (iVarB = b(h10, iVarE0, hashSet)) == null) {
                return null;
            }
            if (!h10.x(iVar)) {
                return iVarB;
            }
            if (!h10.x(iVarB) && (!(iVarB instanceof Ve.k) || !h10.C((Ve.k) iVarB))) {
                return h10.u0(iVarB);
            }
        }
        return iVar;
    }
}
