package Se;

import Re.B0;
import Re.J0;
import Re.N0;
import Re.S;
import Re.v0;
import Re.w0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1799m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {
    private static final S a(S s10) {
        return (S) Xe.c.b(s10).d();
    }

    private static final String b(v0 v0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + v0Var, sb2);
        c("hashCode: " + v0Var.hashCode(), sb2);
        c("javaClass: " + v0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC1799m interfaceC1799mP = v0Var.p(); interfaceC1799mP != null; interfaceC1799mP = interfaceC1799mP.b()) {
            c("fqName: " + Ce.n.f1885h.M(interfaceC1799mP), sb2);
            c("javaClass: " + interfaceC1799mP.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    public static final S d(S subtype, S supertype, x typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(subtype, null));
        v0 v0VarN0 = supertype.N0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            S sB = uVar.b();
            v0 v0VarN1 = sB.N0();
            if (typeCheckingProcedureCallbacks.a(v0VarN1, v0VarN0)) {
                boolean zO0 = sB.O0();
                for (u uVarA = uVar.a(); uVarA != null; uVarA = uVarA.a()) {
                    S sB2 = uVarA.b();
                    List listL0 = sB2.L0();
                    if (listL0 != null && listL0.isEmpty()) {
                        sB = w0.f11186c.a(sB2).c().n(sB, N0.INVARIANT);
                        Intrinsics.c(sB);
                        break;
                    }
                    Iterator it = listL0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            sB = w0.f11186c.a(sB2).c().n(sB, N0.INVARIANT);
                            Intrinsics.c(sB);
                            break;
                        }
                        N0 n0B = ((B0) it.next()).b();
                        N0 n10 = N0.INVARIANT;
                        if (n0B != n10) {
                            S sN = Ee.e.h(w0.f11186c.a(sB2), false, 1, null).c().n(sB, n10);
                            Intrinsics.checkNotNullExpressionValue(sN, "safeSubstitute(...)");
                            sB = a(sN);
                            break;
                        }
                    }
                    zO0 = zO0 || sB2.O0();
                }
                v0 v0VarN2 = sB.N0();
                if (typeCheckingProcedureCallbacks.a(v0VarN2, v0VarN0)) {
                    return J0.p(sB, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(v0VarN2) + ", \n\nsupertype: " + b(v0VarN0) + " \n" + typeCheckingProcedureCallbacks.a(v0VarN2, v0VarN0));
            }
            for (S s10 : v0VarN1.a()) {
                Intrinsics.c(s10);
                arrayDeque.add(new u(s10, uVar));
            }
        }
        return null;
    }
}
