package p324s0;

import K.c;
import V.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p270p0.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class H0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final G0 a(InterfaceC4144j interfaceC4144j, Object obj) {
        C4129b0 c4129b0S0;
        int iA = AbstractC4137f0.a(262144);
        if (!interfaceC4144j.k0().D1()) {
            a.b("visitAncestors called on an unattached node");
        }
        k.c cVarA1 = interfaceC4144j.k0().A1();
        I iL = AbstractC4146k.l(interfaceC4144j);
        while (iL != null) {
            if ((iL.s0().k().t1() & iA) != 0) {
                while (cVarA1 != null) {
                    if ((cVarA1.y1() & iA) != 0) {
                        ?? H10 = cVarA1;
                        ?? cVar = 0;
                        while (H10 != 0) {
                            if (H10 instanceof G0) {
                                G0 g10 = (G0) H10;
                                if (Intrinsics.b(obj, g10.L())) {
                                    return g10;
                                }
                            } else if ((H10.y1() & iA) != 0 && (H10 instanceof AbstractC4148m)) {
                                k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                int i10 = 0;
                                H10 = H10;
                                cVar = cVar;
                                while (cVarX1 != null) {
                                    if ((cVarX1.y1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar = cVar;
                                            H10 = cVarX1;
                                        } else {
                                            if (cVar == 0) {
                                                cVar = new c(new k.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                cVar.b(H10);
                                                H10 = 0;
                                            }
                                            cVar.b(cVarX1);
                                        }
                                    }
                                    cVarX1 = cVarX1.u1();
                                    H10 = H10;
                                    cVar = cVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC4146k.h(cVar);
                        }
                    }
                    cVarA1 = cVarA1.A1();
                }
            }
            iL = iL.z0();
            cVarA1 = (iL == null || (c4129b0S0 = iL.s0()) == null) ? null : c4129b0S0.p();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final G0 b(G0 g10) {
        C4129b0 c4129b0S0;
        int iA = AbstractC4137f0.a(262144);
        if (!g10.k0().D1()) {
            a.b("visitAncestors called on an unattached node");
        }
        k.c cVarA1 = g10.k0().A1();
        I iL = AbstractC4146k.l(g10);
        while (iL != null) {
            if ((iL.s0().k().t1() & iA) != 0) {
                while (cVarA1 != null) {
                    if ((cVarA1.y1() & iA) != 0) {
                        ?? H10 = cVarA1;
                        ?? cVar = 0;
                        while (H10 != 0) {
                            if (H10 instanceof G0) {
                                G0 g11 = (G0) H10;
                                if (Intrinsics.b(g10.L(), g11.L()) && V.c.a(g10, g11)) {
                                    return g11;
                                }
                            } else if ((H10.y1() & iA) != 0 && (H10 instanceof AbstractC4148m)) {
                                k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                int i10 = 0;
                                H10 = H10;
                                cVar = cVar;
                                while (cVarX1 != null) {
                                    if ((cVarX1.y1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar = cVar;
                                            H10 = cVarX1;
                                        } else {
                                            if (cVar == 0) {
                                                cVar = new c(new k.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                cVar.b(H10);
                                                H10 = 0;
                                            }
                                            cVar.b(cVarX1);
                                        }
                                    }
                                    cVarX1 = cVarX1.u1();
                                    H10 = H10;
                                    cVar = cVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC4146k.h(cVar);
                        }
                    }
                    cVarA1 = cVarA1.A1();
                }
            }
            iL = iL.z0();
            cVarA1 = (iL == null || (c4129b0S0 = iL.s0()) == null) ? null : c4129b0S0.p();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void c(InterfaceC4144j interfaceC4144j, Object obj, Function1 function1) {
        C4129b0 c4129b0S0;
        int iA = AbstractC4137f0.a(262144);
        if (!interfaceC4144j.k0().D1()) {
            a.b("visitAncestors called on an unattached node");
        }
        k.c cVarA1 = interfaceC4144j.k0().A1();
        I iL = AbstractC4146k.l(interfaceC4144j);
        while (iL != null) {
            if ((iL.s0().k().t1() & iA) != 0) {
                while (cVarA1 != null) {
                    if ((cVarA1.y1() & iA) != 0) {
                        ?? H10 = cVarA1;
                        ?? cVar = 0;
                        while (H10 != 0) {
                            if (H10 instanceof G0) {
                                G0 g10 = (G0) H10;
                                if (!(Intrinsics.b(obj, g10.L()) ? ((Boolean) function1.invoke(g10)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((H10.y1() & iA) != 0) && (H10 instanceof AbstractC4148m)) {
                                    k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                    int i10 = 0;
                                    while (cVarX1 != null) {
                                        if ((cVarX1.y1() & iA) != 0) {
                                            H10 = H10;
                                            cVar = cVar;
                                            i10++;
                                            if (i10 == 1) {
                                                H10 = H10;
                                                cVar = cVar;
                                                cVar = cVar;
                                                H10 = cVarX1;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new c(new k.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    cVar.b(H10);
                                                    H10 = 0;
                                                }
                                                cVar.b(cVarX1);
                                            }
                                        } else {
                                            H10 = H10;
                                            cVar = cVar;
                                            H10 = H10;
                                            cVar = cVar;
                                        }
                                        cVarX1 = cVarX1.u1();
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                    if (i10 == 1) {
                                        H10 = H10;
                                        cVar = cVar;
                                    } else {
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                }
                            }
                            H10 = AbstractC4146k.h(cVar);
                        }
                    }
                    cVarA1 = cVarA1.A1();
                }
            }
            iL = iL.z0();
            cVarA1 = (iL == null || (c4129b0S0 = iL.s0()) == null) ? null : c4129b0S0.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void d(G0 g10, Function1 function1) {
        C4129b0 c4129b0S0;
        int iA = AbstractC4137f0.a(262144);
        if (!g10.k0().D1()) {
            a.b("visitAncestors called on an unattached node");
        }
        k.c cVarA1 = g10.k0().A1();
        I iL = AbstractC4146k.l(g10);
        while (iL != null) {
            if ((iL.s0().k().t1() & iA) != 0) {
                while (cVarA1 != null) {
                    if ((cVarA1.y1() & iA) != 0) {
                        ?? H10 = cVarA1;
                        ?? cVar = 0;
                        while (H10 != 0) {
                            boolean zBooleanValue = true;
                            if (H10 instanceof G0) {
                                G0 g11 = (G0) H10;
                                if (Intrinsics.b(g10.L(), g11.L()) && V.c.a(g10, g11)) {
                                    zBooleanValue = ((Boolean) function1.invoke(g11)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((H10.y1() & iA) != 0) && (H10 instanceof AbstractC4148m)) {
                                    k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                    int i10 = 0;
                                    while (cVarX1 != null) {
                                        if ((cVarX1.y1() & iA) != 0) {
                                            H10 = H10;
                                            cVar = cVar;
                                            i10++;
                                            if (i10 == 1) {
                                                H10 = H10;
                                                cVar = cVar;
                                                cVar = cVar;
                                                H10 = cVarX1;
                                            } else {
                                                if (cVar == 0) {
                                                    cVar = new c(new k.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    cVar.b(H10);
                                                    H10 = 0;
                                                }
                                                cVar.b(cVarX1);
                                            }
                                        } else {
                                            H10 = H10;
                                            cVar = cVar;
                                            H10 = H10;
                                            cVar = cVar;
                                        }
                                        cVarX1 = cVarX1.u1();
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                    if (i10 == 1) {
                                        H10 = H10;
                                        cVar = cVar;
                                    } else {
                                        H10 = H10;
                                        cVar = cVar;
                                    }
                                }
                            }
                            H10 = AbstractC4146k.h(cVar);
                        }
                    }
                    cVarA1 = cVarA1.A1();
                }
            }
            iL = iL.z0();
            cVarA1 = (iL == null || (c4129b0S0 = iL.s0()) == null) ? null : c4129b0S0.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [V.k$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [K.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [K.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void e(G0 g10, Function1 function1) {
        int iA = AbstractC4137f0.a(262144);
        if (!g10.k0().D1()) {
            a.b("visitSubtreeIf called on an unattached node");
        }
        c cVar = new c(new k.c[16], 0);
        k.c cVarU1 = g10.k0().u1();
        if (cVarU1 == null) {
            AbstractC4146k.c(cVar, g10.k0(), false);
        } else {
            cVar.b(cVarU1);
        }
        while (cVar.l() != 0) {
            k.c cVar2 = (k.c) cVar.r(cVar.l() - 1);
            if ((cVar2.t1() & iA) != 0) {
                k.c cVarU2 = cVar2;
                while (true) {
                    if (cVarU2 != null) {
                        if ((cVarU2.y1() & iA) != 0) {
                            ?? H10 = cVarU2;
                            ?? cVar3 = 0;
                            while (H10 != 0) {
                                if (H10 instanceof G0) {
                                    G0 g11 = (G0) H10;
                                    F0 f10 = (Intrinsics.b(g10.L(), g11.L()) && V.c.a(g10, g11)) ? (F0) function1.invoke(g11) : F0.ContinueTraversal;
                                    if (f10 != F0.CancelTraversal) {
                                        if (f10 == F0.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((H10.y1() & iA) != 0 && (H10 instanceof AbstractC4148m)) {
                                    k.c cVarX1 = ((AbstractC4148m) H10).X1();
                                    int i10 = 0;
                                    while (cVarX1 != null) {
                                        if ((cVarX1.y1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                H10 = H10;
                                                cVar3 = cVar3;
                                                cVar3 = cVar3;
                                                H10 = cVarX1;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new c(new k.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    cVar3.b(H10);
                                                    H10 = 0;
                                                }
                                                cVar3.b(cVarX1);
                                            }
                                        } else {
                                            H10 = H10;
                                            cVar3 = cVar3;
                                        }
                                        cVarX1 = cVarX1.u1();
                                        H10 = H10;
                                        cVar3 = cVar3;
                                    }
                                    if (i10 == 1) {
                                        H10 = H10;
                                        cVar3 = cVar3;
                                    } else {
                                        H10 = H10;
                                        cVar3 = cVar3;
                                    }
                                }
                                H10 = AbstractC4146k.h(cVar3);
                            }
                        }
                        cVarU2 = cVarU2.u1();
                    }
                }
            }
            AbstractC4146k.c(cVar, cVar2, false);
        }
    }
}
