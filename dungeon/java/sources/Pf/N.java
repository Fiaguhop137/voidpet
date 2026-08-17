package Pf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9078b = new a(N.class, 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9079a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return N.w(c1320n0.A());
        }
    }

    N(byte[] bArr, boolean z10) {
        this.f9079a = z10 ? Ug.a.e(bArr) : bArr;
    }

    static N w(byte[] bArr) {
        return new x0(bArr, false);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.n(this.f9079a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof N) {
            return Ug.a.b(this.f9079a, ((N) abstractC1333y).f9079a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 21, this.f9079a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9079a.length);
    }
}
