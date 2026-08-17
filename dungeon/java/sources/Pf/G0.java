package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class G0 extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9059d;

    public G0() {
        this.f9059d = -1;
    }

    public G0(C1303f c1303f) {
        super(c1303f, false);
        this.f9059d = -1;
    }

    G0(boolean z10, InterfaceC1301e[] interfaceC1301eArr) {
        super(z10, interfaceC1301eArr);
        this.f9059d = -1;
    }

    G0(InterfaceC1301e[] interfaceC1301eArr, InterfaceC1301e[] interfaceC1301eArr2) {
        super(interfaceC1301eArr, interfaceC1301eArr2);
        this.f9059d = -1;
    }

    private int C() {
        if (this.f9059d < 0) {
            int length = this.f9042a.length;
            int iP = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iP += this.f9042a[i10].g().v().p(true);
            }
            this.f9059d = iP;
        }
        return this.f9059d;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.s(z10, 49);
        D0 d0E = c1331w.e();
        int length = this.f9042a.length;
        int i10 = 0;
        if (this.f9059d >= 0 || length > 16) {
            c1331w.k(C());
            while (i10 < length) {
                d0E.u(this.f9042a[i10].g(), true);
                i10++;
            }
            return;
        }
        AbstractC1333y[] abstractC1333yArr = new AbstractC1333y[length];
        int iP = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC1333y abstractC1333yV = this.f9042a[i11].g().v();
            abstractC1333yArr[i11] = abstractC1333yV;
            iP += abstractC1333yV.p(true);
        }
        this.f9059d = iP;
        c1331w.k(iP);
        while (i10 < length) {
            d0E.u(abstractC1333yArr[i10], true);
            i10++;
        }
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, C());
    }

    @Override // Pf.C, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
