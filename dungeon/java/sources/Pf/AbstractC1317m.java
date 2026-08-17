package Pf;

/* JADX INFO: renamed from: Pf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1317m extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9145b = new a(AbstractC1317m.class, 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9146a;

    /* JADX INFO: renamed from: Pf.m$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return AbstractC1317m.w(c1320n0.A());
        }
    }

    AbstractC1317m(byte[] bArr, boolean z10) {
        this.f9146a = z10 ? Ug.a.e(bArr) : bArr;
    }

    static AbstractC1317m w(byte[] bArr) {
        return new C1314k0(bArr, false);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.n(this.f9146a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof AbstractC1317m) {
            return Ug.a.b(this.f9146a, ((AbstractC1317m) abstractC1333y).f9146a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 22, this.f9146a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9146a.length);
    }

    public String toString() {
        return x();
    }

    public final String x() {
        return Ug.h.b(this.f9146a);
    }
}
