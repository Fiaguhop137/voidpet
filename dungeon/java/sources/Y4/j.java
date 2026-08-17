package Y4;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h f16946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f16948c;

    public j(h hVar) {
        V4.k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f16946a = (h) V4.k.g(hVar);
        this.f16947b = 0;
        this.f16948c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f16946a.size() - this.f16947b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f16948c = this.f16947b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f16946a;
        int i10 = this.f16947b;
        this.f16947b = i10 + 1;
        return hVar.R(i10) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i11 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i11);
        this.f16946a.D(this.f16947b, bArr, i10, iMin);
        this.f16947b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f16947b = this.f16948c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        V4.k.b(Boolean.valueOf(j10 >= 0));
        int iMin = Math.min((int) j10, available());
        this.f16947b += iMin;
        return iMin;
    }
}
