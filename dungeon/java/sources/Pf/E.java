package Pf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9049b = new a(E.class, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9050a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return E.w(c1320n0.A());
        }
    }

    E(byte[] bArr, boolean z10) {
        this.f9050a = z10 ? Ug.a.e(bArr) : bArr;
    }

    static E w(byte[] bArr) {
        return new t0(bArr, false);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.n(this.f9050a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof E) {
            return Ug.a.b(this.f9050a, ((E) abstractC1333y).f9050a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 20, this.f9050a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9050a.length);
    }

    public String toString() {
        return x();
    }

    public final String x() {
        return Ug.h.b(this.f9050a);
    }
}
