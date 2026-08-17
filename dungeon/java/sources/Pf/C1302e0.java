package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1302e0 extends AbstractC1295b {
    public C1302e0(InterfaceC1301e interfaceC1301e) {
        super(interfaceC1301e.g().i("DER"), 0);
    }

    public C1302e0(byte[] bArr) {
        this(bArr, 0);
    }

    public C1302e0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    C1302e0(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) throws IOException {
        byte[] bArr = this.f9107a;
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b10 = bArr[length];
        byte b11 = (byte) ((255 << i10) & b10);
        if (b10 == b11) {
            c1331w.o(z10, 3, bArr);
        } else {
            c1331w.q(z10, 3, bArr, 0, length, b11);
        }
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
    AbstractC1333y t() {
        return this;
    }

    @Override // Pf.AbstractC1295b, Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
