package Ag;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f428d;

    k(m mVar) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        }
        this.f425a = mVar;
        int iC = mVar.c();
        this.f426b = new h(mVar.b(), iC);
        this.f427c = new byte[iC];
        this.f428d = new byte[iC];
    }

    private byte[] a(byte[] bArr, int i10, int i11, j jVar) {
        int iC = this.f425a.c();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iC) {
            throw new IllegalArgumentException("startHash needs to be " + iC + "bytes");
        }
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (jVar.d() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i12 = i10 + i11;
        if (i12 > this.f425a.d() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i11 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i10, i11 - 1, jVar);
        j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(jVar.e()).o(i12 - 1).f(0)).l();
        byte[] bArrC = this.f426b.c(this.f428d, jVar2.d());
        byte[] bArrC2 = this.f426b.c(this.f428d, ((j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar2.b())).h(jVar2.c())).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1)).l()).d());
        byte[] bArr2 = new byte[iC];
        for (int i13 = 0; i13 < iC; i13++) {
            bArr2[i13] = (byte) (bArrA[i13] ^ bArrC2[i13]);
        }
        return this.f426b.a(bArrC, bArr2);
    }

    private byte[] b(int i10) {
        if (i10 < 0 || i10 >= this.f425a.a()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f426b.c(this.f427c, A.q(i10, 32));
    }

    protected h c() {
        return this.f426b;
    }

    protected m d() {
        return this.f425a;
    }

    n e(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.f425a.a()][];
        for (int i10 = 0; i10 < this.f425a.a(); i10++) {
            jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(i10).o(jVar.f()).f(jVar.a())).l();
            bArr[i10] = a(b(i10), 0, this.f425a.d() - 1, jVar);
        }
        return new n(this.f425a, bArr);
    }

    protected byte[] f() {
        return Ug.a.e(this.f428d);
    }

    protected byte[] g(byte[] bArr, j jVar) {
        return this.f426b.c(bArr, ((j) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).l()).d());
    }

    void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.f425a.c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.f425a.c()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f427c = bArr;
        this.f428d = bArr2;
    }
}
