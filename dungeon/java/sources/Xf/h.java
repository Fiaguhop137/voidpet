package Xf;

import Vf.q;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b implements q {
    public h(int i10) {
        super(r(i10), Vf.d.ANY);
    }

    private static int r(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException("'bitStrength' " + i10 + " not supported for SHAKE");
    }

    @Override // Xf.b, Vf.j
    public int a(byte[] bArr, int i10) {
        return e(bArr, i10, d());
    }

    @Override // Vf.j
    public String c() {
        return "SHAKE" + this.f16490f;
    }

    @Override // Xf.b, Vf.j
    public int d() {
        return this.f16490f / 4;
    }

    @Override // Vf.q
    public int e(byte[] bArr, int i10, int i11) {
        int iS = s(bArr, i10, i11);
        p();
        return iS;
    }

    @Override // Xf.b
    protected Vf.c l() {
        return i.b(this, this.f16485a);
    }

    public int s(byte[] bArr, int i10, int i11) {
        if (!this.f16491g) {
            k(15, 4);
        }
        q(bArr, i10, ((long) i11) * 8);
        return i11;
    }
}
