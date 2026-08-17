package Ag;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends q implements Ug.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Ag.b f461i;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f463b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f464c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f465d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f466e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f467f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f468g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Ag.b f469h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f470i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private x f471j = null;

        public b(r rVar) {
            this.f462a = rVar;
        }

        public s k() {
            return new s(this, null);
        }

        public b l(Ag.b bVar) {
            if (bVar.b() == 0) {
                this.f469h = new Ag.b(bVar, (1 << this.f462a.a()) - 1);
                return this;
            }
            this.f469h = bVar;
            return this;
        }

        public b m(long j10) {
            this.f463b = j10;
            return this;
        }

        public b n(long j10) {
            this.f464c = j10;
            return this;
        }

        public b o(byte[] bArr) {
            this.f467f = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f468g = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f466e = A.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f465d = A.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f462a.e());
        r rVar = bVar.f462a;
        this.f455c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int iF = rVar.f();
        byte[] bArr = bVar.f470i;
        if (bArr != null) {
            if (bVar.f471j == null) {
                throw new NullPointerException("xmss == null");
            }
            int iA = rVar.a();
            int i10 = (iA + 7) / 8;
            this.f460h = A.a(bArr, 0, i10);
            if (!A.l(iA, this.f460h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f456d = A.g(bArr, i10, iF);
            int i11 = i10 + iF;
            this.f457e = A.g(bArr, i11, iF);
            int i12 = i11 + iF;
            this.f458f = A.g(bArr, i12, iF);
            int i13 = i12 + iF;
            this.f459g = A.g(bArr, i13, iF);
            int i14 = i13 + iF;
            try {
                this.f461i = ((Ag.b) A.f(A.g(bArr, i14, bArr.length - i14), Ag.b.class)).f(bVar.f471j.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        this.f460h = bVar.f463b;
        byte[] bArr2 = bVar.f465d;
        if (bArr2 == null) {
            this.f456d = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f456d = bArr2;
        }
        byte[] bArr3 = bVar.f466e;
        if (bArr3 == null) {
            this.f457e = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f457e = bArr3;
        }
        byte[] bArr4 = bVar.f467f;
        if (bArr4 == null) {
            this.f458f = new byte[iF];
        } else {
            if (bArr4.length != iF) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f458f = bArr4;
        }
        byte[] bArr5 = bVar.f468g;
        if (bArr5 == null) {
            this.f459g = new byte[iF];
        } else {
            if (bArr5.length != iF) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f459g = bArr5;
        }
        Ag.b bVar2 = bVar.f469h;
        if (bVar2 != null) {
            this.f461i = bVar2;
        } else {
            if (!A.l(rVar.a(), bVar.f463b) || bArr4 == null || bArr2 == null) {
                bVar2 = new Ag.b(bVar.f464c + 1);
                this.f461i = bVar2;
            } else {
                this.f461i = new Ag.b(rVar, bVar.f463b, bArr4, bArr2);
            }
        }
        if (bVar.f464c >= 0 && bVar.f464c != this.f461i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    /* synthetic */ s(b bVar, a aVar) {
        this(bVar);
    }

    public r c() {
        return this.f455c;
    }

    public byte[] d() {
        byte[] bArrG;
        synchronized (this) {
            try {
                int iF = this.f455c.f();
                int iA = (this.f455c.a() + 7) / 8;
                byte[] bArr = new byte[iA + iF + iF + iF + iF];
                A.e(bArr, A.q(this.f460h, iA), 0);
                A.e(bArr, this.f456d, iA);
                int i10 = iA + iF;
                A.e(bArr, this.f457e, i10);
                int i11 = i10 + iF;
                A.e(bArr, this.f458f, i11);
                A.e(bArr, this.f459g, i11 + iF);
                try {
                    bArrG = Ug.a.g(bArr, A.p(this.f461i));
                } catch (IOException e10) {
                    throw new IllegalStateException("error serializing bds state: " + e10.getMessage(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrG;
    }

    @Override // Ug.c
    public byte[] getEncoded() {
        byte[] bArrD;
        synchronized (this) {
            bArrD = d();
        }
        return bArrD;
    }
}
