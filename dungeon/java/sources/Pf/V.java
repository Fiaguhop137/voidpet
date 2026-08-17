package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class V extends B {
    public V() {
    }

    public V(InterfaceC1301e interfaceC1301e) {
        super(interfaceC1301e);
    }

    public V(C1303f c1303f) {
        super(c1303f);
    }

    @Override // Pf.B
    AbstractC1295b C() {
        return new P(w());
    }

    @Override // Pf.B
    AbstractC1309i D() {
        return ((B) v()).D();
    }

    @Override // Pf.B
    AbstractC1329u E() {
        return new T(x());
    }

    @Override // Pf.B
    C F() {
        return new X(false, G());
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.r(z10, 48, this.f9038a);
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        int iP = z10 ? 4 : 3;
        int length = this.f9038a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iP += this.f9038a[i10].g().p(true);
        }
        return iP;
    }
}
