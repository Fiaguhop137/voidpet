package G2;

import R1.x;
import U1.AbstractC1459a;
import U1.F;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends E2.c {
    @Override // E2.c
    protected x b(E2.b bVar, ByteBuffer byteBuffer) {
        return new x(c(new F(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(F f10) {
        return new a((String) AbstractC1459a.e(f10.F()), (String) AbstractC1459a.e(f10.F()), f10.E(), f10.E(), Arrays.copyOfRange(f10.f(), f10.g(), f10.j()));
    }
}
