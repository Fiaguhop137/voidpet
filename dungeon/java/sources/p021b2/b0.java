package p021b2;

import F9.i;
import S1.o;
import U1.AbstractC1459a;
import U1.S;
import Y1.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p380v2.H;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f26106d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f26107e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f26108a = o.f11448a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26110c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26109b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f26109b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f26106d.length;
            length += f26107e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f26109b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f26106d);
            }
            byteBufferC.put(f26107e);
        }
        int iJ = this.f26110c + H.j(byteBuffer);
        this.f26110c = iJ;
        f(byteBufferC, iJ, this.f26109b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f26109b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f26107e;
            byteBufferC.putInt(i10 + bArr2.length + 22, S.w(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, S.w(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f26109b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f26108a.capacity() < i10) {
            this.f26108a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f26108a.clear();
        }
        return this.f26108a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, S.w(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(i.a(i11));
    }

    public void a(f fVar, List list) {
        AbstractC1459a.e(fVar.f16811d);
        if (fVar.f16811d.limit() - fVar.f16811d.position() == 0) {
            return;
        }
        this.f26108a = b(fVar.f16811d, (this.f26109b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.p();
        fVar.A(this.f26108a.remaining());
        fVar.f16811d.put(this.f26108a);
        fVar.B();
    }

    public void d() {
        this.f26108a = o.f11448a;
        this.f26110c = 0;
        this.f26109b = 2;
    }
}
