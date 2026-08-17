package p358tg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f54748d;

    public d(b bVar, byte[] bArr) {
        super(false, bVar);
        byte[] bArrK = a.k(bArr, 0, 32);
        this.f54747c = bArrK;
        this.f54748d = a.k(bArr, bArrK.length, bArr.length);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[b().a()];
        byte[] bArr2 = this.f54747c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = this.f54748d;
        System.arraycopy(bArr3, 0, bArr, this.f54747c.length, bArr3.length);
        return bArr;
    }
}
