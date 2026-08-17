package Pf;

/* JADX INFO: loaded from: classes3.dex */
public class z0 extends AbstractC1295b {
    z0(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    static void D(C1331w c1331w, boolean z10, byte b10, byte[] bArr, int i10, int i11) {
        c1331w.n(z10, 3, b10, bArr, i10, i11);
    }

    static void E(C1331w c1331w, boolean z10, byte[] bArr, int i10, int i11) {
        c1331w.p(z10, 3, bArr, i10, i11);
    }

    static int F(boolean z10, int i10) {
        return C1331w.g(z10, i10);
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 3, this.f9107a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9107a.length);
    }

    @Override // Pf.AbstractC1295b, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
