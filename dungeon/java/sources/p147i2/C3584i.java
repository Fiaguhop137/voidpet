package p147i2;

import U1.AbstractC1459a;
import Y1.f;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: i2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3584i extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f43701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43703l;

    public C3584i() {
        super(2);
        this.f43703l = 32;
    }

    private boolean G(f fVar) {
        ByteBuffer byteBuffer;
        if (!K()) {
            return true;
        }
        if (this.f43702k >= this.f43703l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f16811d;
        return byteBuffer2 == null || (byteBuffer = this.f16811d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean F(f fVar) {
        AbstractC1459a.a(!fVar.C());
        AbstractC1459a.a(!fVar.s());
        AbstractC1459a.a(!fVar.t());
        if (!G(fVar)) {
            return false;
        }
        int i10 = this.f43702k;
        this.f43702k = i10 + 1;
        if (i10 == 0) {
            this.f16813f = fVar.f16813f;
            if (fVar.v()) {
                y(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f16811d;
        if (byteBuffer != null) {
            A(byteBuffer.remaining());
            this.f16811d.put(byteBuffer);
        }
        this.f43701j = fVar.f16813f;
        return true;
    }

    public long H() {
        return this.f16813f;
    }

    public long I() {
        return this.f43701j;
    }

    public int J() {
        return this.f43702k;
    }

    public boolean K() {
        return this.f43702k > 0;
    }

    public void L(int i10) {
        AbstractC1459a.a(i10 > 0);
        this.f43703l = i10;
    }

    @Override // Y1.f, Y1.a
    public void p() {
        super.p();
        this.f43702k = 0;
    }
}
