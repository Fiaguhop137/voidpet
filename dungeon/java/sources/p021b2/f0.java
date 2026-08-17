package p021b2;

import S1.o;
import S1.q;
import U1.S;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f26139m = S.f12881f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26141o;

    @Override // S1.q, S1.o
    public boolean b() {
        return super.b() && this.f26140n == 0;
    }

    @Override // S1.q, S1.o
    public ByteBuffer c() {
        int i10;
        if (super.b() && (i10 = this.f26140n) > 0) {
            l(i10).put(this.f26139m, 0, this.f26140n).flip();
            this.f26140n = 0;
        }
        return super.c();
    }

    @Override // S1.o
    public void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f26138l);
        this.f26141o += (long) (iMin / this.f11455b.f11453d);
        this.f26138l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f26138l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f26140n + i11) - this.f26139m.length;
        ByteBuffer byteBufferL = l(length);
        int iO = S.o(length, 0, this.f26140n);
        byteBufferL.put(this.f26139m, 0, iO);
        int iO2 = S.o(length - iO, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iO2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iO2;
        int i13 = this.f26140n - iO;
        this.f26140n = i13;
        byte[] bArr = this.f26139m;
        System.arraycopy(bArr, iO, bArr, 0, i13);
        byteBuffer.get(this.f26139m, this.f26140n, i12);
        this.f26140n += i12;
        byteBufferL.flip();
    }

    @Override // S1.q
    public o.a h(o.a aVar) throws o.b {
        if (!S.D0(aVar.f11452c)) {
            throw new o.b(aVar);
        }
        this.f26137k = true;
        return (this.f26135i == 0 && this.f26136j == 0) ? o.a.f11449e : aVar;
    }

    @Override // S1.q
    protected void i() {
        if (this.f26137k) {
            this.f26137k = false;
            int i10 = this.f26136j;
            int i11 = this.f11455b.f11453d;
            this.f26139m = new byte[i10 * i11];
            this.f26138l = this.f26135i * i11;
        }
        this.f26140n = 0;
    }

    @Override // S1.q
    protected void j() {
        if (this.f26137k) {
            int i10 = this.f26140n;
            if (i10 > 0) {
                this.f26141o += (long) (i10 / this.f11455b.f11453d);
            }
            this.f26140n = 0;
        }
    }

    @Override // S1.q
    protected void k() {
        this.f26139m = S.f12881f;
    }

    public long m() {
        return this.f26141o;
    }

    public void n() {
        this.f26141o = 0L;
    }

    public void o(int i10, int i11) {
        this.f26135i = i10;
        this.f26136j = i11;
    }
}
