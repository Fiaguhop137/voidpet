package p202l4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f48628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f48629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f48630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48632e;

    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f48629b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f48634a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f48628a = inputStream;
        this.f48629b = charset;
        this.f48630c = new byte[i10];
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f48628a;
        byte[] bArr = this.f48630c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f48631d = 0;
        this.f48632e = i10;
    }

    public boolean c() {
        return this.f48632e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f48628a) {
            try {
                if (this.f48630c != null) {
                    this.f48630c = null;
                    this.f48628a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String d() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f48628a) {
            try {
                if (this.f48630c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f48631d >= this.f48632e) {
                    b();
                }
                for (int i12 = this.f48631d; i12 != this.f48632e; i12++) {
                    byte[] bArr2 = this.f48630c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f48631d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f48629b.name());
                        this.f48631d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f48632e - this.f48631d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f48630c;
                    int i14 = this.f48631d;
                    aVar.write(bArr3, i14, this.f48632e - i14);
                    this.f48632e = -1;
                    b();
                    i10 = this.f48631d;
                    while (i10 != this.f48632e) {
                        bArr = this.f48630c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f48631d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f48631d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
