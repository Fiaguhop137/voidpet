package Ag;

/* JADX INFO: loaded from: classes3.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f439a;

    protected n(m mVar, byte[][] bArr) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (A.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != mVar.a()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != mVar.c()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f439a = A.d(bArr);
    }

    protected byte[][] a() {
        return A.d(this.f439a);
    }
}
