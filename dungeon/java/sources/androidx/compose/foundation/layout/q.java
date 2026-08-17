package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p288q0.InterfaceC4062i;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class q extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f21271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21272p;

    private q(float f10, float f11) {
        this.f21271o = f10;
        this.f21272p = f11;
    }

    public /* synthetic */ q(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(androidx.compose.ui.layout.p pVar, androidx.compose.ui.layout.p.a aVar) {
        androidx.compose.ui.layout.p.a.T(aVar, pVar, 0, 0, 0.0f, 4, null);
        return Unit.f48228a;
    }

    @Override // p324s0.D
    public int C(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        int iC0 = interfaceC4062i.c0(i10);
        int iQ0 = !Float.isNaN(this.f21271o) ? jVar.q0(this.f21271o) : 0;
        return iC0 < iQ0 ? iQ0 : iC0;
    }

    public final void Y1(float f10) {
        this.f21272p = f10;
    }

    public final void Z1(float f10) {
        this.f21271o = f10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        int iN;
        int iM;
        if (Float.isNaN(this.f21271o) || O0.b.n(j10) != 0) {
            iN = O0.b.n(j10);
        } else {
            int iQ0 = kVar.q0(this.f21271o);
            iN = O0.b.l(j10);
            if (iQ0 < 0) {
                iQ0 = 0;
            }
            if (iQ0 <= iN) {
                iN = iQ0;
            }
        }
        int iL = O0.b.l(j10);
        if (Float.isNaN(this.f21272p) || O0.b.m(j10) != 0) {
            iM = O0.b.m(j10);
        } else {
            int iQ1 = kVar.q0(this.f21272p);
            iM = O0.b.k(j10);
            int i10 = iQ1 >= 0 ? iQ1 : 0;
            if (i10 <= iM) {
                iM = i10;
            }
        }
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(O0.c.a(iN, iL, iM, O0.b.k(j10)));
        return androidx.compose.ui.layout.k.s0(kVar, pVarD0.H0(), pVarD0.A0(), null, new p(pVarD0), 4, null);
    }

    @Override // p324s0.D
    public int e(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        int iZ = interfaceC4062i.Z(i10);
        int iQ0 = !Float.isNaN(this.f21271o) ? jVar.q0(this.f21271o) : 0;
        return iZ < iQ0 ? iQ0 : iZ;
    }

    @Override // p324s0.D
    public int p(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        int iA = interfaceC4062i.A(i10);
        int iQ0 = !Float.isNaN(this.f21272p) ? jVar.q0(this.f21272p) : 0;
        return iA < iQ0 ? iQ0 : iA;
    }

    @Override // p324s0.D
    public int t(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        int iQ = interfaceC4062i.Q(i10);
        int iQ0 = !Float.isNaN(this.f21272p) ? jVar.q0(this.f21272p) : 0;
        return iQ < iQ0 ? iQ0 : iQ;
    }
}
