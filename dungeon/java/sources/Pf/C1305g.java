package Pf;

/* JADX INFO: renamed from: Pf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1305g extends AbstractC1333y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f9125c = new a(C1305g.class, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1305g[] f9126d = new C1305g[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9128b;

    /* JADX INFO: renamed from: Pf.g$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return C1305g.w(c1320n0.A(), false);
        }
    }

    C1305g(byte[] bArr, boolean z10) {
        if (C1321o.E(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f9127a = z10 ? Ug.a.e(bArr) : bArr;
        this.f9128b = C1321o.H(bArr);
    }

    static C1305g w(byte[] bArr, boolean z10) {
        if (bArr.length > 1) {
            return new C1305g(bArr, z10);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        C1305g[] c1305gArr = f9126d;
        if (i10 >= c1305gArr.length) {
            return new C1305g(bArr, z10);
        }
        C1305g c1305g = c1305gArr[i10];
        if (c1305g != null) {
            return c1305g;
        }
        C1305g c1305g2 = new C1305g(bArr, z10);
        c1305gArr[i10] = c1305g2;
        return c1305g2;
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9127a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (abstractC1333y instanceof C1305g) {
            return Ug.a.b(this.f9127a, ((C1305g) abstractC1333y).f9127a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 10, this.f9127a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9127a.length);
    }
}
