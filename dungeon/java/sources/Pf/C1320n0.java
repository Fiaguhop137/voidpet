package Pf;

/* JADX INFO: renamed from: Pf.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1320n0 extends AbstractC1329u {
    public C1320n0(InterfaceC1301e interfaceC1301e) {
        super(interfaceC1301e.g().i("DER"));
    }

    public C1320n0(byte[] bArr) {
        super(bArr);
    }

    static void B(C1331w c1331w, boolean z10, byte[] bArr, int i10, int i11) {
        c1331w.p(z10, 4, bArr, i10, i11);
    }

    static int C(boolean z10, int i10) {
        return C1331w.g(z10, i10);
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 4, this.f9169a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9169a.length);
    }

    @Override // Pf.AbstractC1329u, Pf.AbstractC1333y
    AbstractC1333y t() {
        return this;
    }

    @Override // Pf.AbstractC1329u, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
