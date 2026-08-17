package p453z3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: z3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4382n extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f58441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58442b = 1073741824;

    public C4382n(InputStream inputStream) {
        this.f58441a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f58442b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f58442b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f58441a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f58441a.read());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f58441a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f58441a.read(bArr, i10, i11));
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f58441a.skip(j10);
    }
}
