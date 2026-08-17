package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class X extends C {
    public X() {
    }

    public X(C1303f c1303f) {
        super(c1303f, false);
    }

    X(boolean z10, InterfaceC1301e[] interfaceC1301eArr) {
        super(z10, interfaceC1301eArr);
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.r(z10, 49, this.f9042a);
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        int iP = z10 ? 4 : 3;
        int length = this.f9042a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iP += this.f9042a[i10].g().p(true);
        }
        return iP;
    }
}
