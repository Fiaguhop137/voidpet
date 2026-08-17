package Ag;

import Pf.C1328t;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vf.j f411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f412b;

    protected h(C1328t c1328t, int i10) {
        if (c1328t == null) {
            throw new NullPointerException("digest == null");
        }
        this.f411a = f.a(c1328t);
        this.f412b = i10;
    }

    private byte[] d(int i10, byte[] bArr, byte[] bArr2) {
        byte[] bArrQ = A.q(i10, this.f412b);
        this.f411a.update(bArrQ, 0, bArrQ.length);
        this.f411a.update(bArr, 0, bArr.length);
        this.f411a.update(bArr2, 0, bArr2.length);
        int i11 = this.f412b;
        byte[] bArr3 = new byte[i11];
        Vf.j jVar = this.f411a;
        if (jVar instanceof Vf.q) {
            ((Vf.q) jVar).e(bArr3, 0, i11);
            return bArr3;
        }
        jVar.a(bArr3, 0);
        return bArr3;
    }

    protected byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f412b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i10) {
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f412b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i10 * 2) {
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f412b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }
}
