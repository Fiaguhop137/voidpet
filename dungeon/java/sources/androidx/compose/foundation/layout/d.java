package androidx.compose.foundation.layout;

import A.EnumC0786v;
import kotlin.Unit;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class d extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private EnumC0786v f21232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21233p;

    public d(EnumC0786v enumC0786v, float f10) {
        this.f21232o = enumC0786v;
        this.f21233p = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(androidx.compose.ui.layout.p pVar, androidx.compose.ui.layout.p.a aVar) {
        androidx.compose.ui.layout.p.a.T(aVar, pVar, 0, 0, 0.0f, 4, null);
        return Unit.f48228a;
    }

    public final void Y1(EnumC0786v enumC0786v) {
        this.f21232o = enumC0786v;
    }

    public final void Z1(float f10) {
        this.f21233p = f10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!O0.b.h(j10) || this.f21232o == EnumC0786v.Vertical) {
            iN = O0.b.n(j10);
            iL = O0.b.l(j10);
        } else {
            int iRound = Math.round(O0.b.l(j10) * this.f21233p);
            int iN2 = O0.b.n(j10);
            iN = O0.b.l(j10);
            if (iRound < iN2) {
                iRound = iN2;
            }
            if (iRound <= iN) {
                iN = iRound;
            }
            iL = iN;
        }
        if (!O0.b.g(j10) || this.f21232o == EnumC0786v.Horizontal) {
            int iM = O0.b.m(j10);
            iK = O0.b.k(j10);
            iK2 = iM;
        } else {
            int iRound2 = Math.round(O0.b.k(j10) * this.f21233p);
            int iM2 = O0.b.m(j10);
            iK2 = O0.b.k(j10);
            if (iRound2 < iM2) {
                iRound2 = iM2;
            }
            if (iRound2 <= iK2) {
                iK2 = iRound2;
            }
            iK = iK2;
        }
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(O0.c.a(iN, iL, iK2, iK));
        return androidx.compose.ui.layout.k.s0(kVar, pVarD0.H0(), pVarD0.A0(), null, new c(pVarD0), 4, null);
    }
}
