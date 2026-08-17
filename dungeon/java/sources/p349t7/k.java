package p349t7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f54524a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f54526c + (j10 * ((long) dVar.f54528e));
        this.f54533a = iVar.i(byteBufferAllocate, j11);
        this.f54534b = iVar.g(byteBufferAllocate, 8 + j11);
        this.f54535c = iVar.g(byteBufferAllocate, 16 + j11);
        this.f54536d = iVar.g(byteBufferAllocate, j11 + 40);
    }
}
