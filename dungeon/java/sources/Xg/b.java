package Xg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f16535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f16538d;

    public b(InputStream inputStream) {
        this(inputStream, 16384, null);
    }

    public b(InputStream inputStream, int i10, byte[] bArr) throws IOException {
        k kVar = new k();
        this.f16538d = kVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i10);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.f16535a = new byte[i10];
        this.f16536b = 0;
        this.f16537c = 0;
        try {
            k.c(kVar, inputStream);
            if (bArr != null) {
                e.s(kVar, bArr);
            }
        } catch (c e10) {
            throw new IOException("Brotli decoder initialization failed", e10);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        k.a(this.f16538d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f16537c >= this.f16536b) {
            byte[] bArr = this.f16535a;
            int i10 = read(bArr, 0, bArr.length);
            this.f16536b = i10;
            this.f16537c = 0;
            if (i10 == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.f16535a;
        int i11 = this.f16537c;
        this.f16537c = i11 + 1;
        return bArr2[i11] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Bad offset: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Bad length: " + i11);
        }
        int i12 = i10 + i11;
        if (i12 > bArr.length) {
            throw new IllegalArgumentException("Buffer overflow: " + i12 + " > " + bArr.length);
        }
        if (i11 == 0) {
            return 0;
        }
        int iMax = Math.max(this.f16536b - this.f16537c, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i11);
            System.arraycopy(this.f16535a, this.f16537c, bArr, i10, iMax);
            this.f16537c += iMax;
            i10 += iMax;
            i11 -= iMax;
            if (i11 == 0) {
                return iMax;
            }
        }
        try {
            k kVar = this.f16538d;
            kVar.f16586Z = bArr;
            kVar.f16581U = i10;
            kVar.f16582V = i11;
            kVar.f16583W = 0;
            e.i(kVar);
            int i13 = this.f16538d.f16583W;
            if (i13 == 0) {
                return -1;
            }
            return i13 + iMax;
        } catch (c e10) {
            throw new IOException("Brotli stream decoding failed", e10);
        }
    }
}
