package Y4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f16940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z4.h f16942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16943d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16944e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16945f = false;

    public g(InputStream inputStream, byte[] bArr, Z4.h hVar) {
        this.f16940a = (InputStream) V4.k.g(inputStream);
        this.f16941b = (byte[]) V4.k.g(bArr);
        this.f16942c = (Z4.h) V4.k.g(hVar);
    }

    private boolean a() throws IOException {
        if (this.f16944e < this.f16943d) {
            return true;
        }
        int i10 = this.f16940a.read(this.f16941b);
        if (i10 <= 0) {
            return false;
        }
        this.f16943d = i10;
        this.f16944e = 0;
        return true;
    }

    private void b() throws IOException {
        if (this.f16945f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        V4.k.i(this.f16944e <= this.f16943d);
        b();
        return (this.f16943d - this.f16944e) + this.f16940a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f16945f) {
            return;
        }
        this.f16945f = true;
        this.f16942c.a(this.f16941b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f16945f) {
            W4.a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        V4.k.i(this.f16944e <= this.f16943d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f16941b;
        int i10 = this.f16944e;
        this.f16944e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        V4.k.i(this.f16944e <= this.f16943d);
        b();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.f16943d - this.f16944e, i11);
        System.arraycopy(this.f16941b, this.f16944e, bArr, i10, iMin);
        this.f16944e += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        V4.k.i(this.f16944e <= this.f16943d);
        b();
        int i10 = this.f16943d;
        int i11 = this.f16944e;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f16944e = (int) (((long) i11) + j10);
            return j10;
        }
        this.f16944e = i10;
        return j11 + this.f16940a.skip(j10 - j11);
    }
}
