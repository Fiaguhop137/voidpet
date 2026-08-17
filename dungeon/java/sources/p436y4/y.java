package p436y4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p328s4.b;

/* JADX INFO: loaded from: classes.dex */
public class y extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f57948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f57953f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public y(InputStream inputStream, b bVar) {
        this(inputStream, bVar, 65536);
    }

    y(InputStream inputStream, b bVar, int i10) {
        super(inputStream);
        this.f57951d = -1;
        this.f57953f = bVar;
        this.f57948a = (byte[]) bVar.c(i10, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f57951d;
        if (i10 != -1) {
            int i11 = this.f57952e - i10;
            int i12 = this.f57950c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f57949b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f57953f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f57948a = bArr2;
                    this.f57953f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f57952e - this.f57951d;
                this.f57952e = i13;
                this.f57951d = 0;
                this.f57949b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f57952e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f57949b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f57951d = -1;
            this.f57952e = 0;
            this.f57949b = i16;
        }
        return i16;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f57948a == null || inputStream == null) {
            throw d();
        }
        return (this.f57949b - this.f57952e) + inputStream.available();
    }

    public synchronized void b() {
        this.f57950c = this.f57948a.length;
    }

    public synchronized void c() {
        if (this.f57948a != null) {
            this.f57953f.put(this.f57948a);
            this.f57948a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f57948a != null) {
            this.f57953f.put(this.f57948a);
            this.f57948a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f57950c = Math.max(this.f57950c, i10);
        this.f57951d = this.f57952e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f57948a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f57952e >= this.f57949b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f57948a && (bArr = this.f57948a) == null) {
            throw d();
        }
        int i10 = this.f57949b;
        int i11 = this.f57952e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f57952e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f57948a;
        if (bArr2 == null) {
            throw d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i14 = this.f57952e;
        int i15 = this.f57949b;
        if (i14 < i15) {
            int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f57952e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f57951d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f57948a && (bArr2 = this.f57948a) == null) {
                    throw d();
                }
                int i17 = this.f57949b;
                int i18 = this.f57952e;
                i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f57952e += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f57948a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f57951d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f57952e + " markLimit: " + this.f57950c);
        }
        this.f57952e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f57948a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i10 = this.f57949b;
        int i11 = this.f57952e;
        if (i10 - i11 >= j10) {
            this.f57952e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f57952e = i10;
        if (this.f57951d == -1 || j10 > this.f57950c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f57951d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f57949b;
        int i13 = this.f57952e;
        if (i12 - i13 >= j10 - j11) {
            this.f57952e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f57952e = i12;
        return j12;
    }
}
