package Pf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class s0 extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9160d;

    s0(boolean z10, InterfaceC1301e[] interfaceC1301eArr) {
        super(C(z10), interfaceC1301eArr);
        this.f9160d = -1;
    }

    private static boolean C(boolean z10) {
        if (z10) {
            return z10;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int D() {
        if (this.f9160d < 0) {
            int length = this.f9042a.length;
            int iP = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iP += this.f9042a[i10].g().t().p(true);
            }
            this.f9160d = iP;
        }
        return this.f9160d;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        c1331w.s(z10, 49);
        C1324p0 c1324p0D = c1331w.d();
        int length = this.f9042a.length;
        int i10 = 0;
        if (this.f9160d >= 0 || length > 16) {
            c1331w.k(D());
            while (i10 < length) {
                this.f9042a[i10].g().t().k(c1324p0D, true);
                i10++;
            }
            return;
        }
        AbstractC1333y[] abstractC1333yArr = new AbstractC1333y[length];
        int iP = 0;
        for (int i11 = 0; i11 < length; i11++) {
            AbstractC1333y abstractC1333yT = this.f9042a[i11].g().t();
            abstractC1333yArr[i11] = abstractC1333yT;
            iP += abstractC1333yT.p(true);
        }
        this.f9160d = iP;
        c1331w.k(iP);
        while (i10 < length) {
            abstractC1333yArr[i10].k(c1324p0D, true);
            i10++;
        }
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, D());
    }

    @Override // Pf.C, Pf.AbstractC1333y
    AbstractC1333y t() {
        return this.f9043b != null ? this : super.t();
    }

    @Override // Pf.C, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
