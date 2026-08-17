package p324s0;

import V.k;
import kotlin.jvm.internal.Intrinsics;
import p270p0.a;

/* JADX INFO: renamed from: s0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4148m extends k.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f53184o = AbstractC4139g0.g(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k.c f53185p;

    private final void a2(int i10, boolean z10) {
        k.c cVarU1;
        int iY1 = y1();
        R1(i10);
        if (iY1 != i10) {
            if (AbstractC4146k.g(this)) {
                M1(i10);
            }
            if (D1()) {
                k.c cVarK0 = k0();
                k.c cVarA1 = this;
                while (cVarA1 != null) {
                    i10 |= cVarA1.y1();
                    cVarA1.R1(i10);
                    if (cVarA1 == cVarK0) {
                        break;
                    } else {
                        cVarA1 = cVarA1.A1();
                    }
                }
                if (z10 && cVarA1 == cVarK0) {
                    i10 = AbstractC4139g0.h(cVarK0);
                    cVarK0.R1(i10);
                }
                int iT1 = i10 | ((cVarA1 == null || (cVarU1 = cVarA1.u1()) == null) ? 0 : cVarU1.t1());
                while (cVarA1 != null) {
                    iT1 |= cVarA1.y1();
                    cVarA1.M1(iT1);
                    cVarA1 = cVarA1.A1();
                }
            }
        }
    }

    private final void b2(int i10, k.c cVar) {
        int iY1 = y1();
        if ((i10 & AbstractC4137f0.a(2)) == 0 || (AbstractC4137f0.a(2) & iY1) == 0 || (this instanceof D)) {
            return;
        }
        a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    @Override // V.k.c
    public void E1() {
        super.E1();
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.V1(v1());
            if (!cVarX1.D1()) {
                cVarX1.E1();
            }
        }
    }

    @Override // V.k.c
    public void F1() {
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.F1();
        }
        super.F1();
    }

    @Override // V.k.c
    public void J1() {
        super.J1();
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.J1();
        }
    }

    @Override // V.k.c
    public void K1() {
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.K1();
        }
        super.K1();
    }

    @Override // V.k.c
    public void L1() {
        super.L1();
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.L1();
        }
    }

    @Override // V.k.c
    public void N1(k.c cVar) {
        super.N1(cVar);
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.N1(cVar);
        }
    }

    @Override // V.k.c
    public void V1(AbstractC4133d0 abstractC4133d0) {
        super.V1(abstractC4133d0);
        for (k.c cVarX1 = X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
            cVarX1.V1(abstractC4133d0);
        }
    }

    protected final InterfaceC4144j W1(InterfaceC4144j interfaceC4144j) {
        k.c cVarK0 = interfaceC4144j.k0();
        if (cVarK0 != interfaceC4144j) {
            k.c cVar = interfaceC4144j instanceof k.c ? (k.c) interfaceC4144j : null;
            k.c cVarA1 = cVar != null ? cVar.A1() : null;
            if (cVarK0 == k0() && Intrinsics.b(cVarA1, this)) {
                return interfaceC4144j;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (cVarK0.D1()) {
            a.b("Cannot delegate to an already attached node");
        }
        cVarK0.N1(k0());
        int iY1 = y1();
        int iH = AbstractC4139g0.h(cVarK0);
        cVarK0.R1(iH);
        b2(iH, cVarK0);
        cVarK0.O1(this.f53185p);
        this.f53185p = cVarK0;
        cVarK0.T1(this);
        a2(y1() | iH, false);
        if (D1()) {
            if ((iH & AbstractC4137f0.a(2)) == 0 || (iY1 & AbstractC4137f0.a(2)) != 0) {
                V1(v1());
            } else {
                C4129b0 c4129b0S0 = AbstractC4146k.l(this).s0();
                k0().V1(null);
                c4129b0S0.D();
            }
            cVarK0.E1();
            cVarK0.K1();
            AbstractC4139g0.a(cVarK0);
        }
        return interfaceC4144j;
    }

    public final k.c X1() {
        return this.f53185p;
    }

    public final int Y1() {
        return this.f53184o;
    }

    protected final void Z1(InterfaceC4144j interfaceC4144j) {
        k.c cVar = null;
        for (k.c cVarU1 = this.f53185p; cVarU1 != null; cVarU1 = cVarU1.u1()) {
            if (cVarU1 == interfaceC4144j) {
                if (cVarU1.D1()) {
                    AbstractC4139g0.d(cVarU1);
                    cVarU1.L1();
                    cVarU1.F1();
                }
                cVarU1.N1(cVarU1);
                cVarU1.M1(0);
                if (cVar == null) {
                    this.f53185p = cVarU1.u1();
                } else {
                    cVar.O1(cVarU1.u1());
                }
                cVarU1.O1(null);
                cVarU1.T1(null);
                int iY1 = y1();
                int iH = AbstractC4139g0.h(this);
                a2(iH, true);
                if (D1() && (iY1 & AbstractC4137f0.a(2)) != 0 && (AbstractC4137f0.a(2) & iH) == 0) {
                    C4129b0 c4129b0S0 = AbstractC4146k.l(this).s0();
                    k0().V1(null);
                    c4129b0S0.D();
                    return;
                }
                return;
            }
            cVar = cVarU1;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC4144j).toString());
    }
}
