package p349t7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f54538j;

    public g(boolean z10, i iVar) {
        this.f54524a = z10;
        this.f54538j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f54525b = iVar.f(byteBufferAllocate, 16L);
        this.f54526c = iVar.i(byteBufferAllocate, 28L);
        this.f54527d = iVar.i(byteBufferAllocate, 32L);
        this.f54528e = iVar.f(byteBufferAllocate, 42L);
        this.f54529f = iVar.f(byteBufferAllocate, 44L);
        this.f54530g = iVar.f(byteBufferAllocate, 46L);
        this.f54531h = iVar.f(byteBufferAllocate, 48L);
        this.f54532i = iVar.f(byteBufferAllocate, 50L);
    }

    @Override // p349t7.d
    public c a(long j10, int i10) {
        return new a(this.f54538j, this, j10, i10);
    }

    @Override // p349t7.d
    public e b(long j10) {
        return new j(this.f54538j, this, j10);
    }

    @Override // p349t7.d
    public f c(int i10) {
        return new l(this.f54538j, this, i10);
    }
}
