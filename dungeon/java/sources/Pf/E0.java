package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class E0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9051c;

    public E0() {
        this.f9051c = -1;
    }

    public E0(InterfaceC1301e interfaceC1301e) {
        super(interfaceC1301e);
        this.f9051c = -1;
    }

    public E0(C1303f c1303f) {
        super(c1303f);
        this.f9051c = -1;
    }

    E0(InterfaceC1301e[] interfaceC1301eArr, boolean z10) {
        super(interfaceC1301eArr, z10);
        this.f9051c = -1;
    }

    private int H() {
        if (this.f9051c < 0) {
            int length = this.f9038a.length;
            int iP = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iP += this.f9038a[i10].g().v().p(true);
            }
            this.f9051c = iP;
        }
        return this.f9051c;
    }

    @Override // Pf.B
    AbstractC1295b C() {
        return new z0(P.D(w()), false);
    }

    @Override // Pf.B
    AbstractC1309i D() {
        return new B0(this);
    }

    @Override // Pf.B
    AbstractC1329u E() {
        return new C1320n0(T.B(x()));
    }

    @Override // Pf.B
    C F() {
        return new G0(false, G());
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.s(z10, 48);
        D0 d0E = c1331w.e();
        int length = this.f9038a.length;
        int i10 = 0;
        if (this.f9051c >= 0 || length > 16) {
            c1331w.k(H());
            while (i10 < length) {
                d0E.u(this.f9038a[i10].g(), true);
                i10++;
            }
            return;
        }
        AbstractC1333y[] abstractC1333yArr = new AbstractC1333y[length];
        int iP = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC1333y abstractC1333yV = this.f9038a[i11].g().v();
            abstractC1333yArr[i11] = abstractC1333yV;
            iP += abstractC1333yV.p(true);
        }
        this.f9051c = iP;
        c1331w.k(iP);
        while (i10 < length) {
            d0E.u(abstractC1333yArr[i10], true);
            i10++;
        }
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, H());
    }

    @Override // Pf.B, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
