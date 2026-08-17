package Pf;

/* JADX INFO: loaded from: classes3.dex */
public class I extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9062b = new a(I.class, 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9063a;

    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return I.w(c1320n0.A());
        }
    }

    I(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f9063a = bArr;
        if (!x(0) || !x(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    static I w(byte[] bArr) {
        return new I(bArr);
    }

    private boolean x(int i10) {
        byte b10;
        byte[] bArr = this.f9063a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9063a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof I) {
            return Ug.a.b(this.f9063a, ((I) abstractC1333y).f9063a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 23, this.f9063a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9063a.length);
    }

    public String toString() {
        return Ug.h.b(this.f9063a);
    }
}
