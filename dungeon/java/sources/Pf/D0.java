package Pf;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
class D0 extends C1331w {
    D0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // Pf.C1331w
    D0 e() {
        return this;
    }

    @Override // Pf.C1331w
    void l(InterfaceC1301e[] interfaceC1301eArr) {
        for (InterfaceC1301e interfaceC1301e : interfaceC1301eArr) {
            interfaceC1301e.g().v().k(this, true);
        }
    }

    @Override // Pf.C1331w
    void u(AbstractC1333y abstractC1333y, boolean z10) {
        abstractC1333y.v().k(this, z10);
    }

    @Override // Pf.C1331w
    void v(AbstractC1333y[] abstractC1333yArr) {
        for (AbstractC1333y abstractC1333y : abstractC1333yArr) {
            abstractC1333y.v().k(this, true);
        }
    }
}
