package p250ng;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f50291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f50292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f50293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f50294f;

    public c(b bVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, bVar);
        this.f50292d = a.e(bArr);
        this.f50293e = a.e(bArr2);
        this.f50294f = a.e(bArr3);
        this.f50291c = a.e(bArr4);
    }

    public byte[] c() {
        return a.e(this.f50293e);
    }

    public byte[] d() {
        return a.e(this.f50291c);
    }

    public byte[] e() {
        return a.e(this.f50294f);
    }

    public byte[] f() {
        return a.e(this.f50292d);
    }
}
