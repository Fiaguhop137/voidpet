package Pf;

/* JADX INFO: renamed from: Pf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1310i0 extends C1313k {
    public C1310i0(byte[] bArr) {
        super(bArr);
    }

    private byte[] C() {
        byte[] bArr = this.f9140a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!y()) {
            byte[] bArr2 = this.f9140a;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(Ug.h.d("0000Z"), 0, bArr3, this.f9140a.length - 1, 5);
            return bArr3;
        }
        if (!A()) {
            byte[] bArr4 = this.f9140a;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(Ug.h.d("00Z"), 0, bArr5, this.f9140a.length - 1, 3);
            return bArr5;
        }
        if (!x()) {
            return this.f9140a;
        }
        int length = this.f9140a.length - 2;
        while (length > 0 && this.f9140a[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.f9140a;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i10 = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i10);
        bArr8[i10] = 90;
        return bArr8;
    }

    @Override // Pf.C1313k, Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 24, C());
    }

    @Override // Pf.C1313k, Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, C().length);
    }

    @Override // Pf.C1313k, Pf.AbstractC1333y
    AbstractC1333y t() {
        return this;
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y v() {
        return this;
    }
}
