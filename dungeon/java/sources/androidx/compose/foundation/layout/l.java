package androidx.compose.foundation.layout;

import A.E;
import kotlin.Unit;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class l extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private E f21249o;

    public l(E e10) {
        this.f21249o = e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(androidx.compose.ui.layout.p pVar, int i10, int i11, androidx.compose.ui.layout.p.a aVar) {
        androidx.compose.ui.layout.p.a.K(aVar, pVar, i10, i11, 0.0f, 4, null);
        return Unit.f48228a;
    }

    public final void Y1(E e10) {
        this.f21249o = e10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        float fC = this.f21249o.c(kVar.getLayoutDirection());
        float fD = this.f21249o.d();
        float fB = this.f21249o.b(kVar.getLayoutDirection());
        float fA = this.f21249o.a();
        float f10 = 0;
        if (!((O0.h.i(fA, O0.h.o(f10)) >= 0) & (O0.h.i(fC, O0.h.o(f10)) >= 0) & (O0.h.i(fD, O0.h.o(f10)) >= 0) & (O0.h.i(fB, O0.h.o(f10)) >= 0))) {
            B.a.a("Padding must be non-negative");
        }
        int iQ0 = kVar.q0(fC);
        int iQ1 = kVar.q0(fB) + iQ0;
        int iQ2 = kVar.q0(fD);
        int iQ3 = kVar.q0(fA) + iQ2;
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(O0.c.i(j10, -iQ1, -iQ3));
        return androidx.compose.ui.layout.k.s0(kVar, O0.c.g(j10, pVarD0.H0() + iQ1), O0.c.f(j10, pVarD0.A0() + iQ3), null, new k(pVarD0, iQ0, iQ2), 4, null);
    }
}
