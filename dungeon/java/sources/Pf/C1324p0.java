package Pf;

import java.io.OutputStream;

/* JADX INFO: renamed from: Pf.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1324p0 extends D0 {
    C1324p0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // Pf.C1331w
    C1324p0 d() {
        return this;
    }

    @Override // Pf.D0, Pf.C1331w
    void l(InterfaceC1301e[] interfaceC1301eArr) {
        for (InterfaceC1301e interfaceC1301e : interfaceC1301eArr) {
            interfaceC1301e.g().t().k(this, true);
        }
    }

    @Override // Pf.D0, Pf.C1331w
    void u(AbstractC1333y abstractC1333y, boolean z10) {
        abstractC1333y.t().k(this, z10);
    }

    @Override // Pf.D0, Pf.C1331w
    void v(AbstractC1333y[] abstractC1333yArr) {
        for (AbstractC1333y abstractC1333y : abstractC1333yArr) {
            abstractC1333y.t().k(this, true);
        }
    }
}
