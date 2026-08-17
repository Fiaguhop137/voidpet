package p214lg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f48754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f48755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f48756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final byte[] f48757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final byte[] f48758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final byte[] f48759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f48760i;

    public d(c cVar, byte[] bArr, e eVar) {
        super(true, cVar);
        a aVarA = cVar.a(null);
        this.f48754c = a.k(bArr, 0, 32);
        this.f48755d = a.k(bArr, 32, 64);
        this.f48756e = a.k(bArr, 64, 128);
        int iB = (aVarA.b() * aVarA.c()) + 128;
        this.f48757f = a.k(bArr, 128, iB);
        int iA = (aVarA.a() * aVarA.c()) + iB;
        this.f48758g = a.k(bArr, iB, iA);
        this.f48759h = a.k(bArr, iA, (aVarA.a() * 416) + iA);
        if (eVar != null) {
            this.f48760i = eVar.d();
        } else {
            this.f48760i = null;
        }
    }

    public d(c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, cVar);
        this.f48754c = a.e(bArr);
        this.f48755d = a.e(bArr2);
        this.f48756e = a.e(bArr3);
        this.f48757f = a.e(bArr4);
        this.f48758g = a.e(bArr5);
        this.f48759h = a.e(bArr6);
        this.f48760i = a.e(bArr7);
    }

    public e c() {
        return new e(b(), this.f48754c, this.f48760i);
    }

    public byte[] getEncoded() {
        return a.i(new byte[][]{this.f48754c, this.f48755d, this.f48756e, this.f48757f, this.f48758g, this.f48759h});
    }
}
