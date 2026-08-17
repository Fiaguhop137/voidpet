package Pf;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class K0 extends P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f9070e = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9072d;

    K0(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            b(true);
        }
        this.f9071c = i10;
        this.f9072d = i10;
    }

    int c() {
        return this.f9072d;
    }

    void d(byte[] bArr) throws IOException {
        int i10 = this.f9072d;
        if (i10 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i10 == 0) {
            return;
        }
        int iA = a();
        int i11 = this.f9072d;
        if (i11 >= iA) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f9072d + " >= " + iA);
        }
        int iD = i11 - Wg.a.d(this.f9087a, bArr, 0, bArr.length);
        this.f9072d = iD;
        if (iD == 0) {
            b(true);
            return;
        }
        throw new EOFException("DEF length " + this.f9071c + " object truncated by " + this.f9072d);
    }

    byte[] e() throws IOException {
        if (this.f9072d == 0) {
            return f9070e;
        }
        int iA = a();
        int i10 = this.f9072d;
        if (i10 >= iA) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f9072d + " >= " + iA);
        }
        byte[] bArr = new byte[i10];
        int iD = i10 - Wg.a.d(this.f9087a, bArr, 0, i10);
        this.f9072d = iD;
        if (iD == 0) {
            b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f9071c + " object truncated by " + this.f9072d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f9072d == 0) {
            return -1;
        }
        int i10 = this.f9087a.read();
        if (i10 >= 0) {
            int i11 = this.f9072d - 1;
            this.f9072d = i11;
            if (i11 == 0) {
                b(true);
            }
            return i10;
        }
        throw new EOFException("DEF length " + this.f9071c + " object truncated by " + this.f9072d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9072d;
        if (i12 == 0) {
            return -1;
        }
        int i13 = this.f9087a.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            int i14 = this.f9072d - i13;
            this.f9072d = i14;
            if (i14 == 0) {
                b(true);
            }
            return i13;
        }
        throw new EOFException("DEF length " + this.f9071c + " object truncated by " + this.f9072d);
    }
}
