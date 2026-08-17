package p358tg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f54744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f54745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f54746f;

    public c(b bVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, bVar);
        this.f54743c = a.e(bArr);
        this.f54744d = a.e(bArr2);
        this.f54745e = a.e(bArr3);
        this.f54746f = a.e(bArr4);
    }

    public byte[] c() {
        return a.e(this.f54743c);
    }

    public byte[] d() {
        return a.e(this.f54746f);
    }

    public byte[] e() {
        return a.e(this.f54744d);
    }

    public byte[] f() {
        return a.e(this.f54745e);
    }
}
