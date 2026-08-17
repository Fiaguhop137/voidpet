package p448yg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f58216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final a f58217d;

    public f(e eVar, byte[] bArr) {
        super(true, eVar);
        int iB = eVar.b();
        int i10 = iB * 4;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i11 = iB * 2;
        this.f58216c = new b(a.k(bArr, 0, iB), a.k(bArr, iB, i11));
        int i12 = iB * 3;
        this.f58217d = new a(a.k(bArr, i11, i12), a.k(bArr, i12, i10));
    }

    public f(e eVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, eVar);
        this.f58216c = new b(bArr, bArr2);
        this.f58217d = new a(bArr3, bArr4);
    }

    public byte[] c() {
        a aVar = this.f58217d;
        return a.g(aVar.f58150a, aVar.f58151b);
    }

    public byte[] getEncoded() {
        b bVar = this.f58216c;
        byte[] bArr = bVar.f58152a;
        byte[] bArr2 = bVar.f58153b;
        a aVar = this.f58217d;
        return a.i(new byte[][]{bArr, bArr2, aVar.f58150a, aVar.f58151b});
    }
}
