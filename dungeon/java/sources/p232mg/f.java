package p232mg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class f extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f49394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f49395d;

    public f(d dVar, byte[] bArr) {
        super(false, dVar);
        this.f49394c = a.k(bArr, 0, bArr.length - 32);
        this.f49395d = a.k(bArr, bArr.length - 32, bArr.length);
    }

    public f(d dVar, byte[] bArr, byte[] bArr2) {
        super(false, dVar);
        this.f49394c = a.e(bArr);
        this.f49395d = a.e(bArr2);
    }

    static byte[] c(byte[] bArr, byte[] bArr2) {
        return a.g(bArr, bArr2);
    }

    public byte[] getEncoded() {
        return c(this.f49394c, this.f49395d);
    }
}
