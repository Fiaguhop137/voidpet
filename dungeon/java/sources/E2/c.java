package E2;

import R1.x;
import U1.AbstractC1459a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements a {
    @Override // E2.a
    public final x a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1459a.e(bVar.f16811d);
        AbstractC1459a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract x b(b bVar, ByteBuffer byteBuffer);
}
