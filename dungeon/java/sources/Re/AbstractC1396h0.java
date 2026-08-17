package Re;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1396h0 {
    public static final C1381a a(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof C1381a) {
            return (C1381a) m0Q0;
        }
        return null;
    }

    public static final AbstractC1388d0 b(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        C1381a c1381aA = a(s10);
        if (c1381aA != null) {
            return c1381aA.Z0();
        }
        return null;
    }

    public static final boolean c(S s10) {
        Intrinsics.checkNotNullParameter(s10, "<this>");
        return s10.Q0() instanceof C1419y;
    }

    private static final Q d(Q q10) {
        S s10;
        Collection collectionA = q10.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collectionA, 10));
        Iterator it = collectionA.iterator();
        boolean z10 = false;
        while (true) {
            s10 = null;
            if (!it.hasNext()) {
                break;
            }
            S sF = (S) it.next();
            if (J0.l(sF)) {
                sF = f(sF.Q0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(sF);
        }
        if (!z10) {
            return null;
        }
        S sI = q10.i();
        if (sI != null) {
            if (J0.l(sI)) {
                sI = f(sI.Q0(), false, 1, null);
            }
            s10 = sI;
        }
        return new Q(arrayList).s(s10);
    }

    public static final M0 e(M0 m10, boolean z10) {
        Intrinsics.checkNotNullParameter(m10, "<this>");
        C1419y c1419yC = C1419y.a.c(C1419y.f11192d, m10, z10, false, 4, null);
        if (c1419yC != null) {
            return c1419yC;
        }
        AbstractC1388d0 abstractC1388d0G = g(m10);
        return abstractC1388d0G != null ? abstractC1388d0G : m10.R0(false);
    }

    public static /* synthetic */ M0 f(M0 m10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(m10, z10);
    }

    private static final AbstractC1388d0 g(S s10) {
        Q qD;
        v0 v0VarN0 = s10.N0();
        Q q10 = v0VarN0 instanceof Q ? (Q) v0VarN0 : null;
        if (q10 == null || (qD = d(q10)) == null) {
            return null;
        }
        return qD.g();
    }

    public static final AbstractC1388d0 h(AbstractC1388d0 abstractC1388d0, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC1388d0, "<this>");
        C1419y c1419yC = C1419y.a.c(C1419y.f11192d, abstractC1388d0, z10, false, 4, null);
        if (c1419yC != null) {
            return c1419yC;
        }
        AbstractC1388d0 abstractC1388d0G = g(abstractC1388d0);
        return abstractC1388d0G == null ? abstractC1388d0.R0(false) : abstractC1388d0G;
    }

    public static /* synthetic */ AbstractC1388d0 i(AbstractC1388d0 abstractC1388d0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(abstractC1388d0, z10);
    }

    public static final AbstractC1388d0 j(AbstractC1388d0 abstractC1388d0, AbstractC1388d0 abbreviatedType) {
        Intrinsics.checkNotNullParameter(abstractC1388d0, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return W.a(abstractC1388d0) ? abstractC1388d0 : new C1381a(abstractC1388d0, abbreviatedType);
    }

    public static final Se.i k(Se.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new Se.i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
