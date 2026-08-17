package A;

import I.AbstractC1032e1;
import I.AbstractC1083w;
import I.InterfaceC1054m;
import I.InterfaceC1094z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778m {

    /* JADX INFO: renamed from: A.m$a */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Md.n f76a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0780o f77b;

        a(Md.n nVar, C0780o c0780o) {
            this.f76a = nVar;
            this.f77b = c0780o;
        }

        public final void a(InterfaceC1054m interfaceC1054m, int i10) {
            if (!interfaceC1054m.o((i10 & 3) != 2, i10 & 1)) {
                interfaceC1054m.L();
                return;
            }
            if (AbstractC1083w.L()) {
                AbstractC1083w.U(-431986394, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:65)");
            }
            this.f76a.invoke(this.f77b, interfaceC1054m, 0);
            if (AbstractC1083w.L()) {
                AbstractC1083w.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1054m) obj, ((Number) obj2).intValue());
            return Unit.f48228a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void c(V.k kVar, V.d dVar, boolean z10, Md.n nVar, InterfaceC1054m interfaceC1054m, int i10, int i11) {
        V.k kVar2;
        int i12;
        V.d dVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        V.k kVar3;
        V.d dVarN;
        InterfaceC1094z1 interfaceC1094z1K;
        p288q0.x xVarF;
        boolean zU;
        Object objD;
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(380139498);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            kVar2 = kVar;
        } else if ((i10 & 6) == 0) {
            kVar2 = kVar;
            i12 = (interfaceC1054mH.U(kVar2) ? 4 : 2) | i10;
        } else {
            kVar2 = kVar;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= interfaceC1054mH.U(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (interfaceC1054mH.a(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (interfaceC1054mH.F(nVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (interfaceC1054mH.o(z12, i12 & 1)) {
                    if (i16 != 0) {
                        kVar3 = V.k.f13755a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        dVarN = V.d.f13710a.n();
                    } else {
                        dVarN = dVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if (AbstractC1083w.L()) {
                        AbstractC1083w.U(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    xVarF = AbstractC0770e.f(dVarN, z11);
                    zU = interfaceC1054mH.U(xVarF) | ((i12 & 7168) == 2048);
                    objD = interfaceC1054mH.D();
                    if (zU || objD == InterfaceC1054m.f4688a.a()) {
                        objD = new C0776k(xVarF, nVar);
                        interfaceC1054mH.t(objD);
                    }
                    androidx.compose.ui.layout.y.a(kVar3, (Function2) objD, interfaceC1054mH, i12 & 14, 0);
                    if (AbstractC1083w.L()) {
                        AbstractC1083w.T();
                    }
                } else {
                    interfaceC1054mH.L();
                    kVar3 = kVar2;
                    dVarN = dVar2;
                }
                interfaceC1094z1K = interfaceC1054mH.k();
                if (interfaceC1094z1K != null) {
                    interfaceC1094z1K.a(new C0777l(kVar3, dVarN, z11, nVar, i10, i11));
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (interfaceC1054mH.F(nVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (interfaceC1054mH.o(z12, i12 & 1)) {
                if (i16 != 0) {
                    kVar3 = V.k.f13755a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    dVarN = V.d.f13710a.n();
                } else {
                    dVarN = dVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if (AbstractC1083w.L()) {
                    AbstractC1083w.U(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                xVarF = AbstractC0770e.f(dVarN, z11);
                zU = interfaceC1054mH.U(xVarF) | ((i12 & 7168) == 2048);
                objD = interfaceC1054mH.D();
                if (zU) {
                    objD = new C0776k(xVarF, nVar);
                    interfaceC1054mH.t(objD);
                } else {
                    objD = new C0776k(xVarF, nVar);
                    interfaceC1054mH.t(objD);
                }
                androidx.compose.ui.layout.y.a(kVar3, (Function2) objD, interfaceC1054mH, i12 & 14, 0);
                if (AbstractC1083w.L()) {
                    AbstractC1083w.T();
                }
            } else {
                interfaceC1054mH.L();
                kVar3 = kVar2;
                dVarN = dVar2;
            }
            interfaceC1094z1K = interfaceC1054mH.k();
            if (interfaceC1094z1K != null) {
                interfaceC1094z1K.a(new C0777l(kVar3, dVarN, z11, nVar, i10, i11));
            }
        }
        i12 |= 48;
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (interfaceC1054mH.a(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (interfaceC1054mH.F(nVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (interfaceC1054mH.o(z12, i12 & 1)) {
                if (i16 != 0) {
                    kVar3 = V.k.f13755a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    dVarN = V.d.f13710a.n();
                } else {
                    dVarN = dVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if (AbstractC1083w.L()) {
                    AbstractC1083w.U(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                xVarF = AbstractC0770e.f(dVarN, z11);
                zU = interfaceC1054mH.U(xVarF) | ((i12 & 7168) == 2048);
                objD = interfaceC1054mH.D();
                if (zU) {
                    objD = new C0776k(xVarF, nVar);
                    interfaceC1054mH.t(objD);
                } else {
                    objD = new C0776k(xVarF, nVar);
                    interfaceC1054mH.t(objD);
                }
                androidx.compose.ui.layout.y.a(kVar3, (Function2) objD, interfaceC1054mH, i12 & 14, 0);
                if (AbstractC1083w.L()) {
                    AbstractC1083w.T();
                }
            } else {
                interfaceC1054mH.L();
                kVar3 = kVar2;
                dVarN = dVar2;
            }
            interfaceC1094z1K = interfaceC1054mH.k();
            if (interfaceC1094z1K != null) {
                interfaceC1094z1K.a(new C0777l(kVar3, dVarN, z11, nVar, i10, i11));
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (interfaceC1054mH.F(nVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (interfaceC1054mH.o(z12, i12 & 1)) {
            if (i16 != 0) {
                kVar3 = V.k.f13755a;
            } else {
                kVar3 = kVar2;
            }
            if (i17 != 0) {
                dVarN = V.d.f13710a.n();
            } else {
                dVarN = dVar2;
            }
            if (i13 != 0) {
                z11 = false;
            }
            if (AbstractC1083w.L()) {
                AbstractC1083w.U(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
            }
            xVarF = AbstractC0770e.f(dVarN, z11);
            zU = interfaceC1054mH.U(xVarF) | ((i12 & 7168) == 2048);
            objD = interfaceC1054mH.D();
            if (zU) {
                objD = new C0776k(xVarF, nVar);
                interfaceC1054mH.t(objD);
            } else {
                objD = new C0776k(xVarF, nVar);
                interfaceC1054mH.t(objD);
            }
            androidx.compose.ui.layout.y.a(kVar3, (Function2) objD, interfaceC1054mH, i12 & 14, 0);
            if (AbstractC1083w.L()) {
                AbstractC1083w.T();
            }
        } else {
            interfaceC1054mH.L();
            kVar3 = kVar2;
            dVarN = dVar2;
        }
        interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new C0777l(kVar3, dVarN, z11, nVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p288q0.y d(p288q0.x xVar, Md.n nVar, p288q0.F f10, O0.b bVar) {
        return xVar.mo0measure3p2s80s(f10, f10.M(Unit.f48228a, Q.h.c(-431986394, true, new a(nVar, new C0780o(f10, bVar.q(), null)))), bVar.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(V.k kVar, V.d dVar, boolean z10, Md.n nVar, int i10, int i11, InterfaceC1054m interfaceC1054m, int i12) {
        c(kVar, dVar, z10, nVar, interfaceC1054m, AbstractC1032e1.a(i10 | 1), i11);
        return Unit.f48228a;
    }
}
