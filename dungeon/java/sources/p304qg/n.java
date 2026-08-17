package p304qg;

import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f52007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f52008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f52009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52011e;

    public n(byte[] bArr, byte[] bArr2, j jVar) {
        this.f52007a = bArr;
        this.f52008b = bArr2;
        this.f52009c = jVar;
    }

    public void a(byte[] bArr, boolean z10, int i10) {
        b(bArr, i10);
        if (z10) {
            this.f52011e++;
        }
    }

    public byte[] b(byte[] bArr, int i10) {
        if (bArr.length - i10 < this.f52009c.d()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        j jVar = this.f52009c;
        byte[] bArr2 = this.f52007a;
        jVar.update(bArr2, 0, bArr2.length);
        this.f52009c.b((byte) (this.f52010d >>> 24));
        this.f52009c.b((byte) (this.f52010d >>> 16));
        this.f52009c.b((byte) (this.f52010d >>> 8));
        this.f52009c.b((byte) this.f52010d);
        this.f52009c.b((byte) (this.f52011e >>> 8));
        this.f52009c.b((byte) this.f52011e);
        this.f52009c.b((byte) -1);
        j jVar2 = this.f52009c;
        byte[] bArr3 = this.f52008b;
        jVar2.update(bArr3, 0, bArr3.length);
        this.f52009c.a(bArr, i10);
        return bArr;
    }

    public void c(int i10) {
        this.f52011e = i10;
    }

    public void d(int i10) {
        this.f52010d = i10;
    }
}
