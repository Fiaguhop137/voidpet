package p349t7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f54539j;

    public h(boolean z10, i iVar) {
        this.f54524a = z10;
        this.f54539j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f54525b = iVar.f(byteBufferAllocate, 16L);
        this.f54526c = iVar.g(byteBufferAllocate, 32L);
        this.f54527d = iVar.g(byteBufferAllocate, 40L);
        this.f54528e = iVar.f(byteBufferAllocate, 54L);
        this.f54529f = iVar.f(byteBufferAllocate, 56L);
        this.f54530g = iVar.f(byteBufferAllocate, 58L);
        this.f54531h = iVar.f(byteBufferAllocate, 60L);
        this.f54532i = iVar.f(byteBufferAllocate, 62L);
    }

    @Override // p349t7.d
    public c a(long j10, int i10) {
        return new b(this.f54539j, this, j10, i10);
    }

    @Override // p349t7.d
    public e b(long j10) {
        return new k(this.f54539j, this, j10);
    }

    @Override // p349t7.d
    public f c(int i10) {
        return new m(this.f54539j, this, i10);
    }
}
