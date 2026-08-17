package L4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6332b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f6331a = j10;
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f6332b += i10;
            return i10;
        }
        if (this.f6331a - ((long) this.f6332b) <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f6331a + ", but read: " + this.f6332b);
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f6331a - ((long) this.f6332b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
