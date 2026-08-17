package p448yg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f58218c;

    public g(e eVar, byte[] bArr) {
        super(false, eVar);
        int iB = eVar.b();
        int i10 = iB * 2;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f58218c = new a(a.k(bArr, 0, iB), a.k(bArr, iB, i10));
    }

    public byte[] getEncoded() {
        a aVar = this.f58218c;
        return a.g(aVar.f58150a, aVar.f58151b);
    }
}
