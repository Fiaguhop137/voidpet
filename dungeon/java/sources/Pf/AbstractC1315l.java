package Pf;

/* JADX INFO: renamed from: Pf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1315l extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9141b = new a(AbstractC1315l.class, 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9142a;

    /* JADX INFO: renamed from: Pf.l$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return AbstractC1315l.w(c1320n0.A());
        }
    }

    AbstractC1315l(byte[] bArr, boolean z10) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.f9142a = z10 ? Ug.a.e(bArr) : bArr;
    }

    static AbstractC1315l w(byte[] bArr) {
        return new C1312j0(bArr, false);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public final int hashCode() {
        return Ug.a.n(this.f9142a);
    }

    @Override // Pf.AbstractC1333y
    final boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof AbstractC1315l) {
            return Ug.a.b(this.f9142a, ((AbstractC1315l) abstractC1333y).f9142a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    final void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 25, this.f9142a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    final int p(boolean z10) {
        return C1331w.g(z10, this.f9142a.length);
    }
}
