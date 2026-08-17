package Pf;

/* JADX INFO: loaded from: classes3.dex */
abstract class L extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final F f9073b;

    L(Class cls, int i10) {
        super(cls);
        this.f9073b = F.a(0, i10);
    }

    final AbstractC1333y a(AbstractC1333y abstractC1333y) {
        if (this.f9060a.isInstance(abstractC1333y)) {
            return abstractC1333y;
        }
        throw new IllegalStateException("unexpected object: " + abstractC1333y.getClass().getName());
    }

    final AbstractC1333y b(byte[] bArr) {
        return a(AbstractC1333y.s(bArr));
    }

    AbstractC1333y c(B b10) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    AbstractC1333y d(C1320n0 c1320n0) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final AbstractC1333y e(G g10, boolean z10) {
        return a(M.a(g10).B(z10, this));
    }
}
