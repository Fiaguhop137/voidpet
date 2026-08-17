package Xf;

/* JADX INFO: loaded from: classes3.dex */
public class f extends b {
    public f(int i10) {
        super(r(i10), Vf.d.ANY);
    }

    private static int r(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHA-3");
    }

    @Override // Xf.b, Vf.j
    public int a(byte[] bArr, int i10) {
        k(2, 2);
        return super.a(bArr, i10);
    }

    @Override // Vf.j
    public String c() {
        return "SHA3-" + this.f16490f;
    }
}
