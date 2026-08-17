package Ag;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends q implements Ug.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f475f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f477b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f478c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f479d = null;

        public b(r rVar) {
            this.f476a = rVar;
        }

        public t e() {
            return new t(this, null);
        }

        public b f(byte[] bArr) {
            this.f479d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f478c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f477b = A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f476a.e());
        r rVar = bVar.f476a;
        this.f472c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int iF = rVar.f();
        byte[] bArr = bVar.f479d;
        if (bArr != null) {
            if (bArr.length == iF + iF) {
                this.f473d = 0;
                this.f474e = A.g(bArr, 0, iF);
                this.f475f = A.g(bArr, iF, iF);
                return;
            } else {
                if (bArr.length != iF + 4 + iF) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f473d = Ug.f.a(bArr, 0);
                this.f474e = A.g(bArr, 4, iF);
                this.f475f = A.g(bArr, 4 + iF, iF);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f473d = rVar.d().a();
        } else {
            this.f473d = 0;
        }
        byte[] bArr2 = bVar.f477b;
        if (bArr2 == null) {
            this.f474e = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f474e = bArr2;
        }
        byte[] bArr3 = bVar.f478c;
        if (bArr3 == null) {
            this.f475f = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f475f = bArr3;
        }
    }

    /* synthetic */ t(b bVar, a aVar) {
        this(bVar);
    }

    public r c() {
        return this.f472c;
    }

    public byte[] d() {
        return A.c(this.f475f);
    }

    public byte[] e() {
        return A.c(this.f474e);
    }

    public byte[] f() {
        byte[] bArr;
        int iF = this.f472c.f();
        int i10 = this.f473d;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[iF + 4 + iF];
            Ug.f.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[iF + iF];
        }
        A.e(bArr, this.f474e, i11);
        A.e(bArr, this.f475f, i11 + iF);
        return bArr;
    }

    @Override // Ug.c
    public byte[] getEncoded() {
        return f();
    }
}
