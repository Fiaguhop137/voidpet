package Pf;

/* JADX INFO: renamed from: Pf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1313k extends AbstractC1333y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f9139b = new a(C1313k.class, 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f9140a;

    /* JADX INFO: renamed from: Pf.k$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return C1313k.w(c1320n0.A());
        }
    }

    C1313k(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f9140a = bArr;
        if (!B(0) || !B(1) || !B(2) || !B(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    private boolean B(int i10) {
        byte b10;
        byte[] bArr = this.f9140a;
        return bArr.length > i10 && (b10 = bArr[i10]) >= 48 && b10 <= 57;
    }

    static C1313k w(byte[] bArr) {
        return new C1313k(bArr);
    }

    protected boolean A() {
        return B(12) && B(13);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9140a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof C1313k) {
            return Ug.a.b(this.f9140a, ((C1313k) abstractC1333y).f9140a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 24, this.f9140a);
    }

    @Override // Pf.AbstractC1333y
    final boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9140a.length);
    }

    @Override // Pf.AbstractC1333y
    AbstractC1333y t() {
        return new C1310i0(this.f9140a);
    }

    protected boolean x() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f9140a;
            if (i10 == bArr.length) {
                return false;
            }
            if (bArr[i10] == 46 && i10 == 14) {
                return true;
            }
            i10++;
        }
    }

    protected boolean y() {
        return B(10) && B(11);
    }
}
