package D1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f2106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f2107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f2110e = d.a();

    protected int a(int i10) {
        return i10 + this.f2107b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f2109d) {
            return this.f2107b.getShort(this.f2108c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f2107b = byteBuffer;
        if (byteBuffer == null) {
            this.f2106a = 0;
            this.f2108c = 0;
            this.f2109d = 0;
        } else {
            this.f2106a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f2108c = i11;
            this.f2109d = this.f2107b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f2106a;
        return i11 + this.f2107b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f2106a;
        return this.f2107b.getInt(i11 + this.f2107b.getInt(i11));
    }
}
