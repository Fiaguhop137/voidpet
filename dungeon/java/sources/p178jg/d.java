package p178jg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f47467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f47468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f47469e;

    public d(c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, cVar);
        this.f47467c = a.e(bArr);
        this.f47468d = a.e(bArr2);
        this.f47469e = a.e(bArr3);
    }

    public byte[] getEncoded() {
        return a.h(this.f47467c, this.f47468d, this.f47469e);
    }
}
