package Ag;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends p implements Ug.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile C0796a f496h;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f498b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f499c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f500d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f501e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f502f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f503g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C0796a f504h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f505i = null;

        public b(x xVar) {
            this.f497a = xVar;
        }

        public y j() {
            return new y(this, null);
        }

        public b k(C0796a c0796a) {
            this.f504h = c0796a;
            return this;
        }

        public b l(int i10) {
            this.f498b = i10;
            return this;
        }

        public b m(int i10) {
            this.f499c = i10;
            return this;
        }

        public b n(byte[] bArr) {
            this.f502f = A.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f503g = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f501e = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f500d = A.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f497a.f());
        x xVar = bVar.f497a;
        this.f491c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int iH = xVar.h();
        byte[] bArr = bVar.f505i;
        if (bArr != null) {
            int iB = xVar.b();
            int iA = Ug.f.a(bArr, 0);
            if (!A.l(iB, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f492d = A.g(bArr, 4, iH);
            int i10 = 4 + iH;
            this.f493e = A.g(bArr, i10, iH);
            int i11 = i10 + iH;
            this.f494f = A.g(bArr, i11, iH);
            int i12 = i11 + iH;
            this.f495g = A.g(bArr, i12, iH);
            int i13 = i12 + iH;
            try {
                C0796a c0796a = (C0796a) A.f(A.g(bArr, i13, bArr.length - i13), C0796a.class);
                if (c0796a.b() != iA) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f496h = c0796a.h(bVar.f497a.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        byte[] bArr2 = bVar.f500d;
        if (bArr2 == null) {
            this.f492d = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f492d = bArr2;
        }
        byte[] bArr3 = bVar.f501e;
        if (bArr3 == null) {
            this.f493e = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f493e = bArr3;
        }
        byte[] bArr4 = bVar.f502f;
        if (bArr4 == null) {
            this.f494f = new byte[iH];
        } else {
            if (bArr4.length != iH) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f494f = bArr4;
        }
        byte[] bArr5 = bVar.f503g;
        if (bArr5 == null) {
            this.f495g = new byte[iH];
        } else {
            if (bArr5.length != iH) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f495g = bArr5;
        }
        C0796a c0796a2 = bVar.f504h;
        if (c0796a2 != null) {
            this.f496h = c0796a2;
        } else if (bVar.f498b >= (1 << xVar.b()) - 2 || bArr4 == null || bArr2 == null) {
            c0796a2 = new C0796a(xVar, (1 << xVar.b()) - 1, bVar.f498b);
            this.f496h = c0796a2;
        } else {
            this.f496h = new C0796a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f498b);
        }
        if (bVar.f499c >= 0 && bVar.f499c != this.f496h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    /* synthetic */ y(b bVar, a aVar) {
        this(bVar);
    }

    public x c() {
        return this.f491c;
    }

    public byte[] d() {
        byte[] bArrG;
        synchronized (this) {
            try {
                int iH = this.f491c.h();
                byte[] bArr = new byte[iH + 4 + iH + iH + iH];
                Ug.f.c(this.f496h.b(), bArr, 0);
                A.e(bArr, this.f492d, 4);
                int i10 = 4 + iH;
                A.e(bArr, this.f493e, i10);
                int i11 = i10 + iH;
                A.e(bArr, this.f494f, i11);
                A.e(bArr, this.f495g, i11 + iH);
                try {
                    bArrG = Ug.a.g(bArr, A.p(this.f496h));
                } catch (IOException e10) {
                    throw new RuntimeException("error serializing bds state: " + e10.getMessage());
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
