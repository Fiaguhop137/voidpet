package p021b2;

import S1.o;
import S1.q;
import U1.AbstractC1459a;
import U1.S;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f26111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f26112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f26113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f26114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f26115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f26117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f26121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f26122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f26123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f26124v;

    public d0() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public d0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f26120r = 0;
        this.f26122t = 0;
        this.f26123u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC1459a.a(z10);
        this.f26114l = j10;
        this.f26111i = f10;
        this.f26115m = j11;
        this.f26113k = i10;
        this.f26112j = s10;
        byte[] bArr = S.f12881f;
        this.f26121s = bArr;
        this.f26124v = bArr;
    }

    private void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC1459a.a(this.f26123u >= i10);
        if (i11 == 2) {
            int i12 = this.f26122t;
            int i13 = this.f26123u;
            int i14 = i12 + i13;
            byte[] bArr = this.f26121s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f26124v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f26124v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f26124v, 0, i15);
                    System.arraycopy(this.f26121s, 0, this.f26124v, i15, length);
                }
            }
        } else {
            int i16 = this.f26122t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f26121s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f26124v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f26124v, 0, length2);
                System.arraycopy(this.f26121s, 0, this.f26124v, length2, i10 - length2);
            }
        }
        AbstractC1459a.b(i10 % this.f26116n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        AbstractC1459a.g(this.f26122t < this.f26121s.length);
        y(this.f26124v, i10, i11);
    }

    private void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f26121s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f26118p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        AbstractC1459a.g(this.f26122t < this.f26121s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f26122t;
        int i12 = this.f26123u;
        int i13 = i11 + i12;
        byte[] bArr = this.f26121s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f26121s, i10, iMin);
        int i14 = this.f26123u + iMin;
        this.f26123u = i14;
        AbstractC1459a.g(i14 <= this.f26121s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f26118p = 0;
            this.f26120r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private int n(int i10) {
        int i11 = this.f26116n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f26113k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f26113k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        int iR = ((r(this.f26115m) - this.f26120r) * this.f26116n) - (this.f26121s.length / 2);
        AbstractC1459a.g(iR >= 0);
        return m(Math.min((i10 * this.f26111i) + 0.5f, iR));
    }

    private int r(long j10) {
        return (int) ((j10 * ((long) this.f11455b.f11450a)) / 1000000);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f26116n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f26116n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f26112j;
    }

    private void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f26113k)) / 100);
        }
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void y(byte[] bArr, int i10, int i11) {
        AbstractC1459a.b(i10 % this.f26116n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f26123u;
        byte[] bArr = this.f26121s;
        if (i10 == bArr.length || z10) {
            if (this.f26120r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    AbstractC1459a.g(i10 >= bArr.length / 2);
                    length = this.f26121s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f26121s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            AbstractC1459a.h(length % this.f26116n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC1459a.g(i10 >= iQ);
            this.f26123u -= length;
            int i11 = this.f26122t + length;
            this.f26122t = i11;
            this.f26122t = i11 % this.f26121s.length;
            int i12 = this.f26120r;
            int i13 = this.f26116n;
            this.f26120r = i12 + (iQ / i13);
            this.f26119q += (long) ((length - iQ) / i13);
        }
    }

    public void D(boolean z10) {
        this.f26117o = z10;
    }

    @Override // S1.q, S1.o
    public boolean a() {
        return super.a() && this.f26117o;
    }

    @Override // S1.o
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f26118p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // S1.q
    protected o.a h(o.a aVar) throws o.b {
        if (aVar.f11452c == 2) {
            return aVar.f11450a == -1 ? o.a.f11449e : aVar;
        }
        throw new o.b(aVar);
    }

    @Override // S1.q
    public void i() {
        if (a()) {
            this.f26116n = this.f11455b.f11451b * 2;
            int iN = n(r(this.f26114l) / 2) * 2;
            if (this.f26121s.length != iN) {
                this.f26121s = new byte[iN];
                this.f26124v = new byte[iN];
            }
        }
        this.f26118p = 0;
        this.f26119q = 0L;
        this.f26120r = 0;
        this.f26122t = 0;
        this.f26123u = 0;
    }

    @Override // S1.q
    public void j() {
        if (this.f26123u > 0) {
            z(true);
            this.f26120r = 0;
        }
    }

    @Override // S1.q
    public void k() {
        this.f26117o = false;
        byte[] bArr = S.f12881f;
        this.f26121s = bArr;
        this.f26124v = bArr;
    }

    public long u() {
        return this.f26119q;
    }
}
