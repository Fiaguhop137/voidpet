package p421x7;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class b extends com.github.penfeizhou.animation.io.b {
    @Override // com.github.penfeizhou.animation.io.b
    public void d(int i10) {
        super.d(i10);
        this.f31565a.order(ByteOrder.BIG_ENDIAN);
    }

    public void g(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }

    public void h(int i10) {
        b((byte) ((i10 >> 24) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) (i10 & 255));
    }
}
