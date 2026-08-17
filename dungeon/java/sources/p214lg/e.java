package p214lg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f48761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f48762d;

    public e(c cVar, byte[] bArr) {
        super(false, cVar);
        this.f48761c = a.k(bArr, 0, 32);
        this.f48762d = a.k(bArr, 32, bArr.length);
    }

    public e(c cVar, byte[] bArr, byte[] bArr2) {
        super(false, cVar);
        this.f48761c = a.e(bArr);
        this.f48762d = a.e(bArr2);
    }

    static byte[] c(byte[] bArr, byte[] bArr2) {
        return a.g(bArr, bArr2);
    }

    public byte[] d() {
        return a.e(this.f48762d);
    }

    public byte[] getEncoded() {
        return c(this.f48761c, this.f48762d);
    }
}
