package p021b2;

import S1.o;
import S1.q;
import U1.AbstractC1459a;
import U1.S;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class C extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f25945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f25946j;

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    @Override // S1.o
    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC1459a.e(this.f25946j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f11455b.f11453d) * this.f11456c.f11453d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iQ = (S.Q(this.f11455b.f11452c) * i10) + iPosition;
                int i11 = this.f11455b.f11452c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iQ));
                } else if (i11 == 3) {
                    byteBufferL.put(byteBuffer.get(iQ));
                } else if (i11 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iQ));
                } else if (i11 == 21) {
                    S.X0(byteBufferL, S.d0(byteBuffer, iQ));
                } else {
                    if (i11 != 22) {
                        if (i11 == 268435456) {
                            byteBufferL.putShort(byteBuffer.getShort(iQ));
                        } else if (i11 == 1342177280) {
                            S.X0(byteBufferL, S.d0(byteBuffer, iQ));
                        } else if (i11 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f11455b.f11452c);
                        }
                    }
                    byteBufferL.putInt(byteBuffer.getInt(iQ));
                }
            }
            iPosition += this.f11455b.f11453d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // S1.q
    public o.a h(o.a aVar) throws o.b {
        int[] iArr = this.f25945i;
        if (iArr == null) {
            return o.a.f11449e;
        }
        if (!S.D0(aVar.f11452c)) {
            throw new o.b(aVar);
        }
        boolean z10 = aVar.f11451b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f11451b) {
                throw new o.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new o.a(aVar.f11450a, iArr.length, aVar.f11452c) : o.a.f11449e;
    }

    @Override // S1.q
    protected void i() {
        this.f25946j = this.f25945i;
    }

    @Override // S1.q
    protected void k() {
        this.f25946j = null;
        this.f25945i = null;
    }

    public void m(int[] iArr) {
        this.f25945i = iArr;
    }
}
