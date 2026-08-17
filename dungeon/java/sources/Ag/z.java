package Ag;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends p implements Ug.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f509f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f511b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f512c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f513d = null;

        public b(x xVar) {
            this.f510a = xVar;
        }

        public z e() {
            return new z(this, null);
        }

        public b f(byte[] bArr) {
            this.f513d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f512c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f511b = A.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f510a.f());
        x xVar = bVar.f510a;
        this.f506c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int iH = xVar.h();
        byte[] bArr = bVar.f513d;
        if (bArr != null) {
            if (bArr.length == iH + iH) {
                this.f507d = 0;
                this.f508e = A.g(bArr, 0, iH);
                this.f509f = A.g(bArr, iH, iH);
                return;
            } else {
                if (bArr.length != iH + 4 + iH) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f507d = Ug.f.a(bArr, 0);
                this.f508e = A.g(bArr, 4, iH);
                this.f509f = A.g(bArr, 4 + iH, iH);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f507d = xVar.e().a();
        } else {
            this.f507d = 0;
        }
        byte[] bArr2 = bVar.f511b;
        if (bArr2 == null) {
            this.f508e = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f508e = bArr2;
        }
        byte[] bArr3 = bVar.f512c;
        if (bArr3 == null) {
            this.f509f = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f509f = bArr3;
        }
    }

    /* synthetic */ z(b bVar, a aVar) {
        this(bVar);
    }

    public x c() {
        return this.f506c;
    }

    public byte[] d() {
        return A.c(this.f509f);
    }

    public byte[] e() {
        return A.c(this.f508e);
    }

    public byte[] f() {
        byte[] bArr;
        int iH = this.f506c.h();
        int i10 = this.f507d;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[iH + 4 + iH];
            Ug.f.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[iH + iH];
        }
        A.e(bArr, this.f508e, i11);
        A.e(bArr, this.f509f, i11 + iH);
        return bArr;
    }

    @Override // Ug.c
    public byte[] getEncoded() {
        return f();
    }
}
