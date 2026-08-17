package Pf;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class M0 extends P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9077f;

    M0(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this.f9076e = false;
        this.f9077f = true;
        this.f9074c = inputStream.read();
        int i11 = inputStream.read();
        this.f9075d = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        c();
    }

    private boolean c() {
        if (!this.f9076e && this.f9077f && this.f9074c == 0 && this.f9075d == 0) {
            this.f9076e = true;
            b(true);
        }
        return this.f9076e;
    }

    void d(boolean z10) {
        this.f9077f = z10;
        c();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (c()) {
            return -1;
        }
        int i10 = this.f9087a.read();
        if (i10 < 0) {
            throw new EOFException();
        }
        int i11 = this.f9074c;
        this.f9074c = this.f9075d;
        this.f9075d = i10;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f9077f || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f9076e) {
            return -1;
        }
        int i12 = this.f9087a.read(bArr, i10 + 2, i11 - 2);
        if (i12 < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f9074c;
        bArr[i10 + 1] = (byte) this.f9075d;
        this.f9074c = this.f9087a.read();
        int i13 = this.f9087a.read();
        this.f9075d = i13;
        if (i13 >= 0) {
            return i12 + 2;
        }
        throw new EOFException();
    }
}
