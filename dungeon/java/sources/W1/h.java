package W1;

import U1.AbstractC1459a;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f14474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f14475b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14479f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14477d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14478e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14476c = new byte[1];

    public h(f fVar, j jVar) {
        this.f14474a = fVar;
        this.f14475b = jVar;
    }

    private void a() {
        if (this.f14477d) {
            return;
        }
        this.f14474a.m(this.f14475b);
        this.f14477d = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14478e) {
            return;
        }
        this.f14474a.close();
        this.f14478e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f14476c) == -1) {
            return -1;
        }
        return this.f14476c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        AbstractC1459a.g(!this.f14478e);
        a();
        int i12 = this.f14474a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f14479f += (long) i12;
        return i12;
    }
}
