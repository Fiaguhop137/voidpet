package C0;

import F0.AbstractC0974h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1087a = O0.w.d(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1088b = O0.w.d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f1089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f1090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final M0.o f1091e;

    static {
        c0.Z.a aVar = p037c0.Z.f26696b;
        f1089c = aVar.d();
        long jA = aVar.a();
        f1090d = jA;
        f1091e = M0.o.f6752a.b(jA);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:101:0x0189  */
    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0193  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x019b  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:11:0x003a A[PHI: r11
      0x003a: PHI (r11v6 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v7 long)
     binds: [B:40:0x00a9, B:52:0x00db, B:49:0x00cf, B:46:0x00c3, B:43:0x00b7, B:38:0x009b, B:33:0x008c, B:27:0x0074, B:24:0x006c, B:21:0x0060, B:18:0x0054, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:92:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x0178  */
    public static final G0 b(G0 g10, long j10, p037c0.P p10, float f10, long j11, F0.r rVar, F0.p pVar, F0.q qVar, AbstractC0974h abstractC0974h, String str, long j12, M0.a aVar, M0.p pVar2, I0.e eVar, long j13, M0.j jVar, p037c0.w0 w0Var, D d10, p073e0.g gVar) {
        long jK;
        M0.p pVar3;
        long jD;
        M0.o oVarB;
        AbstractC0974h abstractC0974hI;
        F0.r rVarN;
        F0.p pVarL;
        F0.q qVarM;
        long jO;
        M0.p pVarU;
        I0.e eVarP;
        p073e0.g gVarH;
        String strJ = str;
        M0.a aVarE = aVar;
        M0.j jVarS = jVar;
        p037c0.w0 w0VarR = w0Var;
        if (!(O0.v.f(j11) == 0)) {
            jK = j11;
            if (!O0.v.e(jK, g10.k())) {
                pVar3 = pVar2;
                jD = j13;
            }
            if (p10 != null) {
                oVarB = M0.o.f6752a.a(p10, f10);
            } else {
                oVarB = M0.o.f6752a.b(j10);
            }
            M0.o oVarH = g10.t().h(oVarB);
            if (abstractC0974h == null) {
                abstractC0974hI = g10.i();
            } else {
                abstractC0974hI = abstractC0974h;
            }
            if (O0.v.f(jK) == 0) {
                jK = g10.k();
            }
            if (rVar == null) {
                rVarN = g10.n();
            } else {
                rVarN = rVar;
            }
            if (pVar == null) {
                pVarL = g10.l();
            } else {
                pVarL = pVar;
            }
            if (qVar == null) {
                qVarM = g10.m();
            } else {
                qVarM = qVar;
            }
            if (strJ == null) {
                strJ = g10.j();
            }
            if (O0.v.f(j12) == 0) {
                jO = g10.o();
            } else {
                jO = j12;
            }
            if (aVarE == null) {
                aVarE = g10.e();
            }
            if (pVar3 == null) {
                pVarU = g10.u();
            } else {
                pVarU = pVar3;
            }
            if (eVar == null) {
                eVarP = g10.p();
            } else {
                eVarP = eVar;
            }
            if (jD == 16) {
                jD = g10.d();
            }
            if (jVarS == null) {
                jVarS = g10.s();
            }
            if (w0VarR == null) {
                w0VarR = g10.r();
            }
            p037c0.w0 w0Var2 = w0VarR;
            c(g10, d10);
            if (gVar == null) {
                gVarH = g10.h();
            } else {
                gVarH = gVar;
            }
            return new G0(oVarH, jK, rVarN, pVarL, qVarM, abstractC0974hI, strJ, jO, aVarE, pVarU, eVarP, jD, jVarS, w0Var2, (D) null, gVarH, (DefaultConstructorMarker) null);
        }
        jK = j11;
        if ((p10 != null || j10 == 16 || p037c0.Z.m(j10, g10.t().e())) && ((pVar == null || Intrinsics.b(pVar, g10.l())) && ((rVar == null || Intrinsics.b(rVar, g10.n())) && (abstractC0974h == null || abstractC0974h == g10.i())))) {
            if ((O0.v.f(j12) == 0) || O0.v.e(j12, g10.o())) {
                if ((jVarS == null || Intrinsics.b(jVarS, g10.s())) && Intrinsics.b(p10, g10.t().l()) && ((p10 == null || f10 == g10.t().a()) && ((qVar == null || Intrinsics.b(qVar, g10.m())) && ((strJ == null || Intrinsics.b(strJ, g10.j())) && (aVarE == null || Intrinsics.b(aVarE, g10.e())))))) {
                    if (pVar2 != null) {
                        pVar3 = pVar2;
                        if (Intrinsics.b(pVar3, g10.u())) {
                        }
                    } else {
                        pVar3 = pVar2;
                    }
                    if (eVar == null || Intrinsics.b(eVar, g10.p())) {
                        if (j13 != 16) {
                            jD = j13;
                            if (p037c0.Z.m(jD, g10.d())) {
                            }
                        } else {
                            jD = j13;
                        }
                        if ((w0VarR == null || Intrinsics.b(w0VarR, g10.r())) && (gVar == null || Intrinsics.b(gVar, g10.h()))) {
                            return g10;
                        }
                    }
                } else {
                    pVar3 = pVar2;
                }
                jD = j13;
            } else {
                pVar3 = pVar2;
                jD = j13;
            }
        } else {
            pVar3 = pVar2;
            jD = j13;
        }
        if (p10 != null) {
            oVarB = M0.o.f6752a.a(p10, f10);
        } else {
            oVarB = M0.o.f6752a.b(j10);
        }
        M0.o oVarH2 = g10.t().h(oVarB);
        if (abstractC0974h == null) {
            abstractC0974hI = g10.i();
        } else {
            abstractC0974hI = abstractC0974h;
        }
        if (O0.v.f(jK) == 0) {
            jK = g10.k();
        }
        if (rVar == null) {
            rVarN = g10.n();
        } else {
            rVarN = rVar;
        }
        if (pVar == null) {
            pVarL = g10.l();
        } else {
            pVarL = pVar;
        }
        if (qVar == null) {
            qVarM = g10.m();
        } else {
            qVarM = qVar;
        }
        if (strJ == null) {
            strJ = g10.j();
        }
        if (O0.v.f(j12) == 0) {
            jO = g10.o();
        } else {
            jO = j12;
        }
        if (aVarE == null) {
            aVarE = g10.e();
        }
        if (pVar3 == null) {
            pVarU = g10.u();
        } else {
            pVarU = pVar3;
        }
        if (eVar == null) {
            eVarP = g10.p();
        } else {
            eVarP = eVar;
        }
        if (jD == 16) {
            jD = g10.d();
        }
        if (jVarS == null) {
            jVarS = g10.s();
        }
        if (w0VarR == null) {
            w0VarR = g10.r();
        }
        p037c0.w0 w0Var3 = w0VarR;
        c(g10, d10);
        if (gVar == null) {
            gVarH = g10.h();
        } else {
            gVarH = gVar;
        }
        return new G0(oVarH2, jK, rVarN, pVarL, qVarM, abstractC0974hI, strJ, jO, aVarE, pVarU, eVarP, jD, jVarS, w0Var3, (D) null, gVarH, (DefaultConstructorMarker) null);
    }

    private static final D c(G0 g10, D d10) {
        g10.q();
        return d10;
    }

    public static final G0 d(G0 g10) {
        M0.o oVarK = g10.t().k(new H0());
        long jK = O0.v.f(g10.k()) == 0 ? f1087a : g10.k();
        F0.r rVarN = g10.n();
        if (rVarN == null) {
            rVarN = F0.r.f2873b.c();
        }
        F0.r rVar = rVarN;
        F0.p pVarL = g10.l();
        F0.p pVarC = F0.p.c(pVarL != null ? pVarL.i() : F0.p.f2863b.b());
        F0.q qVarM = g10.m();
        F0.q qVarB = F0.q.b(qVarM != null ? qVarM.h() : F0.q.f2867b.a());
        AbstractC0974h abstractC0974hI = g10.i();
        if (abstractC0974hI == null) {
            abstractC0974hI = AbstractC0974h.f2839b.a();
        }
        AbstractC0974h abstractC0974h = abstractC0974hI;
        String strJ = g10.j();
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        long jO = O0.v.f(g10.o()) == 0 ? f1088b : g10.o();
        M0.a aVarE = g10.e();
        M0.a aVarB = M0.a.b(aVarE != null ? aVarE.h() : M0.a.f6669b.a());
        M0.p pVarU = g10.u();
        if (pVarU == null) {
            pVarU = M0.p.f6755c.a();
        }
        M0.p pVar = pVarU;
        I0.e eVarP = g10.p();
        if (eVarP == null) {
            eVarP = I0.e.f4901c.a();
        }
        I0.e eVar = eVarP;
        long jD = g10.d();
        if (jD == 16) {
            jD = f1089c;
        }
        long j10 = jD;
        M0.j jVarS = g10.s();
        if (jVarS == null) {
            jVarS = M0.j.f6737b.b();
        }
        M0.j jVar = jVarS;
        p037c0.w0 w0VarR = g10.r();
        if (w0VarR == null) {
            w0VarR = p037c0.w0.f26744d.a();
        }
        p037c0.w0 w0Var = w0VarR;
        g10.q();
        p073e0.g gVarH = g10.h();
        if (gVarH == null) {
            gVarH = p073e0.j.f40222a;
        }
        return new G0(oVarK, jK, rVar, pVarC, qVarB, abstractC0974h, str, jO, aVarB, pVar, eVar, j10, jVar, w0Var, (D) null, gVarH, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M0.o e() {
        return f1091e;
    }
}
