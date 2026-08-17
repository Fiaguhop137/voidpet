package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p288q0.InterfaceC4062i;
import p288q0.w;
import p288q0.y;
import p324s0.D;

/* JADX INFO: loaded from: classes.dex */
final class o extends V.k.c implements D {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f21265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f21266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f21267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f21268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f21269s;

    private o(float f10, float f11, float f12, float f13, boolean z10) {
        this.f21265o = f10;
        this.f21266p = f11;
        this.f21267q = f12;
        this.f21268r = f13;
        this.f21269s = z10;
    }

    public /* synthetic */ o(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    private final long X1(O0.d dVar) {
        int iQ0;
        int iQ1;
        int iQ2;
        int i10 = 0;
        if (Float.isNaN(this.f21267q)) {
            iQ0 = Integer.MAX_VALUE;
        } else {
            iQ0 = dVar.q0(this.f21267q);
            if (iQ0 < 0) {
                iQ0 = 0;
            }
        }
        if (Float.isNaN(this.f21268r)) {
            iQ1 = Integer.MAX_VALUE;
        } else {
            iQ1 = dVar.q0(this.f21268r);
            if (iQ1 < 0) {
                iQ1 = 0;
            }
        }
        if (Float.isNaN(this.f21265o)) {
            iQ2 = 0;
        } else {
            iQ2 = dVar.q0(this.f21265o);
            if (iQ2 < 0) {
                iQ2 = 0;
            }
            if (iQ2 > iQ0) {
                iQ2 = iQ0;
            }
            if (iQ2 == Integer.MAX_VALUE) {
                iQ2 = 0;
            }
        }
        if (!Float.isNaN(this.f21266p)) {
            int iQ3 = dVar.q0(this.f21266p);
            if (iQ3 < 0) {
                iQ3 = 0;
            }
            if (iQ3 > iQ1) {
                iQ3 = iQ1;
            }
            if (iQ3 != Integer.MAX_VALUE) {
                i10 = iQ3;
            }
        }
        return O0.c.a(iQ2, iQ0, i10, iQ1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(androidx.compose.ui.layout.p pVar, androidx.compose.ui.layout.p.a aVar) {
        androidx.compose.ui.layout.p.a.T(aVar, pVar, 0, 0, 0.0f, 4, null);
        return Unit.f48228a;
    }

    @Override // p324s0.D
    public int C(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        long jX1 = X1(jVar);
        if (O0.b.j(jX1)) {
            return O0.b.l(jX1);
        }
        if (!this.f21269s) {
            i10 = O0.c.f(jX1, i10);
        }
        return O0.c.g(jX1, interfaceC4062i.c0(i10));
    }

    public final void Z1(boolean z10) {
        this.f21269s = z10;
    }

    @Override // p324s0.D
    public y a(androidx.compose.ui.layout.k kVar, w wVar, long j10) {
        int iN;
        int iL;
        int iM;
        int iK;
        long jA;
        long jX1 = X1(kVar);
        if (this.f21269s) {
            jA = O0.c.e(j10, jX1);
        } else {
            if (Float.isNaN(this.f21265o)) {
                iN = O0.b.n(j10);
                int iL2 = O0.b.l(jX1);
                if (iN > iL2) {
                    iN = iL2;
                }
            } else {
                iN = O0.b.n(jX1);
            }
            if (Float.isNaN(this.f21267q)) {
                iL = O0.b.l(j10);
                int iN2 = O0.b.n(jX1);
                if (iL < iN2) {
                    iL = iN2;
                }
            } else {
                iL = O0.b.l(jX1);
            }
            if (Float.isNaN(this.f21266p)) {
                iM = O0.b.m(j10);
                int iK2 = O0.b.k(jX1);
                if (iM > iK2) {
                    iM = iK2;
                }
            } else {
                iM = O0.b.m(jX1);
            }
            if (Float.isNaN(this.f21268r)) {
                iK = O0.b.k(j10);
                int iM2 = O0.b.m(jX1);
                if (iK < iM2) {
                    iK = iM2;
                }
            } else {
                iK = O0.b.k(jX1);
            }
            jA = O0.c.a(iN, iL, iM, iK);
        }
        androidx.compose.ui.layout.p pVarD0 = wVar.d0(jA);
        return androidx.compose.ui.layout.k.s0(kVar, pVarD0.H0(), pVarD0.A0(), null, new n(pVarD0), 4, null);
    }

    public final void a2(float f10) {
        this.f21268r = f10;
    }

    public final void b2(float f10) {
        this.f21267q = f10;
    }

    public final void c2(float f10) {
        this.f21266p = f10;
    }

    public final void d2(float f10) {
        this.f21265o = f10;
    }

    @Override // p324s0.D
    public int e(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        long jX1 = X1(jVar);
        if (O0.b.j(jX1)) {
            return O0.b.l(jX1);
        }
        if (!this.f21269s) {
            i10 = O0.c.f(jX1, i10);
        }
        return O0.c.g(jX1, interfaceC4062i.Z(i10));
    }

    @Override // p324s0.D
    public int p(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        long jX1 = X1(jVar);
        if (O0.b.i(jX1)) {
            return O0.b.k(jX1);
        }
        if (!this.f21269s) {
            i10 = O0.c.g(jX1, i10);
        }
        return O0.c.f(jX1, interfaceC4062i.A(i10));
    }

    @Override // p324s0.D
    public int t(p288q0.j jVar, InterfaceC4062i interfaceC4062i, int i10) {
        long jX1 = X1(jVar);
        if (O0.b.i(jX1)) {
            return O0.b.k(jX1);
        }
        if (!this.f21269s) {
            i10 = O0.c.g(jX1, i10);
        }
        return O0.c.f(jX1, interfaceC4062i.Q(i10));
    }
}
